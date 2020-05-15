package p000;

/* renamed from: bzib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzib extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bzib f170145i;

    /* renamed from: k */
    private static volatile bxxk f170146k;

    /* renamed from: a */
    public String f170147a = "";

    /* renamed from: b */
    public String f170148b = "";

    /* renamed from: c */
    public String f170149c = "";

    /* renamed from: d */
    public String f170150d = "";

    /* renamed from: e */
    public String f170151e = "";

    /* renamed from: f */
    public String f170152f = "";

    /* renamed from: g */
    public String f170153g = "";

    /* renamed from: h */
    public String f170154h = "";

    /* renamed from: j */
    private int f170155j;

    static {
        bzib bzib = new bzib();
        f170145i = bzib;
        GeneratedMessageLite.m124024a(bzib.class, bzib);
    }

    private bzib() {
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
            return GeneratedMessageLite.m124022a(f170145i, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\nဈ\t\u000bဈ\n", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bzib();
        } else {
            if (i2 == 4) {
                return new bxvd(f170145i);
            }
            if (i2 == 5) {
                return f170145i;
            }
            bxxk bxxk = f170146k;
            if (bxxk == null) {
                synchronized (bzib.class) {
                    bxxk = f170146k;
                    if (bxxk == null) {
                        bxxk = new bxve(f170145i);
                        f170146k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
