
	import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

	public class StringReadWrite {
	    /**
	     * Reads specified file and returns random string from it
	     *
	     * @param fileName file name
	     * @return random string from file or <b>null</b> if there were any errors
	     */
	    public static String readRandomString(String fileName) {
	        ArrayList<String> stringArrayList = new ArrayList<String>();

	        FileReader myFile;
	        try {
	            myFile = new FileReader(fileName);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            return null;
	        }

	        BufferedReader buff = new BufferedReader(myFile);
	        String line = null;

	        do {
	            try {
	                line = buff.readLine();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }

	            if (line != null) stringArrayList.add(line);
	        } while (line != null);

	        try {
	            buff.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        int randomLineNumber = (int) (Math.random() * stringArrayList.size());
	        return stringArrayList.get(randomLineNumber);
	    }

	    
	    public static String readFileString(String fileName) {
	        //ArrayList<String> stringArrayList = new ArrayList<String>();
	    	StringBuilder sb = new StringBuilder();

	        FileReader myFile;
	        try {
	            myFile = new FileReader(fileName);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            return null;
	        }

	        BufferedReader buff = new BufferedReader(myFile);
	        String line = null;

	        do {
	            try {
	                line = buff.readLine();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }

	            if (line != null) sb.append(line);
	        } while (line != null);

	        try {
	            buff.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        //int randomLineNumber = (int) (Math.random() * stringArrayList.size());
	        return sb.toString();
	    }
	    
	    
	    public static void main(String fileName,String text) throws IOException {
	    	
	  	  FileWriter writeFile = null;
	  	  try {
	  	      File logFile = new File(fileName);
	  	      
			  	    if (logFile.exists())
					{
			  	    	logFile.delete();
					}
	  	      writeFile = new FileWriter(logFile, true);
	  	      writeFile.append(text);
	  	  } catch (IOException e) {
	  	      e.printStackTrace();
	  	  } finally {
	  	      if(writeFile != null) {
	  	          try {
	  	              writeFile.close();
	  	          } catch (IOException e) {
	  	              e.printStackTrace();
	  	          }
	  	      }
	  	  }
	    
	    }
	    
	    
	    public static void setProp(String fileName, String key, String value) throws FileNotFoundException, IOException {
	    
	    Properties props = new Properties();
	    props.setProperty(key, value);
	    
	    props.store(new FileOutputStream(new File(fileName),true), null);
	    
	        }
	    
	    
	    public static String getProp(String fileName, String key) throws FileNotFoundException, IOException {
		    
		    Properties props = new Properties();
		    props.load(new FileInputStream(new File(fileName)));
		    String value = props.getProperty(key);
			
			return value;
			
		    }
	    
	    
	    
	   // Перенесено в другой класс для работы с XML
	    
	   
//	    public static void Write (String www){
//	        String userName, userSurname, userMiddleName;
//
//	       /* if (args.length == 3) {
//	            userName = readRandomString(args[0]);
//	            userSurname = readRandomString(args[1]);
//	            userMiddleName = readRandomString(args[2]);
//
//	            // TODO: some logic
//	        }
//*/
//	        FileWriter myFile = null;
//	        BufferedWriter buff = null;
//
//	        try {
//	            int ran_w = (int) (Math.random() * (1000));
//	            myFile = new FileWriter("D:\\Project\\Java\\scores_out_" + ran_w + ".txt");
//	            buff = new BufferedWriter(myFile);
//
//	            System.out.println("Random value = " + ran_w);
//	      //      buff.write("Name = " + ran_w);
//	            buff.write(www);
//	//System.out.println("������������" + scores[i] );
//	//}
//	            buff.flush();
//
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        } finally {
//	            try {
//	                buff.close();
//	                myFile.close();
//	            } catch (IOException e1) {
//	                e1.printStackTrace();
//	            }
//	        }
//	        
	        
	        
	        
	    } // ����� ������main
	