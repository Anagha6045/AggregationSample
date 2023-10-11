package sample_Java_Aggregate;

public class ChildAggregate {

	String company;
	ParentAggregate a;
	
	public ChildAggregate(String company,ParentAggregate a)
	{
		this.company=company;
		this.a=a;
	}
	
	public void print()
	{
		System.out.println(a.name+"---"+a.salary);
		System.out.print(company);	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ParentAggregate obj1=new ParentAggregate("Anagha",150000);
     ChildAggregate obj2=new ChildAggregate("Intel",obj1);
     obj2.print();
	}

}
