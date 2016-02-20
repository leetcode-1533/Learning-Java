package homework;

/*
 *  List class
 *    
 *  A List is an ordered collection of any kind of Object.
 * 
 *  Operations:
 *		AddToEnd    Add a given object to the end of the list.
 *		Print       Print (to standard output) the objects in the list in order,
 *                 enclosed in square brackets, separated by spaces.
 *		firstElement	put the iterator at the front
 *		nextElement		get the current object and move up the iterator
 *		hasMoreElements	true if iterator havsn't reached the bounds
 */
public class List {
	/*
	 *  |item0|					<- currentOb
	 *  |item1					<- currentOb
	 *  |item2  <-  numItems	<- currentOb
	 *  |null,i3
	 *  |i4
	 *  |i5
	 *  |i6
	 *  |i7
	 *  |i8
	 *  |i9		<- LEN
	 *  
	 *  numItems is incremental only
	 *  LEN only increase by multiplying 2, when numItems reaches LEN
	 *  currentOb iterate over the list, bounded by numItems
	 */
  private int LEN = 10;
  private int numItems;    
  private int currentObject; 
  
  private Object [] items; 

  public static void main(String[] args)
  {
	  List test = new List();
	  
	  for(int i=0;i<=18;i++){
		  test.AddToEnd(i+new Integer(10));
	  }
	  test.Print();
	  test.firstElement();
	  while(test.hasMoreElements()){
		  Object tmp = test.nextElement();
		  System.out.println(tmp);
	  }
	   
  }
  
  public void firstElement(){
	  currentObject = 0;
  }
  
  public Object nextElement(){
	  int tmp = currentObject;
	  
	  // To round back
	  if(currentObject < numItems)
		  currentObject++;  
	  else
		  firstElement();		 
	  
	  return items[tmp];
  }
  
  public boolean hasMoreElements(){
	  
	  if(currentObject < numItems)
		  return true;
	  else 
		  return false;
  }
  
  /*
   * constructor: initialize the list to be empty
   */
  public List()
  {
	items = new Object [LEN];
    numItems = 0;
    currentObject = 0;
  }

  /*
   * AddToEnd
   *
   * Given: Object ob
   * Do:    Add ob to the end of the list.
   */
  public void AddToEnd(Object ob)
  {
	  if(numItems<LEN){
		  items[numItems] = ob;
		  numItems ++;
	  }
	  else{
		  Object [] tmp = new Object [numItems*2];
		  System.arraycopy( items, 0, tmp, 0, numItems);
		  LEN = LEN*2;
		  items = tmp;
		  
		  items[numItems] = ob;
		  numItems ++;
		  }
  }
  
  /*
   * Print
   *
   * Print (to standard output) the objects in the list in order, enclosed in
   * square brackets, separated by spaces.
   */
  public void Print()
  {
	  System.out.print('[');
	  for(int i=0;i<numItems;i++)
	  {
		  System.out.print(items[i]);
		  System.out.print(' ');
	  }
	  System.out.print(']'); 
  }
}