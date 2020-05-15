package p000;

/* renamed from: bsse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsse extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bsse f146846h;

    /* renamed from: i */
    private static volatile bxxk f146847i;

    /* renamed from: a */
    public int f146848a;

    /* renamed from: b */
    public bxwc f146849b = bxxn.f165040b;

    /* renamed from: c */
    public bssa f146850c;

    /* renamed from: d */
    public bssa f146851d;

    /* renamed from: e */
    public bssa f146852e;

    /* renamed from: f */
    public bssa f146853f;

    /* renamed from: g */
    public bssa f146854g;

    static {
        bsse bsse = new bsse();
        f146846h = bsse;
        bxvk.m124024a(bsse.class, bsse);
    }

    private bsse() {
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
            return bxvk.m124022a(f146846h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", bssd.class, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bsse();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return f146846h;
            }
            bxxk bxxk = f146847i;
            if (bxxk == null) {
                synchronized (bsse.class) {
                    bxxk = f146847i;
                    if (bxxk == null) {
                        bxxk = new bxve(f146846h);
                        f146847i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
