package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip {  //Definicion de la clase
		
		//Se crea la definicion de un objeto            //6 Juego//
		private var  Fondo_new: Fondo = new Fondo ();  //Variables de clase
		private var Piso_new: Piso = new Piso ();     //Variables de clase
		private var  Protagonista_new: Protagonista = new Protagonista ();  //Variables de clase
		private var Antagonista_new: Antagonista = new Antagonista (); //Variables de clase
		
		public function setup() { //Metodo Constructor 
			
			addChild (Fondo_new);
			addChild (Piso_new);
			addChild (Protagonista_new);
			addChild (Antagonista_new);
			
		 Fondo_new.y =200;
		 Fondo_new.x =275;
		
		 Piso_new.y =385;
		 Piso_new.x =275;
		 
		 Protagonista_new.y =375;
		 Protagonista_new.x =275;
		 
		 Antagonista_new.y =50;
		 Antagonista_new.x =275;
		}
	    }
        }
