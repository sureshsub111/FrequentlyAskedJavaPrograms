package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public static Object[][] getExcelData() throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String s="C:\\Users\\sures\\Downloads\\USI_EH26_Deloitte_SDET_Interview_Questions_VERIFIED.xlsx";
		FileInputStream fi = new FileInputStream(s);
		Workbook workbook = WorkbookFactory.create(fi);
		Sheet sheet = workbook.getSheetAt(0);
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][]data = new Object[row-1][column];
		DataFormatter formater = new DataFormatter();
		
		for(int i=1;i<row;i++)
		{
			Row row1 = sheet.getRow(i);
			for(int j=0;j<column;j++)
			{
				data[i-1][j]=formater.formatCellValue(row1.getCell(j));
			}
		}
		
		return data;
		

	}

}
