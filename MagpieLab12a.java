import java.util.Scanner;
import java.util.ArrayList;
class MagpieLab12a
{
   public String getGreeting()
   {
      return "Hello, let's talk.";
   }


   public String getResponse(String statement)
   {
      String response = "";
      if (statement.indexOf("no") >= 0)
      {
         response = "Why so negative?";
      }
      else if (statement.indexOf("mother") >= 0
            || statement.indexOf("father") >= 0
            || statement.indexOf("sister") >= 0
            || statement.indexOf("brother") >= 0)
      {
        response = getFamilyResponse();
      }
      else
      {
         response = getRandomResponse();
      }
      return response;
   }

   private String getFamilyResponse()
   {
   	ArrayList <String> familyResponses = new ArrayList();
   	familyResponses.add("What do you like about your family?");
   	familyResponses.add("What sports does your family like");
   	familyResponses.add("Is your family close?");
   	familyResponses.add("How big is your family?");
   	familyResponses.add("Do you love your family?");
   	familyResponses.add("My family does not exist");
   	familyResponses.add("Are you and your siblings close?");
   	familyResponses.add("That sounds great!");
   	familyResponses.add("Sounds lit!");
   	familyResponses.add("This is tech support.");

	final int NUMBER_OF_RESPONSES = 10;
	double r = Math.random();
   	int index = (int)(r * NUMBER_OF_RESPONSES);
   	System.out.println(index);
    String randomResponses = familyResponses.get(index);
   	return randomResponses;
   }

   private String getRandomResponse()
   {
      String responses[] = {"You like bananas?", "You play any sports?", "Do you look good?", "What is your favorite school subject?",
      "You play any games?", "What is 9 + 10?", "Could you fight 10,000 5 year olds?", "Would you win against a Kangaroo?",
      "How much you lift?", "Don't mess with me."};
      int index = (int)(Math.random() * 10);
   	  String randomResponses = responses[index];
      return randomResponses;
   }
}
