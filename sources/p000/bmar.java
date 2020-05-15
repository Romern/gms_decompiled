package p000;

/* renamed from: bmar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmar extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmar f128490c;

    /* renamed from: d */
    private static volatile bxxk f128491d;

    /* renamed from: a */
    public bxwc f128492a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f128493b = bxxn.f165040b;

    static {
        bmar bmar = new bmar();
        f128490c = bmar;
        bxvk.m124024a(bmar.class, bmar);
    }

    private bmar() {
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
            return bxvk.m124022a(f128490c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bmar();
        } else {
            if (i2 == 4) {
                return new bxvd(f128490c);
            }
            if (i2 == 5) {
                return f128490c;
            }
            bxxk bxxk = f128491d;
            if (bxxk == null) {
                synchronized (bmar.class) {
                    bxxk = f128491d;
                    if (bxxk == null) {
                        bxxk = new bxve(f128490c);
                        f128491d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
