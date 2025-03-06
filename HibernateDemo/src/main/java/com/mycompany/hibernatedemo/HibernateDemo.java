/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hibernatedemo;

import com.ntl.repository.impl.CategoryRepositoryImpl;
import com.ntl.repository.impl.ProductRepositoryImpl;
import com.ntl.repository.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
        
        StatsRepositoryImpl s=new StatsRepositoryImpl();
        s.statsRevenueByProduct().forEach(o->System.out.printf("%d - %s -%d\n",o[0] ,o[1],o[2]));
    }
////        CategoryRepositoryImpl s=new CategoryRepositoryImpl();
////        s.getCates().forEach(c->System.err.println(c.getId()));
////        
////        
//
//        Map<String, String> params = new HashMap<>();
//       
//        params.put("kw", "iPhone");
//        params.put("page", "2");
//  //      params.put("categoryId", "1");
//
//        ProductRepositoryImpl s2 = new ProductRepositoryImpl();
//        s2.getProducts(params).forEach(p -> System.err.printf("%d - %s - %d\n", p.getId(), p.getName(),p.getPrice()));
//    }
}
