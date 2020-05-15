package p000;

/* renamed from: bsoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsoi extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bsoi f146382f;

    /* renamed from: g */
    private static volatile bxxk f146383g;

    /* renamed from: a */
    public int f146384a;

    /* renamed from: b */
    public String f146385b = "";

    /* renamed from: c */
    public String f146386c = "";

    /* renamed from: d */
    public String f146387d = "";

    /* renamed from: e */
    public String f146388e = "";

    static {
        bsoi bsoi = new bsoi();
        f146382f = bsoi;
        bxvk.m124024a(bsoi.class, bsoi);
    }

    private bsoi() {
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
            return bxvk.m124022a(f146382f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsoi();
        } else {
            if (i2 == 4) {
                return new bxvd(f146382f);
            }
            if (i2 == 5) {
                return f146382f;
            }
            bxxk bxxk = f146383g;
            if (bxxk == null) {
                synchronized (bsoi.class) {
                    bxxk = f146383g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146382f);
                        f146383g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
