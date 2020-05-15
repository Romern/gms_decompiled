package p000;

/* renamed from: bxcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxcp extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bxcp f162974g;

    /* renamed from: h */
    private static volatile bxxk f162975h;

    /* renamed from: a */
    public int f162976a;

    /* renamed from: b */
    public long f162977b;

    /* renamed from: c */
    public long f162978c;

    /* renamed from: d */
    public int f162979d;

    /* renamed from: e */
    public String f162980e = "";

    /* renamed from: f */
    public String f162981f = "";

    static {
        bxcp bxcp = new bxcp();
        f162974g = bxcp;
        GeneratedMessageLite.m124024a(bxcp.class, bxcp);
    }

    private bxcp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f162974g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bxcp();
        } else {
            if (i2 == 4) {
                return new bxvd(f162974g);
            }
            if (i2 == 5) {
                return f162974g;
            }
            bxxk bxxk = f162975h;
            if (bxxk == null) {
                synchronized (bxcp.class) {
                    bxxk = f162975h;
                    if (bxxk == null) {
                        bxxk = new bxve(f162974g);
                        f162975h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
