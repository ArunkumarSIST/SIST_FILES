package Bascisofjava;

public class switchdemo {

	public static void main(String[] args) {
		String day="Monday";
		
		switch(day)
		{
		case "Monday":
		case "monday":
			System.out.println("Attend the Meeting");
			break;
			
		case "Tuesday":
		case "tuesday":
			System.out.println("Work on projects");
			break;
			
		case "Wednesday":
		case "wednesday":
			System.out.println("Submitting the project report");
			break;
			
		case "Thuresday":
		case "thureaday":
			System.out.println("client call and review");
			break;
			
		case "Friday":
		case "friday":
			System.out.println("Completing weekly report");
			break;
			
		case "Saturday":
		case "saturday":
		case "Sunday":
		case "sunday":
			System.out.println("Enjoy the weekend");
			break;
			
			default:
			{
				System.out.println("Invalid day");
			}
		}
	}

}
