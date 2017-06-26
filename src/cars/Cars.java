package cars;

	public class Cars implements iVehicle {
		@Override
		public void start() {
			System.out.println("the car starts");
		}
		
		@Override
		public void stop() {
			System.out.println("the car stops");
		}

				@Override
		public void accelerates() {
			System.out.println("the car accelerates");
		}
		@Override
		public void deccelerates() {
			System.out.println("the car deccelerates");

			
		}
		@Override
		public void turns() {
			System.out.println("the car turns");

		}

		@Override
		public String honk() {
			// TODO Auto-generated method stub
			return ("honks horn");
		}
		
	}
