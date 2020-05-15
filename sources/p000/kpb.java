package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: kpb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum kpb implements bxvp {
    UNKNOWN_DATA_TYPE(0),
    NOT_APPLICABLE(1),
    USERNAME(2),
    PASSWORD(3),
    USERNAME_OR_EMAIL(4),
    EMAIL_ADDRESS(5),
    PHONE_NUMBER(6),
    PHONE_COUNTRY_CODE(7),
    PHONE_NATIONAL(8),
    NEW_USERNAME(9),
    NEW_PASSWORD(10),
    PERSON_NAME(100),
    PERSON_NAME_GIVEN(101),
    PERSON_NAME_FAMILY(102),
    PERSON_NAME_MIDDLE(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR),
    PERSON_NAME_MIDDLE_INITAL(ErrorInfo.TYPE_SDU_FAILED),
    PERSON_NAME_PREFIX(ErrorInfo.TYPE_SDU_MEMORY_FULL),
    PERSON_NAME_SUFFIX(106),
    POSTAL_ADDRESS(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR),
    POSTAL_ADDRESS_COUNTRY(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR),
    POSTAL_ADDRESS_POSTAL_CODE(202),
    POSTAL_ADDRESS_REGION(203),
    POSTAL_ADDRESS_LOCALITY(204),
    POSTAL_ADDRESS_STREET_ADDRESS(205),
    POSTAL_ADDRESS_EXTENDED_ADDRESS(BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR),
    POSTAL_ADDRESS_EXTENDED_POSTAL_CODE(BaseMfiEventCallback.TYPE_EXPIRED_MFI),
    PAYMENT_CARD_NUMBER(300),
    PAYMENT_CARD_HOLDER_NAME(ErrorInfo.TYPE_FSC_HTTP_ERROR),
    PAYMENT_CARD_CVN(302),
    PAYMENT_CARD_EXPIRATION_MONTH(303),
    PAYMENT_CARD_EXPIRATION_YEAR(304),
    PAYMENT_CARD_EXPIRATION_DATE(305),
    UPI_ID(320),
    OTP_FULL(400),
    OTP_1(ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE),
    OTP_2(ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED),
    OTP_3(403),
    OTP_4(404),
    OTP_5(405),
    OTP_6(406),
    OTP_7(407),
    OTP_8(408),
    OTP_EMAIL(500),
    GENDER(1000),
    BIRTHDATE_FULL(1001),
    BIRTHDATE_DAY(1002),
    BIRTHDATE_MONTH(1003),
    BIRTHDATE_YEAR(1004),
    AGE(1005),
    NATIONALITY(1006),
    NATIONAL_IDENTIFICATION_NUMBER(1007),
    PASSPORT_NUMBER(1008),
    PASSPORT_COUNTRY(1009),
    SUBMIT(2000),
    LOYALTY_ACCOUNT_NUMBER(3000),
    PROMOTIONAL_CODE(3001),
    UNRECOGNIZED(-1);
    

    /* renamed from: af */
    private final int f24717af;

    private kpb(int i) {
        this.f24717af = i;
    }

    /* renamed from: a */
    public static kpb m18276a(int i) {
        if (i == 320) {
            return UPI_ID;
        }
        if (i == 500) {
            return OTP_EMAIL;
        }
        if (i == 2000) {
            return SUBMIT;
        }
        if (i == 3000) {
            return LOYALTY_ACCOUNT_NUMBER;
        }
        if (i == 3001) {
            return PROMOTIONAL_CODE;
        }
        switch (i) {
            case 0:
                return UNKNOWN_DATA_TYPE;
            case 1:
                return NOT_APPLICABLE;
            case 2:
                return USERNAME;
            case 3:
                return PASSWORD;
            case 4:
                return USERNAME_OR_EMAIL;
            case 5:
                return EMAIL_ADDRESS;
            case 6:
                return PHONE_NUMBER;
            case 7:
                return PHONE_COUNTRY_CODE;
            case 8:
                return PHONE_NATIONAL;
            case 9:
                return NEW_USERNAME;
            case 10:
                return NEW_PASSWORD;
            default:
                switch (i) {
                    case 100:
                        return PERSON_NAME;
                    case 101:
                        return PERSON_NAME_GIVEN;
                    case 102:
                        return PERSON_NAME_FAMILY;
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        return PERSON_NAME_MIDDLE;
                    case ErrorInfo.TYPE_SDU_FAILED:
                        return PERSON_NAME_MIDDLE_INITAL;
                    case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                        return PERSON_NAME_PREFIX;
                    case 106:
                        return PERSON_NAME_SUFFIX;
                    default:
                        switch (i) {
                            case BaseMfiEventCallback.TYPE_UNKNOWN_ERROR:
                                return POSTAL_ADDRESS;
                            case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                                return POSTAL_ADDRESS_COUNTRY;
                            case 202:
                                return POSTAL_ADDRESS_POSTAL_CODE;
                            case 203:
                                return POSTAL_ADDRESS_REGION;
                            case 204:
                                return POSTAL_ADDRESS_LOCALITY;
                            case 205:
                                return POSTAL_ADDRESS_STREET_ADDRESS;
                            case BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR:
                                return POSTAL_ADDRESS_EXTENDED_ADDRESS;
                            case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                                return POSTAL_ADDRESS_EXTENDED_POSTAL_CODE;
                            default:
                                switch (i) {
                                    case 300:
                                        return PAYMENT_CARD_NUMBER;
                                    case ErrorInfo.TYPE_FSC_HTTP_ERROR:
                                        return PAYMENT_CARD_HOLDER_NAME;
                                    case 302:
                                        return PAYMENT_CARD_CVN;
                                    case 303:
                                        return PAYMENT_CARD_EXPIRATION_MONTH;
                                    case 304:
                                        return PAYMENT_CARD_EXPIRATION_YEAR;
                                    case 305:
                                        return PAYMENT_CARD_EXPIRATION_DATE;
                                    default:
                                        switch (i) {
                                            case 400:
                                                return OTP_FULL;
                                            case ErrorInfo.TYPE_FELICA_EXCEPTION_FELICA_NOT_AVAILABLE:
                                                return OTP_1;
                                            case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                                                return OTP_2;
                                            case 403:
                                                return OTP_3;
                                            case 404:
                                                return OTP_4;
                                            case 405:
                                                return OTP_5;
                                            case 406:
                                                return OTP_6;
                                            case 407:
                                                return OTP_7;
                                            case 408:
                                                return OTP_8;
                                            default:
                                                switch (i) {
                                                    case 1000:
                                                        return GENDER;
                                                    case 1001:
                                                        return BIRTHDATE_FULL;
                                                    case 1002:
                                                        return BIRTHDATE_DAY;
                                                    case 1003:
                                                        return BIRTHDATE_MONTH;
                                                    case 1004:
                                                        return BIRTHDATE_YEAR;
                                                    case 1005:
                                                        return AGE;
                                                    case 1006:
                                                        return NATIONALITY;
                                                    case 1007:
                                                        return NATIONAL_IDENTIFICATION_NUMBER;
                                                    case 1008:
                                                        return PASSPORT_NUMBER;
                                                    case 1009:
                                                        return PASSPORT_COUNTRY;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f24717af;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
