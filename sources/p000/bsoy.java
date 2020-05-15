package p000;

/* renamed from: bsoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bsoy implements bxvp {
    UNKNOWN_OPEN_LINK_ACTION(0),
    LINK_OPENED_IN_WEBVIEW(1),
    LINK_OPENED_IN_BROWSER(2);
    

    /* renamed from: d */
    public final int f146451d;

    private bsoy(int i) {
        this.f146451d = i;
    }

    /* renamed from: a */
    public static bsoy m116052a(int i) {
        if (i == 0) {
            return UNKNOWN_OPEN_LINK_ACTION;
        }
        if (i == 1) {
            return LINK_OPENED_IN_WEBVIEW;
        }
        if (i != 2) {
            return null;
        }
        return LINK_OPENED_IN_BROWSER;
    }

    /* renamed from: b */
    public static bxvr m116053b() {
        return bsox.f146446a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f146451d;
    }

    public final String toString() {
        return Integer.toString(this.f146451d);
    }
}
