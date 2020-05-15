package p000;

/* renamed from: bwgc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwgc f159171c;

    /* renamed from: e */
    private static volatile bxxk f159172e;

    /* renamed from: a */
    public bmbs f159173a;

    /* renamed from: b */
    public bmnr f159174b;

    /* renamed from: d */
    private int f159175d;

    static {
        bwgc bwgc = new bwgc();
        f159171c = bwgc;
        bxvk.m124024a(bwgc.class, bwgc);
    }

    private bwgc() {
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
            return bxvk.m124022a(f159171c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bwgc();
        } else {
            if (i2 == 4) {
                return new bxvd(f159171c);
            }
            if (i2 == 5) {
                return f159171c;
            }
            bxxk bxxk = f159172e;
            if (bxxk == null) {
                synchronized (bwgc.class) {
                    bxxk = f159172e;
                    if (bxxk == null) {
                        bxxk = new bxve(f159171c);
                        f159172e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
