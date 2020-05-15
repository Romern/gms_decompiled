package p000;

/* renamed from: btmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmw extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final btmw f149565h;

    /* renamed from: i */
    private static volatile bxxk f149566i;

    /* renamed from: a */
    public int f149567a;

    /* renamed from: b */
    public btlr f149568b;

    /* renamed from: c */
    public ByteString f149569c = ByteString.f164797b;

    /* renamed from: d */
    public String f149570d = "";

    /* renamed from: e */
    public ByteString f149571e = ByteString.f164797b;

    /* renamed from: f */
    public long f149572f;

    /* renamed from: g */
    public String f149573g = "";

    static {
        btmw btmw = new btmw();
        f149565h = btmw;
        GeneratedMessageLite.m124024a(btmw.class, btmw);
    }

    private btmw() {
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
            return GeneratedMessageLite.m124022a(f149565h, "\u0000\u0007\u0000\u0000\u0001\t\u0007\u0000\u0000\u0000\u0001\f\u0002\t\u0003\n\u0004Ȉ\u0005\n\b\u0002\tȈ", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new btmw();
        } else {
            if (i2 == 4) {
                return new bxvd(f149565h);
            }
            if (i2 == 5) {
                return f149565h;
            }
            bxxk bxxk = f149566i;
            if (bxxk == null) {
                synchronized (btmw.class) {
                    bxxk = f149566i;
                    if (bxxk == null) {
                        bxxk = new bxve(f149565h);
                        f149566i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
