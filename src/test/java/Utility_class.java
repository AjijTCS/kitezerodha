import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
	public static String getTD(int rowindex,int colindex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\91797\\Pictures\\WithDDF.xlsx");
		Sheet sh = WorkbookFactory.create(fis).getSheet("may7");
		String data = sh.getRow(0).getCell(0).getStringCellValue();
		return data;
	}
	}

