/**
 * 后台管理界面首页
 */

$(function() {
	
	var bathPath=$(".base-path").attr("name");
	var iframe=$("#ifrm")
	//手风琴菜单配置
	var icons = {
		header : "ui-icon-circle-plus",  //关闭时的图标
		activeHeader : "ui-icon-circle-minus"   //开启时 的图标
	};
	$("#accordion").accordion({
		icons : icons
	});
	$("#toggle").button().on("click", function() {
		if ($("#accordion").accordion("option", "icons")) {
			$("#accordion").accordion("option", "icons", null);
		} else {
			$("#accordion").accordion("option", "icons", icons);
		}
	});
	
	//改变iframe，切换页面
	$("#accordion a").each(function(){
		
		$(this).click(function(e){
			e.preventDefault();   //阻止链接的跳转
			//面包削导航
			var sec_menu_val=$(this).parent().prev().text();
			var third_menu_val=$(this).text();
			$("#sec_menu").text(sec_menu_val);
			$("#third_menu").text(third_menu_val);
			$("#accordion a").removeClass("a-bg");
			$(this).addClass("a-bg");
			//改变iframe
			var url=bathPath+$(this).attr("name");
			console.log(url);
			iframe.attr("src",url);
			
		});
		
	});
	
});
