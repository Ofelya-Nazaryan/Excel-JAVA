package MyExcelDemo;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class JavaExcelApp {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("myReport");


        Object[][] empData = {{"EmpID", "Name", "Surname", "UserAge"},
                {"100", "Ann", "Vardanyan", 15},
                {"101", "Karine", "GHazaryan", 18},
                {"102", "Vardanush", "Ashotuan", 25},

        };

        int rows = empData.length;
        int cols = empData[0].length;

        System.out.println(rows);
        System.out.println(cols);

        for (int r = 0; r < rows; r++) {
            XSSFRow row = sheet.createRow(r);
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.createCell(c);
                Object value = empData[r][c];

                if (value instanceof String)
                    cell.setCellValue((String) value);
                if (value instanceof Integer)
                    cell.setCellValue((Integer) value);
                if (value instanceof Boolean)
                    cell.setCellValue((Boolean) value);

            }
        }

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ExcelinJava\\ExcelinJava.xls");
        workbook.write(fos);
        fos.close();


    }
}
