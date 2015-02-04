<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div id="embeddedFlow">
    <p class="notice">Pay by CREDIT</p>
    <form:form id="review" action="${flowExecutionUrl}" modelAttribute="form">
        <div>
            <hr style="width: 80%; height: 2px;">
            TODO: Add connection to PAYPAL <br/>
            <form:form method="post" modelAttribute="payObj" action="https://www.paypal.com/cgi-bin/webscr">
                ${payObj.item_name}
            </form:form>
            <hr style="width: 80%; height: 2px;">
            <a id="startFlow" href="cccc-flow">Start Over</a>
            <script type="text/javascript">
                Spring.addDecoration(new Spring.AjaxEventDecoration({elementId: "startFlow", event: "onclick", params: {fragments: "body", mode: "embedded"}}));
            </script>
        </div>

    </form:form>
</div>