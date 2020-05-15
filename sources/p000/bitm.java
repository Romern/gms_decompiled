package p000;

/* renamed from: bitm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitm extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bitm f121674d;

    /* renamed from: f */
    private static volatile bxxk f121675f;

    /* renamed from: a */
    public int f121676a;

    /* renamed from: b */
    public bxwc f121677b = bxxn.f165040b;

    /* renamed from: c */
    public int f121678c;

    /* renamed from: e */
    private byte f121679e = 2;

    static {
        bitm bitm = new bitm();
        f121674d = bitm;
        bxvk.m124024a(bitm.class, bitm);
    }

    private bitm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121679e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121679e = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121674d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000", new Object[]{"a", "b", bitj.class, "c"});
        } else if (i2 == 3) {
            return new bitm();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f121674d;
            }
            bxxk bxxk = f121675f;
            if (bxxk == null) {
                synchronized (bitm.class) {
                    bxxk = f121675f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121674d);
                        f121675f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
