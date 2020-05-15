package p000;

/* renamed from: byvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final byvr f168489f;

    /* renamed from: g */
    private static volatile bxxk f168490g;

    /* renamed from: a */
    public int f168491a;

    /* renamed from: b */
    public int f168492b;

    /* renamed from: c */
    public bywp f168493c;

    /* renamed from: d */
    public bxvt f168494d = bxvm.f164965b;

    /* renamed from: e */
    public bxwc f168495e = bxxn.f165040b;

    static {
        byvr byvr = new byvr();
        f168489f = byvr;
        GeneratedMessageLite.m124024a(byvr.class, byvr);
    }

    private byvr() {
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
            return GeneratedMessageLite.m124022a(f168489f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001e\u0004\u001a", new Object[]{"a", "b", byvq.f168488a, "c", "d", bzbu.m125628b(), "e"});
        } else if (i2 == 3) {
            return new byvr();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f168489f;
            }
            bxxk bxxk = f168490g;
            if (bxxk == null) {
                synchronized (byvr.class) {
                    bxxk = f168490g;
                    if (bxxk == null) {
                        bxxk = new bxve(f168489f);
                        f168490g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
