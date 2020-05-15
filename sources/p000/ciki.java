package p000;

/* renamed from: ciki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ciki implements brer {
    UNSUPPORTED_OPERATION,
    CARDINFO_PARSE_ERROR,
    TRANSACTIONINFO_PARSE_ERROR,
    SERVER_ERROR,
    RETRY_REQUIREMENT,
    ALREADY_REQUESTED,
    INVALID_CARD_STATUS,
    CARD_NOT_EXIST;
    

    /* renamed from: i */
    private String f190527i;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static ciki m150512a(String str) {
        char c;
        ciki ciki;
        switch (str.hashCode()) {
            case 47653682:
                if (str.equals("20000")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 47653683:
                if (str.equals("20001")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 47653684:
            default:
                c = 65535;
                break;
            case 47653685:
                if (str.equals("20003")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 47653686:
                if (str.equals("20004")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 47653687:
                if (str.equals("20005")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            ciki ciki2 = RETRY_REQUIREMENT;
            ciki2.f190527i = "処理中にエラーが発生しました。しばらくたってから再度ご利用ください。";
            return ciki2;
        } else if (c != 2) {
            if (c == 3) {
                ciki = INVALID_CARD_STATUS;
            } else if (c != 4) {
                ciki ciki3 = SERVER_ERROR;
                ciki3.f190527i = "処理中にエラーが発生しました。しばらくたってから再度ご利用ください。" + "(" + str + ")";
                return ciki3;
            } else {
                ciki = CARD_NOT_EXIST;
            }
            ciki.f190527i = "処理中にエラーが発生しました。ご利用のカード会社へお問い合わせください。";
            return ciki;
        } else {
            ciki ciki4 = ALREADY_REQUESTED;
            ciki4.f190527i = "処理中にエラーが発生しました。しばらくたってから再度ご利用ください。" + "(" + str + ")";
            return ciki4;
        }
    }

    /* renamed from: b */
    public final String mo49934b() {
        return this.f190527i;
    }

    /* renamed from: a */
    public static void m150513a(ciki ciki) {
        int ordinal = ciki.ordinal();
        ciki.f190527i = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? "処理中にエラーが発生しました。しばらくたってから再度ご利用ください。" : "決済履歴情報が不正のため取得できません。" : "カード情報が不正のため取得できません。" : "カード情報が取得できません。";
    }

    /* renamed from: a */
    public final String mo49933a() {
        return name();
    }
}
