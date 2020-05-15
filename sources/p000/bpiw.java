package p000;

/* renamed from: bpiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpiw extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpiw f137819e;

    /* renamed from: f */
    private static volatile bxxk f137820f;

    /* renamed from: a */
    public int f137821a;

    /* renamed from: b */
    public int f137822b;

    /* renamed from: c */
    public int f137823c;

    /* renamed from: d */
    public int f137824d;

    static {
        bpiw bpiw = new bpiw();
        f137819e = bpiw;
        bxvk.m124024a(bpiw.class, bpiw);
    }

    private bpiw() {
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
            return bxvk.m124022a(f137819e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", bpiu.f137818a, "c", "d"});
        } else if (i2 == 3) {
            return new bpiw();
        } else {
            if (i2 == 4) {
                return new bxvd(f137819e);
            }
            if (i2 == 5) {
                return f137819e;
            }
            bxxk bxxk = f137820f;
            if (bxxk == null) {
                synchronized (bpiw.class) {
                    bxxk = f137820f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137819e);
                        f137820f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
