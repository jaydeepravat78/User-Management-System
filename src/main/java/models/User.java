package models;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	public String name;
	private String email;
	private String password;
	private String phone;
	private String gender;
	private String game;
	private String[] lang;
	private String secQues;
	private String profilePic;
	private List<Address> addresses;
	private boolean isAdmin;

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getSecQues() {
		return secQues;
	}

	public void setSecQues(String secQues) {
		this.secQues = secQues;
	}

	public List<Address> getAddresses() {
		return Collections.unmodifiableList(this.addresses);
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = Collections.unmodifiableList(addresses);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String[] getLang() {
		return Arrays.copyOf(this.lang, lang.length);
	}

	public void setLang(String[] lang) {
		this.lang = Arrays.copyOf(lang, lang.length);
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

}
