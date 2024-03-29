package easy;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
	
	public static List<Integer> gradingStudents(List<Integer>grades){
		//code
		List<Integer> output = new ArrayList<>();
		for(Integer grade:grades) {
			if(grade > 37) {
				int remainder = grade % 5;
				int quo = grade / 5;
				if(5-remainder <3) grade = (5 * (quo+1));
			}
			output.add(grade);
		}
		
		return output;
	}

	public static void main(String[] args) {
		//test
		List<Integer> grades = new ArrayList<>();
		grades.add(73);
		grades.add(67);
		grades.add(38);
		grades.add(0);
		
		
		List<Integer> output = gradingStudents(grades);
		printList(output);
		

	}
	
	public static void printList(List<Integer> list) {
		for(Integer i:list) {
			System.out.print(i + " ");
		}
	}

}
