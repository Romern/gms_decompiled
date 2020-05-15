package p000;

/* renamed from: budt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budt extends bxvk implements bxxd {

    /* renamed from: b */
    public static final budt f153515b;

    /* renamed from: c */
    private static volatile bxxk f153516c;

    /* renamed from: a */
    public bxwc f153517a = bxxn.f165040b;

    static {
        budt budt = new budt();
        f153515b = budt;
        bxvk.m124024a(budt.class, budt);
    }

    private budt() {
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
            return bxvk.m124022a(f153515b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", buds.class});
        } else if (i2 == 3) {
            return new budt();
        } else {
            if (i2 == 4) {
                return new bxvd(f153515b);
            }
            if (i2 == 5) {
                return f153515b;
            }
            bxxk bxxk = f153516c;
            if (bxxk == null) {
                synchronized (budt.class) {
                    bxxk = f153516c;
                    if (bxxk == null) {
                        bxxk = new bxve(f153515b);
                        f153516c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
