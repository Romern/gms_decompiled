package p000;

/* renamed from: bwkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwkz f160071d;

    /* renamed from: e */
    private static volatile bxxk f160072e;

    /* renamed from: a */
    public int f160073a;

    /* renamed from: b */
    public bmaj f160074b;

    /* renamed from: c */
    public bwlc f160075c;

    static {
        bwkz bwkz = new bwkz();
        f160071d = bwkz;
        bxvk.m124024a(bwkz.class, bwkz);
    }

    private bwkz() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f160071d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bwkz();
        } else {
            if (i2 == 4) {
                return new bxvd(f160071d);
            }
            if (i2 == 5) {
                return f160071d;
            }
            bxxk bxxk = f160072e;
            if (bxxk == null) {
                synchronized (bwkz.class) {
                    bxxk = f160072e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160071d);
                        f160072e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
