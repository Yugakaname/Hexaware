import java.util.*;

class Books {
	String bookname;
	int cost;
	String Author;
	static int count = 0;

	Books() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Doctor name:");
		Author = sc.nextLine();
	}

	public void display() {
		System.out.println("Doctor Name:" + bookname + "\nCost:" + cost + "\nDoctor name:" + Author);
	}

	public void raisecost() {

	}
}

class CompetetiveExambooks extends Books {
	public CompetetiveExambooks() {
		cost = 1000;
		bookname = "UPSC";
	}

	public void raisecost() {
		cost = cost + 500;
	}

}

class Academic extends Books {
	public Academic() {
		cost = 500;
		bookname = "Java";
	}

	public void raisecost() {
		cost = cost + 200;
	}
}

class Entertain extends Books {
	public Entertain() {
		cost = 300;
		bookname = "Entertainment";
	}

	public void raisecost() {
		cost = cost + 200;
	}
}

public class CollectionProjectJava {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0;
		ArrayList<Books> list = new ArrayList<Books>();
		do {
			System.out.println("*****************************");
			System.out.println("1.Create Profile");
			System.out.println("2.Display Profile");
			System.out.println("3.RaiseCost");
			System.out.println("4.Exit");
			System.out.println("*********************************");
			System.out.println("Enter choice:");
			Scanner sc1 = new Scanner(System.in);
			n1 = sc1.nextInt();
			if (n1 == 1) {
				do {
					System.out.println("*****************************");
					System.out.println("1.Cardiologist");
					System.out.println("2.Neurologist");
					System.out.println("3.Plastic Surgen");
					System.out.println("4.Exit");
					System.out.println("*********************************");
					System.out.println("Enter choice:");
					Scanner sc2 = new Scanner(System.in);
					n2 = sc2.nextInt();
					switch (n2) {
					case 1:
						list.add(new CompetetiveExambooks());
						break;
					case 2:
						list.add(new Academic());
						break;
					case 3:
						list.add(new Entertain());
						break;
					}
				} while (n2 != 4);

			}
			if (n1 == 2) {
				Iterator i = list.iterator();
				while (i.hasNext()) {
					Books b = (Books) i.next();
					b.display();
				}
			}
			if (n1 == 3) {
				Iterator i = list.iterator();
				while (i.hasNext()) {
					Books b = (Books) i.next();
					b.raisecost();
				}
			}
		} while (n1 != 4);
		System.out.println("Number of books created:" + Books.count);

	}

}