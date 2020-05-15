package p000;

/* renamed from: blqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blqp extends bxvk implements bxxd {

    /* renamed from: f */
    public static final blqp f127386f;

    /* renamed from: g */
    private static volatile bxxk f127387g;

    /* renamed from: a */
    public int f127388a;

    /* renamed from: b */
    public boolean f127389b;

    /* renamed from: c */
    public boolean f127390c;

    /* renamed from: d */
    public boolean f127391d;

    /* renamed from: e */
    public int f127392e = 100;

    static {
        blqp blqp = new blqp();
        f127386f = blqp;
        bxvk.m124024a(blqp.class, blqp);
    }

    private blqp() {
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
            return bxvk.m124022a(f127386f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new blqp();
        } else {
            if (i2 == 4) {
                return new bxvd(f127386f);
            }
            if (i2 == 5) {
                return f127386f;
            }
            bxxk bxxk = f127387g;
            if (bxxk == null) {
                synchronized (blqp.class) {
                    bxxk = f127387g;
                    if (bxxk == null) {
                        bxxk = new bxve(f127386f);
                        f127387g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
