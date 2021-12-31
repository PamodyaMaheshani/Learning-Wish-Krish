/* A frog is jumping. First jump, he jumps 5 meters then rest for 1 second. Then again
* he jumps 3 meters and rest for 2 seconds. Then again, he jumps 1 meter and rest 3.5 seconds.
* This happens again and again. After entering a disatance, how many hops frog takes and 
* what time did it take? Assuming, a jump doesn't take any time. 
*/

import java.util.Scanner;

public class Freddie {

	public static void main(String args[]) { 

		double distance = 0.0;	// get the user input to the frog's distance			
		int hops = 0;           // to get the hop count
		double time = 0.0;      // to get the time to the end
		
		// get the user input for the distance
		Scanner input = new Scanner(System.in); 
		System.out.print("\nHow long Freddie should jump -  ");	
		distance = input.nextDouble();
		
		while(distance != 0) 
		{
			if(distance >= 5.0) 
			{
				distance -= 5.0;
				hops++;
				time += 1.0;
				if(distance >= 3.0) 
				{
					distance -= 3.0;
					hops++;
					time += 2.0;
					if(distance >= 1.0) 
					{
						distance -= 1.0;
						hops++;
						time += 3.5;
					}
					else  {
						if(distance != 0) {
							hops++;
						}
						break; 
					}
				}
				else {
					if(distance != 0) {
						hops++;
					}
					break;
				}
			}
			else {
				if(distance != 0) {
					hops++;
				}
				break; 
			}
		}

		// print the hop count and time taken at the end of the frog's journey.
		System.out.println("Frog jumped " + hops + " hops");
		System.out.println("Frog took " + String.valueOf(time) + " seconds at the end !!");

		
	}	
}
