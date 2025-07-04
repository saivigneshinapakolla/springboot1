import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class UnitTesting {
    private final Calculator Calculator1 =new Calculator();
    @Test
    void testAddition(){
        int result=Calculator1.addition(2,3);
        assertEquals(5,result);
    }
    @Test
    void testDivisionByZero(){
        assertThrows(IllegalArgumentException.class,() -> {
            Calculator1.division(1,0);
        });
        /* int result=Calculator1.division(2,0);
        assertEquals(0,result); */
    }

}
