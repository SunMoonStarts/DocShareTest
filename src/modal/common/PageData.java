package modal.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modal.bean.Doc;

//返回页面的数据
public class PageData {

	/**
	 * 卡注销
	 * @param opera 	--页码操作 --上一页、下一页
	 * @param sourceList --源数据，全部数据
	 * @param request
	 * @param response--域对象
	 * @return 
	 */
	//卡-人  相关信息 ---领卡查询
	public static List<Doc> getCardPersonData(String opera, List<Doc> sourceList,
			HttpServletRequest request, HttpServletResponse response) {
		List<Doc> list = sourceList;
		//相关
		int count = 5; // 每页显示5个--个数
		int total = getTotalPage(list.size());
		int start = 0, end = 0; // 起止索引--对应的数据
		String p = request.getSession().getAttribute("card-person-page").toString(); // 当前页
		int page = Integer.parseInt(p);   // 最终显示的页码
		System.out.println("当前页=" + p);
		switch (opera) {
		case "next": { // 下一页
			// 1.计算下一页和总页码       2.先判断总页数，能否最后一页       3.对源数据进行取子串
			page++;
			if (page > total) { // 超出页码
				page--;
				start = (page - 1) * count;
				end = page * count;
			} else {
				start = (page - 1) * count;
				end = page * count;
			}
			break;
		}
		case "prev": { // 上一页
			page--;
			if (page <=0 ) { 
				page=1;
				start = (page - 1) * count;
				end = page * count;
			} else {
				start = (page - 1) * count;
				end = page * count;
			}
			break;
		}
		default:
			break;
		}
		if(end>list.size()) {  //索引超出
			end=list.size();
		}
		System.out.println("start="+start+" end="+end);
		request.getSession().setAttribute("card-person-page", page);
		list = list.subList(start, end);

		return list;
	}
	// 返回总页数--每页5条
	public static int getTotalPage(int totalPage) {

		if (totalPage == 0) { // 一页
			totalPage = 1;
		} else if ((totalPage % 5) != 0) {
			totalPage = totalPage / 5 + 1; // 每页数据5条

		} else if (totalPage % 5 == 0) {
			totalPage = totalPage / 5; // 5的整数倍

		}
		System.out.println("总页数：" + totalPage);
		return totalPage;
	}

}
