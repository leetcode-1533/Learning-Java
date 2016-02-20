package homework;

public class LinkedList 
{
	private ListNode root;
	private ListNode pointer;
	private int size;
	
	private ListNode conlast;
	
	
public static void main(String[] args)
	{
	  LinkedList test = new LinkedList();
      for(int i=0;i<=18;i++){
			  test.AddToEnd(i+new Integer(10));
		}
		
		test.Print();
		
		System.out.println("");
		test.firstElement();
		while(test.hasMoreElements()){
			Object tmp = test.nextElement();
			System.out.println(tmp);
		}
		Object tmp = test.nextElement(); // to get the current one, doesn't have more items
		System.out.println(tmp);

		
	}
	
	public LinkedList(){	
		size = 0;
		root = null;
		pointer = root;
	}
	
	public void AddToEnd(Object item){
		if(root==null){ //empty
			ListNode tmp = new ListNode(item,null);
			conlast = tmp;
			
			root = tmp;
			pointer = root;
				
			size ++;
		}else{
			ListNode tmp = new ListNode(item,null);
			conlast.pt = tmp;
			conlast = tmp;
			
			size ++;
		}
	}
	
	public void Print(){
		ListNode tmp = root;

		for(int i = 0; i<size; i++){
			System.out.print(tmp.item);
			tmp = tmp.pt;
		}
		
	}
	
	public void firstElement(){
		pointer = root;
	}
	
	public Object nextElement(){
		ListNode current = pointer;
		pointer = pointer.pt;
		
		return current.item;
	}
	
	public boolean hasMoreElements(){
		return pointer.pt != null;
	}
}

class ListNode{
	public Object item;
	public ListNode pt;
	
	public ListNode(Object inititem, ListNode initpt){
		item = inititem;
		pt = initpt;
	}
	
}
