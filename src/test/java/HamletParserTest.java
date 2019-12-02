import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;
    private Replacer replacer;
    private String replaced;



    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();

        replacer = new Replacer(hamletText);
        replacer.replace("Hamlet", "Leon");
        replacer.replace("Horatio", "Tariq");
        replaced = replacer.getText();
    }

    @Test
    public void testChangeHamletToLeon() {

        System.out.println(replaced);

    }

    @Test
    public void testChangeHoratioToTariq() {


    }

    @Test
    public void testFindHoratio() {



    }

    @Test
    public void testFindHamlet() {
    }
}