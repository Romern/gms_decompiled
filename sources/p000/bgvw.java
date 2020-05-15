package p000;

/* renamed from: bgvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgvw extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bgvw f117757j;

    /* renamed from: k */
    private static volatile bxxk f117758k;

    /* renamed from: a */
    public int f117759a;

    /* renamed from: b */
    public int f117760b;

    /* renamed from: c */
    public String f117761c = "";

    /* renamed from: d */
    public String f117762d = "";

    /* renamed from: e */
    public String f117763e = "";

    /* renamed from: f */
    public long f117764f;

    /* renamed from: g */
    public long f117765g;

    /* renamed from: h */
    public long f117766h;

    /* renamed from: i */
    public String f117767i = "";

    static {
        bgvw bgvw = new bgvw();
        f117757j = bgvw;
        GeneratedMessageLite.m124024a(bgvw.class, bgvw);
    }

    private bgvw() {
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
            return GeneratedMessageLite.m124022a(f117757j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bgvw();
        } else {
            if (i2 == 4) {
                return new bxvd(f117757j);
            }
            if (i2 == 5) {
                return f117757j;
            }
            bxxk bxxk = f117758k;
            if (bxxk == null) {
                synchronized (bgvw.class) {
                    bxxk = f117758k;
                    if (bxxk == null) {
                        bxxk = new bxve(f117757j);
                        f117758k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
