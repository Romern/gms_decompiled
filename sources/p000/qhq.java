package p000;

/* renamed from: qhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum qhq implements bxvp {
    BASE_CLIENT_ID(1),
    SEARCH_CLIENT_ID(2),
    VOICESEARCH_CLIENT_ID(3),
    MAPS_CLIENT_ID(4),
    YOUTUBE_CLIENT_ID(5),
    MARKET_CLIENT_ID(6),
    SHOPPER_CLIENT_ID(7),
    WALLET_CLIENT_ID(8),
    CHROME_CLIENT_ID(9);
    

    /* renamed from: j */
    public final int f41406j;

    private qhq(int i) {
        this.f41406j = i;
    }

    /* renamed from: a */
    public static qhq m32182a(int i) {
        switch (i) {
            case 1:
                return BASE_CLIENT_ID;
            case 2:
                return SEARCH_CLIENT_ID;
            case 3:
                return VOICESEARCH_CLIENT_ID;
            case 4:
                return MAPS_CLIENT_ID;
            case 5:
                return YOUTUBE_CLIENT_ID;
            case 6:
                return MARKET_CLIENT_ID;
            case 7:
                return SHOPPER_CLIENT_ID;
            case 8:
                return WALLET_CLIENT_ID;
            case 9:
                return CHROME_CLIENT_ID;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m32183b() {
        return qhp.f41395a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f41406j;
    }

    public final String toString() {
        return Integer.toString(this.f41406j);
    }
}
