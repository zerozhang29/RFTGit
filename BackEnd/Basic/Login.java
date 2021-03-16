package BackEnd.Basic;
import resources.BackEnd.Basic.LoginHelper;
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
public class Login extends LoginHelper
{
	/**
	 * Script Name   : <b>Login</b>
	 * Generated     : <b>2021-3-9 下午3:58:05</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2021/03/09
	 * @author zhangyu
	 */
	public void testMain(Object[] args) 
	{
		//启动浏览器并访问系统管理
		startApp("XAIPv6-BackEnd");
	    sleep(3);  
		//用户登录
		text_name().setText("admin");
	    sleep(1);   
		text_password().setText("123456");
	    sleep(1);   
		button_submit().click();
	    sleep(1);   
	    link_IPv6().performTest( IPv6Logo_PicVP() );
	}
}

