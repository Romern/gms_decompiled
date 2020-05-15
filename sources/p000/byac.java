package p000;

/* renamed from: byac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byac extends bxvk implements bxxd {

    /* renamed from: f */
    public static final byac f165231f;

    /* renamed from: g */
    private static volatile bxxk f165232g;

    /* renamed from: a */
    public int f165233a;

    /* renamed from: b */
    public String f165234b = "";

    /* renamed from: c */
    public int f165235c;

    /* renamed from: d */
    public String f165236d = "";

    /* renamed from: e */
    public String f165237e = "";

    static {
        byac byac = new byac();
        f165231f = byac;
        bxvk.m124024a(byac.class, byac);
    }

    private byac() {
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
            return bxvk.m124022a(f165231f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new byac();
        } else {
            if (i2 == 4) {
                return new bxvd(f165231f);
            }
            if (i2 == 5) {
                return f165231f;
            }
            bxxk bxxk = f165232g;
            if (bxxk == null) {
                synchronized (byac.class) {
                    bxxk = f165232g;
                    if (bxxk == null) {
                        bxxk = new bxve(f165231f);
                        f165232g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
