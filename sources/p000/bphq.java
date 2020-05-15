package p000;

/* renamed from: bphq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bphq extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bphq f137697c;

    /* renamed from: d */
    private static volatile bxxk f137698d;

    /* renamed from: a */
    public int f137699a;

    /* renamed from: b */
    public int f137700b;

    static {
        bphq bphq = new bphq();
        f137697c = bphq;
        bxvk.m124024a(bphq.class, bphq);
    }

    private bphq() {
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
            return bxvk.m124022a(f137697c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bpho.f137696a});
        } else if (i2 == 3) {
            return new bphq();
        } else {
            if (i2 == 4) {
                return new bxvd(f137697c);
            }
            if (i2 == 5) {
                return f137697c;
            }
            bxxk bxxk = f137698d;
            if (bxxk == null) {
                synchronized (bphq.class) {
                    bxxk = f137698d;
                    if (bxxk == null) {
                        bxxk = new bxve(f137697c);
                        f137698d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
