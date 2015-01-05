<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
    <h2>福音大会报名表</h2>
    <h4 class="alt"><a href="<c:url value="/"/>">Home</a></h4>
    <hr>
    <div class="span-4 colborder">
        <h6>联系我们</h6>
        <p><br/>CCLiFe<br/>
            670 Bonded Parkway, Streamwood, IL 60107, U.S.A.
            <br/><br/>
            电话：(630)837-7551 <br/>
            传真：(630)837-7552 <br/><br/>
            Web Page: www.cclifefl.org <br/>
            Email: cclifefl@gmail.com , cclife@gmail.com</p>
    </div>
    <div class="span-12 colborder">
        <h3 class="alt">Embedded Flow Area</h3>
        <div id="embeddedFlow">
            <a id="startFlow" href="cccc-flow">Start Embedded Flow</a>
            <script type="text/javascript">
                Spring.addDecoration(new Spring.AjaxEventDecoration({elementId: "startFlow", event: "onclick", params: {fragments: "body", mode: "embedded"}}));
            </script>
        </div>
    </div>
    <div class="span-4">
        <h6>香港中国福音大会</h6>
        <p>在2007年12月26～30日于香港举行的中国福音大会上，我用“为什么是耶稣基督并他钉十字架”这个题目，传讲了一篇关于福音大会之主题的信息。</p>
    </div>
</div>