package com.marks.marks;

public class Mark {
	
	private int mark_id;
	private int student_id;
	private int tamil;
	private int english;
	private int maths;
	private int science;
	private int social_science;
	private int term_id;
	
	public Mark(int mark_id, int student_id, int tamil, int english, int maths, int science, int social_science,
			int term_id) {
		this.mark_id = mark_id;
		this.student_id = student_id;
		this.tamil = tamil;
		this.english = english;
		this.maths = maths;
		this.science = science;
		this.social_science = social_science;
		this.term_id = term_id;
	}

	public int getMark_id() {
		return mark_id;
	}

	public void setMark_id(int mark_id) {
		this.mark_id = mark_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getTamil() {
		return tamil;
	}

	public void setTamil(int tamil) {
		this.tamil = tamil;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSocial_science() {
		return social_science;
	}

	public void setSocial_science(int social_science) {
		this.social_science = social_science;
	}

	public int getTerm_id() {
		return term_id;
	}

	public void setTerm_id(int term_id) {
		this.term_id = term_id;
	}

	@Override
	public String toString() {
		return "Mark [mark_id=" + mark_id + ", student_id=" + student_id + ", tamil=" + tamil + ", english=" + english
				+ ", maths=" + maths + ", science=" + science + ", social_science=" + social_science + ", term_id="
				+ term_id + "]";
	}
	
	

}
