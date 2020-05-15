package p000;

/* renamed from: abqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abqr extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final abqr f58005b;

    /* renamed from: c */
    private static volatile bxxk f58006c;

    /* renamed from: a */
    public String f58007a = "";

    static {
        abqr abqr = new abqr();
        f58005b = abqr;
        GeneratedMessageLite.m124024a(abqr.class, abqr);
    }

    private abqr() {
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
            return GeneratedMessageLite.m124022a(f58005b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new abqr();
        } else {
            if (i2 == 4) {
                return new bxvd(f58005b);
            }
            if (i2 == 5) {
                return f58005b;
            }
            bxxk bxxk = f58006c;
            if (bxxk == null) {
                synchronized (abqr.class) {
                    bxxk = f58006c;
                    if (bxxk == null) {
                        bxxk = new bxve(f58005b);
                        f58006c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
