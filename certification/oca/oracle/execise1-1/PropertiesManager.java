import java.util.Properties;

public class PropertiesManager {
 public static void main(String[] args) {
   if(args.length == 0) {System.exit(0);}

   Properties properties = System.getProperties();
   properties.setProperty("new_property2", "new_value2");

   switch(args[0]) {
     case "-list_all":
      properties.list(System.out);
      break;

      case "-list_prop":
       System.out.println(properties.getProperty(args[1]));
       break;
       default:
       System.out.println("Usage : \n java PropertiesManager -list_all");
       System.out.println("Or : java PropertiesManager -list_prop  [property]");
   }
  }
}
