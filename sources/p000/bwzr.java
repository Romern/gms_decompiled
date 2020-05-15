package p000;

/* renamed from: bwzr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwzr extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwzr f161634b;

    /* renamed from: c */
    public static final bxvj f161635c;

    /* renamed from: e */
    private static volatile bxxk f161636e;

    /* renamed from: a */
    public int f161637a;

    /* renamed from: d */
    private int f161638d;

    static {
        bwzr bwzr = new bwzr();
        f161634b = bwzr;
        bxvk.m124024a(bwzr.class, bwzr);
        bwoq bwoq = bwoq.f160480d;
        bwzr bwzr2 = f161634b;
        f161635c = bxvk.m124006a(bwoq, bwzr2, bwzr2, 232901549, bxzf.MESSAGE);
    }

    private bwzr() {
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
            return bxvk.m124022a(f161634b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwzp.f161633a});
        } else if (i2 == 3) {
            return new bwzr();
        } else {
            if (i2 == 4) {
                return new bxvd(f161634b);
            }
            if (i2 == 5) {
                return f161634b;
            }
            bxxk bxxk = f161636e;
            if (bxxk == null) {
                synchronized (bwzr.class) {
                    bxxk = f161636e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161634b);
                        f161636e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
