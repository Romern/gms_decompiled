package p000;

/* renamed from: bspz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspz extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bspz f146608e;

    /* renamed from: f */
    private static volatile bxxk f146609f;

    /* renamed from: a */
    public int f146610a;

    /* renamed from: b */
    public bspu f146611b;

    /* renamed from: c */
    public bspy f146612c;

    /* renamed from: d */
    public bsqd f146613d;

    static {
        bspz bspz = new bspz();
        f146608e = bspz;
        bxvk.m124024a(bspz.class, bspz);
    }

    private bspz() {
        bxtx bxtx = bxtx.f164797b;
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f146608e, "\u0001\u0003\u0000\u0001\u001c!\u0003\u0000\u0000\u0000\u001cဉ\b\u001fဉ\u0015!ဉ\u000f", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new bspz();
        } else {
            if (i2 == 4) {
                return new bxvd(f146608e);
            }
            if (i2 == 5) {
                return f146608e;
            }
            bxxk bxxk = f146609f;
            if (bxxk == null) {
                synchronized (bspz.class) {
                    bxxk = f146609f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146608e);
                        f146609f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
