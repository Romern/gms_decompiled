package p000;

/* renamed from: mql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mql extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final mql f34310e;

    /* renamed from: f */
    private static volatile bxxk f34311f;

    /* renamed from: a */
    public int f34312a;

    /* renamed from: b */
    public String f34313b = "";

    /* renamed from: c */
    public int f34314c;

    /* renamed from: d */
    public bxwc f34315d = bxxn.f165040b;

    static {
        mql mql = new mql();
        f34310e = mql;
        GeneratedMessageLite.m124024a(mql.class, mql);
    }

    private mql() {
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
            return GeneratedMessageLite.m124022a(f34310e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"a", "b", "c", mqn.m25524b(), "d", msz.class});
        } else if (i2 == 3) {
            return new mql();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f34310e;
            }
            bxxk bxxk = f34311f;
            if (bxxk == null) {
                synchronized (mql.class) {
                    bxxk = f34311f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34310e);
                        f34311f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
