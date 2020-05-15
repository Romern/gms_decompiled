package p000;

/* renamed from: byhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byhu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final byhu f166512c;

    /* renamed from: d */
    private static volatile bxxk f166513d;

    /* renamed from: a */
    public int f166514a;

    /* renamed from: b */
    public long f166515b;

    static {
        byhu byhu = new byhu();
        f166512c = byhu;
        bxvk.m124024a(byhu.class, byhu);
    }

    private byhu() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f166512c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new byhu();
        } else {
            if (i2 == 4) {
                return new bxvd(f166512c);
            }
            if (i2 == 5) {
                return f166512c;
            }
            bxxk bxxk = f166513d;
            if (bxxk == null) {
                synchronized (byhu.class) {
                    bxxk = f166513d;
                    if (bxxk == null) {
                        bxxk = new bxve(f166512c);
                        f166513d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
