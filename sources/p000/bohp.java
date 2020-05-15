package p000;

/* renamed from: bohp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohp extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bohp f133122e;

    /* renamed from: f */
    private static volatile bxxk f133123f;

    /* renamed from: a */
    public int f133124a;

    /* renamed from: b */
    public int f133125b;

    /* renamed from: c */
    public bxwc f133126c = bxxn.f165040b;

    /* renamed from: d */
    public boolean f133127d;

    static {
        bohp bohp = new bohp();
        f133122e = bohp;
        bxvk.m124024a(bohp.class, bohp);
    }

    private bohp() {
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
            return bxvk.m124022a(f133122e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bohp();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f133122e;
            }
            bxxk bxxk = f133123f;
            if (bxxk == null) {
                synchronized (bohp.class) {
                    bxxk = f133123f;
                    if (bxxk == null) {
                        bxxk = new bxve(f133122e);
                        f133123f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
