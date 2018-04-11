package com.konylabs.ffi;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Vector;
import com.konylabs.api.TableLib;
import com.konylabs.vm.LuaTable;



import com.mapfre.ffi.AnalyticsWrapper;
import com.konylabs.libintf.Library;
import com.konylabs.libintf.JSLibrary;
import com.konylabs.vm.LuaError;
import com.konylabs.vm.LuaNil;


public class N_analytics extends JSLibrary {

 
 
	public static final String trackEvent = "trackEvent";
 
	String[] methods = { trackEvent };


 Library libs[] = null;
 public Library[] getClasses() {
 libs = new Library[0];
 return libs;
 }



	public N_analytics(){
	}

	public Object[] execute(int index, Object[] params) {
		// TODO Auto-generated method stub
		Object[] ret = null;
 try {
		int paramLen = params.length;
 int inc = 1;
		switch (index) {
 		case 0:
 if (paramLen != 3){ return new Object[] {new Double(100),"Invalid Params"}; }
 java.lang.String category0 = null;
 if(params[0] != null && params[0] != LuaNil.nil) {
 category0 = (java.lang.String)params[0];
 }
 java.lang.String action0 = null;
 if(params[1] != null && params[1] != LuaNil.nil) {
 action0 = (java.lang.String)params[1];
 }
 java.lang.String label0 = null;
 if(params[2] != null && params[2] != LuaNil.nil) {
 label0 = (java.lang.String)params[2];
 }
 ret = this.trackEvent( category0, action0, label0 );
 
 			break;
 		default:
			break;
		}
 }catch (Exception e){
			ret = new Object[]{e.getMessage(), new Double(101), e.getMessage()};
		}
		return ret;
	}

	public String[] getMethods() {
		// TODO Auto-generated method stub
		return methods;
	}
	public String getNameSpace() {
		// TODO Auto-generated method stub
		return "analytics";
	}


	/*
	 * return should be status(0 and !0),address
	 */
 
 
 	public final Object[] trackEvent( java.lang.String inputKey0, java.lang.String inputKey1, java.lang.String inputKey2 ){
 
		Object[] ret = null;
 com.mapfre.ffi.AnalyticsWrapper.trackEvent( inputKey0
 , inputKey1
 , inputKey2
 );
 
 ret = new Object[]{LuaNil.nil, new Double(0)};
 		return ret;
	}
 
};
