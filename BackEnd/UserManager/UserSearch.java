package BackEnd.UserManager;
import resources.BackEnd.UserManager.UserSearchHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author zhangyu
 */
public class UserSearch extends UserSearchHelper
{
	/**
	 * Script Name   : <b>UserSearch</b>
	 * Generated     : <b>2021-3-9 ÏÂÎç5:32:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2021/03/09
	 * @author zhangyu
	 */
	public void testMain(Object[] args) 
	{
		// search
	    button_Reset().click();
		text_keyword().setText("test");
		button_search().click();
	    sleep(1);   
	    checkBox_select().click();
	    button_Reset().click();
	    sleep(1); 
	}
}

