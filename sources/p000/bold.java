package p000;

/* renamed from: bold */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bold extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bold f133497f;

    /* renamed from: g */
    private static volatile bxxk f133498g;

    /* renamed from: a */
    public int f133499a;

    /* renamed from: b */
    public int f133500b = 1;

    /* renamed from: c */
    public long f133501c;

    /* renamed from: d */
    public float f133502d;

    /* renamed from: e */
    public float f133503e;

    static {
        bold bold = new bold();
        f133497f = bold;
        GeneratedMessageLite.m124024a(bold.class, bold);
    }

    private bold() {
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
            return GeneratedMessageLite.m124022a(f133497f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", bolc.f133496a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bold();
        } else {
            if (i2 == 4) {
                return new bxvd(f133497f);
            }
            if (i2 == 5) {
                return f133497f;
            }
            bxxk bxxk = f133498g;
            if (bxxk == null) {
                synchronized (bold.class) {
                    bxxk = f133498g;
                    if (bxxk == null) {
                        bxxk = new bxve(f133497f);
                        f133498g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
