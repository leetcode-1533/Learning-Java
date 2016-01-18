package homework;

/*
 *  List class
 *    
 *  A List is an ordered collection of any kind of Object.
 * 
 *  Operations:
 *     AddToEnd    Add a given object to the end of the list.
 *     Print       Print (to standard output) the objects in the list in order,
 *                 enclosed in square brackets, separated by spaces.
 */
class List {
  private static int LEN = 10;
  private Object [] items;  // the actual items
  private int numItems;     // the number of items currently in the list
  

  public static void main(String[] args)
  {
	  List test = new List();
	  
	  for(int i=0;i<=19;i++){
		  test.AddToEnd(i+new Integer(10));
	  }
	  
	  test.Print();
  }
  /*
   * constructor: initialize the list to be empty
   */
  public List()
  {
	items = new Object [LEN];
    numItems = 0;
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
		  Object [] tmp = new Object [LEN*2];
		  System.arraycopy( items, 0, tmp, 0, LEN);
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