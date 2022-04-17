package Testcases;

import Common.Constant;
import Common.WebDriverUtils;
import com.opencsv.CSVReader;
import org.testng.annotations.*;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestBase {

    @BeforeSuite
    @Parameters("browser")
    public void beforeSuite(String browserName){
        Constant.BROWSER = browserName;
    }

    @BeforeMethod
    public void setUp() {
        WebDriverUtils.init();
        WebDriverUtils.navigate(Constant.HOME_PAGE_URL);
    }

    @AfterMethod
    public void tearDown() {
        WebDriverUtils.quitBrowser();

    }

    @DataProvider
    public Iterator<Object[]> dataLogin() throws IOException {

        String path = "D:\\study\\SATT\\SeleniumLevel1\\src\\test\\java\\DataObjects\\" + this.getClass().getSimpleName() + ".csv";

        Reader reader = new FileReader(path);
        CSVReader csvreader = new CSVReader(reader);

        List<Object[]> list = new ArrayList<>();
        String[] nextLine= csvreader.readNext();
        while (nextLine != null) {
            Object[] objLine = nextLine;
            list.add(objLine);
            nextLine= csvreader.readNext();
        }

        Iterator<Object[]> dataCsv = list.iterator();
        return dataCsv;
    }
}

