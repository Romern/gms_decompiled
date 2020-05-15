package p000;

/* renamed from: cahn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cahn extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cahn f174569b;

    /* renamed from: c */
    private static volatile bxxk f174570c;

    /* renamed from: a */
    public bxwc f174571a = bxxn.f165040b;

    static {
        cahn cahn = new cahn();
        f174569b = cahn;
        GeneratedMessageLite.m124024a(cahn.class, cahn);
    }

    private cahn() {
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
            return GeneratedMessageLite.m124022a(f174569b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cahm.class});
        } else if (i2 == 3) {
            return new cahn();
        } else {
            if (i2 == 4) {
                return new bxvd(f174569b);
            }
            if (i2 == 5) {
                return f174569b;
            }
            bxxk bxxk = f174570c;
            if (bxxk == null) {
                synchronized (cahn.class) {
                    bxxk = f174570c;
                    if (bxxk == null) {
                        bxxk = new bxve(f174569b);
                        f174570c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
