public class Individual {
	private String ID;
	private int line;
	private String name;
	private String Firstname;
	private String Lastname;
	private String gender;
	private String birthday;
	private int age;
	private boolean alive;
	private String death;
	private String child;
	private String spouse;
	private String fams = "NA";

	public String getId() {
		return ID;
	}

	public int getLine() {
		return line;
	}

	public String getName() {
		return name;
	}
	
	public String getFirstName() {
		return Firstname;
	}
	public String getLastName() {
		return Lastname;
	}

	public String getGender() {
		return gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public int getAge() {
		return age;
	}

	public boolean getIsAlive() {
		return alive;
	}

	public String getDeath() {
		return death;
	}

	public String getChild() {
		return child;
	}

	public String getSpouse() {
		return spouse;
	}
	
	public String getFams() {
        	return fams;
    	}
	
	// mutators;
	public void setId(String ID) {
		this.ID = ID;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setFirstName(String FirstName) {
		this.Firstname = Firstname;
	}
	
	public void setLastName(String Lastname) {
		this.Lastname = Lastname;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setDeath(String death) {
		this.death = death;
	}

	public void setChild(String child) {
		this.child = child;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}
	
	public void setFams(String fams) {
        	this.fams = fams;
    	}
}
