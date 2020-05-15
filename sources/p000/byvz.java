package p000;

/* renamed from: byvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byvz f168541e;

    /* renamed from: f */
    private static volatile bxxk f168542f;

    /* renamed from: a */
    public int f168543a;

    /* renamed from: b */
    public int f168544b;

    /* renamed from: c */
    public int f168545c;

    /* renamed from: d */
    public byvt f168546d;

    static {
        byvz byvz = new byvz();
        f168541e = byvz;
        GeneratedMessageLite.m124024a(byvz.class, byvz);
    }

    private byvz() {
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
            return GeneratedMessageLite.m124022a(f168541e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bzbg.f169246a, "c", "d"});
        } else if (i2 == 3) {
            return new byvz();
        } else {
            if (i2 == 4) {
                return new bxvd(f168541e);
            }
            if (i2 == 5) {
                return f168541e;
            }
            bxxk bxxk = f168542f;
            if (bxxk == null) {
                synchronized (byvz.class) {
                    bxxk = f168542f;
                    if (bxxk == null) {
                        bxxk = new bxve(f168541e);
                        f168542f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
