
public class BooksInfo 
{
     private String Bookname;
     private int Booknumber;
     private String Authorname;
     
	public BooksInfo(String Bookname, int Booknumber, String Authorname) {
		super();
		this.Bookname = Bookname;
		this.Booknumber = Booknumber;
		this.Authorname = Authorname;
	}
   public void displayinfo()
   {
	   System.out.println("Bookname: "+Bookname);
	   System.out.println("Booknumber: "+Booknumber);
	   System.out.println("Authorname: "+Authorname);
   }
      
}  
    