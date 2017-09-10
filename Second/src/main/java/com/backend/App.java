package com.backend;
import java.math.BigDecimal;




import java.util.List;

import org.springframework.context.ApplicationContext;
//import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.backend.Service.ProductService;
import com.backend.configuration.AppCfg;
import com.backend.model.Product;
/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppCfg.class);
     	//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:hibernate.xml");  
     	;
     ProductService service = (ProductService) context.getBean("productService");
/*
     Create Product7*/
      
     Product Product1 = new Product();
     Product1.setCategory("Earphone");
     Product1.setStock(10);
     Product1.setPrice(new BigDecimal(360));
     Product1.setDescription("This is a 4GB pendrive");

     service.insertservice(Product1);
      /* Create Product2*/
      
    /* Product Product2 = new Product();
     Product2.setCategory("HardDisk");
     Product2.setStock(7);
     Product2.setPrice(new BigDecimal(4600));
     Product2.setDescription("It is of 1TB in size");
     
      /* Create Product3*/
      
    /* Product Product3 = new Product();
     Product3.setCategory("MemoryCard");
     Product3.setStock(7);
     Product3.setPrice(new BigDecimal(500));
     Product3.setDescription("Size of 16 Gb");
     
        */
       
    // service.insertservice(Product2);
     //service.insertservice(Product3);

     /*
      * Get all Products list from database
      */
     List<Product> Products = service.viewAllProduct();
     for (Product emp : Products) {
         System.out.println(emp);
     }

        service.deleteservice(134);

     /*
      * update an Product
      *         Product p = service.findBySsn("id");
         p.setPrice(new BigDecimal(4500));
         service.updateservice(p);
  

      */

  
 	    /*
      * Get all Products list from database
      */
     List<Product> ProductList = service.viewAllProduct();
     for (Product emp : ProductList) {
         System.out.println(emp);
     }

     //context.close();

        // System.out.println( "Hello World!" );
     }

       
    }

