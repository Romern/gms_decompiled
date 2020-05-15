package p000;

/* renamed from: jbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jbg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final jbg f22090c;

    /* renamed from: d */
    private static volatile bxxk f22091d;

    /* renamed from: a */
    public int f22092a;

    /* renamed from: b */
    public bxtx f22093b = bxtx.f164797b;

    static {
        jbg jbg = new jbg();
        f22090c = jbg;
        bxvk.m124024a(jbg.class, jbg);
    }

    private jbg() {
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
            return bxvk.m124022a(f22090c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new jbg();
        } else {
            if (i2 == 4) {
                return new bxvd(f22090c);
            }
            if (i2 == 5) {
                return f22090c;
            }
            bxxk bxxk = f22091d;
            if (bxxk == null) {
                synchronized (jbg.class) {
                    bxxk = f22091d;
                    if (bxxk == null) {
                        bxxk = new bxve(f22090c);
                        f22091d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
