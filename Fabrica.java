import javax.swing.JOptionPane;
public class Fabrica {
	
	public static void caracteristicas(car coche) {
		
		JOptionPane.showMessageDialog(null,"El numero de matricula es "+ coche.getMatricula() +"\n La marca es " 
		+ coche.getMarca() + "\n El modelo es "+ coche.getModelo() +"\n el color es " + coche.getColor() + "\n El techo solar " 
		+ coche.getTechnoSolar() +"\n Ha recorrido " + coche.getKilometros() + " \n Tiene " + coche.getNumPuertas() + " puertas" 
		+ "\n Tiene " + coche.getNumPlazas() + " plazas");
		
		
		
	}

	public static void main(String[] args) {
		
		String matricula;
		String marca = "SEAT";
		String modelo = "ALTEA";
		String color = "blanco";
		
		boolean technoSolar = false;
		
		int kilometros = 0;
		int numPuertas = 3;
		int numPlazas = 5;
		
		
		
		
		
		car car1 = new car();
		
		car1.preguntaMarca();
		car1.preguntaModelo();
		car1.preguntaPlazas();
		car1.preguntaPuertas();
		car1.preguntaAvanzar();
		car1.matricular();
		car1.preguntaTun();
		
		caracteristicas(car1);
		
		
		
		
		matricula=JOptionPane.showInputDialog("¿Que matricula quieres?");
		car car2 = new car(matricula);
		
		car2.preguntaMarca();
		car2.preguntaModelo();
		car2.preguntaPlazas();
		car2.preguntaPuertas();
		car2.preguntaTun();
		car2.preguntaAvanzar();
		
		caracteristicas(car2);
		
		
		marca=JOptionPane.showInputDialog("¿Que marca quieres?");
		modelo=JOptionPane.showInputDialog("¿Que modelo quieres?");
		color=JOptionPane.showInputDialog("¿Que color quieres?");
		car car3 = new car(marca, modelo, color);
		car3.preguntaTun();
		car3.preguntaPlazas();
		car3.preguntaPuertas();
		car3.preguntaAvanzar();
		car3.matricular();
		
		caracteristicas(car3);
		
		
		
		numPuertas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas puertas quieres?"));
		numPlazas= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas plazas quieres?"));
		car car4 = new car(numPuertas, numPlazas);
		car4.preguntaMarca();
		car4.preguntaModelo();
		car4.comprobarNumPP();
		car4.matricular();
		car4.preguntaTun();
		car4.preguntaAvanzar();
		
		
		caracteristicas(car4);
		
		}
		

	}

