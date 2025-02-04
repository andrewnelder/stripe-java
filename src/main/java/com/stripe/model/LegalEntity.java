package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public class LegalEntity extends StripeObject {
	String type;
	Address address;
	String businessName;
	Boolean businessTaxIdProvided;
	DateOfBirth dob;
	String firstName;
	String lastName;
	Address personalAddress;
	Boolean personalIdNumberProvided;
	@SerializedName("ssn_last_4_provided")/*Annotation required for GSON serialization for field with number*/
	Boolean ssnLast4Provided;
	Verification verification;
	List<Owner> additionalOwners;

	public String getType() {
		return type;
	}
	public Address getAddress() {
		return address;
	}
	public String getBusinessName() {
		return businessName;
	}
	public Boolean getBusinessTaxIdProvided() {
		return businessTaxIdProvided;
	}
	public void setBusinessTaxIdProvided(Boolean businessTaxIdProvided) {
		this.businessTaxIdProvided = businessTaxIdProvided;
	}
	public DateOfBirth getDob() {
		return dob;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Address getPersonalAddress() {
		return personalAddress;
	}
	public Boolean getPersonalIdNumberProvided() {
		return personalIdNumberProvided;
	}
	public void setPersonalIdNumberProvided(Boolean personalIdNumberProvided) {
		this.personalIdNumberProvided = personalIdNumberProvided;
	}
	public Boolean getSsnLast4Provided() {
		return ssnLast4Provided;
	}
	public void setSsnLast4Provided(Boolean ssnLast4Provided) {
		this.ssnLast4Provided = ssnLast4Provided;
	}
	public Verification getVerification() {
		return verification;
	}
	public List<Owner> getAdditionalOwners() {
		return additionalOwners;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		LegalEntity le = (LegalEntity) o;
		return equals(type, le.type) &&
			equals(address, le.address) &&
			equals(businessName, le.businessName) &&
			equals(dob, le.dob) &&
			equals(firstName, le.firstName) &&
			equals(lastName, le.lastName) &&
			equals(personalAddress, le.personalAddress) &&
			equals(personalIdNumberProvided, le.personalIdNumberProvided) &&
			equals(ssnLast4Provided, le.ssnLast4Provided) &&
			equals(verification, le.verification) &&
			equals(additionalOwners, le.additionalOwners);
	}

	public static class DateOfBirth extends StripeObject {
		Integer day;
		Integer month;
		Integer year;

		public Integer getDay() {
			return day;
		}
		public Integer getMonth() {
			return month;
		}
		public Integer getYear() {
			return year;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			DateOfBirth dob = (DateOfBirth) o;
			return equals(day, dob.day) &&
				equals(month, dob.month) &&
				equals(year, dob.year);
		}
	}

	public static class Verification extends StripeObject {
		String status;
		String document;
		String details;
		String detailsCode;

		public String getStatus() {
			return status;
		}
		public String getDocument() {
			return document;
		}
		public String getDetails() {
			return details;
		}
		public String getDetailsCode() {
			return detailsCode;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			Verification verification = (Verification) o;
			return equals(status, verification.status) &&
				equals(document, verification.document) &&
				equals(details, verification.details) &&
				equals(detailsCode, verification.detailsCode);
		}
	}

	public static class Owner extends StripeObject {
		Address address;
		DateOfBirth dob;
		String firstName;
		String lastName;
		Verification verification;

		public Address getAddress() {
			return address;
		}
		public DateOfBirth getDob() {
			return dob;
		}
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public Verification getVerification() {
			return verification;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}

			Owner owner = (Owner) o;
			return equals(address, owner.address) &&
				equals(dob, owner.dob) &&
				equals(firstName, owner.firstName) &&
				equals(lastName, owner.lastName) &&
				equals(verification, owner.verification);
		}
	}
}
