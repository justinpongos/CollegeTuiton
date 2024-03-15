import java.util.ArrayList;
public class StudentDriver {
	public static void main(String[]args) {
		
		ArrayList <Student> s = new ArrayList<Student>();
			s.add(new PostGraduate("Doug","Chicano Literature",6));
			s.add(new PostGraduate("Isaac","Technology",4));
			s.add(new Graduate("Guarav","Computer Science",5));
			s.add(new Graduate("Zoe","Engeneering",12));
			s.add(new UnderGrad("Carl","Gender Studies",3));
			s.add(new UnderGrad("Qu","Computer Science",5));
			
			Student[][] StudentBody = new Student[1][1];
				for (int x = 0; x < s.size(); x++) {
					for(int row = 0; row < StudentBody.length; row++) {
						for(int col = 0; col < StudentBody[0].length; col++) {
							StudentBody[row][col] = s.get(x);		
							System.out.print(StudentBody[row][col] + " ()()() "); // printing it in grid format
						}//end for 
						if (x % 2 == 1) { // 2 = num of columns + everytime u change 2 you add one to the right side
							System.out.println("\n");
					}//end if
				}//end for
		}//end for
	}//end main
}//end class
