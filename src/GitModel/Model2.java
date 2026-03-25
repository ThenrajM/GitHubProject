package GitModel;



public class Model2 {


		// TODO Auto-generated method stub
		
		private int STD_ID;
		
		private String DEPT = "";
		private int CGPA = 0;

		public int getSTD_ID() {
			return STD_ID;
		}

		public void setSTD_ID(int sTD_ID) {
			STD_ID = sTD_ID;
		}


		public String getDEPT() {
			return DEPT;
		}

		public void setDEPT(String dEPT) {
			DEPT = dEPT;
		}

		public int getCGPA() {
			return CGPA;
		}

		public void setCGPA(int cGPA) {
			CGPA = cGPA;
		}

		@Override
		public String toString() {
			return "Student [STD_ID=" + STD_ID + ", STD_NAME=" + ", DEPT=" + DEPT + ", CGPA=" + CGPA + "]";
		
	
		
	
}
}