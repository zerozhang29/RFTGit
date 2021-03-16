package BackEnd.Basic;
import resources.BackEnd.Basic.UserManagerHelper;
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
public class UserManager extends UserManagerHelper
{
	/**
	 * Script Name   : <b>UserManager</b>
	 * Generated     : <b>2021-3-9 ÏÂÎç5:01:32</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2021/03/09
	 * @author zhangyu
	 */
	public void testMain(Object[] args) 
	{		
        //usermanager
		html_febs().click(atPoint(229,176));
		link_usermanager().click();
	    sleep(1);   
	}
}

