import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
// Create an Optional:
//
//Create an Optional<String> with a value.
//Create an empty Optional<String>.
    Integer name=1;
        Optional<Integer> op=Optional.ofNullable(null);
//       System.out.println(op.orElse("I am empty"));

//-----------------------------------------------------------------------------------------------------

//        Check if Present:
//
//        Use isPresent() to check if the Optional has a value.
//                Print the value if present.

        if(op.isPresent())
            System.out.println(op.get());


//------------------------------------------------------------------------------------------------------
//        Default Value:
//
//        Use orElse() to provide a default value if the Optional is empty.
//        Use orElseGet() with a Supplier for lazy loading of default value.


        System.out.println(op.orElse(1000));
        System.out.println(op.orElseThrow(()->new ArithmeticException("omething wrong")));




    }
}
