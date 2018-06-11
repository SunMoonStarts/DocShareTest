/**
 * 文件上传
 */

$(function(){
	
	var bathPath=$(".base-path").attr("name");
	$("#upload-btn").click(function(e){
		e.preventDefault();
		var title=$("#upload input").eq(0).val();  //标题
		var integral=$(".doc-integral").val();  //下载 积分
		if(title.length<=0 || integral.length<=0){
			alert("请输入值");
			return;
		}
		var url="upload";
//		$("#upload").attr("action",bathPath+url);
		$("#upload").submit();
	});
	
	//添加多个文档
	function addMore() {
		var td = document.getElementById("more");

		var br = document.createElement("br");
		var input = document.createElement("input");
		var button = document.createElement("input");

		input.type = "file";
		input.name = "myfile";

		button.type = "button";
		button.value = "Remove";

		button.onclick = function() {
			td.removeChild(br);
			td.removeChild(input);
			td.removeChild(button);
		}

		td.appendChild(br);
		td.appendChild(input);
		td.appendChild(button);
	}
});

