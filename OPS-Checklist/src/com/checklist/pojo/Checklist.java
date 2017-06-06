package com.checklist.pojo;

public class Checklist {

    private boolean functionalscope1;
    private boolean functionalscope2;
    private boolean functionalscope3;
    private boolean functionalscope4;
    private boolean functionalscope5;

    private boolean infrarelease1;
    private boolean infrarelease2;
    private boolean infrarelease3;
    private boolean infrarelease4;
    private boolean infrarelease5;
    private boolean infrarelease6;
    private boolean infrarelease7;
    private boolean infrarelease8;
    private boolean infrarelease9;
    private boolean infrarelease10;
    private boolean infrarelease11;
    
    private boolean alerting1;
    private boolean alerting2;
    private boolean alerting3;
    private boolean alerting4;
    private boolean alerting5;
    private boolean alerting6;
    private boolean alerting7;
    private boolean alerting8;
    private boolean alerting9;
    
    public Checklist() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Checklist(boolean functionalscope1, boolean functionalscope2, boolean functionalscope3,
            boolean functionalscope4, boolean functionalscope5, boolean infrarelease1, boolean infrarelease2,
            boolean infrarelease3, boolean infrarelease4, boolean infrarelease5, boolean infrarelease6,
            boolean infrarelease7, boolean infrarelease8, boolean infrarelease9, boolean infrarelease10,
            boolean infrarelease11, boolean alerting1, boolean alerting2, boolean alerting3, boolean alerting4,
            boolean alerting5, boolean alerting6, boolean alerting7, boolean alerting8, boolean alerting9) {
        super();
        this.functionalscope1 = functionalscope1;
        this.functionalscope2 = functionalscope2;
        this.functionalscope3 = functionalscope3;
        this.functionalscope4 = functionalscope4;
        this.functionalscope5 = functionalscope5;
        this.infrarelease1 = infrarelease1;
        this.infrarelease2 = infrarelease2;
        this.infrarelease3 = infrarelease3;
        this.infrarelease4 = infrarelease4;
        this.infrarelease5 = infrarelease5;
        this.infrarelease6 = infrarelease6;
        this.infrarelease7 = infrarelease7;
        this.infrarelease8 = infrarelease8;
        this.infrarelease9 = infrarelease9;
        this.infrarelease10 = infrarelease10;
        this.infrarelease11 = infrarelease11;
        this.alerting1 = alerting1;
        this.alerting2 = alerting2;
        this.alerting3 = alerting3;
        this.alerting4 = alerting4;
        this.alerting5 = alerting5;
        this.alerting6 = alerting6;
        this.alerting7 = alerting7;
        this.alerting8 = alerting8;
        this.alerting9 = alerting9;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (alerting1 ? 1231 : 1237);
        result = prime * result + (alerting2 ? 1231 : 1237);
        result = prime * result + (alerting3 ? 1231 : 1237);
        result = prime * result + (alerting4 ? 1231 : 1237);
        result = prime * result + (alerting5 ? 1231 : 1237);
        result = prime * result + (alerting6 ? 1231 : 1237);
        result = prime * result + (alerting7 ? 1231 : 1237);
        result = prime * result + (alerting8 ? 1231 : 1237);
        result = prime * result + (alerting9 ? 1231 : 1237);
        result = prime * result + (functionalscope1 ? 1231 : 1237);
        result = prime * result + (functionalscope2 ? 1231 : 1237);
        result = prime * result + (functionalscope3 ? 1231 : 1237);
        result = prime * result + (functionalscope4 ? 1231 : 1237);
        result = prime * result + (functionalscope5 ? 1231 : 1237);
        result = prime * result + (infrarelease1 ? 1231 : 1237);
        result = prime * result + (infrarelease10 ? 1231 : 1237);
        result = prime * result + (infrarelease11 ? 1231 : 1237);
        result = prime * result + (infrarelease2 ? 1231 : 1237);
        result = prime * result + (infrarelease3 ? 1231 : 1237);
        result = prime * result + (infrarelease4 ? 1231 : 1237);
        result = prime * result + (infrarelease5 ? 1231 : 1237);
        result = prime * result + (infrarelease6 ? 1231 : 1237);
        result = prime * result + (infrarelease7 ? 1231 : 1237);
        result = prime * result + (infrarelease8 ? 1231 : 1237);
        result = prime * result + (infrarelease9 ? 1231 : 1237);
        return result;
    }
    @Override
    public boolean equals(
            Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Checklist other = (Checklist) obj;
        if (alerting1 != other.alerting1)
            return false;
        if (alerting2 != other.alerting2)
            return false;
        if (alerting3 != other.alerting3)
            return false;
        if (alerting4 != other.alerting4)
            return false;
        if (alerting5 != other.alerting5)
            return false;
        if (alerting6 != other.alerting6)
            return false;
        if (alerting7 != other.alerting7)
            return false;
        if (alerting8 != other.alerting8)
            return false;
        if (alerting9 != other.alerting9)
            return false;
        if (functionalscope1 != other.functionalscope1)
            return false;
        if (functionalscope2 != other.functionalscope2)
            return false;
        if (functionalscope3 != other.functionalscope3)
            return false;
        if (functionalscope4 != other.functionalscope4)
            return false;
        if (functionalscope5 != other.functionalscope5)
            return false;
        if (infrarelease1 != other.infrarelease1)
            return false;
        if (infrarelease10 != other.infrarelease10)
            return false;
        if (infrarelease11 != other.infrarelease11)
            return false;
        if (infrarelease2 != other.infrarelease2)
            return false;
        if (infrarelease3 != other.infrarelease3)
            return false;
        if (infrarelease4 != other.infrarelease4)
            return false;
        if (infrarelease5 != other.infrarelease5)
            return false;
        if (infrarelease6 != other.infrarelease6)
            return false;
        if (infrarelease7 != other.infrarelease7)
            return false;
        if (infrarelease8 != other.infrarelease8)
            return false;
        if (infrarelease9 != other.infrarelease9)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Checklist [functionalscope1=" + functionalscope1 + ", functionalscope2=" + functionalscope2
                + ", functionalscope3=" + functionalscope3 + ", functionalscope4=" + functionalscope4
                + ", functionalscope5=" + functionalscope5 + ", infrarelease1=" + infrarelease1 + ", infrarelease2="
                + infrarelease2 + ", infrarelease3=" + infrarelease3 + ", infrarelease4=" + infrarelease4
                + ", infrarelease5=" + infrarelease5 + ", infrarelease6=" + infrarelease6 + ", infrarelease7="
                + infrarelease7 + ", infrarelease8=" + infrarelease8 + ", infrarelease9=" + infrarelease9
                + ", infrarelease10=" + infrarelease10 + ", infrarelease11=" + infrarelease11 + ", alerting1="
                + alerting1 + ", alerting2=" + alerting2 + ", alerting3=" + alerting3 + ", alerting4=" + alerting4
                + ", alerting5=" + alerting5 + ", alerting6=" + alerting6 + ", alerting7=" + alerting7 + ", alerting8="
                + alerting8 + ", alerting9=" + alerting9 + ", isAlerting1()=" + isAlerting1() + ", isAlerting2()="
                + isAlerting2() + ", isAlerting3()=" + isAlerting3() + ", isAlerting4()=" + isAlerting4()
                + ", isAlerting5()=" + isAlerting5() + ", isAlerting6()=" + isAlerting6() + ", isAlerting7()="
                + isAlerting7() + ", isAlerting8()=" + isAlerting8() + ", isAlerting9()=" + isAlerting9()
                + ", isFunctionalscope1()=" + isFunctionalscope1() + ", isFunctionalscope2()=" + isFunctionalscope2()
                + ", isFunctionalscope3()=" + isFunctionalscope3() + ", isFunctionalscope4()=" + isFunctionalscope4()
                + ", isFunctionalscope5()=" + isFunctionalscope5() + ", isInfrarelease1()=" + isInfrarelease1()
                + ", isInfrarelease2()=" + isInfrarelease2() + ", isInfrarelease3()=" + isInfrarelease3()
                + ", isInfrarelease4()=" + isInfrarelease4() + ", isInfrarelease5()=" + isInfrarelease5()
                + ", isInfrarelease6()=" + isInfrarelease6() + ", isInfrarelease7()=" + isInfrarelease7()
                + ", isInfrarelease8()=" + isInfrarelease8() + ", isInfrarelease9()=" + isInfrarelease9()
                + ", isInfrarelease10()=" + isInfrarelease10() + ", isInfrarelease11()=" + isInfrarelease11()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }
    public boolean isAlerting1() {
        return alerting1;
    }
    public void setAlerting1(
            boolean alerting1) {
        this.alerting1 = alerting1;
    }
    public boolean isAlerting2() {
        return alerting2;
    }
    public void setAlerting2(
            boolean alerting2) {
        this.alerting2 = alerting2;
    }
    public boolean isAlerting3() {
        return alerting3;
    }
    public void setAlerting3(
            boolean alerting3) {
        this.alerting3 = alerting3;
    }
    public boolean isAlerting4() {
        return alerting4;
    }
    public void setAlerting4(
            boolean alerting4) {
        this.alerting4 = alerting4;
    }
    public boolean isAlerting5() {
        return alerting5;
    }
    public void setAlerting5(
            boolean alerting5) {
        this.alerting5 = alerting5;
    }
    public boolean isAlerting6() {
        return alerting6;
    }
    public void setAlerting6(
            boolean alerting6) {
        this.alerting6 = alerting6;
    }
    public boolean isAlerting7() {
        return alerting7;
    }
    public void setAlerting7(
            boolean alerting7) {
        this.alerting7 = alerting7;
    }
    public boolean isAlerting8() {
        return alerting8;
    }
    public void setAlerting8(
            boolean alerting8) {
        this.alerting8 = alerting8;
    }
    public boolean isAlerting9() {
        return alerting9;
    }
    public void setAlerting9(
            boolean alerting9) {
        this.alerting9 = alerting9;
    }
    public boolean isFunctionalscope1() {
        return functionalscope1;
    }
    public void setFunctionalscope1(
            boolean functionalscope1) {
        this.functionalscope1 = functionalscope1;
    }
    public boolean isFunctionalscope2() {
        return functionalscope2;
    }
    public void setFunctionalscope2(
            boolean functionalscope2) {
        this.functionalscope2 = functionalscope2;
    }
    public boolean isFunctionalscope3() {
        return functionalscope3;
    }
    public void setFunctionalscope3(
            boolean functionalscope3) {
        this.functionalscope3 = functionalscope3;
    }
    public boolean isFunctionalscope4() {
        return functionalscope4;
    }
    public void setFunctionalscope4(
            boolean functionalscope4) {
        this.functionalscope4 = functionalscope4;
    }
    public boolean isFunctionalscope5() {
        return functionalscope5;
    }
    public void setFunctionalscope5(
            boolean functionalscope5) {
        this.functionalscope5 = functionalscope5;
    }
    public boolean isInfrarelease1() {
        return infrarelease1;
    }
    public void setInfrarelease1(
            boolean infrarelease1) {
        this.infrarelease1 = infrarelease1;
    }
    public boolean isInfrarelease2() {
        return infrarelease2;
    }
    public void setInfrarelease2(
            boolean infrarelease2) {
        this.infrarelease2 = infrarelease2;
    }
    public boolean isInfrarelease3() {
        return infrarelease3;
    }
    public void setInfrarelease3(
            boolean infrarelease3) {
        this.infrarelease3 = infrarelease3;
    }
    public boolean isInfrarelease4() {
        return infrarelease4;
    }
    public void setInfrarelease4(
            boolean infrarelease4) {
        this.infrarelease4 = infrarelease4;
    }
    public boolean isInfrarelease5() {
        return infrarelease5;
    }
    public void setInfrarelease5(
            boolean infrarelease5) {
        this.infrarelease5 = infrarelease5;
    }
    public boolean isInfrarelease6() {
        return infrarelease6;
    }
    public void setInfrarelease6(
            boolean infrarelease6) {
        this.infrarelease6 = infrarelease6;
    }
    public boolean isInfrarelease7() {
        return infrarelease7;
    }
    public void setInfrarelease7(
            boolean infrarelease7) {
        this.infrarelease7 = infrarelease7;
    }
    public boolean isInfrarelease8() {
        return infrarelease8;
    }
    public void setInfrarelease8(
            boolean infrarelease8) {
        this.infrarelease8 = infrarelease8;
    }
    public boolean isInfrarelease9() {
        return infrarelease9;
    }
    public void setInfrarelease9(
            boolean infrarelease9) {
        this.infrarelease9 = infrarelease9;
    }
    public boolean isInfrarelease10() {
        return infrarelease10;
    }
    public void setInfrarelease10(
            boolean infrarelease10) {
        this.infrarelease10 = infrarelease10;
    }
    public boolean isInfrarelease11() {
        return infrarelease11;
    }
    public void setInfrarelease11(
            boolean infrarelease11) {
        this.infrarelease11 = infrarelease11;
    }

}
