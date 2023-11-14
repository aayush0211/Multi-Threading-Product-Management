package core;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class ProductSortingThread implements Runnable {
	Map<Integer, Product> lists = new HashMap<>();

	public ProductSortingThread(Map<Integer, Product> list) {
		super();
		lists.putAll(list);
	}

	@Override
	public void run() {
		try (PrintWriter pw = new PrintWriter(new FileWriter("ProductData.txt"))) {
			lists.values().stream().sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())).forEach(pw::println);
System.out.println(Thread.currentThread().getName()+" thread over");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
