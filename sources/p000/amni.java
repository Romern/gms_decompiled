package p000;

/* renamed from: amni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amni extends bxvk implements bxxd {

    /* renamed from: d */
    public static final amni f75479d;

    /* renamed from: e */
    private static volatile bxxk f75480e;

    /* renamed from: a */
    public int f75481a;

    /* renamed from: b */
    public amng f75482b;

    /* renamed from: c */
    public amnh f75483c;

    static {
        amni amni = new amni();
        f75479d = amni;
        bxvk.m124024a(amni.class, amni);
    }

    private amni() {
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
            return bxvk.m124022a(f75479d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new amni();
        } else {
            if (i2 == 4) {
                return new bxvd(f75479d);
            }
            if (i2 == 5) {
                return f75479d;
            }
            bxxk bxxk = f75480e;
            if (bxxk == null) {
                synchronized (amni.class) {
                    bxxk = f75480e;
                    if (bxxk == null) {
                        bxxk = new bxve(f75479d);
                        f75480e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
