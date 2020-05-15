package p000;

/* renamed from: btti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btti implements bxvp {
    UNKNOWN_FUNDS_TRANSFER_NOTICE_TYPE(0),
    LEGAL_TEXT(1),
    REGULATORY_DISCLOSURE(2);
    

    /* renamed from: d */
    private final int f150350d;

    private btti(int i) {
        this.f150350d = i;
    }

    /* renamed from: a */
    public static btti m117120a(int i) {
        if (i == 0) {
            return UNKNOWN_FUNDS_TRANSFER_NOTICE_TYPE;
        }
        if (i == 1) {
            return LEGAL_TEXT;
        }
        if (i != 2) {
            return null;
        }
        return REGULATORY_DISCLOSURE;
    }

    /* renamed from: b */
    public static bxvr m117121b() {
        return btth.f150345a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f150350d;
    }

    public final String toString() {
        return Integer.toString(this.f150350d);
    }
}
