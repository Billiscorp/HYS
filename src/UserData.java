

//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Map.Entry;

public class UserData {

	public static  Candidate main() {
		
		Candidate cand = new Candidate();


		cand.setRan_firstname(StringReadWrite.readRandomString("Name.txt"));
						
		cand.setRan_middlename(StringReadWrite.readRandomString("Name.txt"));
		
		cand.setRan_lastname(StringReadWrite.readRandomString("LastName.txt"));
	    		
		cand.setRan_ssn(Generate_Data.Gen_SSN());
				
		cand.setRan_zip(Generate_Data.Gen_ZIP());
						
		cand.setRan_month(Generate_Data.Gen_BirthDayMonth ());
						
		cand.setRan_year(Generate_Data.Gen_BirthDayYear());
				
		cand.setRan_day(Generate_Data.Gen_BirthDayDay());
		
		cand.setRan_phoneNo_1(Generate_Data.Gen_PhoneNo_xxx());
		cand.setRan_phoneNo_2(Generate_Data.Gen_PhoneNo_xxx());
		cand.setRan_phoneNo_3(Generate_Data.Gen_PhoneNo_xxxx());
		
		cand.setRan_Email(Generate_Data.Gen_Email());

		cand.setRan_State(StringReadWrite.readRandomString("State.txt"));
				
		cand.setRan_City(StringReadWrite.readRandomString("City.txt"));
		
		cand.setRan_Street(StringReadWrite.readRandomString("Street_pref.txt")+" "+StringReadWrite.readRandomString("Street_Suff.txt"));
	    
		cand.setRan_Foto(Generate_Data.Gen_Foto_Path());
		cand.setRan_Foto_ID(Generate_Data.Gen_Foto_ID_Path());
			
	   	    
	    return cand;
	  
		}
 
}

