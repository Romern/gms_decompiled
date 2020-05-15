package p000;

/* renamed from: cbjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbjy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbjy f177377b;

    /* renamed from: c */
    private static volatile bxxk f177378c;

    /* renamed from: a */
    public cblg f177379a;

    static {
        cbjy cbjy = new cbjy();
        f177377b = cbjy;
        bxvk.m124024a(cbjy.class, cbjy);
    }

    private cbjy() {
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
            return bxvk.m124022a(f177377b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbjy();
        } else {
            if (i2 == 4) {
                return new bxvd(f177377b);
            }
            if (i2 == 5) {
                return f177377b;
            }
            bxxk bxxk = f177378c;
            if (bxxk == null) {
                synchronized (cbjy.class) {
                    bxxk = f177378c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177377b);
                        f177378c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
