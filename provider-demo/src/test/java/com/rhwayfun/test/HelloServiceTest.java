package com.rhwayfun.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @ClassName: HelloServiceTest 
 * @Description: TODO
 * @author ZhongCB
 * @date 2016��8��5�� ����5:17:52 
 *
 */
public class HelloServiceTest {

	public static void main(String[] args) throws IOException{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"application.xml"});
		ctx.start();
		System.out.println("�����ṩ����ע��ɹ���");
		System.in.read();
	}
}
