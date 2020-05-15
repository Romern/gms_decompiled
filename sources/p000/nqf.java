package p000;

/* renamed from: nqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nqf extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final nqf f36402e;

    /* renamed from: f */
    private static volatile bxxk f36403f;

    /* renamed from: a */
    public int f36404a;

    /* renamed from: b */
    public int f36405b;

    /* renamed from: c */
    public int f36406c;

    /* renamed from: d */
    public int f36407d;

    static {
        nqf nqf = new nqf();
        f36402e = nqf;
        GeneratedMessageLite.m124024a(nqf.class, nqf);
    }

    private nqf() {
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
            return GeneratedMessageLite.m124022a(f36402e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", nqg.f36408a, "c", "d"});
        } else if (i2 == 3) {
            return new nqf();
        } else {
            if (i2 == 4) {
                return new bxvd(f36402e);
            }
            if (i2 == 5) {
                return f36402e;
            }
            bxxk bxxk = f36403f;
            if (bxxk == null) {
                synchronized (nqf.class) {
                    bxxk = f36403f;
                    if (bxxk == null) {
                        bxxk = new bxve(f36402e);
                        f36403f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
