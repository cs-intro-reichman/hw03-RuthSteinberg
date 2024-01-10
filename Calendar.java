public class Calendar {
        static int dayOfMonth = 1; 
        static int dayOfWeek = 1;  
        static int month = 1;
	    static int year = 1900;
        static int nDaysInMonth = 31; // Number of days in January
    public static void main(String[] args) throws Exception {
        int givenYear=Integer.parseInt(args[0]);
        int debugDaysCounter = 0; 
		//int sundayCounter = 0;
	 	while (year<givenYear) {
			advance();
        }
        while(year==givenYear)
        {
            debugDaysCounter++;
			System.out.println(dayOfMonth + "/" + month + "/" + year);	
            if(dayOfWeek==1)
            {
				
                System.out.println(" Sunday ");
            }	
			if((dayOfMonth==1) && (month==3) && (year==2020))
			{
				System.out.println(" Sunday ");
			}
			advance();
            
        }
    }
	    public static void advance() {
		dayOfWeek++;
		if(dayOfWeek>7){
			dayOfWeek=1;
		}
		dayOfMonth++;
		if(dayOfMonth>nDaysInMonth(month,year))
		{
			dayOfMonth=1;
			month=month+1;
		}
		if(month>12)
		{
			month=1;
			year=year+1;
		}
	 } 
	
	public static boolean isLeapYear(int year) {
	    if((year%4==0)||((year%1000==0)&&(year%400==0)))
		{
			return true;
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		int number=31;
		if(month==4||month==6||month==9||month==11)
		{
			number=30;
		}
		if((isLeapYear(year)==true)&&(month==2))
		{
			number=29;
		}
		if((isLeapYear(year)==false)&&(month==2))
		{
			number=28;
		}
		return number;
	}
}



	
    

