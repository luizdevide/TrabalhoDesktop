package trabalhodesktop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends ContaCorrente{

    private Date aniversario;

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }
    
    public ContaPoupanca(){   
        super();
        try {
           SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
           Date date = (Date)format.parse("10/10/2016");
           this.aniversario = date;                   
        }catch(ParseException e){
           System.out.println("\nErro ocorrido ao converter a data de aniversario da conta.");
        }        
    }
    
     public void creditaJuros(){        
        Calendar calendar =  Calendar.getInstance();             
        calendar.setTime(new Date());
        calendar.set(Calendar.AM_PM,0);
        calendar.set(Calendar.HOUR,0);        
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        calendar.set(Calendar.MILLISECOND,0);        
        Date dataAtual  = new Date();
        Date dataAniver = new Date();
        dataAtual = calendar.getTime();
        calendar.setTime(this.aniversario);
        calendar.add(Calendar.YEAR,1);
        dataAniver = calendar.getTime();       
        if (dataAniver.equals(dataAtual)){
            this.setSaldo(this.getSaldo() * 1.05);
        }        
    }
}
