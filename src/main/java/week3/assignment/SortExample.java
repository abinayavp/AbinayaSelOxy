package week3.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		List<String> company = new ArrayList<String>();
		company.add("Hcl");
		company.add("Cts");
		company.add("Aspire System");
		System.out.println(company.size());
		Collections.sort(company);	
		System.out.println(company);

	}

}
