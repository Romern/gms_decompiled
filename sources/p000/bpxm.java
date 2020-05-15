package p000;

/* renamed from: bpxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpxm f139734c;

    /* renamed from: d */
    private static volatile bxxk f139735d;

    /* renamed from: a */
    public int f139736a;

    /* renamed from: b */
    public int f139737b;

    static {
        bpxm bpxm = new bpxm();
        f139734c = bpxm;
        bxvk.m124024a(bpxm.class, bpxm);
    }

    private bpxm() {
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
            return bxvk.m124022a(f139734c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bqbb.f140210a});
        } else if (i2 == 3) {
            return new bpxm();
        } else {
            if (i2 == 4) {
                return new bxvd(f139734c);
            }
            if (i2 == 5) {
                return f139734c;
            }
            bxxk bxxk = f139735d;
            if (bxxk == null) {
                synchronized (bpxm.class) {
                    bxxk = f139735d;
                    if (bxxk == null) {
                        bxxk = new bxve(f139734c);
                        f139735d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
