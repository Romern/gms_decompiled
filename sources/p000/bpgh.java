package p000;

/* renamed from: bpgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpgh extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bpgh f137489c;

    /* renamed from: d */
    private static volatile bxxk f137490d;

    /* renamed from: a */
    public int f137491a;

    /* renamed from: b */
    public int f137492b;

    static {
        bpgh bpgh = new bpgh();
        f137489c = bpgh;
        bxvk.m124024a(bpgh.class, bpgh);
    }

    private bpgh() {
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
            return bxvk.m124022a(f137489c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzzv.m126374b()});
        } else if (i2 == 3) {
            return new bpgh();
        } else {
            if (i2 == 4) {
                return new bxvd(f137489c);
            }
            if (i2 == 5) {
                return f137489c;
            }
            bxxk bxxk = f137490d;
            if (bxxk == null) {
                synchronized (bpgh.class) {
                    bxxk = f137490d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137489c);
                        f137490d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
