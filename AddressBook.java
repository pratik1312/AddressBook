import java.util.*;
class AddressBook {
	ArrayList<String> List = new ArrayList<String>();
	ArrayList<String> List1 = new ArrayList<String>();
	ArrayList<String> List2 = new ArrayList<String>();

	Scanner sc = new Scanner(System.in);
	int id=0;
	String id1=null;
	public void create(){
		System.out.println("Adding the data in Address Book");
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Phone : ");
		String no=sc.next();
		System.out.println("Enter City : ");
		String city=sc.next();
		System.out.println("Enter Address : ");
		String add=sc.next();
		System.out.println("Enter Zip : ");
		String zip=sc.next();
		id1=Integer.toString(id);
		String str1=id1+" "+name+" "+no+" "+city+" "+add+" "+zip;
		List.add(str1);
		id=id+1;
		System.out.println(List);
	}
     public void display(){
		System.out.println("Id"+" - "+"Name"+" - "+"Phone No"+" - "+"City"+" - "+"Address"+" - "+"Zip");

		for(int i=0;i<List.size();i++){
			String str1 = List.get(i);
			String[] a = str1.split("\\s+");
			System.out.println(a[0]+" - "+a[1]+" - "+a[2]+" - "+a[3]+" - "+a[4]+" - "+a[5]);
		}
	}
    
     public void sortbyname(){
         System.out.println("Before Sorting ");

 		for(int i=0;i<List.size();i++){
 			String str1 = List.get(i);
 			String[] splited = str1.split("\\s+");
 			List1.add(splited[1]);
 				}
         Collections.sort(List1);
         System.out.println("After Sorting by name");
         for(int i=0;i<List1.size();i++){
         	for (int j=0;j<List.size();j++){
         		String str2 = List.get(j);
     			String[] splited1 = str2.split("\\s+");
     			if(List1.get(i).equals(splited1[1])){
     			System.out.println(splited1[0]+" | "+splited1[1]+" | "+splited1[2]+" | "+splited1[3]+" | "+splited1[4]+" | "+splited1[5]);    				
     			}
         	}
         }
         List1.removeAll(List1);
 	}
    
     public void sortbyzip(){
         System.out.println("Before Sorting ");

 		for(int i=0;i<List.size();i++){
 			String str1 = List.get(i);
 			String[] splited = str1.split("\\s+");
 			List2.add(splited[5]);
 		}
         Collections.sort(List2);
         System.out.println("After Sorting by zip");
         for(int i=0;i<List2.size();i++){
         	for (int j=0;j<List.size();j++){
 			String str2 = List.get(j);
     			String[] splited1 = str2.split("\\s+");
     			if(List2.get(i).equals(splited1[5])){
     			System.out.println(splited1[0]+" | "+splited1[1]+" | "+splited1[2]+" | "+splited1[3]+" | "+splited1[4]+" | "+splited1[5]);    				
     			}
         	}
         }
         List2.removeAll(List2);

 	}

     
	public void update(){
		System.out.println("Update the details");
		System.out.println("Enter the Id of record that want to replace");
		int id1=sc.nextInt();
		String str1 = List.get(id1);
		String[] a = str1.split("\\s+");
		if(str1!=null) {
			System.out.println("Update Name [Y/N]");
			String userinput1=sc.next();
			if(userinput1.equals("Y") || userinput1.equals("y")) {
			System.out.println("Enter Name : ");
			 String name1=sc.next();
			 a[1]=name1;
			 }
			System.out.println("Update Phone [Y/N]");
			String userinput2=sc.next();
			if(userinput2.equals("Y") || userinput2.equals("y")) {
			System.out.println("Enter Phone : ");
			String no1=sc.next();
			a[2]=no1;
			}
			System.out.println("Update City [Y/N]");
			String userinput3=sc.next();
			if(userinput3.equals("Y") || userinput3.equals("y")) {
			System.out.println("Enter City : ");
			String city1=sc.next();
			a[3]=city1;
			}
			System.out.println("Update Address [Y/N]");
			String userinput4=sc.next();
			if(userinput4.equals("Y") || userinput4.equals("y")) {
			System.out.println("Enter Address : ");
			String add1=sc.next();
			a[4]=add1;
			}
			System.out.println("Update Zip [Y/N]");
			String userinput5=sc.next();
			if(userinput5.equals("Y") || userinput5.equals("y")) {
			System.out.println("Enter Zip : ");
			String zip1=sc.next();
			a[5]=zip1;
			}
			
		}
		String str2=a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+a[5];
		List.set(id1,str2);
		System.out.println(List);

}
	public void delete(){
		System.out.println("Enter Id");
		int id1=sc.nextInt();
		String str1 = List.get(id1);
		if(str1!=null) {
			List.remove(id1);
		}
		System.out.println("Record Deleted");
	}

	public static void main(String[] args) {
		String userinput6;
	AddressBook ad=new AddressBook();
	do 
	{
			System.out.println("Select the operation you have to perform ");
		    System.out.println("1.Create");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Sort by name");
			System.out.println("5.Sort by zip");
			System.out.println("6.Display");
			Scanner sc1 = new Scanner(System.in);
			int option = sc1.nextInt();
			switch(option){
			case 1:
				ad.create();
				break;
			case 2:
				ad.update();
				break;
			case 3:
				ad.delete();
				break;
			case 4:
				ad.sortbyname();
				break;
			case 5:
				ad.sortbyzip();
				break;
			case 6:
				ad.display();
				break;
			default:
				System.out.println("Please Enter Valid Option");
				break;
			}
			System.out.println("Do you want to continue Yes or No: ");
			userinput6=sc1.next();
		 
		}
	while(userinput6.equals("Y") || userinput6.equals("y"));
	
	}
}
