package p000;

/* renamed from: bitg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitg extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bitg f121639d;

    /* renamed from: f */
    private static volatile bxxk f121640f;

    /* renamed from: a */
    public int f121641a;

    /* renamed from: b */
    public int f121642b;

    /* renamed from: c */
    public int f121643c;

    /* renamed from: e */
    private byte f121644e = 2;

    static {
        bitg bitg = new bitg();
        f121639d = bitg;
        bxvk.m124024a(bitg.class, bitg);
    }

    private bitg() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121644e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121644e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121639d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔄ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bitg();
        } else {
            if (i2 == 4) {
                return new bxvd(f121639d);
            }
            if (i2 == 5) {
                return f121639d;
            }
            bxxk bxxk = f121640f;
            if (bxxk == null) {
                synchronized (bitg.class) {
                    bxxk = f121640f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121639d);
                        f121640f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
