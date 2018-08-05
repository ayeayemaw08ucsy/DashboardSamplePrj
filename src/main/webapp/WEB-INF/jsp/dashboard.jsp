<%-- Created Date :     2018/08/03 
	 Created By: Aye Aye Maw
	 Version : 1.0	
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
   
   <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
   <script src="https://www.google.com/jsapi"></script>
   <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
    google.charts.load('current', {'packages':['bar','line']});
    google.charts.setOnLoadCallback(callRightChart);

    function callRightChart() {
        var barChartData = google.visualization.arrayToDataTable([
          ['Year', 'Sales', 'Expenses', 'Profit'],
          ['2014', 1000, 400, 200],
          ['2015', 1170, 460, 250],
          ['2016', 660, 1120, 300],
          ['2017', 1030, 540, 350]
        ]);

        var barChartOptions = {
          chart: {
            title: 'Assets & Depreciation',
            subtitle: '',
          }
        };

        var barChart = new google.charts.Bar(document.getElementById('columnchart_material'));
        barChart.draw(barChartData, google.charts.Bar.convertOptions(barChartOptions));
        
        var lineChartData = new google.visualization.DataTable();
        lineChartData.addColumn('number', 'MONTH');
        lineChartData.addColumn('number', 'Previous Projection');
        lineChartData.addColumn('number', 'Projection');
        lineChartData.addColumn('number', 'Depreciation');

        lineChartData.addRows([
            [1,  37.8, 80.8, 41.8],
            [2,  30.9, 69.5, 32.4],
            [3,  25.4,   57, 25.7],
            [4,  11.7, 18.8, 10.5],
            [5,  11.9, 17.6, 10.4],
            [6,   8.8, 13.6,  7.7],
            [7,   7.6, 12.3,  9.6],
            [8,  12.3, 29.2, 10.6],
            [9,  16.9, 42.9, 14.8],
            [10, 12.8, 30.9, 11.6],
            [11,  5.3,  7.9,  4.7],
            [12,  6.6,  8.4,  5.2],
            [13,  4.8,  6.3,  3.6],
            [14,  4.2,  6.2,  3.4]
          ]);
        
        var lineChartOptions = {
                chart: {
                  title: 'Comparison of Asset Control',
                  subtitle: ''
                }
              };
        var lineChart = new google.charts.Line(document.getElementById('linechart_material'));
		
       lineChart.draw(lineChartData, google.charts.Line.convertOptions(lineChartOptions));
    }
    </script>
   
   <script>
   google.charts.load('current', {'packages':['corechart']});
   google.charts.setOnLoadCallback(callLeftChart);
 
// 3. This function fires when Google Charts has been fully loaded
function callLeftChart() {

  // 4. Retrieve the raw JSON data
  var jsonData = $.ajax({
   // url: 'http://localhost:8080/coreChart',
    url:'https://myspringapp.herokuapp.com/coreChart',
    dataType: 'json',
  }).done(function (results) {
	console.log(results);
	let {pie, donut} = results ? results :null;
	console.log(pie);
	console.log(donut);
	var pieChartData = new google.visualization.DataTable(pie);
	console.log(pieChartData);
	var pieChartOptions = {
	           legend: 'none',
	           pieSliceText: 'label',
	           title: 'Asset Value By Category',
	           pieStartAngle: 100,
	         };

	 var pieChart = new google.visualization.PieChart(document.getElementById('myPieChart'));
     pieChart.draw(pieChartData, pieChartOptions);
	
    /*  var donutChartData = google.visualization.arrayToDataTable([
         ['Task', 'Depreciation By Category'],
         ['Building',     11],
         ['Vehicle',  2],
         ['Furniture', 2],
         ['Other',    7]
       ]); */
   	   var donutChartData = new google.visualization.DataTable(donut);
       var donutChartOptions = {
         title: 'Depreciation By Category',
         pieHole: 0.7,
       };

       var donutChart = new google.visualization.PieChart(document.getElementById('donutchart'));
       donutChart.draw(donutChartData, donutChartOptions);
  });

}


</script>
</head>
 <body>
   <div class="container">
  <div class="row justify-content-md-center">
    <div class="col-12 col-md-8" style="border: 1px solid black">
    <div id="columnchart_material"></div>
    </div>
    <div class="col-6 col-md-4" style="border: 1px solid black">
   <div id="donutchart"></div>
    </div>
  </div>

   <div class="row justify-content-md-center">
    <div class="col-12 col-md-8" style="border: 1px solid black">
      <div id="linechart_material"></div>
    </div>
    <div class="col-6 col-md-4" style="border: 1px solid black">
      <div id="myPieChart"  style="width: auto;"></div>
    </div>
  </div>
  </div>
</body>
</html>