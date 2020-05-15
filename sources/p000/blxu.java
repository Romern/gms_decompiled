package p000;

/* renamed from: blxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blxu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxvu f128142b = new blxt();

    /* renamed from: d */
    public static final blxu f128143d;

    /* renamed from: e */
    private static volatile bxxk f128144e;

    /* renamed from: a */
    public bxvt f128145a = bxvm.f164965b;

    /* renamed from: c */
    public bxwc f128146c = bxxn.f165040b;

    static {
        blxu blxu = new blxu();
        f128143d = blxu;
        GeneratedMessageLite.m124024a(blxu.class, blxu);
    }

    private blxu() {
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
            return GeneratedMessageLite.m124022a(f128143d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001a", new Object[]{"a", bmfk.m107977b(), "c"});
        } else if (i2 == 3) {
            return new blxu();
        } else {
            if (i2 == 4) {
                return new bxvd(f128143d);
            }
            if (i2 == 5) {
                return f128143d;
            }
            bxxk bxxk = f128144e;
            if (bxxk == null) {
                synchronized (blxu.class) {
                    bxxk = f128144e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128143d);
                        f128144e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
