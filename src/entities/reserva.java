package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.exceptions.InvalidDateException;
import entities.exceptions.NoRoomAvailableException;

public class reserva {
//atributos
	 private Date dataIncio;
	 private Date dataFinal;
	 private Boolean reservado = false;
	 private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 
//construto
 
public reserva(Date dataIncio, Date dataFinal) {
	super();
	this.dataIncio = dataIncio;
	this.dataFinal = dataFinal;
}
	 public reserva() {
		 
	 }
	 
//set e get
	public Date getDataIncio() {
		return dataIncio;
	}
	
	public void setDataIncio(Date dataIncio) {
		this.dataIncio = dataIncio;
	}
	
	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public void setReservado(boolean reserva) {
		this.reservado = reserva;
	
	}
	
	
//metodos
	
	public void checkDates() {
		if(!dataFinal.after(dataIncio)) {
			throw new InvalidDateException("coloque as datas em ordem que corresponda com a logica do calendario");
			
		}
		System.out.println("deu certo");
	}
	
	public void checkAvailability() {
		checkDates();
		if(reservado) {
			
			throw new  NoRoomAvailableException("não ha reserva disponivel");
		}
		System.out.println("reserva feita");
		
	}
	

}
