package com.ty.onetomany;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

	@Entity
	public class Branch {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name, address;
		private long phone;
		@ManyToOne
		@JoinColumn(name="my_hospital_id")
		private Hospital hospital;

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

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public long getPhone() {
			return phone;
		}

		public void setPhone(long phone) {
			this.phone = phone;
		}

		public Hospital getHosptial() {
			return hospital;
		}

		public void setHosptial(Hospital hosptial) {
			this.hospital = hospital;
		}

		@Override
		public String toString() {
			return "Branch []";
		}
}
