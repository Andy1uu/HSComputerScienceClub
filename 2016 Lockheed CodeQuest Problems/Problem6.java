import java.util.*;

public class Problem6 {
	public static class Student implements Comparable<Student> {
		String name;
		double gpa;
		int creditHours;

		public Student(String name, double gpa, int creditHours) {
			this.name = name;
			this.gpa = gpa;
			this.creditHours = creditHours;
		}

		public int compareTo(Student other) {
			if ((this.gpa < other.gpa)|| ((this.gpa == other.gpa)&&(this.creditHours<other.creditHours))) {
				return -1;
			} else if ((this.gpa > other.gpa)|| ((this.gpa == other.gpa)&&(this.creditHours>other.creditHours))) {
				return 1;
			} else {
				return 0;
			}

		}

		public String toString() {
			return name;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt(), totalGradePoints = 0, gradePoints = 0, totalCreditHours = 0;
		double gpa;
		in.nextLine();
		for (int i = 0; i < cases; i++) {
			ArrayList<Student> students = new ArrayList<Student>();
			String hs = in.nextLine();
			int numStudents = in.nextInt();
			in.nextLine();
			for (int j = 0; j < numStudents; j++) {
				String nameGrades[] = in.nextLine().split(":");
				//System.out.println(nameGrades[1]);
				String eachClass[] = nameGrades[1].split(",");
				for (int k = 0; k < eachClass.length; k++) {
					String letterGrade = eachClass[k].substring(0,1);
					//System.out.println("Letter Grade: "+letterGrade);
					int creditHours = Integer.parseInt(eachClass[k].substring(1, 2));
					//System.out.println("Credit Hours: "+creditHours);
					if (letterGrade.equals("A")) {
						gradePoints = 4;

					} else if (letterGrade.equals("B")) {
						gradePoints = 3;

					} else if (letterGrade.equals("C")) {
						gradePoints = 2;

					} else {
						gradePoints = 1;
					}
					totalGradePoints += (gradePoints * creditHours);
					//System.out.println("Total Grade Points:"+totalGradePoints);
					totalCreditHours += creditHours;
					//System.out.println("Total Credit Hours:"+totalCreditHours);
				}
				gpa = (((double) (totalGradePoints))/ ((double)(totalCreditHours)));
				students.add(new Student(nameGrades[0], gpa, totalCreditHours));
				totalGradePoints = 0;
				totalCreditHours = 0;
			}
			Collections.sort(students);
			//System.out.println(students);
			System.out.println(hs + " = " + students.get(students.size() - 1));
		}
	}
}
