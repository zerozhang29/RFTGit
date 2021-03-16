package BackEnd.Basic;
import resources.BackEnd.Basic.BroadbandUserHelper;
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
public class BroadbandUser extends BroadbandUserHelper
{
	/**
	 * Script Name   : <b>TrafficStatistic</b>
	 * Generated     : <b>2021-3-16 上午10:27:16</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.1  Build 7601 (S)
	 * 
	 * @since  2021/03/16
	 * @author zhangyu
	 */
	public void testMain(Object[] args) 
	{
		// 资源统计
		html_febs().click(atPoint(85,221));
		sleep(1);
		link_BroadbandUser().click();
		sleep(1);
	}
}

