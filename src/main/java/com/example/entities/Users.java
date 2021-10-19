package com.example.entities;


	import java.util.HashSet;
	import java.util.Set;

	import javax.persistence.CascadeType;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.JoinTable;
	import javax.persistence.ManyToMany;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Entity(name = "onlineuser")
	@Table(name = "onlineuser")
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	public class Users {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private int userId;
		@Column(name = "name")
		private String userName;

		// USERS MAPPED WITH CUSTOMER
		@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name = "passengerId")
		private Booking bookingId;
		private String password;

		// USERS MAPPED WITH ROLES
		@ManyToMany(fetch = FetchType.LAZY)
		@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "role_id"))
		private Set<Role> roles = new HashSet<>();

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Booking getBookingId() {
			return bookingId;
		}

		public void setBookingId(Booking bookingId) {
			this.bookingId = bookingId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Set<Role> getRoles() {
			return roles;
		}

		public void setRoles(Set<Role> roles) {
			this.roles = roles;
		}

		public Users(int i, String string) {
			// TODO Auto-generated constructor stub
		}

}
