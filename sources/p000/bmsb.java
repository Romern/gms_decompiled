package p000;

/* renamed from: bmsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsb extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bmsb f130640e;

    /* renamed from: f */
    private static volatile bxxk f130641f;

    /* renamed from: a */
    public int f130642a;

    /* renamed from: b */
    public bmaj f130643b;

    /* renamed from: c */
    public bmrw f130644c;

    /* renamed from: d */
    public bmry f130645d;

    static {
        bmsb bmsb = new bmsb();
        f130640e = bmsb;
        bxvk.m124024a(bmsb.class, bmsb);
    }

    private bmsb() {
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
            return bxvk.m124022a(f130640e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bmsb();
        } else {
            if (i2 == 4) {
                return new bxvd(f130640e);
            }
            if (i2 == 5) {
                return f130640e;
            }
            bxxk bxxk = f130641f;
            if (bxxk == null) {
                synchronized (bmsb.class) {
                    bxxk = f130641f;
                    if (bxxk == null) {
                        bxxk = new bxve(f130640e);
                        f130641f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
