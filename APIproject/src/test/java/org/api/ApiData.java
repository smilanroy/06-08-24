package org.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiData {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		Api2 a = new Api2(9, "ramesh", "ba");
		Api2 a1 = new Api2(10, "suresh", "pm");
		Api2 a2 = new Api2(11, "shiva", "pr");
		Api2 a3 = new Api2(12, "guru", "developer");
		Api2 a4 = new Api2(13, "bany", "head");

		List<Api2> li = new ArrayList<Api2>();
		li.add(a);
		li.add(a1);
		li.add(a2);
		li.add(a3);
		li.add(a4);

		Api1 ap = new Api1(1001, "Greenstech", 6767675437l, li);
		ObjectMapper map = new ObjectMapper();
		map.writeValue(new File("data.json"), ap);

		System.out.println("done");

	}

}
