package p000;

/* renamed from: tiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tiv extends bxvk implements bxxd {

    /* renamed from: f */
    public static final tiv f46147f;

    /* renamed from: g */
    private static volatile bxxk f46148g;

    /* renamed from: a */
    public int f46149a;

    /* renamed from: b */
    public int f46150b;

    /* renamed from: c */
    public int f46151c;

    /* renamed from: d */
    public tjb f46152d;

    /* renamed from: e */
    public tiy f46153e;

    static {
        tiv tiv = new tiv();
        f46147f = tiv;
        bxvk.m124024a(tiv.class, tiv);
    }

    private tiv() {
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
            return bxvk.m124022a(f46147f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new tiv();
        } else {
            if (i2 == 4) {
                return new bxvd(f46147f);
            }
            if (i2 == 5) {
                return f46147f;
            }
            bxxk bxxk = f46148g;
            if (bxxk == null) {
                synchronized (tiv.class) {
                    bxxk = f46148g;
                    if (bxxk == null) {
                        bxxk = new bxve(f46147f);
                        f46148g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
