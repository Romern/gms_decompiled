package p000;

/* renamed from: bpxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpxy f139806c;

    /* renamed from: d */
    private static volatile bxxk f139807d;

    /* renamed from: a */
    public int f139808a;

    /* renamed from: b */
    public bpxz f139809b;

    static {
        bpxy bpxy = new bpxy();
        f139806c = bpxy;
        bxvk.m124024a(bpxy.class, bpxy);
    }

    private bpxy() {
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
            return bxvk.m124022a(f139806c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpxy();
        } else {
            if (i2 == 4) {
                return new bxvd(f139806c);
            }
            if (i2 == 5) {
                return f139806c;
            }
            bxxk bxxk = f139807d;
            if (bxxk == null) {
                synchronized (bpxy.class) {
                    bxxk = f139807d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139806c);
                        f139807d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
