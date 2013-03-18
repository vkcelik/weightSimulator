
public class Protocol {
	
	private gui g;
	
	public Protocol(gui g){
		this.g = g;
	}

	public String processInput(String theInput) {
		String theOutput = "ES\r\n";
		
		if (theInput.toUpperCase().equals("S\r\n")){
			theOutput = "S S " + g.getNettoWeight() + " kg \r\n" ;
		}
		
		if (theInput.toUpperCase().equals("T\r\n")){
			theOutput = "T S " + g.getNettoWeight() + " kg \r\n" ;
			g.setTare();
		}
		
		if (theInput.toUpperCase().startsWith("D ")){
			g.setOnDisplay(theInput.substring(2, theInput.length()));
			theOutput = "D A\r\n";
		}
		
		if (theInput.toUpperCase().equals("DW\r\n")){
			g.displayWeight();
			theOutput = "DW A\r\n";
		}
		
		if (theInput.toUpperCase().startsWith("RM20 8 ")){
			// TODO SÆT MODTAGNING AF KOMMANDOER PÅ PAUSE
			theOutput = "RM20 A " + g.getOnDisplay() + " \r\n";
		}
		
		return theOutput;
	}
	
}
