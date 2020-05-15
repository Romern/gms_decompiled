package p000;

/* renamed from: blwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blwc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blwc f127918c;

    /* renamed from: d */
    private static volatile bxxk f127919d;

    /* renamed from: a */
    public int f127920a;

    /* renamed from: b */
    public bxtx f127921b = bxtx.f164797b;

    static {
        blwc blwc = new blwc();
        f127918c = blwc;
        bxvk.m124024a(blwc.class, blwc);
    }

    private blwc() {
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
            return bxvk.m124022a(f127918c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new blwc();
        } else {
            if (i2 == 4) {
                return new bxvd(f127918c);
            }
            if (i2 == 5) {
                return f127918c;
            }
            bxxk bxxk = f127919d;
            if (bxxk == null) {
                synchronized (blwc.class) {
                    bxxk = f127919d;
                    if (bxxk == null) {
                        bxxk = new bxve(f127918c);
                        f127919d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
