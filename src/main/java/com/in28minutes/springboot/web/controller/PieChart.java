package com.in28minutes.springboot.web.controller;
/** **********Created Date :  2018/08/03 *********************** 
**************Created By: Aye Aye Maw***************************
***************Version : 1.0	********************************
*/
import java.util.List;

public class PieChart extends CoreChart {
	private final List<Object> cols;
    private final List<Object> rows;
    
 
    public PieChart(List<Object> cols, List<Object> rows) {
    	this.cols=cols;
        this.rows=rows;
    }

	public List<Object> getCols() {
		return cols;
	}

	public List<Object> getRows() {
		return rows;
	}
   
	
    
    
//	{
//		  "cols": [
//		        {"id":"","label":"Topping","pattern":"","type":"string"},
//		        {"id":"","label":"Slices","pattern":"","type":"number"}
//		      ],
//		  "rows": [
//		        {"c":[{"v":"Mushrooms","f":null},{"v":3,"f":null}]},
//		        {"c":[{"v":"Onions","f":null},{"v":1,"f":null}]},
//		        {"c":[{"v":"Olives","f":null},{"v":1,"f":null}]},
//		        {"c":[{"v":"Zucchini","f":null},{"v":1,"f":null}]},
//		        {"c":[{"v":"Pepperoni","f":null},{"v":2,"f":null}]}
//		      ]
//		}
}
