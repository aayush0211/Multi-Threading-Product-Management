package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import core.Product;
import core.ProductSortedName;
import core.ProductSortingThread;
import populatedProduct.PopulatedProductMap;

public class ProductManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			
			Map<Integer,Product> productList = new HashMap<>();
			 
			productList.putAll(PopulatedProductMap.populatedMap(productList));
			
			
			ProductSortingThread productSortingThread = new ProductSortingThread(productList);
			Thread t1 = new Thread(productSortingThread,"one");
			ProductSortedName productSortedName = new ProductSortedName(productList);
			Thread t2 = new Thread(productSortedName,"two");
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println("main over");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
