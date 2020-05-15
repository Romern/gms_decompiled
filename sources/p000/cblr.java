package p000;

/* renamed from: cblr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblr extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final cblr f177556a;

    /* renamed from: b */
    private static volatile bxxk f177557b;

    static {
        cblr cblr = new cblr();
        f177556a = cblr;
        GeneratedMessageLite.m124024a(cblr.class, cblr);
    }

    private cblr() {
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
            return GeneratedMessageLite.m124022a(f177556a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new cblr();
        }
        if (i2 == 4) {
            return new bxvd(f177556a);
        }
        if (i2 == 5) {
            return f177556a;
        }
        bxxk bxxk = f177557b;
        if (bxxk == null) {
            synchronized (cblr.class) {
                bxxk = f177557b;
                if (bxxk == null) {
                    bxxk = new bxve(f177556a);
                    f177557b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
