package p000;

/* renamed from: bivm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bivm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bivm f122013c;

    /* renamed from: f */
    private static volatile bxxk f122014f;

    /* renamed from: a */
    public int f122015a = 1;

    /* renamed from: b */
    public int f122016b;

    /* renamed from: d */
    private int f122017d;

    /* renamed from: e */
    private byte f122018e = 2;

    static {
        bivm bivm = new bivm();
        f122013c = bivm;
        bxvk.m124024a(bivm.class, bivm);
    }

    private bivm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f122018e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f122018e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f122013c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᔄ\u0001", new Object[]{"d", "a", bisf.m102782b(), "b"});
        } else if (i2 == 3) {
            return new bivm();
        } else {
            if (i2 == 4) {
                return new bxvd(f122013c);
            }
            if (i2 == 5) {
                return f122013c;
            }
            bxxk bxxk = f122014f;
            if (bxxk == null) {
                synchronized (bivm.class) {
                    bxxk = f122014f;
                    if (bxxk == null) {
                        bxxk = new bxve(f122013c);
                        f122014f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
