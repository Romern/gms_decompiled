package p000;

/* renamed from: biwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biwc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final biwc f122068c;

    /* renamed from: d */
    private static volatile bxxk f122069d;

    /* renamed from: a */
    public int f122070a;

    /* renamed from: b */
    public biwb f122071b;

    static {
        biwc biwc = new biwc();
        f122068c = biwc;
        bxvk.m124024a(biwc.class, biwc);
    }

    private biwc() {
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
            return bxvk.m124022a(f122068c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new biwc();
        } else {
            if (i2 == 4) {
                return new bxvd(f122068c);
            }
            if (i2 == 5) {
                return f122068c;
            }
            bxxk bxxk = f122069d;
            if (bxxk == null) {
                synchronized (biwc.class) {
                    bxxk = f122069d;
                    if (bxxk == null) {
                        bxxk = new bxve(f122068c);
                        f122069d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
