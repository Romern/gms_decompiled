package p000;

/* renamed from: bvfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvfe extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvfe f155851c;

    /* renamed from: d */
    private static volatile bxxk f155852d;

    /* renamed from: a */
    public bxwc f155853a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f155854b = bxxn.f165040b;

    static {
        bvfe bvfe = new bvfe();
        f155851c = bvfe;
        bxvk.m124024a(bvfe.class, bvfe);
    }

    private bvfe() {
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
            return bxvk.m124022a(f155851c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", bvgc.class, "b", bvfk.class});
        } else if (i2 == 3) {
            return new bvfe();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f155851c;
            }
            bxxk bxxk = f155852d;
            if (bxxk == null) {
                synchronized (bvfe.class) {
                    bxxk = f155852d;
                    if (bxxk == null) {
                        bxxk = new bxve(f155851c);
                        f155852d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
