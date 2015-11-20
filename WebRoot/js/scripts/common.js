$(function(){
	var url = location.href.replace(/\?.*$/, '');
	var file = url.substr(url.lastIndexOf('/') + 1);
	if(file == ''){
		file = 'index.html';
	}
	$('#menu a').each(function(i, a){
		a = $(a);
		if(a.attr('href') == file){
			a.addClass('on');
		}else{
			a.removeClass('on');
		}
	});
});

function add_event(tr){
	tr.onmouseover = function(){
		tr.className += ' hover';
	};
	tr.onmouseout = function(){
		tr.className = tr.className.replace(' hover', '');
	};
}

function stripe(table) {
	var trs = table.getElementsByTagName("tr");
	for(var i=1; i<trs.length; i++){
		var tr = trs[i];
		tr.className = i%2 != 0? 'odd' : 'even';
		add_event(tr);
	}
}

window.onload = function(){
	var tables = document.getElementsByTagName('table');
	for(var i=0; i<tables.length; i++){
		var table = tables[i];
		if(table.className == 'datagrid1' || table.className == 'datagrid2'
			|| table.className == 'datagrid3' || table.className == 'datagrid4'){
			stripe(tables[i]);
		}
	}
}		
