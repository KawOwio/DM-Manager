package dbmanager;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelFileEditor {
	public static void main(String args[]) throws IOException   {

		final JFrame frame = new JFrame("Document Reader");
		frame.setSize(400, 400);
		frame.setLocation(750, 350);
		frame.setVisible(true);
		String excelFilePath = excelToJavaImport.openFile(frame, "xlsx");
		FileInputStream inputStream = new FileInputStream(excelFilePath);
	    Workbook workbook = new XSSFWorkbook(inputStream);
	}

	public excelFileEditor(String excelFilePath) {
		
		
	}
	
	// creates new Sheet 
		public void addSheet(Workbook workbook, String sheetName) {
		workbook.createSheet(sheetName);
		}
	
	// TODO  adds row at the end
		public void addRow(Workbook workbook) {
		
		}
	
	// TODO adds row somewhere in the sheet
		public void addRow(Workbook workbook, int rowNr) {
			
		}
		
	// TODO adds new Column at the end
		public void addColumn(Workbook workbook) {
					
		}
		
	// TODO adds new Column somewhere in the sheet
		public void addColumn(Workbook workbook, int columnNr) {
							
		}		
		
	// TODO Copy some sheet at the end
		public void copySheet(Workbook workbook, Sheet sheetToCopy) {
									
		}	
		
	// TODO Copies some sheet somewhere in the workbook
		public void copySheet(Workbook workbook, Sheet sheetToCopy, int whereToCopy) {
											
		}
		
		// TODO Copies some row at the end of this sheet
		public void copyRow(Workbook workbook, int rowToCopy) {
											
		}
		// TODO Copies some row somewhere in the sheet
		public void copyRow(Workbook workbook, int rowToCopy, int whereToCopy) {
											
		}
		// TODO Copies some row somewhere in the workbook
		public void copyRow(Workbook workbook, Sheet whereToCopy, int rowToCopy, int whereToCopy) {
											
		}
		// TODO Copies some column at the end of this sheet
		public void copyColumn(Workbook workbook, int columnToCopy) {
											
		}
		// TODO Copies some column somewhere in the sheet
		public void copyColumn(Workbook workbook, int columnToCopy, int whereToCopy) {
											
		}
		// TODO Copies some column somewhere in the workbook
		public void copyColumn(Workbook workbook, Sheet whereToCopy, int colomnToCopy, int whereToCopy) {
											
		}
		// TODO Edit cell
		public void editCell(Workbook workbook, Cell cell, String datatype) {
											
		}
		// TODO Change font
		public void formatCell(Workbook workbook, Cell cell, Font font) {
											
		}
		
}           
