package p000;

/* renamed from: btkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btkl f149269d;

    /* renamed from: e */
    private static volatile bxxk f149270e;

    /* renamed from: a */
    public btiy f149271a;

    /* renamed from: b */
    public btli f149272b;

    /* renamed from: c */
    public btlh f149273c;

    static {
        btkl btkl = new btkl();
        f149269d = btkl;
        bxvk.m124024a(btkl.class, btkl);
    }

    private btkl() {
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
            return bxvk.m124022a(f149269d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btkl();
        } else {
            if (i2 == 4) {
                return new bxvd(f149269d);
            }
            if (i2 == 5) {
                return f149269d;
            }
            bxxk bxxk = f149270e;
            if (bxxk == null) {
                synchronized (btkl.class) {
                    bxxk = f149270e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149269d);
                        f149270e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
