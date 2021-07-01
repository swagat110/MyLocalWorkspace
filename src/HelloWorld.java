import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class HelloWorld {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    int count = 0;
    boolean headerRead = false;
    List<Text> list = new ArrayList<>();
    String header = null;
    

    while ((line = in.readLine()) != "/t") {
      if(!headerRead){
        //System.out.println(line);
        header = line;
        headerRead = true;
      }
      else if(!line.isEmpty()){
        Text entry = new Text();
        String[] arr = line.split(",",2);
        if(arr[0].equals("ID")){
          //do nothing
        }else{
          entry.setId(Integer.parseInt(arr[0]));
          entry.setRest(arr[1]);
          list.add(entry);
        }
          
        
      }
      
    }
    //sort the list based on id
    Collections.sort(list, (e1,e2) -> Integer.compare(e1.getId(),e2.getId()));
    System.out.println(header);
    for(Text t : list){
      System.out.println(t.getId()+","+t.getRest());
    }

    
  }    
  
  

  }
  class Text{
    int id;
    String rest;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRest() {
		return rest;
	}
	public void setRest(String rest) {
		this.rest = rest;
	}
}