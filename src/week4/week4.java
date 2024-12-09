package week4;

  public class week4 {  

	  public static void main(String[] args) {
	
		 
		  //1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		  
		  int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

		 
		  // a. Programmatically subtract the value of the first element in the array from the value in the last 
		  //element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		  
		  int result = ages[ages.length - 1] - ages[0];
		System.out.println("Result of subtraction: " + result);

		
		//b. Create a new array of int called ages2 with 9 elements 
		//(ages2 will be longer than the ages array, and have more elements).  
		
		//i. Make sure that there are 9 elements of type int in this new array.  
		
	    int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 100};
	  
	
   	

		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element 
		//in the new array ages2 from the last element of ages2). 
		
		 int result2 = ages2[ages2.length - 1] - ages2[0];
		    System.out.println("Result2: " + result2);
		
		
		// iii. Show that using the index values for the elements
		//is dynamic (works for arrays of different lengths).
		
		
		   System.out.println("Dynamic Indexing:");
		    System.out.println("ages array length: " + ages.length);
		    System.out.println("ages2 array length: " + ages2.length);
		    System.out.println("Last element of ages: " + ages[ages.length - 1]);
		    System.out.println("Last element of ages2: " + ages2[ages2.length - 1]);
		  
		  
		// c. Use a loop to iterate through the array and
		//calculate the average age. Print the result to the console.
		
		  int sum = 0;
		  for (int age : ages) {
		  sum += age;
		  }
		  double averageAge = (double) sum / ages.length;
		  System.out.println("Average Age: " + averageAge);
		
	
		 
  
       //2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

  String[] names1 = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
     
   // a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.

         //Calculate the total number of letters
  
  int totalLetters = 0;
  for (String name : names1) { 
	  totalLetters += name.length(); 
  }
          
          // Calculate the average number of letters per name double averageLetters = (double) totalLetters / names.length; System.out.println("Average number of letters per name: " + averageLetters); 
 
  double averageLetters = (double) totalLetters / names1.length;
  System.out.println("Average number of letters per name: " + averageLetters);
  
  // b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
      
           //Concatenate all the names together, separated by spaces
  
  StringBuilder concatenatedNames = new StringBuilder(); 
  for (String name1 : names1) { concatenatedNames.append(names1).append(" ");
  } 
        
         // Print the result to the console
  
  System.out.println("Concatenated names: " + concatenatedNames.toString().trim());
  
      
  
  //3. How do you access the last element of any array?

  int[] ages1 = {3, 9, 23, 64, 2, 8, 28, 93};
  int lastElement = ages1[ages1.length - 1];
  System.out.println("Last element of ages array: " + lastElement);
	  
    		  
      //4. How do you access the first element of any array?

 
  int firstElement = ages[0];
  System.out.println("First element of ages array: " + firstElement);
    		  
      //5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

            String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

           //Create a new array of int called nameLengths
           
            int[] nameLengths = new int[names1.length];

            //Write a loop to iterate over the names array and add the length of each name to the nameLengths array
            
            for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names1[i].length();
          }

           //Print the nameLengths array to verify the result
           
            System.out.println("Lengths of each name:");
           for (int length1 : nameLengths) {
          System.out.println(length1);
        }

      
      //6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.

      
           int[] nameLengths1 = new int[names.length];
           for (int i1 = 0; i1 < names.length; i1++) {
           nameLengths1[i1] = names[i1].length();
           }
           System.out.println("Sum of all elements in nameLengths array: " + sum);
  
	  } //end of main
         //7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	 
	  String concatenateWord(String word, int n) {
		  StringBuilder result = new StringBuilder();
		  for (int i = 0; i < n; i++) {
		  result.append(word);
		  }
		  return result.toString();
		  }

  
     // 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

         String getFullName(String firstName, String lastName) {
        	 return firstName + " " + lastName;
        	 }
       
        	

     // 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

         boolean isSumGreaterThan100(int[] array) {
        	 int sum = 0;
        	 for (int num : array) {
        	 sum += num;
        	 }
        	 return sum > 100;
        	 }
      
    // 10. Write a method that takes an array of double and returns the average of all the elements in the array.

         double calculateAverage(double[] array) {
        	 double sum = 0;
        	 for (double num : array) {
        	 sum += num;
        	 }
        	 return sum / array.length;
        	 }
     
     //11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.

         boolean compareAverages(double[] array1, double[] array2) {
        	 double sum1 = 0, sum2 = 0;

        	 for (double num : array1) { sum1 += num; }
        	 for (double num : array2) { sum2 += num; }

        	 return (sum1 / array1.length) > (sum2 / array2.length);
        	 }
     
    // 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

     
         public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        	    return isHotOutside && moneyInPocket > 10.50;
        	}

     //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.


      // Method to find the largest of three numbers
      // I created this method to solve the problem of determining the maximum value among three numbers

      int findLargest(int num1, int num2, int num3) {
      if (num1 >= num2 && num1 >= num3) {
      return num1;
      } else if (num2 >= num1 && num2 >= num3) {
      return num2;
      } else {
      return num3;
      }
      }
  }//end of class
  