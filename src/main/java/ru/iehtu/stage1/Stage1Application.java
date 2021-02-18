package ru.iehtu.stage1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @SpringBootApplication
public class Stage1Application {

	public static void main(String[] args) {
		
		//Прямое управление. Всё сами, всё сами...
		
		Work work = new Work("Уборщик"); // Создали раз объект
		Man worker = new Man(); // Создали два объект

		worker.setName("Вася"); // Установили параметры объекта - имя
		worker.setSalary(100); // И зарплату

		work.setWorker(worker); // Назначили человека на работу
		System.out.println(work.getLoss()); // Посчитали наши затраты на работу

		
		// Обратное управление. За нас всё сделает Framework

		ApplicationContext context = new ClassPathXmlApplicationContext("main_cfg.xml");
		Work work2 = (Work)context.getBean("work");
		
		System.out.println(work2.getLoss());

		((ClassPathXmlApplicationContext)context).close();
	}

}
