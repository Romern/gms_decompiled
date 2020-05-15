package p000;

/* renamed from: acld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acld extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final acld f60081b;

    /* renamed from: c */
    private static volatile bxxk f60082c;

    /* renamed from: a */
    public boolean f60083a;

    static {
        acld acld = new acld();
        f60081b = acld;
        GeneratedMessageLite.m124024a(acld.class, acld);
    }

    private acld() {
    }

    /* renamed from: a */
    public static bxvd m49369a() {
        return f60081b.mo74144da();
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
            return GeneratedMessageLite.m124022a(f60081b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
        } else if (i2 == 3) {
            return new acld();
        } else {
            if (i2 == 4) {
                return new bxvd((char[][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f60081b;
            }
            bxxk bxxk = f60082c;
            if (bxxk == null) {
                synchronized (acld.class) {
                    bxxk = f60082c;
                    if (bxxk == null) {
                        bxxk = new bxve(f60081b);
                        f60082c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
