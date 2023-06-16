package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.events.KeyboardEvent;
	
	public class Protagonista extends MovieClip {
		
		private var izq: Boolean = false;
		private var der: Boolean = false;
		private var vel: int = 10; //Velocidad de cuenta en pixeles
		private var limite_x_der: int =510;
		private var limite_x_izq: int =40;
		
		
		public function Protagonista() {
			// constructor code
		addEventListener(Event.ENTER_FRAME, motor);
		}
		public function motor(e:Event):void{
			if(der){
				if(x<= limite_x_der){
				x+= vel;
			}
			}
			else if (izq){
				if(x>=limite_x_izq){
				x-= vel;
			}
			}
			
			controles();
		}
		public function controles(){
			stage.addEventListener(KeyboardEvent.KEY_DOWN, keydown);
			stage.addEventListener(KeyboardEvent.KEY_UP,keyup);
		}
		public function keydown(e: KeyboardEvent): void{
			switch(e.keyCode){
				case 39: //letra a 
				der=true
				break;
				
				case 37: //letra b
				izq=true;
				break;
			}
		}
		public function keyup(e: KeyboardEvent): void{
			switch(e.keyCode){
				case 39:
				der=false
				break;
				
				case 37:
				izq=false;
				break;
	}
}
	}
}