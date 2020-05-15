package p000;

/* renamed from: blpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpi extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final blpi f127229a;

    /* renamed from: e */
    private static volatile bxxk f127230e;

    /* renamed from: b */
    private int f127231b;

    /* renamed from: c */
    private blot f127232c;

    /* renamed from: d */
    private byte f127233d = 2;

    static {
        blpi blpi = new blpi();
        f127229a = blpi;
        GeneratedMessageLite.m124024a(blpi.class, blpi);
    }

    private blpi() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f127233d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f127233d = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f127229a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new blpi();
        } else {
            if (i2 == 4) {
                return new bxvd(f127229a);
            }
            if (i2 == 5) {
                return f127229a;
            }
            bxxk bxxk = f127230e;
            if (bxxk == null) {
                synchronized (blpi.class) {
                    bxxk = f127230e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127229a);
                        f127230e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
