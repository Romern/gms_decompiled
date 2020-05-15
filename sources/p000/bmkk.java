package p000;

/* renamed from: bmkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmkk extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bmkk f129840e;

    /* renamed from: g */
    private static volatile bxxk f129841g;

    /* renamed from: a */
    public long f129842a;

    /* renamed from: b */
    public int f129843b;

    /* renamed from: c */
    public int f129844c;

    /* renamed from: d */
    public String f129845d = "";

    /* renamed from: f */
    private int f129846f;

    static {
        bmkk bmkk = new bmkk();
        f129840e = bmkk;
        GeneratedMessageLite.m124024a(bmkk.class, bmkk);
    }

    private bmkk() {
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
            return GeneratedMessageLite.m124022a(f129840e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmkk();
        } else {
            if (i2 == 4) {
                return new bxvd(f129840e);
            }
            if (i2 == 5) {
                return f129840e;
            }
            bxxk bxxk = f129841g;
            if (bxxk == null) {
                synchronized (bmkk.class) {
                    bxxk = f129841g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129840e);
                        f129841g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
