package proyectoFinal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class FinalProyect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		ArrayList<String> equipoGanador= new ArrayList<String>();
		ArrayList<String> equipoPerdedor= new ArrayList<String>();
		ArrayList<String> contrincantes= new ArrayList<String>();
		
		
		String[] alemania= {"Johannes Gutenberg", "Wolfgang von Goethe", "Albert Einstein", "Dieter Fehrenbach",
				"Walter Reiner", "Rudolf Fischer", "Matthias Schmidt", "Ludwig Muller", "Franz Lehmann",
				"Heinrich Wagner", "Immanuel Kant", "Sigmund Schubert", "Otto Bauer", "Helmut Kohl", "Bertram Bier",
				"Elies Hoffmann","Maximiliam Weber"};
		String[] posicionesAlemania= {"Arquero", "Defensa", "Defensa","Defensa","Defensa","Delantero","Delantero",
				"Delantero", "Medio campo", "Medio campo","Medio campo","Delantero", "Defensa", "Medio campo",
				"Medio campo", "Delantero","Defensa"};
		ArrayList<String> nuevoJugadorAlemania= new ArrayList<String>();
		ArrayList<String> posicionNuevoAlemania= new ArrayList<String>();
		String[] estadoAlemania= {"En campo","En campo", "En campo","En campo","En campo","En campo","En campo","En campo",
				"En campo","En campo","En campo","En banca","En banca","En banca","En banca","En banca","En banca",};
		int puntosAlemania=0;
		int puntosAlemaniaSimulacion=0;
		
		
		String[] argentina= {"Mario Malario", "Lionel Messi", "Pedro Gónzalez", "Thiago Díaz", "Santino Martinez",
				"Tomás Moreno","Matías Flores", "Martín Martinez", "Alejandro Magno", "Álvaro Álvarez",
				"Rodrigo Rodrigez", "Roberto Figo", "Diego Sánchez", "Gabriel Ruiz", "Gonzalo Gonzalez", "Victor Vector",
				"Daniel Garzón"};
		String[] posicionesArgentina= {"Arquero", "Defensa", "Defensa","Defensa","Defensa","Delantero","Delantero",
				"Delantero", "Medio campo", "Medio campo","Medio campo","Delantero", "Defensa", "Medio campo", "Defensa",
				"Medio campo","Delantero"};
		ArrayList<String> nuevoJugadorArgentina= new ArrayList<String>();
		ArrayList<String> posicionNuevoArgentina= new ArrayList<String>();
		String[] estadoArgentina= {"En campo","En campo", "En campo","En campo","En campo","En campo","En campo","En campo",
				"En campo","En campo","En campo","En banca","En banca","En banca","En banca","En banca","En banca",};
		int puntosArgentina=0;
		int puntosArgentinaSimulacion=0;
		
		
		String[] inglaterra= {"Arthur Wright", "Daniel Smith", "David Cooperfield", "Oliver Twist", "Robin Robinson",
				"Allistair Bowie", "Alan Turing", "Alfred Cooper", "Thomas Moore", "Andrew Scott",
				"Sherlock Holmes", "Harry Potter", "James James", "Harry Styles", "Oscar Wilde", "Ethan Myers",
				"Connor Spooner"};
		String[] posicionesInglaterra= {"Arquero", "Defensa", "Defensa","Defensa","Defensa","Delantero","Delantero",
				"Delantero", "Medio campo", "Medio campo","Medio campo","Delantero", "Defensa", "Medio campo", "Delantero",
				"Defensa", "Medio campo"};
		ArrayList<String> nuevoJugadorInglaterra= new ArrayList<String>();
		ArrayList<String> posicionNuevoInglaterra= new ArrayList<String>();
		String[] estadoInglaterra= {"En campo","En campo", "En campo","En campo","En campo","En campo","En campo","En campo",
				"En campo","En campo","En campo","En banca","En banca","En banca","En banca","En banca","En banca",};
		int puntosInglaterra=0;
		int puntosInglaterraSimulacion=0;
		
		
		String[] brasil= {"Damiao Da Silva", "Heitor De Oliveira", "Silvio Santos", "Reginaldo Souza",
				"Sebastiao Teixeira", "Vicente Carvalho", "Gael Almeida", "Edvaldo Rosa", "Critiano Xavier",
				"Adriano Nevis", "Enzo Medeiros", "Flavio de Assis", "Guilherme da Castro", "Luciano Moura", "Manoel Ferreira",
		        "Paulo De Jesus", "Rodrigo Araujo"};
		String[] posicionesBrasil= {"Arquero", "Defensa", "Defensa","Defensa","Defensa","Delantero","Delantero",
				"Delantero", "Medio campo", "Medio campo","Medio campo","Delantero", "Defensa", "Medio campo", "Defensa",
				"Delantero", "Medio campo"};
		ArrayList<String> nuevoJugadorBrasil= new ArrayList<String>();
		ArrayList<String> posicionNuevoBrasil= new ArrayList<String>();
		String[] estadoBrasil= {"En campo","En campo", "En campo","En campo","En campo","En campo","En campo","En campo",
				"En campo","En campo","En campo","En banca","En banca","En banca","En banca","En banca","En banca",};
		int puntosBrasil=0;
		int puntosBrasilSimulacion=0;
		
		
		String[] italia= {"Benito Mussolini", "Michelangelo Buonarroti", "Leonardo Da Vinci", "Nerón Claudio",
				"Luigi Rinaldi", "Francesco Bernoulli", "Alessio Bianco", "Dante Alighieri", "Julio Cesar",
				"Galileo Galilei", "Giorgio Armani", "Adriano Rosa", "Vincenzo Marcolini", "Giuseppe Milano", "Giovanni Giorgio",
				"Filippo Rizzo", "Luciano Pagano"};
		String[] posicionesItalia= {"Arquero", "Defensa", "Defensa","Defensa","Defensa","Delantero","Delantero",
				"Delantero", "Medio campo", "Medio campo","Medio campo","Delantero", "Defensa", "Medio campo", "Delantero",
				"Defensa", "Medio campo"};
		ArrayList<String> nuevoJugadorItalia= new ArrayList<String>();
		ArrayList<String> posicionNuevoItalia= new ArrayList<String>();
		String[] estadoItalia= {"En campo","En campo", "En campo","En campo","En campo","En campo","En campo","En campo",
				"En campo","En campo","En campo","En banca","En banca","En banca","En banca","En banca","En banca",};
		int puntosItalia=0;
		int puntosItaliaSimulacion=0;
		
		
		String[] francia= {"Emmanuel Macron", "Victor Hugo", "Maximilien Robespierre", "Alphonse Petit",
				"Gustave Flaubert", "Jean Jacques Rousseau", "Rene Descartes", "Luis XVI", "Jean-Paul Sartre",
				"Julio Vernes", "Antoine de Saint-Exupéry","Maurius Lefebvre", "Philippe Lambert", "Théodore Blanc", "Joyce Durand",
				"Orson Roux", "Thierry Fournier"};
		String[] posicionesFrancia= {"Arquero", "Defensa", "Defensa","Defensa","Defensa","Delantero","Delantero",
				"Delantero", "Medio campo", "Medio campo","Medio campo","Delantero", "Defensa", "Medio campo", "Defensa", "Delantero",
				"Medio campo"};
		ArrayList<String> nuevoJugadorFrancia= new ArrayList<String>();
		ArrayList<String> posicionNuevoFrancia= new ArrayList<String>();
		String[] estadoFrancia= {"En campo","En campo", "En campo","En campo","En campo","En campo","En campo","En campo",
				"En campo","En campo","En campo","En banca","En banca","En banca","En banca","En banca","En banca",};
		int puntosFrancia=0;
		int puntosFranciaSimulacion=0;
		
		
		
		int menu;
		do {
		menu=Integer.parseInt(JOptionPane.showInputDialog("El azteca:\n"
				+ "1. Administrar un equipo\n"
				+ "2. Simular un campeonato\n"
				+ "3. Ver tabla de posiciones\n"
				+ "4. Iniciar juego\n"
				+ "5. Ingresar un resultado\n"
				+ "6. Ver resultado de la jornada\n"
				+ "7. Salir"));
		
		switch (menu) {
		
		case 1:
			int menu2=0;
			
			do {
			menu2= Integer.parseInt(JOptionPane.showInputDialog("Seleccione la opción de su preferencia:\n"
					+ "1. Ver jugadores y sus posiciones\n"
					+ "2. Cambiar de posición a un jugador\n"
					+ "3. Ingresar un nuevo jugador\n"
					+ "4. Sustituir jugadores\n"
					+ "5. Elegir un capitán\n"
					+ "6. Cambiar estado\n "
					+ "7. Regresar"));
			switch(menu2) {
			case 1:
				int menu3=0;
				do {
				menu3= Integer.parseInt(JOptionPane.showInputDialog("Elija el equipo que desea ver:\n"
						+" 1. Alemania\n"
						+" 2. Argentina\n"
						+" 3. Inglaterra\n"
						+" 4. Brasil\n"
						+" 5. Italia\n"
						+" 6. Francia\n"
						+" 7. Regresar"));
			switch(menu3){
			case 1:
			for(int i=0;i<posicionesAlemania.length;i++) {
				System.out.println(alemania[i]+ ": "+ posicionesAlemania[i]);
			}
			for(int j=0;j<nuevoJugadorAlemania.toArray().length;j++) {
				System.out.println(nuevoJugadorAlemania.get(j)+": "+ posicionNuevoAlemania.get(j));
			}
			break;
			case 2:	
			for(int i=0;i<posicionesArgentina.length;i++) {
				System.out.println(argentina[i]+ ": "+ posicionesArgentina[i]);
			}
			for(int j=0;j<nuevoJugadorArgentina.toArray().length;j++) {
				System.out.println(nuevoJugadorArgentina.get(j)+": "+ posicionNuevoArgentina.get(j));
			}
			break;
			case 3:
				for(int i=0;i<posicionesInglaterra.length;i++) {
					System.out.println(inglaterra[i]+ ": "+ posicionesInglaterra[i]);
				}
				for(int j=0;j<nuevoJugadorInglaterra.toArray().length;j++) {
					System.out.println(nuevoJugadorInglaterra.get(j)+": "+ posicionNuevoInglaterra.get(j));
				}
				break;
			case 4:
				for(int i=0;i<posicionesBrasil.length;i++) {
					System.out.println(brasil[i]+ ": "+ posicionesBrasil[i]);
				}
				for(int j=0;j<nuevoJugadorBrasil.toArray().length;j++) {
					System.out.println(nuevoJugadorBrasil.get(j)+": "+ posicionNuevoBrasil.get(j));
				}
				break;
			case 5:
				for(int i=0;i<posicionesItalia.length;i++) {
					System.out.println(italia[i]+ ": "+ posicionesItalia[i]);
				}
				for(int j=0;j<nuevoJugadorItalia.toArray().length;j++) {
					System.out.println(nuevoJugadorItalia.get(j)+": "+ posicionNuevoItalia.get(j));
				}
				break;
			case 6:
				for(int i=0;i<posicionesFrancia.length;i++) {
					System.out.println(francia[i]+ ": "+ posicionesFrancia[i]);
				}
				for(int j=0;j<nuevoJugadorFrancia.toArray().length;j++) {
					System.out.println(nuevoJugadorFrancia.get(j)+": "+ posicionNuevoFrancia.get(j));
				}
				break;
				}
			}while(menu3!=7);
				break;
				
			case 2:
				int menu4=0;
				do {
					menu4= Integer.parseInt(JOptionPane.showInputDialog("Elija el equipo del jugador que desea cambiar de posición:\n"
							+" 1. Alemania\n"
							+" 2. Argentina\n"
							+" 3. Inglaterra\n"
							+" 4. Brasil\n"
							+" 5. Italia\n"
							+" 6. Francia\n"
							+" 7. Regresar"));
					switch(menu4) {
					case 1:
						String jugador= JOptionPane.showInputDialog("Ingrese el nombre del jugador tal como se muestra en la pantalla:");
						for(int i=0;i<alemania.length;i++) {
							if(alemania[i].equals(jugador)) {
								System.out.println("La posición actual del jugador es: "+ posicionesAlemania[i]);
								String nuevaPosicion= JOptionPane.showInputDialog("Ingrese la nueva posición deseada:\n"+
								"Arquero\n"+
								"Defensa\n"+
								"Medio campo\n"+
								"Delantero");
								JOptionPane.showMessageDialog(null, "La nueva posición del jugador es: "+nuevaPosicion);
								posicionesAlemania[i]=nuevaPosicion;
							}
						}
						break;
					case 2:
						String jugador2= JOptionPane.showInputDialog("Ingrese el nombre del jugador tal como se muestra en la pantalla:");
						for(int i=0;i<argentina.length;i++) {
							if(argentina[i].equals(jugador2)) {
								System.out.println("La posición actual del jugador es: "+ posicionesArgentina[i]);
								String nuevaPosicion= JOptionPane.showInputDialog("Ingrese la nueva posición deseada:\n"+
								"Arquero\n"+
								"Defensa\n"+
								"Medio campo\n"+
								"Delantero");
								JOptionPane.showMessageDialog(null, "La nueva posición del jugador es: "+nuevaPosicion);
								posicionesArgentina[i]=nuevaPosicion;
							}
						}
						break;
					case 3:
						String jugador3= JOptionPane.showInputDialog("Ingrese el nombre del jugador tal como se muestra en la pantalla:");
						for(int i=0;i<inglaterra.length;i++) {
							if(inglaterra[i].equals(jugador3)) {
								System.out.println("La posición actual del jugador es: "+ posicionesInglaterra[i]);
								String nuevaPosicion= JOptionPane.showInputDialog("Ingrese la nueva posición deseada:\n"+
								"Arquero\n"+
								"Defensa\n"+
								"Medio campo\n"+
								"Delantero");
								JOptionPane.showMessageDialog(null, "La nueva posición del jugador es: "+nuevaPosicion);
								posicionesInglaterra[i]=nuevaPosicion;
							}
						}
						break;
					case 4:
						String jugador4= JOptionPane.showInputDialog("Ingrese el nombre del jugador tal como se muestra en la pantalla:");
						for(int i=0;i<brasil.length;i++) {
							if(brasil[i].equals(jugador4)) {
								System.out.println("La posición actual del jugador es: "+ posicionesBrasil[i]);
								String nuevaPosicion= JOptionPane.showInputDialog("Ingrese la nueva posición deseada:\n"+
								"Arquero\n"+
								"Defensa\n"+
								"Medio campo\n"+
								"Delantero");
								JOptionPane.showMessageDialog(null, "La nueva posición del jugador es: "+nuevaPosicion);
								posicionesBrasil[i]=nuevaPosicion;
							}
						}
						break;
					case 5:
						String jugador5= JOptionPane.showInputDialog("Ingrese el nombre del jugador tal como se muestra en la pantalla:");
						for(int i=0;i<italia.length;i++) {
							if(italia[i].equals(jugador5)) {
								System.out.println("La posición actual del jugador es: "+ posicionesItalia[i]);
								String nuevaPosicion= JOptionPane.showInputDialog("Ingrese la nueva posición deseada:\n"+
								"Arquero\n"+
								"Defensa\n"+
								"Medio campo\n"+
								"Delantero");
								JOptionPane.showMessageDialog(null, "La nueva posición del jugador es: "+nuevaPosicion);
								posicionesItalia[i]=nuevaPosicion;
							}
						}
						break;
					case 6:
						String jugador6= JOptionPane.showInputDialog("Ingrese el nombre del jugador tal como se muestra en la pantalla:");
						for(int i=0;i<francia.length;i++) {
							if(francia[i].equals(jugador6)) {
								System.out.println("La posición actual del jugador es: "+ posicionesFrancia[i]);
								String nuevaPosicion= JOptionPane.showInputDialog("Ingrese la nueva posición deseada:\n"+
								"Arquero\n"+
								"Defensa\n"+
								"Medio campo\n"+
								"Delantero");
								JOptionPane.showMessageDialog(null, "La nueva posición del jugador es: "+nuevaPosicion);
								posicionesFrancia[i]=nuevaPosicion;
							}
						}
						break;
						
					}	
				}while(menu4!=7);
				break;
			case 3:
				int menu5=0;
				do {
					menu5= Integer.parseInt(JOptionPane.showInputDialog("Elija el equipo del nuevo jugador:\n"
							+" 1. Alemania\n"
							+" 2. Argentina\n"
							+" 3. Inglaterra\n"
							+" 4. Brasil\n"
							+" 5. Italia\n"
							+" 6. Francia\n"
							+" 7. Regresar"));
					switch(menu5) {
					case 1:
						String nuevoJugador= JOptionPane.showInputDialog("Ingrese el nombre de su nuevo jugador: ");
						nuevoJugadorAlemania.add(nuevoJugador);	
						String posicionNuevo= JOptionPane.showInputDialog("Ingrese la posición del nuevo jugador: ");
						posicionNuevoAlemania.add(posicionNuevo);
						break;
					case 2:	
						String nuevoJugador2= JOptionPane.showInputDialog("Ingrese el nombre de su nuevo jugador: ");
						nuevoJugadorArgentina.add(nuevoJugador2);	
						String posicionNuevo2= JOptionPane.showInputDialog("Ingrese la posición del nuevo jugador: ");
						posicionNuevoArgentina.add(posicionNuevo2);
						break;
					case 3:
						String nuevoJugador3= JOptionPane.showInputDialog("Ingrese el nombre de su nuevo jugador: ");
						nuevoJugadorInglaterra.add(nuevoJugador3);	
						String posicionNuevo3= JOptionPane.showInputDialog("Ingrese la posición del nuevo jugador: ");
						posicionNuevoInglaterra.add(posicionNuevo3);
						break;
					case 4:
						String nuevoJugador4= JOptionPane.showInputDialog("Ingrese el nombre de su nuevo jugador: ");
						nuevoJugadorBrasil.add(nuevoJugador4);	
						String posicionNuevo4= JOptionPane.showInputDialog("Ingrese la posición del nuevo jugador: ");
						posicionNuevoBrasil.add(posicionNuevo4);
						break;
					case 5:
						String nuevoJugador5= JOptionPane.showInputDialog("Ingrese el nombre de su nuevo jugador: ");
						nuevoJugadorItalia.add(nuevoJugador5);	
						String posicionNuevo5= JOptionPane.showInputDialog("Ingrese la posición del nuevo jugador: ");
						posicionNuevoItalia.add(posicionNuevo5);
						break;
					case 6:
						String nuevoJugador6= JOptionPane.showInputDialog("Ingrese el nombre de su nuevo jugador: ");
						nuevoJugadorFrancia.add(nuevoJugador6);	
						String posicionNuevo6= JOptionPane.showInputDialog("Ingrese la posición del nuevo jugador: ");
						posicionNuevoFrancia.add(posicionNuevo6);
						
					}
				}while(menu5!=7);
				break;
			case 4:
			int menu6=0;
			do {
				menu6= Integer.parseInt(JOptionPane.showInputDialog("Elija el equipo del jugador que desea sustituir:\n"
						+" 1. Alemania\n"
						+" 2. Argentina\n"
						+" 3. Inglaterra\n"
						+" 4. Brasil\n"
						+" 5. Italia\n"
						+" 6. Francia\n"
						+" 7. Regresar"));
				switch(menu6) {
				case 1:
					for(int i=0;i<alemania.length;i++) {
						System.out.println(alemania[i]+": "+ estadoAlemania[i]);
					}
					String sustituido= JOptionPane.showInputDialog("Ingrese el nombre del jugador a sustituir como\n"
					+" se muestra en la pantalla:");
					for(int i=0;i<alemania.length;i++) {
						if(alemania[i].equals(sustituido)) {
							System.out.println("El estado actual del jugador que desea sustituir es: "+ estadoAlemania[i]);
							String sustituto= JOptionPane.showInputDialog("Ingrese el nombre del jugador que ingresará\n"+
						    "al campo");
							estadoAlemania[i]= "En banca";
							for(int j=0;j<alemania.length;j++) {
								if(alemania[j].equals(sustituto)) {
									estadoAlemania[j]="En campo";
								}
							}
						}
					}
					break;
				case 2:
					for(int i=0;i<argentina.length;i++) {
						System.out.println(argentina[i]+": "+ estadoArgentina[i]);
					}
					String sustituido2= JOptionPane.showInputDialog("Ingrese el nombre del jugador a sustituir como\n"
					+" se muestra en la pantalla:");
					for(int i=0;i<argentina.length;i++) {
						if(argentina[i].equals(sustituido2)) {
							System.out.println("El estado actual del jugador que desea sustituir es: "+ estadoArgentina[i]);
							String sustituto2= JOptionPane.showInputDialog("Ingrese el nombre del jugador que ingresará\n"+
						    "al campo");
							estadoArgentina[i]= "En banca";
							for(int j=0;j<argentina.length;j++) {
								if(argentina[j].equals(sustituto2)) {
									estadoArgentina[j]="En campo";
								}
						}
					}
					}
					break;
				case 3:
					for(int i=0;i<inglaterra.length;i++) {
						System.out.println(inglaterra[i]+": "+ estadoInglaterra[i]);
					}
					String sustituido3= JOptionPane.showInputDialog("Ingrese el nombre del jugador a sustituir como\n"
					+" se muestra en la pantalla:");
					for(int i=0;i<inglaterra.length;i++) {
						if(inglaterra[i].equals(sustituido3)) {
							System.out.println("El estado actual del jugador que desea sustituir es: "+ estadoInglaterra[i]);
							String sustituto3= JOptionPane.showInputDialog("Ingrese el nombre del jugador que ingresará\n"+
						    "al campo");
							estadoInglaterra[i]= "En banca";
							for(int j=0;j<inglaterra.length;j++) {
								if(inglaterra[j].equals(sustituto3)) {
									estadoInglaterra[j]="En campo";
								}
							}
						}
					}
					break;
				case 4:
					for(int i=0;i<brasil.length;i++) {
						System.out.println(brasil[i]+": "+ estadoBrasil[i]);
					}
					String sustituido4= JOptionPane.showInputDialog("Ingrese el nombre del jugador a sustituir como\n"
					+" se muestra en la pantalla:");
					for(int i=0;i<brasil.length;i++) {
						if(brasil[i].equals(sustituido4)) {
							System.out.println("El estado actual del jugador que desea sustituir es: "+ estadoBrasil[i]);
							String sustituto4= JOptionPane.showInputDialog("Ingrese el nombre del jugador que ingresará\n"+
						    "al campo");
							estadoBrasil[i]= "En banca";
							for(int j=0;j<brasil.length;j++) {
								if(brasil[j].equals(sustituto4)) {
									estadoBrasil[j]="En campo";
								}
							}
							
						}
					}
					break;
				case 5:	
					for(int i=0;i<italia.length;i++) {
						System.out.println(italia[i]+": "+ estadoItalia[i]);
					}
					String sustituido5= JOptionPane.showInputDialog("Ingrese el nombre del jugador a sustituir como\n"
					+" se muestra en la pantalla:");
					for(int i=0;i<italia.length;i++) {
						if(italia[i].equals(sustituido5)) {
							System.out.println("El estado actual del jugador que desea sustituir es: "+ estadoItalia[i]);
							String sustituto5= JOptionPane.showInputDialog("Ingrese el nombre del jugador que ingresará\n"+
						    "al campo");
							estadoItalia[i]= "En banca";
							for(int j=0;j<italia.length;j++) {
								if(italia[j].equals(sustituto5)) {
									estadoItalia[j]="En campo";
								}
						}
					}
					}
					break;
				case 6:
					for(int i=0;i<francia.length;i++) {
						System.out.println(francia[i]+": "+ estadoFrancia[i]);
					}
					String sustituido6= JOptionPane.showInputDialog("Ingrese el nombre del jugador a sustituir como\n"
					+" se muestra en la pantalla:");
					for(int i=0;i<francia.length;i++) {
						if(francia[i].equals(sustituido6)) {
							System.out.println("El estado actual del jugador que desea sustituir es: "+ estadoFrancia[i]);
							String sustituto6= JOptionPane.showInputDialog("Ingrese el nombre del jugador que ingresará\n"+
						    "al campo");
							estadoFrancia[i]= "En banca";
							for(int j=0;j<francia.length;j++) {
								if(francia[j].equals(sustituto6)) {
									estadoArgentina[j]="En campo";
								}
						}
					}
					}
					break;
					}
				
				
			}while(menu6!=7);
			break;
			
			case 5:
				int menu7=0;
				do {
				menu7= Integer.parseInt(JOptionPane.showInputDialog("Elija el equipo del jugador que desea hacer capitán:\n"
							+" 1. Alemania\n"
							+" 2. Argentina\n"
							+" 3. Inglaterra\n"
							+" 4. Brasil\n"
							+" 5. Italia\n"
							+" 6. Francia\n"
							+" 7. Regresar"));
				switch(menu7) {
				case 1:
					String capitan= JOptionPane.showInputDialog("Ingrese el nombre del jugador que será capitán:");
					for(int i=0; i<alemania.length;i++) {
						if(alemania[i].equals(capitan)) {
							posicionesAlemania[i]="Capitán";
						}
					}
					break;
					
				case 2:
					String capitan2= JOptionPane.showInputDialog("Ingrese el nombre del jugador que será capitán:");
					for(int i=0; i<argentina.length;i++) {
						if(argentina[i].equals(capitan2)) {
							posicionesArgentina[i]="Capitán";
						}
					}
					break;
				case 3:
					String capitan3= JOptionPane.showInputDialog("Ingrese el nombre del jugador que será capitán:");
					for(int i=0; i<inglaterra.length;i++) {
						if(inglaterra[i].equals(capitan3)) {
							posicionesInglaterra[i]="Capitán";
						}
					}
					break;
				case 4:
					String capitan4= JOptionPane.showInputDialog("Ingrese el nombre del jugador que será capitán:");
					for(int i=0;i<brasil.length;i++) {
						if(brasil[i].equals(capitan4)) {
							posicionesBrasil[i]="Capitán";
						}
					}
					break;
				case 5:
					String capitan5= JOptionPane.showInputDialog("Ingrese el nombre del jugador que será capitán:");
					for(int i=0; i<italia.length;i++) {
						if(italia[i].equals(capitan5)) {
							posicionesItalia[i]="Capitán";
						}
					}
					break;
				case 6:
					String capitan6= JOptionPane.showInputDialog("Ingrese el nombre del jugador que será capitán:");
					for(int i=0; i<francia.length;i++) {
						if(francia[i].equals(capitan6)) {
							posicionesFrancia[i]="Capitán";
						}
					}
					
				break;	
				}	
				}while(menu7!=7);
				
				break;
				
			case 6:
				int menu8=0;
				do {
					menu8= Integer.parseInt(JOptionPane.showInputDialog("Elija el equipo del jugador cuyo estado desea cambiar:\n"
							+" 1. Alemania\n"
							+" 2. Argentina\n"
							+" 3. Inglaterra\n"
							+" 4. Brasil\n"
							+" 5. Italia\n"
							+" 6. Francia\n"
							+" 7. Regresar"));
					
					switch(menu8) {
					case 1:
						String jugadorCambio= JOptionPane.showInputDialog("Ingrese el nombre del jugador cuyo estado desea cambiar:");
						for(int i=0; i<alemania.length;i++) {
							if(alemania[i].equals(jugadorCambio)) {
								String nuevoEstado=JOptionPane.showInputDialog("Ingrese el nuevo estado del jugador:");
								estadoAlemania[i]=nuevoEstado;
							}
						}
						break;
					case 2:
						String jugadorCambio2= JOptionPane.showInputDialog("Ingrese el nombre del jugador cuyo estado desea cambiar:");
						for(int i=0; i<argentina.length;i++) {
							if(argentina[i].equals(jugadorCambio2)) {
								String nuevoEstado=JOptionPane.showInputDialog("Ingrese el nuevo estado del jugador:");
								estadoArgentina[i]=nuevoEstado;
							}
						}
						break;
					case 3:
						String jugadorCambio3= JOptionPane.showInputDialog("Ingrese el nombre del jugador cuyo estado desea cambiar:");
						for(int i=0; i<inglaterra.length;i++) {
							if(inglaterra[i].equals(jugadorCambio3)) {
								String nuevoEstado=JOptionPane.showInputDialog("Ingrese el nuevo estado del jugador:");
								estadoInglaterra[i]=nuevoEstado;
							}
						}
						break;
					case 4:
						String jugadorCambio4= JOptionPane.showInputDialog("Ingrese el nombre del jugador cuyo estado desea cambiar:");
						for(int i=0; i<brasil.length;i++) {
							if(brasil[i].equals(jugadorCambio4)) {
								String nuevoEstado=JOptionPane.showInputDialog("Ingrese el nuevo estado del jugador:");
								estadoBrasil[i]=nuevoEstado;
							}
						}
						break;
					case 5:
						String jugadorCambio5= JOptionPane.showInputDialog("Ingrese el nombre del jugador cuyo estado desea cambiar:");
						for(int i=0; i<italia.length;i++) {
							if(italia[i].equals(jugadorCambio5)) {
								String nuevoEstado=JOptionPane.showInputDialog("Ingrese el nuevo estado del jugador:");
								estadoItalia[i]=nuevoEstado;
							}
						}
						break;
					case 6:
						String jugadorCambio6= JOptionPane.showInputDialog("Ingrese el nombre del jugador cuyo estado desea cambiar:");
						for(int i=0; i<francia.length;i++) {
							if(francia[i].equals(jugadorCambio6)) {
								String nuevoEstado=JOptionPane.showInputDialog("Ingrese el nuevo estado del jugador:");
								estadoFrancia[i]=nuevoEstado;
							}
						}
						break;
						
					}
				}while(menu8!=7);
				break;
			}
		}while(menu2!=7);
			break;
		
		case 2:
			System.out.println("A continuación se mostrará el orden de los partidos:\n "
					+" Alemania vs Argentina\n"
					+" Alemania vs Inglaterra\n"
					+" Alemania vs Brasil\n"
					+" Alemania vs Francia\n"
					+" Alemania vs Francia\n"
					+" Argentina vs Inglaterra\n"
					+" Argentina vs Brasil\n"
					+" Argentina vs Italia\n"
					+" Argentina vs Francia\n"
					+" Inglaterra vs Brasil\n"
					+" Inglaterra vs Italia\n"
					+" Inglaterra vs Francia\n"
					+" Brasil vs Italia\n"
					+" Brasil vs Francia\n"
					+" Italia vs Francia\n"
					+" A continuación iniciará la simulación del campeonato.");
			
			JOptionPane.showMessageDialog(null, "Ahora: Alemania vs Argentina");
			
			JOptionPane.showMessageDialog(null, "Alemania: Par  Argentina: Impar");
			int numSimulacion= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ numSimulacion);
			if(numSimulacion%2==0) {
				JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
				puntosAlemaniaSimulacion=puntosAlemaniaSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
				puntosArgentinaSimulacion=puntosArgentinaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Alemania vs Inglaterra");
			
			JOptionPane.showMessageDialog(null, "Alemania: Par  Inglaterra: Impar");
			int num2S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num2S);
			if(num2S%2==0) {
				JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
				puntosAlemaniaSimulacion=puntosAlemaniaSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
				puntosInglaterraSimulacion=puntosInglaterraSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Alemania vs Brasil");
			
			JOptionPane.showMessageDialog(null, "Alemania: Par  Brasil: Impar");
			int num3S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num3S);
			if(num3S%2==0) {
				JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
				puntosAlemaniaSimulacion=puntosAlemaniaSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
				puntosBrasilSimulacion=puntosBrasilSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Alemania vs Italia");
			
			JOptionPane.showMessageDialog(null, "Alemania: Par  Italia: Impar");
			int num4S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num4S);
			if(num4S%2==0) {
				JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
				puntosAlemaniaSimulacion=puntosAlemaniaSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
				puntosItaliaSimulacion=puntosItaliaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Alemania vs Francia");
			
			JOptionPane.showMessageDialog(null, "Alemania: Par  Francia: Impar");
			int num5S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num5S);
			if(num5S%2==0) {
				JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
				puntosAlemaniaSimulacion=puntosAlemaniaSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
				puntosFranciaSimulacion=puntosFranciaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Argentina vs Inglaterra");
			
			JOptionPane.showMessageDialog(null, "Argentina: Par  Inglaterra: Impar");
			int num6S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num6S);
			if(num6S%2==0) {
				JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
				puntosArgentinaSimulacion=puntosArgentinaSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
				puntosInglaterraSimulacion=puntosInglaterraSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Argentina vs Brasil");
			
			JOptionPane.showMessageDialog(null, "Argentina: Par  Brasil: Impar");
			int num7S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num7S);
			if(num7S%2==0) {
				JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
				puntosArgentinaSimulacion=puntosArgentinaSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
				puntosBrasilSimulacion=puntosBrasilSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Argentina vs Italia");
			
			JOptionPane.showMessageDialog(null, "Argentina: Par  Italia: Impar");
			int num8S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num8S);
			if(num8S%2==0) {
				JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
				puntosArgentinaSimulacion=puntosArgentinaSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
				puntosItaliaSimulacion=puntosItaliaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Argentina vs Francia");
			
			JOptionPane.showMessageDialog(null, "Argentina: Par  Francia: Impar");
			int num9S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num9S);
			if(num9S%2==0) {
				JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
				puntosArgentinaSimulacion=puntosArgentinaSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
				puntosFranciaSimulacion=puntosFranciaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Inglaterra vs Brasil");
			
			JOptionPane.showMessageDialog(null, "Inglaterra: Par  Brasil: Impar");
			int num10S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num10S);
			if(num10S%2==0) {
				JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
				puntosInglaterraSimulacion=puntosInglaterraSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
				puntosBrasilSimulacion=puntosBrasilSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Inglaterra vs Italia");
			
			JOptionPane.showMessageDialog(null, "Inglaterra: Par  Italia: Impar");
			int num11S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num11S);
			if(num11S%2==0) {
				JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
				puntosInglaterraSimulacion=puntosInglaterraSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
				puntosItaliaSimulacion=puntosItaliaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Inglaterra vs Francia");
			
			JOptionPane.showMessageDialog(null, "Inglaterra: Par  Francia: Impar");
			int num12S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num12S);
			if(num12S%2==0) {
				JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
				puntosInglaterraSimulacion=puntosInglaterraSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
				puntosFranciaSimulacion=puntosFranciaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Brasil vs Italia");
			
			JOptionPane.showMessageDialog(null, "Brasil: Par  Italia: Impar");
			int num13S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num13S);
			if(num13S%2==0) {
				JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
				puntosBrasilSimulacion=puntosBrasilSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
				puntosItaliaSimulacion=puntosItaliaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Brasil vs Francia");
			
			JOptionPane.showMessageDialog(null, "Brasil: Par  Francia: Impar");
			int num14S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num14S);
			if(num14S%2==0) {
				JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
				puntosBrasilSimulacion=puntosBrasilSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
				puntosFranciaSimulacion=puntosFranciaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "Ahora: Italia vs Francia");
			
			JOptionPane.showMessageDialog(null, "Italia: Par  Francia: Impar");
			int num15S= aleatorio();
			JOptionPane.showMessageDialog(null, "El número es: "+ num15S);
			if(num15S%2==0) {
				JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
				puntosBrasilSimulacion=puntosBrasilSimulacion+3;
			}else {
				JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
				puntosFranciaSimulacion=puntosFranciaSimulacion+3;
			}
			
			JOptionPane.showMessageDialog(null, "A continuación se muestran los puntos obtenidos por cada equipo: ");
			System.out.println("Puntos Alemania: "+ puntosAlemaniaSimulacion);
			System.out.println("Puntos Argetina: "+ puntosArgentinaSimulacion);
			System.out.println("Puntos Inglaterra: "+ puntosInglaterraSimulacion);
			System.out.println("Puntos Brasil: "+ puntosBrasilSimulacion);
			System.out.println("Punto Italia: "+ puntosItaliaSimulacion);
			System.out.println("Puntos Francia: "+ puntosFranciaSimulacion);
			
		    //Organizar datos
			
			
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "A continuación se muestran los puntos de cada equipo:");
			System.out.println("Puntos del equipo de Alemania: "+ puntosAlemania);
			System.out.println("Puntos del equipo de Argentina: "+ puntosArgentina);
			System.out.println("Puntos del equipo de Inglaterra: "+ puntosInglaterra);
			System.out.println("Puntos del equipo de Brasil: "+ puntosBrasil);
			System.out.println("Puntos del equipo de Italia: "+ puntosItalia);
			System.out.println("Puntos del equipo de Francia: "+ puntosFrancia);			
			break;
	
			
		case 4:
			int menu15=0;
			do {
				menu15=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del partido que desea ver:\n"
						+"1. Alemania vs Argentina\n"
						+"2. Alemania vs Inglaterra\n"
						+"3. Alemania vs Brasil\n"
						+"4. Alemania vs Italia\n"
						+"5. Alemania vs Francia\n"
						+"6. Argentina vs Ingleterra\n"
						+"7. Argentina vs Brasil\n"
						+"8. Argentina vs Italia\n"
						+"9. Argentina vs Francia\n"
						+"10. Inglaterra vs Brasil\n"
						+"11. Inglaterra vs Italia\n"
						+"12. Inglaterra vs Francia\n"
						+"13. Brasil vs Italia\n"
						+"14. Brasil vs Francia\n"
						+"15. Italia vs Francia\n"
						+"16. Salir"));
				switch(menu15) {
				
				case 1:
					JOptionPane.showMessageDialog(null, "Alemania: Par  Argentina: Impar");
					int num= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num);
					if(num%2==0) {
						JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
						puntosAlemania=puntosAlemania+3;
					}else {
						JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
						puntosArgentina=puntosArgentina+3;
					}
					break;
				case 2 :
					JOptionPane.showMessageDialog(null, "Alemania: Par  Inglaterra: Impar");
					int num2= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num2);
					if(num2%2==0) {
						JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
						puntosAlemania=puntosAlemania+3;
					}else {
						JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
						puntosInglaterra=puntosInglaterra+3;
					}
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Alemania: Par  Brasil: Impar");
					int num3= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num3);
					if(num3%2==0) {
						JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
						puntosAlemania=puntosAlemania+3;
					}else {
						JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
						puntosBrasil=puntosBrasil+3;
					}
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Alemania: Par  Italia: Impar");
					int num4= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num4);
					if(num4%2==0) {
						JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
						puntosAlemania=puntosAlemania+3;
					}else {
						JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
						puntosItalia=puntosItalia+3;
					}
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Alemania: Par  Francia: Impar");
					int num5= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num5);
					if(num5%2==0) {
						JOptionPane.showMessageDialog(null, "Alemania gana 3 puntos");
						puntosAlemania=puntosAlemania+3;
					}else {
						JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
						puntosFrancia=puntosFrancia+3;
					}
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "Argentina: Par  Inglaterra: Impar");
					int num6= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num6);
					if(num6%2==0) {
						JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
						puntosArgentina=puntosArgentina+3;
					}else {
						JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
						puntosInglaterra=puntosInglaterra+3;
					}
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "Argentina: Par  Brasil: Impar");
					int num7= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num7);
					if(num7%2==0) {
						JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
						puntosArgentina=puntosArgentina+3;
					}else {
						JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
						puntosBrasil=puntosBrasil+3;
					}
					break;
				case 8:
					JOptionPane.showMessageDialog(null, "Argentina: Par  Italia: Impar");
					int num8= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num8);
					if(num8%2==0) {
						JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
						puntosArgentina=puntosArgentina+3;
					}else {
						JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
						puntosItalia=puntosItalia+3;
					}
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Argentina: Par  Francia: Impar");
					int num9= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num9);
					if(num9%2==0) {
						JOptionPane.showMessageDialog(null, "Argentina gana 3 puntos");
						puntosArgentina=puntosArgentina+3;
					}else {
						JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
						puntosFrancia=puntosFrancia+3;
					}
					break;
				case 10:
					JOptionPane.showMessageDialog(null, "Inglaterra: Par  Brasil: Impar");
					int num10= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num10);
					if(num10%2==0) {
						JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
						puntosInglaterra=puntosInglaterra+3;
					}else {
						JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
						puntosBrasil=puntosBrasil+3;
					}
					break;
				case 11:
					JOptionPane.showMessageDialog(null, "Inglaterra: Par  Italia: Impar");
					int num11= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num11);
					if(num11%2==0) {
						JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
						puntosInglaterra=puntosInglaterra+3;
					}else {
						JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
						puntosItalia=puntosItalia+3;
					}
					break;
				case 12:
					JOptionPane.showMessageDialog(null, "Inglaterra: Par  Francia: Impar");
					int num12= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num12);
					if(num12%2==0) {
						JOptionPane.showMessageDialog(null, "Inglaterra gana 3 puntos");
						puntosInglaterra=puntosInglaterra+3;
					}else {
						JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
						puntosFrancia=puntosFrancia+3;
					}
					break;
				case 13:
					JOptionPane.showMessageDialog(null, "Brasil: Par  Italia: Impar");
					int num13= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num13);
					if(num13%2==0) {
						JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
						puntosBrasil=puntosBrasil+3;
					}else {
						JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
						puntosItalia=puntosItalia+3;
					}
					break;
				case 14:
					JOptionPane.showMessageDialog(null, "Brasil: Par  Francia: Impar");
					int num14= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: "+ num14);
					if(num14%2==0) {
						JOptionPane.showMessageDialog(null, "Brasil gana 3 puntos");
						puntosBrasil=puntosBrasil+3;
					}else {
						JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
						puntosFrancia=puntosFrancia+3;
					}
					break;
				case 15:
					JOptionPane.showMessageDialog(null, "Italia: Par  Francia: Impar");
					int num15= aleatorio();
					JOptionPane.showMessageDialog(null, "El número es: " + num15);
					if(num15%2==0) {
						JOptionPane.showMessageDialog(null, "Italia gana 3 puntos");
						puntosBrasil=puntosBrasil+3;
					}else {
						JOptionPane.showMessageDialog(null, "Francia gana 3 puntos");
						puntosFrancia=puntosFrancia+3;
					}
					break;
					
					
				}
			}while(menu15!=16);
			
		
		case 5:
			String oponentes= JOptionPane.showInputDialog("Ingrese los dos equipos contrincantes: ");
			contrincantes.add(oponentes);
			
			String ganador= JOptionPane.showInputDialog("Ingrese el equipo ganador:");
			equipoGanador.add(ganador);
			
			String perdedor= JOptionPane.showInputDialog("Ingrese el equipo perdedor: ");
			equipoPerdedor.add(perdedor);
		
		case 6:
			JOptionPane.showMessageDialog(null, "Se mostrará el resultado de la jornada: ");
			for(int i=0;i<contrincantes.size();i++) {
			   String partidosJugados= contrincantes.get(i);
			   String winner= equipoGanador.get(i);
			   String loser= equipoPerdedor.get(i);
			   System.out.println("Contrincantes: "+ partidosJugados+ " Ganador: "+ winner+ " Perdedor: "+ loser);
			}
			System.out.println("_____________________________________________");
			System.out.println("A continuación de muestra la puntuación final de cada equipo: ");
			System.out.println("Puntos Alemania: "+ puntosAlemania);
			System.out.println("Puntos Argentina: "+ puntosArgentina);
			System.out.println("Puntos Inglaterra: "+ puntosInglaterra);
			System.out.println("Puntos Brasil: "+ puntosBrasil);
			System.out.println("Puntos Italia: "+ puntosItalia);
			System.out.println("Puntos Francia: "+ puntosFrancia);
			
		}
}while(menu!=7);
	}
	public static int aleatorio() {
		int aleatorio=0;
		int min=0;
		int max=50;
		aleatorio=(int)Math.floor(Math.random()*(max-min+1))+min;
		return aleatorio;
	}
	}
	
