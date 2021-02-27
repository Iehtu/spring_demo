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
		

		System.out.println("\nПрямое управление\n");

		Work work = new Work("уборщик"); // Создали раз объект
		Man worker = new Man(); // Создали два объект

		worker.setName("Вася"); // Установили параметры объекта - имя
		worker.setSalary(200); // И зарплату

		work.setWorker(worker); // Назначили человека на работу
		System.out.println(work.getInfoLos()); // Посчитали наши затраты на работу

		
		// Обратное управление. За нас всё сделает Framework

		System.out.println("\nОбратное управление. Определим Бины через XML\n");

		ApplicationContext xmlContext = new ClassPathXmlApplicationContext("main_cfg.xml");
		Work work2 = xmlContext.getBean(Work.class);
		
		System.out.println(work2.getInfoLos());

		((ClassPathXmlApplicationContext) xmlContext).close();

		System.out.println("\nОбратное управление. Определим Бины через Java\n");

		ApplicationContext javaContext = new AnnotationConfigApplicationContext(Config.class);
		Work work_java  = javaContext.getBean(Work.class);
		System.out.println(work_java.getInfoLos());
		((AnnotationConfigApplicationContext) javaContext).close();

		System.out.println("\nОбратное управление. Определим Бины через Annotation\n");

		ApplicationContext annotationContext = new AnnotationConfigApplicationContext(ConfigAnnotation.class);
		Work work_annotation  = annotationContext.getBean(Work.class);
		System.out.println(work_annotation.getInfoLos());
		((AnnotationConfigApplicationContext) annotationContext).close();

	}

}
