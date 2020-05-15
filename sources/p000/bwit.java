package p000;

/* renamed from: bwit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwit extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwit f159683d;

    /* renamed from: f */
    private static volatile bxxk f159684f;

    /* renamed from: a */
    public int f159685a = 0;

    /* renamed from: b */
    public Object f159686b;

    /* renamed from: c */
    public int f159687c;

    /* renamed from: e */
    private int f159688e;

    static {
        bwit bwit = new bwit();
        f159683d = bwit;
        bxvk.m124024a(bwit.class, bwit);
    }

    private bwit() {
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
            return bxvk.m124022a(f159683d, "\u0001\u0002\u0001\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ြ\u0000", new Object[]{"b", "a", "e", "c", bwir.f159682a, bwiq.class});
        } else if (i2 == 3) {
            return new bwit();
        } else {
            if (i2 == 4) {
                return new bxvd(f159683d);
            }
            if (i2 == 5) {
                return f159683d;
            }
            bxxk bxxk = f159684f;
            if (bxxk == null) {
                synchronized (bwit.class) {
                    bxxk = f159684f;
                    if (bxxk == null) {
                        bxxk = new bxve(f159683d);
                        f159684f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
