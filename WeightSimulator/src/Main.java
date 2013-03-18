public class Main {
	public static void main(String[] args) {
		gui g = new gui();
		g.setVisible(true);
		Protocol p = new Protocol(g);
		
		int portdst = 8000;
        if (args.length > 0)
            portdst = Integer.parseInt(args[0]);
        
        System.out.println(p.processInput("D \"hej\""));

	}
}
