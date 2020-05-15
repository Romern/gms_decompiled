package p000;

/* renamed from: bmow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmow extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bmow f130264f;

    /* renamed from: g */
    private static volatile bxxk f130265g;

    /* renamed from: a */
    public int f130266a;

    /* renamed from: b */
    public bmnr f130267b;

    /* renamed from: c */
    public int f130268c;

    /* renamed from: d */
    public String f130269d = "";

    /* renamed from: e */
    public int f130270e;

    static {
        bmow bmow = new bmow();
        f130264f = bmow;
        GeneratedMessageLite.m124024a(bmow.class, bmow);
    }

    private bmow() {
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
            return GeneratedMessageLite.m124022a(f130264f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0001\u0002ဈ\u0002\u0003ဌ\u0003\u0006ဉ\u0000", new Object[]{"a", "c", bmqh.m108282b(), "d", "e", bmou.f130263a, "b"});
        } else if (i2 == 3) {
            return new bmow();
        } else {
            if (i2 == 4) {
                return new bxvd(f130264f);
            }
            if (i2 == 5) {
                return f130264f;
            }
            bxxk bxxk = f130265g;
            if (bxxk == null) {
                synchronized (bmow.class) {
                    bxxk = f130265g;
                    if (bxxk == null) {
                        bxxk = new bxve(f130264f);
                        f130265g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
