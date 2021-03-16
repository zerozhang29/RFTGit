// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources.BackEnd.UserManager;

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
 * Script Name   : <b>AddUser</b><br>
 * Generated     : <b>2021/03/09 下午6:24:27</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 7 x86 6.1 <br>
 * 
 * @since  3月 09, 2021
 * @author zhangyu
 */
public abstract class AddUserHelper extends RationalTestScript
{
	/**
	 * 新增button： with default state.
	 *		.id : 
	 * 		.type : button
	 * 		.value : 新 增
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 4
	 */
	protected GuiTestObject button_Add() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_Add"));
	}
	/**
	 * 新增button： with specific test context and state.
	 *		.id : 
	 * 		.type : button
	 * 		.value : 新 增
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 4
	 */
	protected GuiTestObject button_Add(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_Add"), anchor, flags);
	}
	
	/**
	 * 提交button： with default state.
	 *		.id : 
	 * 		.type : button
	 * 		.value : 提 交
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_submit() 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_submit"));
	}
	/**
	 * 提交button： with specific test context and state.
	 *		.id : 
	 * 		.type : button
	 * 		.value : 提 交
	 * 		.title : 
	 * 		.class : Html.BUTTON
	 * 		.name : 
	 * 		.classIndex : 1
	 */
	protected GuiTestObject button_submit(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("button_submit"), anchor, flags);
	}
	
	/**
	 * _1： with default state.
	 *		.id : 
	 * 		.type : radio
	 * 		.value : 1
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_active() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_active"));
	}
	/**
	 * _1： with specific test context and state.
	 *		.id : 
	 * 		.type : radio
	 * 		.value : 1
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_active(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_active"), anchor, flags);
	}
	
	/**
	 * _0： with default state.
	 *		.id : 
	 * 		.type : radio
	 * 		.value : 0
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_lock() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_lock"));
	}
	/**
	 * _0： with specific test context and state.
	 *		.id : 
	 * 		.type : radio
	 * 		.value : 0
	 * 		.title : 
	 * 		.class : Html.INPUT.radio
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject radioButton_lock(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("radioButton_lock"), anchor, flags);
	}
	
	/**
	 * _1234qwer： with default state.
	 *		.id : 
	 * 		.type : password
	 * 		.title : 
	 * 		.class : Html.INPUT.password
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pwd() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pwd"));
	}
	/**
	 * _1234qwer： with specific test context and state.
	 *		.id : 
	 * 		.type : password
	 * 		.title : 
	 * 		.class : Html.INPUT.password
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_pwd(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_pwd"), anchor, flags);
	}
	
	/**
	 * username： with default state.
	 *		.id : username
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_username() 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_username"));
	}
	/**
	 * username： with specific test context and state.
	 *		.id : username
	 * 		.type : text
	 * 		.title : 
	 * 		.class : Html.INPUT.text
	 * 		.name : 
	 * 		.classIndex : 0
	 */
	protected TextGuiTestObject text_username(TestObject anchor, long flags) 
	{
		return new TextGuiTestObject(
                        getMappedTestObject("text_username"), anchor, flags);
	}
	
	

	protected AddUserHelper()
	{
		setScriptName("BackEnd.UserManager.AddUser");
	}
	
}

