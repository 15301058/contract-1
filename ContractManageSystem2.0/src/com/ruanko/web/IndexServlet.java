package com.ruanko.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IndexServlet extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		this.doGet(request, response);
	}
	
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");//����������ݵ�����
		response.setCharacterEncoding("UTF-8");//����������ݵı���
		PrintWriter out=response.getWriter();//��ȡ�������
		//���ͷ������
		out.println("<!DOCTYPE HTML PUBLIC'-//W3C//DTD HTML 4.01 Transitional//EN'>");
		//�����׼��HTML�ṹ
		out.println("<html>");
		out.println("<head>");
		//����ҳ���ַ�������
		out.println("<meta http-equiv='Cnotent-Type' content='text/html';charset='tuf-8'/>");
		out.println("<title>IndexxServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("��ӭ�����ͬ����ϵͳ");//ҳ����������Ϣ
		out.println("</body>");
		out.println("</html>");
		//��ղ��ر������
		out.flush();
		out.close();
	}
}
