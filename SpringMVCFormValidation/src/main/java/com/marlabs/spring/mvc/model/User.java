package com.marlabs.spring.mvc.model;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class User implements Serializable {
	private String name;
	private String email;
	private String gender;
	private List<String> languages;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the languages
	 */
	public List<String> getLanguages() {
		return languages;
	}

	/**
	 * @param languages
	 *            the languages to set
	 */
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", gender=" + gender
				+ ", languages=" + languages + "]";
	}
}
