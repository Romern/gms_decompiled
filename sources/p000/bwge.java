package p000;

/* renamed from: bwge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwge extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwge f159184b;

    /* renamed from: c */
    private static volatile bxxk f159185c;

    /* renamed from: a */
    public bxwc f159186a = bxxn.f165040b;

    static {
        bwge bwge = new bwge();
        f159184b = bwge;
        bxvk.m124024a(bwge.class, bwge);
    }

    private bwge() {
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
            return bxvk.m124022a(f159184b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", bwgc.class});
        } else if (i2 == 3) {
            return new bwge();
        } else {
            if (i2 == 4) {
                return new bxvd(f159184b);
            }
            if (i2 == 5) {
                return f159184b;
            }
            bxxk bxxk = f159185c;
            if (bxxk == null) {
                synchronized (bwge.class) {
                    bxxk = f159185c;
                    if (bxxk == null) {
                        bxxk = new bxve(f159184b);
                        f159185c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
