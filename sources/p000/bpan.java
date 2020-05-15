package p000;

/* renamed from: bpan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpan implements bxvp {
    UNKNOWN_PROMPT_TYPE(0),
    ENABLE_ADM(1),
    ENABLE_NFC(2),
    VERIFICATION_RPC_RETRY(3),
    ADD_VISA_CARD(4),
    AUTOFILL_CODE(5),
    TOKENIZE_RETRY(6),
    WEAR_PROXY_RETRY(7),
    WEAR_PROXY_ADD_ACCOUNT(8),
    SHOW_SECURITY_DEVICE_ADMIN(9),
    SHOW_SECURITY_SECURE_KEYGUARD(10),
    CONFIRM_NFC(11),
    DELETE_PROMPT(12),
    VERIFICATION_PROMPT_ERROR(13),
    LINK_VISA_ERROR(14),
    WEAR_NON_RETRYABLE_ERROR(15),
    SELECT_VERIFICATION_ERROR(16),
    TOKENIZE_NON_RETRYABLE(17),
    DIFFERENT_PHONE_NUMBER(18),
    CHECK_SECURE_ELEMENT_PROMPT(19),
    CHECK_SECURE_ELEMENT_INSTALL_MFI_PROMPT(20),
    NOTIFICATION_SETTINGS_NO_NETWORK(21),
    SELECT_ACCOUNT_ERROR(22),
    ACCOUNT_SETUP_ERROR(23);
    

    /* renamed from: y */
    public final int f135522y;

    private bpan(int i) {
        this.f135522y = i;
    }

    /* renamed from: a */
    public static bpan m111723a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PROMPT_TYPE;
            case 1:
                return ENABLE_ADM;
            case 2:
                return ENABLE_NFC;
            case 3:
                return VERIFICATION_RPC_RETRY;
            case 4:
                return ADD_VISA_CARD;
            case 5:
                return AUTOFILL_CODE;
            case 6:
                return TOKENIZE_RETRY;
            case 7:
                return WEAR_PROXY_RETRY;
            case 8:
                return WEAR_PROXY_ADD_ACCOUNT;
            case 9:
                return SHOW_SECURITY_DEVICE_ADMIN;
            case 10:
                return SHOW_SECURITY_SECURE_KEYGUARD;
            case 11:
                return CONFIRM_NFC;
            case 12:
                return DELETE_PROMPT;
            case 13:
                return VERIFICATION_PROMPT_ERROR;
            case 14:
                return LINK_VISA_ERROR;
            case 15:
                return WEAR_NON_RETRYABLE_ERROR;
            case 16:
                return SELECT_VERIFICATION_ERROR;
            case 17:
                return TOKENIZE_NON_RETRYABLE;
            case 18:
                return DIFFERENT_PHONE_NUMBER;
            case 19:
                return CHECK_SECURE_ELEMENT_PROMPT;
            case 20:
                return CHECK_SECURE_ELEMENT_INSTALL_MFI_PROMPT;
            case 21:
                return NOTIFICATION_SETTINGS_NO_NETWORK;
            case 22:
                return SELECT_ACCOUNT_ERROR;
            case 23:
                return ACCOUNT_SETUP_ERROR;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m111724b() {
        return bpam.f135496a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f135522y;
    }

    public final String toString() {
        return Integer.toString(this.f135522y);
    }
}
