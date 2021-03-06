<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="embeddedFlow">
    <p class="notice">step 2 - Enter individual information</p>
    <form:form id="step2" action="${flowExecutionUrl}" modelAttribute="registrant">
        <table
            style="text-align: left; margin-left: auto; margin-right: auto;">
            <tbody>
                <tr>
                    <td>
                        <table
                            style="width: 900px; height: 61px; text-align: left; margin-left: auto; margin-right: auto;"
                            border="0" cellpadding="2" cellspacing="2">
                            <tbody>
                                <tr>
                                    <td>中文姓名:</td>
                                    <td><form:input path="person.chineseName" size="25"  /></td>
                                    <td>English Lastname:</td>
                                    <td><form:input id="lastName" path="person.lastName" size="25" maxlength="30"/></td>
                                    <td>English Firstname:</td>
                                    <td><form:input id="firstName" path="person.firstName" size="25" maxlength="30"/></td>
                                </tr>
                                <tr>
                                    <td>性别 Gender:</td>
                                    <td>
                                        <form:radiobutton path="person.gender" value="M" label="M"/>
                                        &#160;
                                        <form:radiobutton path="person.gender" value="F" label="F"/>
                                    <td>年龄 Age/Age Group:</td>
                                    <td>
                                        <form:select id="age" path="person.age">
                                            <form:option value="" label="-- Select Age --" />
                                            <form:options items="${form.ageGroup}" itemValue="value" itemLabel="label" />
                                        </form:select>
                                    </td>
                                    <td>年级 Grade:</td>
                                    <td>
                                        <form:select id="status" path="person.status">
                                            <form:option value="" label="-- Select Status --" />
                                            <form:options items="${form.statusGroup2}" itemValue="value" itemLabel="label" />
                                        </form:select></td>
                                </tr>
                                <tr>
                                    <td>关系 夫妻/子女等:</td>
                                    <td>[TODO]</td>
                                    <td>信主 Beliver:</td>
                                    <td>

                                        &nbsp;&nbsp;是 Yes &nbsp;&nbsp;<form:radiobutton path="person.acceptedChrist" value="1"/>
                                        否 No<form:radiobutton path="person.acceptedChrist" value="0"/> <br>

                                    </td>
                                    <td>事奉角色:</td>
                                    <td>
                                        <form:select id="status" path="person.status">
                                            <form:option value="" label="-- 服事 --" />
                                            <form:options items="${form.statusGroup}" itemValue="value" itemLabel="label" />
                                        </form:select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>语言 Language:</td>
                                    <td>国语
                                        Mandarin<form:radiobutton path="person.preferedLanguage" value="M" /></td>
                                    <td>广东话 Cantonese <form:radiobutton path="person.preferedLanguage" value="C" /></td>
                                    <td>英文 English <form:radiobutton path="person.preferedLanguage" value="E" /><
                                    <td>翻译耳机 <br>
                                        Interpreter Headerphone: </td>
                                    <td>[TODO]</td>
                                </tr>
                                <tr>
                                    <td>电邮 &nbsp;Email:</td>
                                    <td colspan="5" rowspan="1"><form:input id="email" path="person.email" size="25" maxlength="50"/></td>
                                </tr>
                            </tbody>
                        </table>
                    </td>
                </tr>
            </tbody>
        </table>
        <hr style="width: 80%; height: 2px;">

        <table style="text-align: left; width: 500px; height: 62px;"
               align="center" border="0" cellpadding="2" cellspacing="2">
            <tbody>
                <tr>
                    <td colspan="4" rowspan="1" align="center"><b>大会义工</b></td>
                </tr>
                <tr>
                    <td>招待 &nbsp;<form:checkbox path="volunteerJobs" value="USHERS"/></td>
                    <td>幼儿看顾 &nbsp;<form:checkbox path="volunteerJobs" value="NURSERY_HELPER"/></td>
                    <td>翻译 &nbsp;<form:checkbox path="volunteerJobs" value="INTERPRETER"/></td>
                    <td>音影 &nbsp;<form:checkbox path="volunteerJobs" value="AUDIO_VISUAL"/></td>
                </tr>
                <tr>
                    <td>陪谈 &nbsp;<form:checkbox path="volunteerJobs" value="FOLLOWUP"/></td>
                    <td>交通 &nbsp;<form:checkbox path="volunteerJobs" value="TRANSPORTATION"/></td>
                    <td>医疗 &nbsp;<form:checkbox path="volunteerJobs" value="MEDICAL_SUPPORT"/></td>
                    <td>其他 &nbsp;<form:checkbox path="volunteerJobs" value="OTHER"/></td>
                </tr>
            </tbody>
        </table>
        <hr style="width: 80%; height: 2px;">
        <table
            style="text-align: center; margin-left: auto; margin-right: auto;">
            <tbody>
                <tr>
                    <td colspan="3" rowspan="1"><b>订餐</b></td>
                </tr>
                <tr>
                    <td>&nbsp; &nbsp;Dec. 28 &nbsp; </td>
                    <td>&nbsp; &nbsp;Dec. 29 &nbsp; </td>
                    <td>&nbsp; Dec. 30 &nbsp;</td>
                </tr>
                <tr>
                    <td>午餐 &nbsp;<form:checkbox path="mealplan.lunch1" value="1"/></td>
                    <td>午餐 &nbsp;<form:checkbox path="mealplan.lunch2" value="1"/></td>
                    <td>午餐 &nbsp;<form:checkbox path="mealplan.lunch3" value="1"/></td>
                </tr>
                <tr>
                    <td>晚餐 &nbsp;<form:checkbox path="mealplan.dinner1" value="1"/></td>
                    <td>晚餐 &nbsp;<form:checkbox path="mealplan.dinner2" value="1"/></td>
                    <td>晚餐 &nbsp;<form:checkbox path="mealplan.dinner3" value="1"/></td>
                </tr>
            </tbody>
        </table>
        <hr style="width: 80%; height: 2px;">

        <button id="cancel" type="submit" name="_eventId_cancel">Cancel</button>
        <button id="previous" type="submit" name="_eventId_previous">&lt;&lt; Previous</button>
        <button id="next" type="submit" name="_eventId_next">Next &gt;&gt;</button>
        <script type="text/javascript">
            Spring.addDecoration(new Spring.AjaxEventDecoration({elementId: 'next', event: 'onclick', formId: 'step2', params: {fragments: "body"}}));
            Spring.addDecoration(new Spring.AjaxEventDecoration({elementId: 'previous', event: 'onclick', formId: 'step2', params: {fragments: "body"}}));
            Spring.addDecoration(new Spring.AjaxEventDecoration({elementId: 'cancel', event: 'onclick', formId: 'step2', params: {fragments: "body"}}));
        </script>

    </form:form>
</div>