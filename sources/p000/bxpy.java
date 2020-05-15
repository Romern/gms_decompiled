package p000;

/* renamed from: bxpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxpy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxpy f164339d;

    /* renamed from: f */
    private static volatile bxxk f164340f;

    /* renamed from: a */
    public int f164341a;

    /* renamed from: b */
    public bxpo f164342b;

    /* renamed from: c */
    public bxwc f164343c = bxxn.f165040b;

    /* renamed from: e */
    private byte f164344e = 2;

    static {
        bxpy bxpy = new bxpy();
        f164339d = bxpy;
        bxvk.m124024a(bxpy.class, bxpy);
    }

    private bxpy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f164344e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f164344e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f164339d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"a", "b", "c", bxpx.class});
        } else if (i2 == 3) {
            return new bxpy();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (byte[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f164339d;
            }
            bxxk bxxk = f164340f;
            if (bxxk == null) {
                synchronized (bxpy.class) {
                    bxxk = f164340f;
                    if (bxxk == null) {
                        bxxk = new bxve(f164339d);
                        f164340f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
