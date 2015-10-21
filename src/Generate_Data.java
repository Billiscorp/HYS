

public class Generate_Data {


		public static String Gen_SSN () {
		int ssn = (int)(Math.random()*9999);
		String ssn_String = String.format("%04d", ssn);
		return ssn_String;
	}
	
		public static String Gen_ZIP() {
			int zip = (int)(Math.random()*99999);// ���������� c ��������� � ������ � �������.
			String Ran_zip = String.format("%05d", zip);
		    return Ran_zip;
		}
		
		public static String Gen_BirthDayMonth ()
		{
			String[] month = new String[] {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			int m = (int)(Math.random()*11); 
			return month[m];
		}
		
		public static String Gen_BirthDayYear ()
		{
			int year = (int)(1954+(Math.random()*40)); // ����������. ���� �� �������, ��������� �������� ��������
			String Ran_year = Integer.toString(year);
			return Ran_year;
		}
		
		public static String Gen_BirthDayDay() {
			int day = (int)((Math.random()*27)+1);// ����������
			//String Ran_day = String.format("%02d", day);
			String Ran_day = String.format("%01d", day);
			return Ran_day;
		}
		
//		public static String [] Gen_PhoneNo() {
//			int No_first = (int)(Math.random()*999);
//			int No_second = (int)(Math.random()*999);
//			int No_third = (int)(Math.random()*9999);
//			String Ran_No_first = String.format("%03d", No_first);
//			String Ran_No_second = String.format("%03d", No_second);
//			String Ran_No_third = String.format("%04d", No_third);
//			
//			String [] phone_arr = new String [] {Ran_No_first,Ran_No_second,Ran_No_third};
//		return phone_arr;
//		}
		
		
		public static String Gen_PhoneNo_xxx() {
			int No_first = (int)(Math.random()*999);
			String Ran_No_xxx = String.format("%03d", No_first);
			
		return Ran_No_xxx;
		}
		
			public static String Gen_PhoneNo_xxxx() {
				int No_third = (int)(Math.random()*9999);
				String Ran_No_third = String.format("%04d", No_third);

		return Ran_No_third;
			}
				
		public static String Gen_Email ()
		{
//			String pref_email = "billiscorp";
			String pref_email = "tpcdealer";
			int index = (int)(Math.random()*999999);
			String base_email = pref_email+"+"+String.format("%06d", index)+"@gmail.com"; 
			return base_email;
		}
		
		public static String Gen_Foto_Path ()
		{
			String pref_path = "/home/billiscorp/Project/OSHA/Foto_face/"; //надо будет брать с конфига
			int index = (int)(Math.random()*26);
			String foto_path = pref_path+index+".jpg"; 
			return foto_path;
		}
		
		public static String Gen_Foto_ID_Path ()
		{
			String pref_path = "/home/billiscorp/Project/OSHA/Foto_ID/"; //надо будет брать с конфига
			int index = (int)(Math.random()*26);
			String foto_ID_path = pref_path+index+".jpg"; 
			return foto_ID_path;
		}
		
	}	
	
	


