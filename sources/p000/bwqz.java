package p000;

/* renamed from: bwqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwqz f160741c;

    /* renamed from: d */
    private static volatile bxxk f160742d;

    /* renamed from: a */
    public int f160743a = 0;

    /* renamed from: b */
    public Object f160744b;

    static {
        bwqz bwqz = new bwqz();
        f160741c = bwqz;
        bxvk.m124024a(bwqz.class, bwqz);
    }

    private bwqz() {
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
            return bxvk.m124022a(f160741c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ွ\u0000\u0002ွ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new bwqz();
        } else {
            if (i2 == 4) {
                return new bxvd(f160741c);
            }
            if (i2 == 5) {
                return f160741c;
            }
            bxxk bxxk = f160742d;
            if (bxxk == null) {
                synchronized (bwqz.class) {
                    bxxk = f160742d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160741c);
                        f160742d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
