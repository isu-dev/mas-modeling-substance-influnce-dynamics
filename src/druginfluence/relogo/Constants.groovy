package druginfluence.relogo

class Constants {
	public static int civilianId = 1
	def static genderList = ["Male", "Female"]
	def static yesNoList = ["Yes", "No"]
	def static statusList = ["NonUser", "CasualUser", "RegularUser"]

	public static int getCivilianId() {
		return civilianId;
		civilianId++
	}

	public void setCivilianId(int civilianId) {
		this.civilianId = civilianId;
	}
	
	
}
