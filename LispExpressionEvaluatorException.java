/************************************************************************************
 * 
 * Do not modify this file.
 *
 * LispException class
 *
 * It is used by LispExpressionEvaluator 
 *
 *************************************************************************************/

package PJ2;

public class LispExpressionEvaluatorException extends RuntimeException
{
    public LispExpressionEvaluatorException()
    {
	this("");
    }

    public LispExpressionEvaluatorException(String errorMsg) 
    {
	super(errorMsg);
    }

}
