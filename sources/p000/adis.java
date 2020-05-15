package p000;

/* renamed from: adis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adis extends bxvk implements bxxd {

    /* renamed from: e */
    public static final adis f61836e;

    /* renamed from: f */
    private static volatile bxxk f61837f;

    /* renamed from: a */
    public int f61838a = 0;

    /* renamed from: b */
    public Object f61839b;

    /* renamed from: c */
    public int f61840c;

    /* renamed from: d */
    public bxvt f61841d = bxvm.f164965b;

    static {
        adis adis = new adis();
        f61836e = adis;
        bxvk.m124024a(adis.class, adis);
    }

    private adis() {
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
            return bxvk.m124022a(f61836e, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0000\u0001\u0000\u0001:\u0000\u0002=\u0000\u0003=\u0000\u0004=\u0000\u0005=\u0000\u0007\u0004\b'", new Object[]{"b", "a", "c", "d"});
        } else if (i2 == 3) {
            return new adis();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (boolean[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f61836e;
            }
            bxxk bxxk = f61837f;
            if (bxxk == null) {
                synchronized (adis.class) {
                    bxxk = f61837f;
                    if (bxxk == null) {
                        bxxk = new bxve(f61836e);
                        f61837f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
