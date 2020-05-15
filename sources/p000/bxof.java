package p000;

/* renamed from: bxof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxof extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bxof f164145c;

    /* renamed from: d */
    private static volatile bxxk f164146d;

    /* renamed from: a */
    public int f164147a;

    /* renamed from: b */
    public bpwx f164148b;

    static {
        bxof bxof = new bxof();
        f164145c = bxof;
        bxvk.m124024a(bxof.class, bxof);
    }

    private bxof() {
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
            return bxvk.m124022a(f164145c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bxof();
        } else {
            if (i2 == 4) {
                return new bxvd(f164145c);
            }
            if (i2 == 5) {
                return f164145c;
            }
            bxxk bxxk = f164146d;
            if (bxxk == null) {
                synchronized (bxof.class) {
                    bxxk = f164146d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164145c);
                        f164146d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
