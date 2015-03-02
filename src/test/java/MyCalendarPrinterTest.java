import org.junit.Test;

public class MyCalendarPrinterTest {

    @Test
    public static void isUruTest() {
        Boolean result;
        System.out.println(MyCalendarPrinter.isUru(2015));
        System.out.println(MyCalendarPrinter.isUru(2000));
        System.out.println(MyCalendarPrinter.isUru(2100));
        System.out.println(MyCalendarPrinter.isUru(2104));
    }
}
