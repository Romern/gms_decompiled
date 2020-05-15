package p000;

/* renamed from: bldl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bldl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bldl f126101d;

    /* renamed from: e */
    private static volatile bxxk f126102e;

    /* renamed from: a */
    public int f126103a;

    /* renamed from: b */
    public bleu f126104b;

    /* renamed from: c */
    public String f126105c = "";

    static {
        bldl bldl = new bldl();
        f126101d = bldl;
        bxvk.m124024a(bldl.class, bldl);
    }

    private bldl() {
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
            return bxvk.m124022a(f126101d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bldl();
        } else {
            if (i2 == 4) {
                return new bxvd(f126101d);
            }
            if (i2 == 5) {
                return f126101d;
            }
            bxxk bxxk = f126102e;
            if (bxxk == null) {
                synchronized (bldl.class) {
                    bxxk = f126102e;
                    if (bxxk == null) {
                        bxxk = new bxve(f126101d);
                        f126102e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
