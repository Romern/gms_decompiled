package p000;

/* renamed from: bwes */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwes extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwes f159024c;

    /* renamed from: d */
    private static volatile bxxk f159025d;

    /* renamed from: a */
    public int f159026a;

    /* renamed from: b */
    public bwgu f159027b;

    static {
        bwes bwes = new bwes();
        f159024c = bwes;
        bxvk.m124024a(bwes.class, bwes);
    }

    private bwes() {
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
            return bxvk.m124022a(f159024c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwes();
        } else {
            if (i2 == 4) {
                return new bxvd(f159024c);
            }
            if (i2 == 5) {
                return f159024c;
            }
            bxxk bxxk = f159025d;
            if (bxxk == null) {
                synchronized (bwes.class) {
                    bxxk = f159025d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159024c);
                        f159025d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
