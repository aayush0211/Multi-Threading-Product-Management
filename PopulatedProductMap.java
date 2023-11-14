//private Integer pId;
//	private String name;
//	private double quantity;
//	private Double price;
//	private Category category;
package populatedProduct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Scanner;

import core.Category;
import core.Product;

public interface PopulatedProductMap {
	
	static Map<Integer,Product> populatedMap(Map<Integer, Product> list){
			list.put(1,new Product(1,"Pen",20,100.00,Category.BAD));
			list.put(2,new Product(2,"Copy",10,500.00,Category.GOOD));
			list.put(3,new Product(1,"Sangle",25,150.00,Category.VERYBAD));
			list.put(4,new Product(1,"Gapp",30,125.00,Category.GOOD));
			list.put(5,new Product(1,"gullu",20,325.00,Category.BAD));
			list.put(6,new Product(1,"Pullu",20,1000.00,Category.VERYBAD));
			list.put(7,new Product(1,"Vaishali",20,2300.00,Category.BAD));
			return list;
		}
	}

