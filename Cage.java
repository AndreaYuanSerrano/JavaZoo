public class Cage{
	
	private int length;
	private int width;
	private int height;
	private boolean clean;
	private boolean covered;
	
	public Cage(){
		this.clean = true;
		this.covered = true;
	}
	
	//setters
	
	public void setLength(int length){
		this.length= length;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	
	//getters
	
	  public int getLength() {
    return length;
  }
    public int getWidth() {
    return width;
  }
    public int getHeight() {
    return height;
  }
  
    public boolean isClean(){
    return clean;
  }
  public boolean isCovered(){
  	return covered;
  }
  
  public static void main(String[]args){
  		
  	Cage cage = new Cage();
  		
  	cage.setLength(26);
  	cage.setWidth(30);
  	cage.setHeight(71);
  	
  	System.out.println("Length: " + cage.getLength());
  	System.out.println("Width: " + cage.getWidth());
  	System.out.println("Height: " + cage.getHeight());
  	
  	
  	System.out.println(cage.isClean() ? "The cage is clean." : "The cage is not clean.");
  	System.out.println(cage.isCovered() ? "The cage is covered." : "The cage is not covered.");
  
  }
}