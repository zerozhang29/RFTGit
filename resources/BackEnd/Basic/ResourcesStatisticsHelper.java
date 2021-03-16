// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.BackEnd.Basic;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>ResourcesStatistics</b><br>
 * Generated     : <b>2021/03/16 ����2:32:04</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  3�� 16, 2021
 * @author zhangyu
 */
public abstract class ResourcesStatisticsHelper extends RationalTestScript
{
	/**
	 * febs�� with default state.
	 *		.id : febs
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_febs() 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_febs"));
	}
	/**
	 * febs�� with specific test context and state.
	 *		.id : febs
	 * 		.title : 
	 * 		.class : Html.DIV
	 * 		.classIndex : 0
	 */
	protected GuiTestObject html_febs(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("html_febs"), anchor, flags);
	}
	
	

	protected ResourcesStatisticsHelper()
	{
		setScriptName("BackEnd.Basic.ResourcesStatistics");
	}
	
}

