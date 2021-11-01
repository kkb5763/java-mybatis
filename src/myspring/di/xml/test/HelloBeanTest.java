package myspring.di.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

public class HelloBeanTest {

	public static void main(String[] args) {
		//IoC 컨테이너를 생성
		//1.ApplicationContext 객체 생성
		ApplicationContext context = new GenericXmlApplicationContext("classpath:config/beans.xml");
		//2. getBean() 호출
		Hello hello = (Hello)context.getBean("hello");
		//3. Hello 의 sayHello() 호출.
		System.out.println(hello.sayHello());
		//3. Hello의 printer() 호출
		hello.print();
		
		//StringPrinter  getBean()
		Printer printer = context.getBean("printer",Printer.class);
		System.out.println(printer.toString());
	}

}
