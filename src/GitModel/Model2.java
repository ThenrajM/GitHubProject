package GitModel;



public class Model2 {


		// TODO Auto-generated method stub
		
		private int STD_ID;
		private String STD_NAME = "";
		private String DEPT = "";
		private int CGPA = 0;

		public int getSTD_ID() {
			return STD_ID;
		}

		public void setSTD_ID(int sTD_ID) {
			STD_ID = sTD_ID;
		}

		public String getSTD_NAME() {
			return STD_NAME;
		}

		public void setSTD_NAME(String sTD_NAME) {
			STD_NAME = sTD_NAME;
		}


		@Override
		public String toString() {
			return "Student [STD_ID=" + STD_ID + ", STD_NAME=" + STD_NAME + ", DEPT=" + DEPT + ", CGPA=" + CGPA + "]";
		
	
		
	
}
}