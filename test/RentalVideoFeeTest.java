import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class RentalVideoFeeTest {

    @Test
    void testCalcFeeIsNew() {
        String name = "test";
        int days = 1;
        Boolean isNew = true;

        RentalVideoFee target = new RentalVideoFee(name, days, isNew);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        target.calcFee();
        assertEquals(this.printResult(name, days, isNew, 200), out.toString());
    }

    @Test
    void testCalcFeeIsNotNew() {
        String name = "test";
        int days = 1;
        Boolean isNew = false;

        RentalVideoFee target = new RentalVideoFee(name, days, isNew);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        target.calcFee();
        assertEquals(this.printResult(name, days, isNew, 100), out.toString());
    }

    @Test
    void testCalcFeeIsLong() {
        String name = "test";
        int days = 7;
        Boolean isNew = false;

        RentalVideoFee target = new RentalVideoFee(name, days, isNew);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        target.calcFee();
        assertEquals(this.printResult(name, days, isNew, 800), out.toString());
    }

    String printResult(String name, int days, Boolean isNew, int fee) {
        return  "映画名:" + name + System.lineSeparator()
                + "レンタル期間:" + days + "日" + System.lineSeparator()
                + "種類:" + (isNew ? "新作": "旧作") + System.lineSeparator()
                + "レンタル料金は " + fee + "円です。" + System.lineSeparator();
    }
}