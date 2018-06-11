/**
 * 登录
 */

$(function(){
	//审核通过
	$(".check-success").each(function(){
		
		$(this).click(function(){
//			console.log($(this).parent().next());
			var id=$(this).parent().next().text();
			var docType=$(this).parent().prev().text();
			var uploader=$(this).parent().parent().children().eq(1).text(); //上传者
			var smg="check=已审核&id="+id+"&docType="+docType+"&uploader="+uploader;
			$.ajax({
				url	    :  "docAction!checkDoc.action",
				type    :  "post",
				data  	:  smg,
				dataType:  "text",
				async   :  true,
				success :  function(msg){
					alert(msg);
					alert("succ");
					
				}
			});
			$(this).parent().parent().remove(); //把自己删掉
		});
	});
});
