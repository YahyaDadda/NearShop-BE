package ma.tcm.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppUser {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	private String email;
	private String password;
	private Collection<Long> likedShopsId = new ArrayList<>();
	private Collection<Long> disLikedShopsId = new ArrayList<>();
	
	public AppUser() {
		super();
	}

	public AppUser(Long userId, String email, String password, Collection<Long> likedShopsId,
			Collection<Long> disLikedShopsId) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.likedShopsId = likedShopsId;
		this.disLikedShopsId = disLikedShopsId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public Collection<Long> getLikedShopsId() {
		return likedShopsId;
	}

	public void setLikedShopsId(Collection<Long> likedShopsId) {
		this.likedShopsId = likedShopsId;
	}

	public Collection<Long> getDisLikedShopsId() {
		return disLikedShopsId;
	}

	public void setDisLikedShopsId(Collection<Long> disLikedShopsId) {
		this.disLikedShopsId = disLikedShopsId;
	}
}
