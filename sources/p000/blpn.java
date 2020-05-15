package p000;

/* renamed from: blpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpn extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blpn f127253a;

    /* renamed from: e */
    private static volatile bxxk f127254e;

    /* renamed from: b */
    private int f127255b;

    /* renamed from: c */
    private blot f127256c;

    /* renamed from: d */
    private byte f127257d = 2;

    static {
        blpn blpn = new blpn();
        f127253a = blpn;
        GeneratedMessageLite.m124024a(blpn.class, blpn);
    }

    private blpn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127257d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127257d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127253a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new blpn();
        } else {
            if (i2 == 4) {
                return new bxvd(f127253a);
            }
            if (i2 == 5) {
                return f127253a;
            }
            bxxk bxxk = f127254e;
            if (bxxk == null) {
                synchronized (blpn.class) {
                    bxxk = f127254e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127253a);
                        f127254e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
