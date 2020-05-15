package p000;

/* renamed from: cbnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbnz extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cbnz f177781f;

    /* renamed from: g */
    private static volatile bxxk f177782g;

    /* renamed from: a */
    public int f177783a = 0;

    /* renamed from: b */
    public Object f177784b;

    /* renamed from: c */
    public cboa f177785c;

    /* renamed from: d */
    public int f177786d;

    /* renamed from: e */
    public cbrc f177787e;

    static {
        cbnz cbnz = new cbnz();
        f177781f = cbnz;
        GeneratedMessageLite.m124024a(cbnz.class, cbnz);
    }

    private cbnz() {
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
            return GeneratedMessageLite.m124022a(f177781f, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001\t\u0002\f\u0003<\u0000\u0004<\u0000\u0005\t\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"b", "a", "c", "d", cbok.class, cbnx.class, "e", cbom.class, cbot.class, cboh.class});
        } else if (i2 == 3) {
            return new cbnz();
        } else {
            if (i2 == 4) {
                return new bxvd(f177781f);
            }
            if (i2 == 5) {
                return f177781f;
            }
            bxxk bxxk = f177782g;
            if (bxxk == null) {
                synchronized (cbnz.class) {
                    bxxk = f177782g;
                    if (bxxk == null) {
                        bxxk = new bxve(f177781f);
                        f177782g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
