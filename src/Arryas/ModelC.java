package Arryas;

import java.util.Objects;

public class ModelC {

	private int massId;
	private String massName;

	private String massEmail;

	private int massPh;


	public ModelC() {
		super();
		this.massId = massId;
		this.massName = massName;
		this.massEmail = massEmail;
		this.massPh = massPh;
	}

	public int getMassId() {
		return massId;
	}

	public void setMassId(int massId) {
		this.massId = massId;
	}

	public String getMassName() {
		return massName;
	}

	public void setMassName(String massName) {
		this.massName = massName;
	}

	public String getMassEmail() {
		return massEmail;
	}

	public void setMassEmail(String massEmail) {
		this.massEmail = massEmail;
	}

	public int getMassPh() {
		return massPh;
	}

	public void setMassPh(int massPh) {
		this.massPh = massPh;
	}

	@Override
	public int hashCode() {
		return Objects.hash(massEmail, massId, massName, massPh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelC other = (ModelC) obj;
		return Objects.equals(massEmail, other.massEmail) && massId == other.massId
				&& Objects.equals(massName, other.massName) && massPh == other.massPh;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "ModelC [massId=" + massId + ", massName=" + massName + ", massEmail=" + massEmail + ", massPh=" + massPh
				+ "]";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


}
