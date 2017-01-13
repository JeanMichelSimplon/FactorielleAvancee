package co.simplon.factorielle;

public class NonPositiveException extends RuntimeException
{
    public NonPositiveException()
    {
        super();
    }
 
    public NonPositiveException (String message)
    {
        super (message);
    }
}