package p000;

/* renamed from: bygr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bygr f166375e;

    /* renamed from: f */
    private static volatile bxxk f166376f;

    /* renamed from: a */
    public int f166377a;

    /* renamed from: b */
    public bygx f166378b;

    /* renamed from: c */
    public String f166379c = "";

    /* renamed from: d */
    public String f166380d = "";

    static {
        bygr bygr = new bygr();
        f166375e = bygr;
        GeneratedMessageLite.m124024a(bygr.class, bygr);
    }

    private bygr() {
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
            return GeneratedMessageLite.m124022a(f166375e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bygr();
        } else {
            if (i2 == 4) {
                return new bxvd(f166375e);
            }
            if (i2 == 5) {
                return f166375e;
            }
            bxxk bxxk = f166376f;
            if (bxxk == null) {
                synchronized (bygr.class) {
                    bxxk = f166376f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166375e);
                        f166376f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
