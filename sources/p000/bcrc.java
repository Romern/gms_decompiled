package p000;

/* renamed from: bcrc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bcrc extends bcuw {
    /* renamed from: a */
    public bcnw mo57274a() {
        throw null;
    }

    /* renamed from: c */
    public final bcnx mo57279c() {
        String str;
        int b = mo57275b();
        switch (b) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "SUGGESTION_CHIP";
                break;
            case 3:
                str = "MESSAGE_LINK";
                break;
            case 4:
                str = "RICH_CARD_BUTTON";
                break;
            case 5:
                str = "MENU_BUTTON";
                break;
            case 6:
                str = "CUSTOM_WEB_VIEW_LOG";
                break;
            case 7:
                str = "RICH_CARD_MESSAGE";
                break;
            default:
                str = "null";
                break;
        }
        if (b == 0) {
            throw null;
        }
        throw new UnsupportedOperationException(str);
    }
}
