/**
 * An Exception for Pokemon.
 * 
 * @author Weirong He
 * @since 10/30/2018
 */
public class PokemonException extends RuntimeException {
   /**
    * Constructor.
    * 
    * @param message Describes the cause of the error
    */
   public PokemonException(String message) {
      super(message);
   }
} // end of class
