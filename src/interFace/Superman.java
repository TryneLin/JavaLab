package interFace;

public class Superman implements Lawyer,Accountant  {

	@Override
	public void 訴訟() {
		// TODO Auto-generated method stub
	}
	@Override
	public void 報稅() {
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superman s = new Superman();
			
		s.訴訟();
		s.報稅();

	}


}
