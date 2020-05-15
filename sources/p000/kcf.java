package p000;

/* renamed from: kcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final kcf f23745c;

    /* renamed from: d */
    private static volatile bxxk f23746d;

    /* renamed from: a */
    public bxwc f23747a = bxxn.f165040b;

    /* renamed from: b */
    public String f23748b = "";

    static {
        kcf kcf = new kcf();
        f23745c = kcf;
        bxvk.m124024a(kcf.class, kcf);
    }

    private kcf() {
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
            return bxvk.m124022a(f23745c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"a", kce.class, "b"});
        } else if (i2 == 3) {
            return new kcf();
        } else {
            if (i2 == 4) {
                return new bxvd(f23745c);
            }
            if (i2 == 5) {
                return f23745c;
            }
            bxxk bxxk = f23746d;
            if (bxxk == null) {
                synchronized (kcf.class) {
                    bxxk = f23746d;
                    if (bxxk == null) {
                        bxxk = new bxve(f23745c);
                        f23746d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
