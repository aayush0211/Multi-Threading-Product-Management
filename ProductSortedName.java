package core;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ProductSortedName implements Runnable {
	Map<Integer, Product> lists = new HashMap<>();

	public ProductSortedName(Map<Integer, Product> list) {
		super();
		lists.putAll(list);
	}

	@Override
	public void run() {
		try (PrintWriter pw = new PrintWriter(new FileWriter("ProductDataName.txt"))) {
			lists.values().stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(pw::println);
System.out.println(Thread.currentThread().getName()+" over");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}