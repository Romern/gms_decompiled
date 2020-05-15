package p000;

/* renamed from: bvof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvof extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvof f157025d;

    /* renamed from: e */
    private static volatile bxxk f157026e;

    /* renamed from: a */
    public int f157027a;

    /* renamed from: b */
    public bvmv f157028b;

    /* renamed from: c */
    public float f157029c;

    static {
        bvof bvof = new bvof();
        f157025d = bvof;
        bxvk.m124024a(bvof.class, bvof);
    }

    private bvof() {
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
            return bxvk.m124022a(f157025d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bvof();
        } else {
            if (i2 == 4) {
                return new bxvd(f157025d);
            }
            if (i2 == 5) {
                return f157025d;
            }
            bxxk bxxk = f157026e;
            if (bxxk == null) {
                synchronized (bvof.class) {
                    bxxk = f157026e;
                    if (bxxk == null) {
                        bxxk = new bxve(f157025d);
                        f157026e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
