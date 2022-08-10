package FakerDemo;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;

public class FakerDemo {

	public static void main(String[] args) {
		
		Faker fake = new Faker();
		String ad=fake.address().city();
		System.out.println(ad);////we will get dynamic value at each time

	}

}
