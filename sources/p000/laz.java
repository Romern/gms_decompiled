package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: laz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum laz implements bxvp {
    UNKNOWN_DATA_TYPE(0),
    PROMO(1),
    CREDENTIAL(101),
    PAYMENT_CARD(102),
    PERSON_NAME(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR),
    POSTAL_ADDRESS(ErrorInfo.TYPE_SDU_FAILED),
    PHONE_NUMBER(ErrorInfo.TYPE_SDU_MEMORY_FULL),
    EMAIL_ADDRESS(106),
    GENDER(107),
    BIRTHDATE(108),
    AGE(109),
    OTP(110),
    UNRECOGNIZED(-1);
    

    /* renamed from: n */
    private final int f25671n;

    private laz(int i) {
        this.f25671n = i;
    }

    /* renamed from: a */
    public static laz m18867a(int i) {
        if (i == 0) {
            return UNKNOWN_DATA_TYPE;
        }
        if (i == 1) {
            return PROMO;
        }
        switch (i) {
            case 101:
                return CREDENTIAL;
            case 102:
                return PAYMENT_CARD;
            case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                return PERSON_NAME;
            case ErrorInfo.TYPE_SDU_FAILED:
                return POSTAL_ADDRESS;
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                return PHONE_NUMBER;
            case 106:
                return EMAIL_ADDRESS;
            case 107:
                return GENDER;
            case 108:
                return BIRTHDATE;
            case 109:
                return AGE;
            case 110:
                return OTP;
            default:
                return null;
        }
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f25671n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
