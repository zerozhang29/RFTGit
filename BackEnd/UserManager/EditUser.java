package BackEnd.UserManager;
import resources.BackEnd.UserManager.EditUserHelper;
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
public class EditUser extends EditUserHelper
{
	/**
	 * Script Name   : <b>AddUser</b>
	 * Generated     : <b>2021-3-9 ÏÂÎç6:13:27</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2021/03/09
	 * @author zhangyu
	 */
	public void testMain(Object[] args) 
	{
		//Add user	
		button_Add().click();
		text_username().setText("zengwx");
	    sleep(1); 
		text_pwd().setText("1234qwer");
		radioButton_active().click();
		button_submit().click();
	    sleep(1); 
	}
}

