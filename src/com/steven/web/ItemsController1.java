package com.steven.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.steven.bean.Items;
//������Handler����
public class ItemsController1 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		//ʵ�����ǵ���service�������ݿ⣬��ѯ��Ʒ�б�����ֱ��ʹ�þ�̬������ģ����
		List<Items> itemsList = new ArrayList<Items>();
		//��list����侲̬����
		Items items_1 = new Items();
		items_1.setName("����ʼǱ�");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");
		
		Items items_2 = new Items();
		items_2.setName("ƻ���ֻ�");
		items_2.setPrice(5000f);
		items_2.setDetail("iPhone6ƻ���ֻ���");
		itemsList.add(items_1);
		itemsList.add(items_2);
		//����ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//�൱��request��setAttribute����jspҳ����ͨ��itemsListȡ����
		modelAndView.addObject("itemaList", itemsList);
		//ָ����ͼ
		modelAndView.setViewName("itemaList.jsp");
		return modelAndView;
	}

}
