package p000;

/* renamed from: cacg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cacg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cacg f172542d;

    /* renamed from: f */
    private static volatile bxxk f172543f;

    /* renamed from: a */
    public bxwc f172544a = bxxn.f165040b;

    /* renamed from: b */
    public String f172545b = "";

    /* renamed from: c */
    public boolean f172546c;

    /* renamed from: e */
    private int f172547e;

    static {
        cacg cacg = new cacg();
        f172542d = cacg;
        bxvk.m124024a(cacg.class, cacg);
    }

    private cacg() {
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
            return bxvk.m124022a(f172542d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"e", "a", cabm.class, "b", "c"});
        } else if (i2 == 3) {
            return new cacg();
        } else {
            if (i2 == 4) {
                return new bxvd(f172542d);
            }
            if (i2 == 5) {
                return f172542d;
            }
            bxxk bxxk = f172543f;
            if (bxxk == null) {
                synchronized (cacg.class) {
                    bxxk = f172543f;
                    if (bxxk == null) {
                        bxxk = new bxve(f172542d);
                        f172543f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
