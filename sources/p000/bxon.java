package p000;

/* renamed from: bxon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxon extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bxon f164173h;

    /* renamed from: i */
    private static volatile bxxk f164174i;

    /* renamed from: a */
    public int f164175a;

    /* renamed from: b */
    public boolean f164176b;

    /* renamed from: c */
    public int f164177c;

    /* renamed from: d */
    public long f164178d;

    /* renamed from: e */
    public int f164179e;

    /* renamed from: f */
    public boolean f164180f;

    /* renamed from: g */
    public boolean f164181g;

    static {
        bxon bxon = new bxon();
        f164173h = bxon;
        bxvk.m124024a(bxon.class, bxon);
    }

    private bxon() {
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
            return bxvk.m124022a(f164173h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", bxnz.f164128a, "d", "e", bxom.m122928b(), "f", "g"});
        } else if (i2 == 3) {
            return new bxon();
        } else {
            if (i2 == 4) {
                return new bxvd(f164173h);
            }
            if (i2 == 5) {
                return f164173h;
            }
            bxxk bxxk = f164174i;
            if (bxxk == null) {
                synchronized (bxon.class) {
                    bxxk = f164174i;
                    if (bxxk == null) {
                        bxxk = new bxve(f164173h);
                        f164174i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
