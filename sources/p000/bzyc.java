package p000;

/* renamed from: bzyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzyc extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzyc f171844b;

    /* renamed from: c */
    private static volatile bxxk f171845c;

    /* renamed from: a */
    public bxwc f171846a = bxxn.f165040b;

    static {
        bzyc bzyc = new bzyc();
        f171844b = bzyc;
        bxvk.m124024a(bzyc.class, bzyc);
    }

    private bzyc() {
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
            return bxvk.m124022a(f171844b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bzym.class});
        } else if (i2 == 3) {
            return new bzyc();
        } else {
            if (i2 == 4) {
                return new bxvd(f171844b);
            }
            if (i2 == 5) {
                return f171844b;
            }
            bxxk bxxk = f171845c;
            if (bxxk == null) {
                synchronized (bzyc.class) {
                    bxxk = f171845c;
                    if (bxxk == null) {
                        bxxk = new bxve(f171844b);
                        f171845c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
