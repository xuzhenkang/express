<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<title><s:property value="#session.student.getUsername()" />您好</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui-1.7.2.custom.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts/jquery.js" charset="UTF-8"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts/jquery-ui-1.7.2.custom.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts/PagerView.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts/TableView.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts/SelectorView.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts/common.js"></script>

</head>
<body>

<script type="text/javascript">
<!--
$(function(){
	$('#tabs').tabs();
});
//-->
</script>

<h1 class="title1">student. <s:property value="#session.student.getUsername()" />同学您好！</h1>

<div id="menu">
	<ul>
		<li><a href="index.html">Home</a></li>
		<li><a href="PagerView.html">PagerView</a></li>
		<li><a href="TableView.html">TableView</a></li>
		<li><a href="SelectorView.html">SelectorView</a></li>
		<li><a href="Style.html">CSS样式表</a></li>
		<li><a href="api/index.html">API文档</a></li>
		<li><a href="js-datagrid.zip">下载</a></li>
	</ul>
</div>
<div style="clear: both;"></div>



<div id="tabs">
	<ul>
		<li><a href="#tabs-1">Demo</a></li>
		<li><a href="#tabs-2">源码</a></li>
	</ul>
	<div id="tabs-1" style="background: #fff;">
<fieldset>
	<legend>可选框显示控件</legend>
	<div id="table_widget_toolbar">
		<input type="checkbox" name="title" value="title" checked="checked" />
		标题
		<input type="checkbox" name="" value="count" checked="checked" />
		计数
		<input type="checkbox" name="" value="marker" checked="checked" />
		行复选框
		<input type="checkbox" name="" value="filter" checked="checked" />
		过滤器
		<input type="checkbox" name="" value="pager" checked="checked" />
		分页控件
	</div>
</fieldset>

<div id="table_div"></div>

<input type="button" value="当前已选中的数据的ID列表"
	onclick="alert('当前已选中的数据的ID列表: ' + table.getSelectedKeys())" />

<script type="text/javascript">
<!--
var table = null;
$(function(){
	table = new TableView('table_div');
	table.header = {
		id			: 'Id',
		name		: 'Name',
		name_cn		: '中文名',
		text		: 'Text',
		input		: '输入'
	};
	table.dataKey = 'id';
	table.title = '可选';
	table.pager.size = 3;

	var input_html = '<input type="text" name="a" size="2" class="textbox" />';

	// table.addRange() 可以用来添加数据列表.
	table.add({id: 0, name: 'None', name_cn: '幽灵', text: 'None', input: input_html});
	table.add({id: 1, name: 'Tom', name_cn: '汤姆', text: 'Tomcat', input: input_html});
	table.add({id: 2, name: 'Jerry', name_cn: '杰瑞', text: 'Jerrimy', input: input_html});
	table.add({id: 3, name: 'Jim', name_cn: '吉姆', text: 'System Engineer', input: input_html});
	table.add({id: 4, name: 'Lucy', name_cn: '露西', text: 'Lucy & Lily', input: input_html});
	table.add({id: 5, name: 'Jessmine', name_cn: 'Jessmine', text: 'Jessmine is a girl', input: input_html});
	table.add({id: 6, name: 'Ta', name_cn: '他/她', text: '他/她', input: input_html});
	table.add({id: 7, name: 'ideawu', name_cn: '我', text: '<a href="http://www.ideawu.net/">http://www.ideawu.net/</a>', input: input_html});
	table.render();

	function change_layout(){
		$('#table_widget_toolbar input').each(function(i, cb){
			var val = cb.value;
			table.display[val] = cb.checked;
		});
		table.render();
	};

	$('#table_widget_toolbar input').each(function(i, cb){
		cb.onclick = change_layout;
	});

	change_layout();
});
//-->
</script>
	</div>
	<div id="tabs-2">
<pre>
&lt;div id="table_div"&gt;&lt;/div&gt;

&lt;script type="text/javascript"&gt;
&lt;!--
var table = new TableView('table_div');
table.header = {
	id			: 'Id',
	name		: 'Name',
	name_cn		: '中文名',
	text		: 'Text',
	input		: '输入'
};
table.dataKey = 'id';
table.display.filter = true;
table.display.pager = true;
table.pager.size = 3;

var input_html = '&lt;input type="text" name="a" size="2" class="textbox" /&gt;';

// table.addRange() 可以用来添加数据列表.
table.add({id: 0, name: 'None', name_cn: '幽灵', text: 'None', input: input_html});
table.add({id: 1, name: 'Tom', name_cn: '汤姆', text: 'Tomcat', input: input_html});
table.add({id: 2, name: 'Jerry', name_cn: '杰瑞', text: 'Jerrimy', input: input_html});
});
table.render();
//--&gt;
&lt;/script&gt;
</pre>
	</div>
</div>


</body>
</html>

