package p000;

/* renamed from: bitf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bitf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bitf f121635c;

    /* renamed from: d */
    private static volatile bxxk f121636d;

    /* renamed from: a */
    public int f121637a;

    /* renamed from: b */
    public boolean f121638b;

    static {
        bitf bitf = new bitf();
        f121635c = bitf;
        bxvk.m124024a(bitf.class, bitf);
    }

    private bitf() {
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
            return bxvk.m124022a(f121635c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bitf();
        } else {
            if (i2 == 4) {
                return new bxvd(f121635c);
            }
            if (i2 == 5) {
                return f121635c;
            }
            bxxk bxxk = f121636d;
            if (bxxk == null) {
                synchronized (bitf.class) {
                    bxxk = f121636d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121635c);
                        f121636d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
