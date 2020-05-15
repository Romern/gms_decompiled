package p000;

/* renamed from: bwgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwgs f159256c;

    /* renamed from: d */
    private static volatile bxxk f159257d;

    /* renamed from: a */
    public int f159258a;

    /* renamed from: b */
    public bwgv f159259b;

    static {
        bwgs bwgs = new bwgs();
        f159256c = bwgs;
        bxvk.m124024a(bwgs.class, bwgs);
    }

    private bwgs() {
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
            return bxvk.m124022a(f159256c, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwgs();
        } else {
            if (i2 == 4) {
                return new bxvd(f159256c);
            }
            if (i2 == 5) {
                return f159256c;
            }
            bxxk bxxk = f159257d;
            if (bxxk == null) {
                synchronized (bwgs.class) {
                    bxxk = f159257d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159256c);
                        f159257d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
