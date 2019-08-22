package model;

public class AccountBuilder {

    private String gender;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String date;
    private String month;
    private String year;
    private String addressFirstName;
    private String addressLastName;
    private String company;
    private String address;
    private String addressLine2;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String addInfo;
    private String homePhone;
    private String mobilePhone;
    private String alias;

    public AccountBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public AccountBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public AccountBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AccountBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public AccountBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public AccountBuilder withDate(String date) {
        this.date = date;
        return this;
    }

    public AccountBuilder withMonth(String month) {
        this.month = month;
        return this;
    }

    public AccountBuilder withYear(String year) {
        this.year = year;
        return this;
    }

    public AccountBuilder withAddressFirstName(String addressFirstName) {
        this.addressFirstName = addressFirstName;
        return this;
    }

    public AccountBuilder withAddressLastName(String addressLastName) {
        this.addressLastName = addressLastName;
        return this;
    }

    public AccountBuilder withCompany(String company) {
        this.company = company;
        return this;
    }

    public AccountBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public AccountBuilder withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    public AccountBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    public AccountBuilder withState(String state) {
        this.state = state;
        return this;
    }

    public AccountBuilder withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public AccountBuilder withCountry(String country) {
        this.country = country;
        return this;
    }

    public AccountBuilder withAddInfo(String addInfo) {
        this.addInfo = addInfo;
        return this;
    }

    public AccountBuilder withHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }


    public AccountBuilder withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }


    public AccountBuilder withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public Account build() {
        return new Account(gender, firstName, lastName, email, password, date, month, year, addressFirstName, addressLastName, company, address, addressLine2, city, state, postcode, country, addInfo, homePhone, mobilePhone, alias);

    }

}
