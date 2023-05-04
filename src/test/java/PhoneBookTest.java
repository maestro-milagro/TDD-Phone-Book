import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PhoneBookTest {
    @Test
    public void addTest(){
        PhoneBook start = new PhoneBook();
        PhoneBook expected = new PhoneBook();
        expected.phoneBook.put("Sergey", "74562344466");

        int result = start.add("Sergey", "74562344466");

        Assertions.assertEquals(expected.phoneBook.size(), result);
    }
    @Test
    public void findByNumberTest(){
        PhoneBook expect = new PhoneBook();
        expect.phoneBook.put("Sergey", "74562344466");
        String expected = "Sergey";

        String result = expect.findByNumber("74562344466");

        Assertions.assertEquals(expected, result);
    }
}
