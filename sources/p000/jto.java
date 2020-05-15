package p000;

/* renamed from: jto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jto extends bxvk implements bxxd {

    /* renamed from: d */
    public static final jto f23186d;

    /* renamed from: e */
    private static volatile bxxk f23187e;

    /* renamed from: a */
    public bxtx f23188a = bxtx.f164797b;

    /* renamed from: b */
    public long f23189b;

    /* renamed from: c */
    public long f23190c;

    static {
        jto jto = new jto();
        f23186d = jto;
        bxvk.m124024a(jto.class, jto);
    }

    private jto() {
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
            return bxvk.m124022a(f23186d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0002\u0003\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new jto();
        } else {
            if (i2 == 4) {
                return new bxvd(f23186d);
            }
            if (i2 == 5) {
                return f23186d;
            }
            bxxk bxxk = f23187e;
            if (bxxk == null) {
                synchronized (jto.class) {
                    bxxk = f23187e;
                    if (bxxk == null) {
                        bxxk = new bxve(f23186d);
                        f23187e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
