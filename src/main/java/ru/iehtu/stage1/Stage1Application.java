package ru.iehtu.stage1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @SpringBootApplication
public class Stage1Application {

	public static void main(String[] args) {
		
		//Прямое управление. Всё сами, всё сами...
		

		System.out.println("Прямое управление");

		Work work = new Work("Уборщик"); // Создали раз объект
		Man worker = new Man(); // Создали два объект

		worker.setName("Вася"); // Установили параметры объекта - имя
		worker.setSalary(200); // И зарплату

		work.setWorker(worker); // Назначили человека на работу
		System.out.println(work.getInfoLos()); // Посчитали наши затраты на работу

		
		// Обратное управление. За нас всё сделает Framework

		System.out.println("Обратное управление");

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Work work2 = (Work)context.getBean("work");
		
		System.out.println(work2.getInfoLos());

		((AnnotationConfigApplicationContext) context).close();

	}

}
