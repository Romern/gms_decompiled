package p000;

/* renamed from: bywn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bywn extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bywn f168628c;

    /* renamed from: d */
    private static volatile bxxk f168629d;

    /* renamed from: a */
    public int f168630a;

    /* renamed from: b */
    public int f168631b;

    static {
        bywn bywn = new bywn();
        f168628c = bywn;
        bxvk.m124024a(bywn.class, bywn);
    }

    private bywn() {
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
            return bxvk.m124022a(f168628c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzbi.f169247a});
        } else if (i2 == 3) {
            return new bywn();
        } else {
            if (i2 == 4) {
                return new bxvd(f168628c);
            }
            if (i2 == 5) {
                return f168628c;
            }
            bxxk bxxk = f168629d;
            if (bxxk == null) {
                synchronized (bywn.class) {
                    bxxk = f168629d;
                    if (bxxk == null) {
                        bxxk = new bxve(f168628c);
                        f168629d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
