package com.dqg.dpd.domain;

public class User {
		private String name;
		private int age;
		private Address address;

		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "UserNode [name=" + name + ", age=" + age + "]";
		}
}
