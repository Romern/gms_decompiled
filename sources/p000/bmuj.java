package p000;

/* renamed from: bmuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmuj extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bmuj f130934f;

    /* renamed from: h */
    private static volatile bxxk f130935h;

    /* renamed from: a */
    public String f130936a = "";

    /* renamed from: b */
    public String f130937b = "";

    /* renamed from: c */
    public String f130938c = "";

    /* renamed from: d */
    public String f130939d = "";

    /* renamed from: e */
    public String f130940e = "";

    /* renamed from: g */
    private int f130941g;

    static {
        bmuj bmuj = new bmuj();
        f130934f = bmuj;
        bxvk.m124024a(bmuj.class, bmuj);
    }

    private bmuj() {
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
            return bxvk.m124022a(f130934f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bmuj();
        } else {
            if (i2 == 4) {
                return new bxvd(f130934f);
            }
            if (i2 == 5) {
                return f130934f;
            }
            bxxk bxxk = f130935h;
            if (bxxk == null) {
                synchronized (bmuj.class) {
                    bxxk = f130935h;
                    if (bxxk == null) {
                        bxxk = new bxve(f130934f);
                        f130935h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
