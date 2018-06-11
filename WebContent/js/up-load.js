/**
 * 文件上传
 */

$(function(){
	
	$("#upload-doc").click(function(){
		
		alert("add");
	});
	
	
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
