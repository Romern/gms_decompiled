package p000;

/* renamed from: cafm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cafm extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cafm f172927b;

    /* renamed from: c */
    private static volatile bxxk f172928c;

    /* renamed from: a */
    public bxwc f172929a = bxxn.f165040b;

    static {
        cafm cafm = new cafm();
        f172927b = cafm;
        GeneratedMessageLite.m124024a(cafm.class, cafm);
    }

    private cafm() {
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
            return GeneratedMessageLite.m124022a(f172927b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cafl.class});
        } else if (i2 == 3) {
            return new cafm();
        } else {
            if (i2 == 4) {
                return new bxvd(f172927b);
            }
            if (i2 == 5) {
                return f172927b;
            }
            bxxk bxxk = f172928c;
            if (bxxk == null) {
                synchronized (cafm.class) {
                    bxxk = f172928c;
                    if (bxxk == null) {
                        bxxk = new bxve(f172927b);
                        f172928c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
