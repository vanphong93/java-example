package demo_2;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {
    public static void main(String[] args)throws Exception {  
        String sDate1="31/12/1998";  
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    }  
}
