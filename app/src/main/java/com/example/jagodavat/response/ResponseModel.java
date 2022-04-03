package com.example.jagodavat.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseModel {

    public Result result;

    public ResponseModel(Result result) {
        this.result = result;
    }

    public String getVatStatus(){
        return result.getSubject().getStatusVat();
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public static class Result {

        public Subject subject;
        public String requestId;
        public String requestDateTime;

        public Result(Subject subject, String requestId, String requestDateTime) {
            this.subject = subject;
            this.requestId = requestId;
            this.requestDateTime = requestDateTime;
        }

        public Subject getSubject() {
            return subject;
        }

        public void setSubject(Subject subject) {
            this.subject = subject;
        }

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public String getRequestDateTime() {
            return requestDateTime;
        }

        public void setRequestDateTime(String requestDateTime) {
            this.requestDateTime = requestDateTime;
        }

        public static class Subject {

            @SerializedName("name")
            @Expose
            public String name;

            @SerializedName("nip")
            @Expose
            public String nip;

            @SerializedName("statusVat")
            @Expose
            public String statusVat;

            @SerializedName("regon")
            @Expose
            public String regon;

            @SerializedName("pesel")
            @Expose
            public Object pesel;

            @SerializedName("krs")
            @Expose
            public Object krs;

            @SerializedName("residenceAddress")
            @Expose
            public Object residenceAddress;

            @SerializedName("workingAddress")
            @Expose
            public String workingAddress;

            @SerializedName("representatives")
            @Expose
            public List<Object> representatives = null;

            @SerializedName("authorizedClerks")
            @Expose
            public List<Object> authorizedClerks = null;

            @SerializedName("partners")
            @Expose
            public List<Object> partners = null;

            @SerializedName("registrationLegalDate")
            @Expose
            public String registrationLegalDate;

            @SerializedName("registrationDenialBasis")
            @Expose
            public Object registrationDenialBasis;

            @SerializedName("registrationDenialDate")
            @Expose
            public Object registrationDenialDate;

            @SerializedName("restorationBasis")
            @Expose
            public Object restorationBasis;

            @SerializedName("restorationDate")
            @Expose
            public Object restorationDate;

            @SerializedName("removalBasis")
            @Expose
            public Object removalBasis;

            @SerializedName("removalDate")
            @Expose
            public Object removalDate;

            @SerializedName("accountNumbers")
            @Expose
            public List<String> accountNumbers = null;

            @SerializedName("hasVirtualAccounts")
            @Expose
            public Boolean hasVirtualAccounts;

            public Subject() {
            }

            public Subject(String name, String nip, String statusVat, String regon, Object pesel, Object krs, Object residenceAddress, String workingAddress, List<Object> representatives, List<Object> authorizedClerks, List<Object> partners, String registrationLegalDate, Object registrationDenialBasis, Object registrationDenialDate, Object restorationBasis, Object restorationDate, Object removalBasis, Object removalDate, List<String> accountNumbers, Boolean hasVirtualAccounts) {
                this.name = name;
                this.nip = nip;
                this.statusVat = statusVat;
                this.regon = regon;
                this.pesel = pesel;
                this.krs = krs;
                this.residenceAddress = residenceAddress;
                this.workingAddress = workingAddress;
                this.representatives = representatives;
                this.authorizedClerks = authorizedClerks;
                this.partners = partners;
                this.registrationLegalDate = registrationLegalDate;
                this.registrationDenialBasis = registrationDenialBasis;
                this.registrationDenialDate = registrationDenialDate;
                this.restorationBasis = restorationBasis;
                this.restorationDate = restorationDate;
                this.removalBasis = removalBasis;
                this.removalDate = removalDate;
                this.accountNumbers = accountNumbers;
                this.hasVirtualAccounts = hasVirtualAccounts;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNip() {
                return nip;
            }

            public void setNip(String nip) {
                this.nip = nip;
            }

            public String getStatusVat() {
                return statusVat;
            }

            public void setStatusVat(String statusVat) {
                this.statusVat = statusVat;
            }

            public String getRegon() {
                return regon;
            }

            public void setRegon(String regon) {
                this.regon = regon;
            }

            public Object getPesel() {
                return pesel;
            }

            public void setPesel(Object pesel) {
                this.pesel = pesel;
            }

            public Object getKrs() {
                return krs;
            }

            public void setKrs(Object krs) {
                this.krs = krs;
            }

            public Object getResidenceAddress() {
                return residenceAddress;
            }

            public void setResidenceAddress(Object residenceAddress) {
                this.residenceAddress = residenceAddress;
            }

            public String getWorkingAddress() {
                return workingAddress;
            }

            public void setWorkingAddress(String workingAddress) {
                this.workingAddress = workingAddress;
            }

            public List<Object> getRepresentatives() {
                return representatives;
            }

            public void setRepresentatives(List<Object> representatives) {
                this.representatives = representatives;
            }

            public List<Object> getAuthorizedClerks() {
                return authorizedClerks;
            }

            public void setAuthorizedClerks(List<Object> authorizedClerks) {
                this.authorizedClerks = authorizedClerks;
            }

            public List<Object> getPartners() {
                return partners;
            }

            public void setPartners(List<Object> partners) {
                this.partners = partners;
            }

            public String getRegistrationLegalDate() {
                return registrationLegalDate;
            }

            public void setRegistrationLegalDate(String registrationLegalDate) {
                this.registrationLegalDate = registrationLegalDate;
            }

            public Object getRegistrationDenialBasis() {
                return registrationDenialBasis;
            }

            public void setRegistrationDenialBasis(Object registrationDenialBasis) {
                this.registrationDenialBasis = registrationDenialBasis;
            }

            public Object getRegistrationDenialDate() {
                return registrationDenialDate;
            }

            public void setRegistrationDenialDate(Object registrationDenialDate) {
                this.registrationDenialDate = registrationDenialDate;
            }

            public Object getRestorationBasis() {
                return restorationBasis;
            }

            public void setRestorationBasis(Object restorationBasis) {
                this.restorationBasis = restorationBasis;
            }

            public Object getRestorationDate() {
                return restorationDate;
            }

            public void setRestorationDate(Object restorationDate) {
                this.restorationDate = restorationDate;
            }

            public Object getRemovalBasis() {
                return removalBasis;
            }

            public void setRemovalBasis(Object removalBasis) {
                this.removalBasis = removalBasis;
            }

            public Object getRemovalDate() {
                return removalDate;
            }

            public void setRemovalDate(Object removalDate) {
                this.removalDate = removalDate;
            }

            public List<String> getAccountNumbers() {
                return accountNumbers;
            }

            public void setAccountNumbers(List<String> accountNumbers) {
                this.accountNumbers = accountNumbers;
            }

            public Boolean getHasVirtualAccounts() {
                return hasVirtualAccounts;
            }

            public void setHasVirtualAccounts(Boolean hasVirtualAccounts) {
                this.hasVirtualAccounts = hasVirtualAccounts;
            }
        }
    }
}
