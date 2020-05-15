package p000;

/* renamed from: apym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apym extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final apym f85151d;

    /* renamed from: e */
    private static volatile bxxk f85152e;

    /* renamed from: a */
    public int f85153a;

    /* renamed from: b */
    public int f85154b;

    /* renamed from: c */
    public String f85155c = "";

    static {
        apym apym = new apym();
        f85151d = apym;
        GeneratedMessageLite.m124024a(apym.class, apym);
    }

    private apym() {
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
            return GeneratedMessageLite.m124022a(f85151d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new apym();
        } else {
            if (i2 == 4) {
                return new bxvd(f85151d);
            }
            if (i2 == 5) {
                return f85151d;
            }
            bxxk bxxk = f85152e;
            if (bxxk == null) {
                synchronized (apym.class) {
                    bxxk = f85152e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85151d);
                        f85152e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
