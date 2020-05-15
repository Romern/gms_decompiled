package p000;

/* renamed from: abpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final abpm f57871d;

    /* renamed from: e */
    private static volatile bxxk f57872e;

    /* renamed from: a */
    public int f57873a;

    /* renamed from: b */
    public String f57874b = "";

    /* renamed from: c */
    public bxwc f57875c = bxxn.f165040b;

    static {
        abpm abpm = new abpm();
        f57871d = abpm;
        bxvk.m124024a(abpm.class, abpm);
    }

    private abpm() {
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
            return bxvk.m124022a(f57871d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", abpl.class});
        } else if (i2 == 3) {
            return new abpm();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (byte[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f57871d;
            }
            bxxk bxxk = f57872e;
            if (bxxk == null) {
                synchronized (abpm.class) {
                    bxxk = f57872e;
                    if (bxxk == null) {
                        bxxk = new bxve(f57871d);
                        f57872e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
