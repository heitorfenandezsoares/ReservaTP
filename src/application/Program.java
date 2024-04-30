package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.reserva;
import entities.exceptions.InvalidDateException;
import entities.exceptions.NoRoomAvailableException;

public class Program {

	public static void main(String[] args) throws ParseException {
	 Scanner sc = new Scanner(System.in);
	 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 
	  
	  try { 
		  System.out.println(" insira a data Incial:");
		  Date dataInicio = sdf.parse(sc.next());
		  
		  System.out.println("insira a data Final:");
		  Date dataFinal = sdf.parse(sc.next());
		  
		  reserva rs = new reserva(dataInicio, dataFinal);
		  
		  System.out.println("TESTE com reserva");
		  rs.setReservado(false);
		  rs.checkAvailability();
		  
		  
		  System.out.println("TESTE sem reserva");
		  rs.setReservado(true);
		  rs.checkAvailability(); 
		  
		  
		  
	  }
	  catch(ParseException e){
		  System.out.println("Erro em digita a data, arrumar POR FAVOR!");
		  
	  }
	  catch(InvalidDateException e){
		 throw new InvalidDateException(e.getMessage());
		  
	  }
	  catch (NoRoomAvailableException e) {
		  throw new NoRoomAvailableException(e.getMessage());
	  }
	  finally {
		sc.close();
	}
	

	}

}
