<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="embeddedFlow">
    <p class="notice">This is step 1 of the embedded flow</p>
    <form:form id="step1" action="${flowExecutionUrl}" modelAttribute="form" >
        <table>
            <tr>
                <td colspan="3"> 
                    <p>如果您的教會不在名單上, 請選擇 Others并在此資料填上您的教會資料.If your church is not in the list above, please select <b>Others</b>, and enter information here</p>
                    教會/團契/查經班名稱： 
            <form:input path="churchName" name="churchName" size="20" maxlength="50"/><br/>
            城市City 
            <form:input path="churchCity" name="churchCity" size="10" maxlength="15"/><br/>
            州State
            <form:input path="churchState" size="5" maxlength="5"/><br/>
            教會聯絡人：
            <form:input path="coordinator" size="15" maxlength="15"/><br/>
            </td>
            </tr>
        </table>
        <button id="cancel" type="submit" name="_eventId_cancel">Cancel</button>
        <button id="next" type="submit" name="_eventId_next">Next &gt;&gt;</button>
        <script type="text/javascript">
            Spring.addDecoration(new Spring.AjaxEventDecoration({elementId: 'next', event: 'onclick', formId: 'step1', params: {fragments: "body"}}));
            Spring.addDecoration(new Spring.AjaxEventDecoration({elementId: 'cancel', event: 'onclick', formId: 'step1', params: {fragments: "body"}}));
        </script>
    </form:form>
 
</div>