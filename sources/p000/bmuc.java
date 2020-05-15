package p000;

/* renamed from: bmuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmuc extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bmuc f130921h;

    /* renamed from: j */
    private static volatile bxxk f130922j;

    /* renamed from: a */
    public int f130923a;

    /* renamed from: b */
    public long f130924b;

    /* renamed from: c */
    public String f130925c = "";

    /* renamed from: d */
    public long f130926d;

    /* renamed from: e */
    public int f130927e;

    /* renamed from: f */
    public int f130928f;

    /* renamed from: g */
    public String f130929g = "";

    /* renamed from: i */
    private int f130930i;

    static {
        bmuc bmuc = new bmuc();
        f130921h = bmuc;
        bxvk.m124024a(bmuc.class, bmuc);
    }

    private bmuc() {
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
            return bxvk.m124022a(f130921h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဈ\u0006", new Object[]{"i", "a", bmtw.f130918a, "b", "c", "d", "e", bmty.f130919a, "f", bmua.f130920a, "g"});
        } else if (i2 == 3) {
            return new bmuc();
        } else {
            if (i2 == 4) {
                return new bxvd(f130921h);
            }
            if (i2 == 5) {
                return f130921h;
            }
            bxxk bxxk = f130922j;
            if (bxxk == null) {
                synchronized (bmuc.class) {
                    bxxk = f130922j;
                    if (bxxk == null) {
                        bxxk = new bxve(f130921h);
                        f130922j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
