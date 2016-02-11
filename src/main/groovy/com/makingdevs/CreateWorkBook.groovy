//import java.io.*

import org.apache.poi.ss.usermodel.*
import org.apache.poi.hssf.usermodel.*
import org.apache.poi.xssf.usermodel.*
import org.apache.poi.ss.util.*
import org.apache.poi.ss.usermodel.*

import org.apache.poi.*
class CreateWorkbook{
   static void main(def args){
      
      XSSFWorkbook workbook = new XSSFWorkbook()
      XSSFSheet sheet=workbook.createSheet(" Pagina_1 ")
      
      for(int row=0;row<5;row++){
         Row r = sheet.createRow(row)
         for (int cellnum=0; cellnum <5; cellnum++) {
            Cell c = r.createCell(cellnum);
            c.setCellValue( "Valor "+row+" "+cellnum );
         }
      }
      
      FileOutputStream out = new FileOutputStream(new File("libro_excel.xlsx"))
      //write operation workbook using file out object 
      workbook.write(out)
      out.close()
      println("Successful")
   }
}