import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PhoneBookTest {
    @Test
    public void addTest(){
        PhoneBook start = new PhoneBook();
        PhoneBook expected = new PhoneBook();
        expected.phoneBook.put("Sergey", "74562344466");

        start.add("Sergey", "74562344466");

        Assertions.assertEquals(expected.phoneBook.size(), start.add("Sergey", "74562344466"));
    }
}
