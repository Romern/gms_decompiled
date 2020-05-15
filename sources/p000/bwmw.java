package p000;

/* renamed from: bwmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwmw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bxvu f160322b = new bwmv();

    /* renamed from: c */
    public static final bwmw f160323c;

    /* renamed from: d */
    private static volatile bxxk f160324d;

    /* renamed from: a */
    public bxvt f160325a = bxvm.f164965b;

    static {
        bwmw bwmw = new bwmw();
        f160323c = bwmw;
        bxvk.m124024a(bwmw.class, bwmw);
    }

    private bwmw() {
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
            return bxvk.m124022a(f160323c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", bwmu.m122116b()});
        } else if (i2 == 3) {
            return new bwmw();
        } else {
            if (i2 == 4) {
                return new bxvd(f160323c);
            }
            if (i2 == 5) {
                return f160323c;
            }
            bxxk bxxk = f160324d;
            if (bxxk == null) {
                synchronized (bwmw.class) {
                    bxxk = f160324d;
                    if (bxxk == null) {
                        bxxk = new bxve(f160323c);
                        f160324d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
