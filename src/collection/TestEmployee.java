package collection;

import java.util.HashSet;
import java.util.Set;

import javax.sound.midi.Soundbank;

import equals.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		Employee e1 = new Employee("001");
		Employee e2 = new Employee("001");

		set.add(e1);
		set.add(e2);
		
		System.out.println(e1.equals(e2));
		System.out.println(set.size());
		
		

		
	}

}
