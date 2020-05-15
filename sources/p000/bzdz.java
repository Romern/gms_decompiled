package p000;

/* renamed from: bzdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzdz extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bzdz f169619f;

    /* renamed from: g */
    private static volatile bxxk f169620g;

    /* renamed from: a */
    public boolean f169621a;

    /* renamed from: b */
    public int f169622b;

    /* renamed from: c */
    public int f169623c;

    /* renamed from: d */
    public int f169624d;

    /* renamed from: e */
    public boolean f169625e;

    static {
        bzdz bzdz = new bzdz();
        f169619f = bzdz;
        bxvk.m124024a(bzdz.class, bzdz);
    }

    private bzdz() {
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
            return bxvk.m124022a(f169619f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0003\f\u0004\f\u0005\u0007", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bzdz();
        } else {
            if (i2 == 4) {
                return new bxvd(f169619f);
            }
            if (i2 == 5) {
                return f169619f;
            }
            bxxk bxxk = f169620g;
            if (bxxk == null) {
                synchronized (bzdz.class) {
                    bxxk = f169620g;
                    if (bxxk == null) {
                        bxxk = new bxve(f169619f);
                        f169620g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
