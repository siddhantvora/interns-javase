package com.yash.Entity;

public class Interns {
	private int id;
	private String internFirstName;
	private String internLastName;
	private int internAge;
	private Level level;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInternFirstName() {
		return internFirstName;
	}
	public void setInternFirstName(String internFirstName) {
		this.internFirstName = internFirstName;
	}
	public String getInternLastName() {
		return internLastName;
	}
	public void setInternLastName(String internLastName) {
		this.internLastName = internLastName;
	}
	public int getInternAge() {
		return internAge;
	}
	public void setInternAge(int internAge) {
		this.internAge = internAge;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + internAge;
		result = prime * result + ((internFirstName == null) ? 0 : internFirstName.hashCode());
		result = prime * result + ((internLastName == null) ? 0 : internLastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interns other = (Interns) obj;
		if (internAge != other.internAge)
			return false;
		if (internFirstName == null) {
			if (other.internFirstName != null)
				return false;
		} else if (!internFirstName.equals(other.internFirstName))
			return false;
		if (internLastName == null) {
			if (other.internLastName != null)
				return false;
		} else if (!internLastName.equals(other.internLastName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Interns [id=" + id + ", internFirstName=" + internFirstName + ", internLastName=" + internLastName
				+ ", internAge=" + internAge + ", level=" + level + "]";
	}
	
	
}
