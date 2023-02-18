package musha;
public class FacebookPage {

    // I take the Facebook page link of a person and return an array of their friends names

    public static String[] getFriendNames(String pageLink) {
        
        // I check if the provided page link matches

        if ("https://www.facebook.com/profile.php?id=12345".equals(pageLink)) {
            
            // If it matches I return them

            return new String[] { "Aino", "Ahti", "Aila", "Aku", "Anna" };
        } 
        
        else if ("https://www.facebook.com/profile.php?id=67890".equals(pageLink)) {
            
            // Same here
            
            return new String[] { "Antti", "Eevi", "Eemeli", "Eira", "Eino" };
        } 
        // In case of not, return an empty array

        else {
            return new String[] {};
        }
    }
}

