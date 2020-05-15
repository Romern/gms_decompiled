package p000;

/* renamed from: bsoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsoh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsoh f146378c;

    /* renamed from: d */
    private static volatile bxxk f146379d;

    /* renamed from: a */
    public bxwc f146380a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f146381b = bxxn.f165040b;

    static {
        bsoh bsoh = new bsoh();
        f146378c = bsoh;
        bxvk.m124024a(bsoh.class, bsoh);
    }

    private bsoh() {
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
            return bxvk.m124022a(f146378c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", bspe.class, "b", bspd.class});
        } else if (i2 == 3) {
            return new bsoh();
        } else {
            if (i2 == 4) {
                return new bxvd((int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f146378c;
            }
            bxxk bxxk = f146379d;
            if (bxxk == null) {
                synchronized (bsoh.class) {
                    bxxk = f146379d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146378c);
                        f146379d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
