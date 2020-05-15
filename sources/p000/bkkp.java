package p000;

/* renamed from: bkkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bkkp f124596e;

    /* renamed from: f */
    private static volatile bxxk f124597f;

    /* renamed from: a */
    public int f124598a;

    /* renamed from: b */
    public String f124599b = "";

    /* renamed from: c */
    public String f124600c = "";

    /* renamed from: d */
    public String f124601d = "";

    static {
        bkkp bkkp = new bkkp();
        f124596e = bkkp;
        bxvk.m124024a(bkkp.class, bkkp);
    }

    private bkkp() {
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
            return bxvk.m124022a(f124596e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0006ဈ\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bkkp();
        } else {
            if (i2 == 4) {
                return new bxvd(f124596e);
            }
            if (i2 == 5) {
                return f124596e;
            }
            bxxk bxxk = f124597f;
            if (bxxk == null) {
                synchronized (bkkp.class) {
                    bxxk = f124597f;
                    if (bxxk == null) {
                        bxxk = new bxve(f124596e);
                        f124597f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
