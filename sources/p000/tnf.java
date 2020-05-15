package p000;

/* renamed from: tnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tnf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final tnf f46278c;

    /* renamed from: d */
    private static volatile bxxk f46279d;

    /* renamed from: a */
    public int f46280a;

    /* renamed from: b */
    public String f46281b = "";

    static {
        tnf tnf = new tnf();
        f46278c = tnf;
        bxvk.m124024a(tnf.class, tnf);
    }

    private tnf() {
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
            return bxvk.m124022a(f46278c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new tnf();
        } else {
            if (i2 == 4) {
                return new bxvd(f46278c);
            }
            if (i2 == 5) {
                return f46278c;
            }
            bxxk bxxk = f46279d;
            if (bxxk == null) {
                synchronized (tnf.class) {
                    bxxk = f46279d;
                    if (bxxk == null) {
                        bxxk = new bxve(f46278c);
                        f46279d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
