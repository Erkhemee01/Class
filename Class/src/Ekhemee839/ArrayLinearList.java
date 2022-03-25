package Ekhemee839;
import java.util.Scanner;

public class ArrayLinearList{
	 private Object[] element;
	 private int size;

	 public ArrayLinearList(int n)
			{
		 		
				element = new Object[n];
			}

	 public ArrayLinearList()
	 		{
		 		this(100);
	 		}

	public boolean isEmpty()
	 		{
		 		return size == 0;
	 		}

	 public int size()
	 		{
		 		return size;
	 		}
//aaaaa
	 public Object get(int index)
	 		{
		 		return element[index];
	 		}

	 public void add(int index, Object theElement)
	 		{
	if (size == element.length) {
		
	}

	for (int i = size - 1; i >= index; i--)
	element[i + 1] = element[i];
	element[index] = theElement;
	size++;
	}
	public Object remove(int index)
	{
	Object removedElement = element[index];
	for (int i = index + 1; i < size; i++)
	{
	element[i-1] = element[i];
	}
	element[--size] = null;
	return removedElement;
	}


	public String toString()
	{
	StringBuffer s = new StringBuffer("[");

	for (int i = 0; i < size; i++)
	if (element[i] == null)
	s.append("null, ");
	else
	s.append(element[i].toString() + ", ");

	if (size > 0)
	s.delete(s.length() - 2, s.length());

	s.append("]");

	return new String(s);
	}
	public int max() {
	int maxValue = (int)this.get(0);
	for(int i = 1; i < size; i++) {
	if(maxValue < (int)element[i]) {
	maxValue = (int)element[i];
	}

	}
	return maxValue;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Утга оруулна уу:");
	System.out.println("\t1. isEmpty\n\t2. size \n\t3. get \n\t4. remove \n\t5. add \n\t6. toString \n\t7. max \n");

	Scanner sc = new Scanner(System.in);
	ArrayLinearList mylist = new ArrayLinearList();

	while(true) {
	System.out.print("Хариу:");
	int songolt = sc.nextInt();

	switch(songolt) {
	case 1: {
	System.out.println(mylist.isEmpty());
	break;
	}
	
	case 2:{
	System.out.println(mylist.size());
	break;
	}
	
	case 3: {
	// get()
		//83
	System.out.print("Авах элементийн утгыг оруулна уу");
	int index = sc.nextInt();
	if(index < mylist.size())
	System.out.println(mylist.get(index));
	else
	System.out.println(index + " байхгүй байна");
	break;
	}
	case 4: {
	//remove
	System.out.print("Устгах элементийн утгыг оруулна уу");
	int index = sc.nextInt();
	if(index < mylist.size())
	System.out.println(mylist.remove(index) + " дэх индексийг амжилттай устгалаа");
	else
	System.out.println("Олдсонгүй");
	break;
	}
	case 5:{
	System.out.print("Элементийг жагсаалтын хэд дэх индекст оруулах вэ?");
	int index = sc.nextInt();
	System.out.println("Нэмэх элементийн утга");
	int value = sc.nextInt();
	mylist.add(index, value);

	break;
	}
	case 6: {
	System.out.println(mylist.toString());
	break;
	}
	case 7: {
	if(mylist.isEmpty())
	System.out.println("Элементийн жагсаалт дах хамгийн их утга: ");
	else
	System.out.println(mylist.max());
	break;
	
	}
	}
	}
	}


}