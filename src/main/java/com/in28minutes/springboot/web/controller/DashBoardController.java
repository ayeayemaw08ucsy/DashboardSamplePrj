package com.in28minutes.springboot.web.controller;
/** **********Created Date :  2018/08/03 *********************** 
**************Created By: Aye Aye Maw***************************
***************Version : 1.0	********************************
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DashBoardController {

	@RequestMapping("/coreChart")
    public Map<String,CoreChart> filling() {
		List<Object> cols = new ArrayList<Object>();
		List<Object> rows = new ArrayList<Object>();
		Map<String,String> col1 = new HashMap<String,String>();
		col1.put("id", "");
		col1.put("label", "Category");
		col1.put("pattern", "");
		col1.put("type", "string");
		
			
		Map<String,String> col2 = new HashMap<String,String>();
		col2.put("id", "");
		col2.put("label", "Asset Value By Category");
		col2.put("pattern", "");
		col2.put("type", "number");
		cols.add(col1);
		cols.add(col2);
		

		Map<String,Object> row1 = new HashMap<String,Object>();
		Map<String,Object> row2 = new HashMap<String,Object>();
		Map<String,Object> row3 = new HashMap<String,Object>();
		Map<String,Object> row4 = new HashMap<String,Object>();
		
		List<Object> row1arr = new ArrayList<Object>();
		List<Object> row2arr = new ArrayList<Object>();
		List<Object> row3arr = new ArrayList<Object>();
		List<Object> row4arr = new ArrayList<Object>();
		
		Map<String,String> row1arrdata1 = new HashMap<String,String>();
		row1arrdata1.put("v", "Furniture");
		row1arrdata1.put("f", null);
		
		Map<String,Object> row1arrdata1Value = new HashMap<String,Object>();
		row1arrdata1Value.put("v", 3);
		row1arrdata1Value.put("f", null);
		row1arr.add(row1arrdata1);
		row1arr.add(row1arrdata1Value);
		
		Map<String,String> row2arrdata = new HashMap<String,String>();
		row2arrdata.put("v", "Building");
		row2arrdata.put("f", null);
		Map<String,Object> row2arrdataValue = new HashMap<String,Object>();
		row2arrdataValue.put("v", 4);
		row2arrdataValue.put("f", null);
		row2arr.add(row2arrdata);
		row2arr.add(row2arrdataValue);
		
		Map<String,String> row3arrdata = new HashMap<String,String>();
		row3arrdata.put("v", "Vehicle");
		row3arrdata.put("f", null);
		Map<String,Object> row3arrdataValue = new HashMap<String,Object>();
		row3arrdataValue.put("v", 1.66);
		row3arrdataValue.put("f", null);
		row3arr.add(row3arrdata);
		row3arr.add(row3arrdataValue);
		
		Map<String,String> row4arrdata = new HashMap<String,String>();
		row4arrdata.put("v", "Other");
		row4arrdata.put("f", null);
		Map<String,Object> row4arrdataValue = new HashMap<String,Object>();
		row4arrdataValue.put("v", 2);
		row4arrdataValue.put("f", null);
		row4arr.add(row4arrdata);
		row4arr.add(row4arrdataValue);
		
		row1.put("c", row1arr);
        row2.put("c",row2arr);
        row3.put("c",row3arr);
        row4.put("c",row4arr);
        
		rows.add(row1);
		rows.add(row2);
		rows.add(row3);
		rows.add(row4);
		
		
		//Prepare Data for Donut Chart
        List<Object> donutCols = new ArrayList<Object>();
		List<Object> donutRows = new ArrayList<Object>();
		Map<String,String> donutCol1 = new HashMap<String,String>();
		donutCol1.put("id", "");
		donutCol1.put("label", "Category");
		donutCol1.put("pattern", "");
		donutCol1.put("type", "string");
		
			
		Map<String,String> donutCol2 = new HashMap<String,String>();
		donutCol2.put("id", "");
		donutCol2.put("label", "Asset Value By Category");
		donutCol2.put("pattern", "");
		donutCol2.put("type", "number");
		donutCols.add(donutCol1);
		donutCols.add(donutCol2);
		

		Map<String,Object> donutRow1 = new HashMap<String,Object>();
		Map<String,Object> donutRow2 = new HashMap<String,Object>();
		Map<String,Object> donutRow3 = new HashMap<String,Object>();
		Map<String,Object> donutRow4 = new HashMap<String,Object>();
		
		List<Object> donutRow1arr = new ArrayList<Object>();
		List<Object> donutRow2arr = new ArrayList<Object>();
		List<Object> donutRow3arr = new ArrayList<Object>();
		List<Object> donutRow4arr = new ArrayList<Object>();
		
		Map<String,String> donutRow1arrdata1 = new HashMap<String,String>();
		donutRow1arrdata1.put("v", "Furniture");
		donutRow1arrdata1.put("f", null);
		
		Map<String,Object> donutRow1arrdata1Value = new HashMap<String,Object>();
		donutRow1arrdata1Value.put("v", 11);
		donutRow1arrdata1Value.put("f", null);
		donutRow1arr.add(donutRow1arrdata1);
		donutRow1arr.add(donutRow1arrdata1Value);
		
		Map<String,String> donutRow2arrdata = new HashMap<String,String>();
		donutRow2arrdata.put("v", "Building");
		donutRow2arrdata.put("f", null);
		Map<String,Object> donutRow2arrdataValue = new HashMap<String,Object>();
		donutRow2arrdataValue.put("v", 2);
		donutRow2arrdataValue.put("f", null);
		donutRow2arr.add(donutRow2arrdata);
		donutRow2arr.add(donutRow2arrdataValue);
		
		Map<String,String> donutRow3arrdata = new HashMap<String,String>();
		donutRow3arrdata.put("v", "Vehicle");
		donutRow3arrdata.put("f", null);
		Map<String,Object> donutRow3arrdataValue = new HashMap<String,Object>();
		donutRow3arrdataValue.put("v", 2);
		donutRow3arrdataValue.put("f", null);
		donutRow3arr.add(donutRow3arrdata);
		donutRow3arr.add(donutRow3arrdataValue);
		
		Map<String,String> donutRow4arrdata = new HashMap<String,String>();
		donutRow4arrdata.put("v", "Other");
		donutRow4arrdata.put("f", null);
		Map<String,Object> donutRow4arrdataValue = new HashMap<String,Object>();
		donutRow4arrdataValue.put("v", 9);
		donutRow4arrdataValue.put("f", null);
		donutRow4arr.add(donutRow4arrdata);
		donutRow4arr.add(donutRow4arrdataValue);
		
		donutRow1.put("c", donutRow1arr);
		donutRow2.put("c",donutRow2arr);
		donutRow3.put("c",donutRow3arr);
		donutRow4.put("c",donutRow4arr);
        
		donutRows.add(donutRow1);
		donutRows.add(donutRow2);
		donutRows.add(donutRow3);
		donutRows.add(donutRow4);
        
        Map<String,CoreChart> result = new HashMap<String,CoreChart>();
        result.put("pie", new PieChart(cols,rows));
        result.put("donut", new PieChart(donutCols,donutRows));
        return result;
    }

	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView showDashBoardPage(ModelMap model){
		
		return new ModelAndView("dashboard", (Map) model);
	}
}
