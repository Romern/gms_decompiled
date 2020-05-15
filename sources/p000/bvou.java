package p000;

/* renamed from: bvou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvou extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bvou f157218c;

    /* renamed from: d */
    private static volatile bxxk f157219d;

    /* renamed from: a */
    public int f157220a;

    /* renamed from: b */
    public int f157221b;

    static {
        bvou bvou = new bvou();
        f157218c = bvou;
        bxvk.m124024a(bvou.class, bvou);
    }

    private bvou() {
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
            return bxvk.m124022a(f157218c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bvot.f157217a});
        } else if (i2 == 3) {
            return new bvou();
        } else {
            if (i2 == 4) {
                return new bxvd(f157218c);
            }
            if (i2 == 5) {
                return f157218c;
            }
            bxxk bxxk = f157219d;
            if (bxxk == null) {
                synchronized (bvou.class) {
                    bxxk = f157219d;
                    if (bxxk == null) {
                        bxxk = new bxve(f157218c);
                        f157219d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
