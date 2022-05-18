public class CreditCardEx {
    static String getCreditCardType( String creditCardNumber){
        String type="";
        if (creditCardNumber !=null) {
            if (creditCardNumber.startsWith("3")) {
                type = "American Express";
            } else if (creditCardNumber.startsWith("4")) {
                type = "Visa";

            } else if (creditCardNumber.startsWith("5")) {
                type = "MasterCard";
            } else if (creditCardNumber.startsWith("6")) {
                type = "Discover";
            } else {
                System.out.println("Invalid creditCardNumber");
            }
        }
        return type;
    }
}
