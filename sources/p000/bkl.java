package p000;

/* renamed from: bkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkl extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bkl f4985g;

    /* renamed from: h */
    private static volatile bxxk f4986h;

    /* renamed from: a */
    public int f4987a;

    /* renamed from: b */
    public long f4988b;

    /* renamed from: c */
    public long f4989c;

    /* renamed from: d */
    public long f4990d;

    /* renamed from: e */
    public bkq f4991e;

    /* renamed from: f */
    public boolean f4992f = true;

    static {
        bkl bkl = new bkl();
        f4985g = bkl;
        bxvk.m124024a(bkl.class, bkl);
    }

    private bkl() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f4985g, "\u0001\u0005\u0000\u0001\u0001e\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002dဉ\u0003eဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bkl();
        } else {
            if (i2 == 4) {
                return new bxvd(f4985g);
            }
            if (i2 == 5) {
                return f4985g;
            }
            bxxk bxxk = f4986h;
            if (bxxk == null) {
                synchronized (bkl.class) {
                    bxxk = f4986h;
                    if (bxxk == null) {
                        bxxk = new bxve(f4985g);
                        f4986h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
