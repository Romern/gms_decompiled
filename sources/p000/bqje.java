package p000;

/* renamed from: bqje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqje extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bqje f140932h;

    /* renamed from: i */
    private static volatile bxxk f140933i;

    /* renamed from: a */
    public int f140934a;

    /* renamed from: b */
    public int f140935b;

    /* renamed from: c */
    public bqja f140936c;

    /* renamed from: d */
    public bxwc f140937d = bxxn.f165040b;

    /* renamed from: e */
    public int f140938e;

    /* renamed from: f */
    public bxwc f140939f = bxxn.f165040b;

    /* renamed from: g */
    public bqiz f140940g;

    static {
        bqje bqje = new bqje();
        f140932h = bqje;
        bxvk.m124024a(bqje.class, bqje);
    }

    private bqje() {
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
            return bxvk.m124022a(f140932h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004\u001b\u0005င\u0002\u0006\u001b\u0007ဉ\u0003", new Object[]{"a", "b", bqjv.f140972a, "c", "d", bqji.class, "e", "f", bqiv.class, "g"});
        } else if (i2 == 3) {
            return new bqje();
        } else {
            if (i2 == 4) {
                return new bqjd();
            }
            if (i2 == 5) {
                return f140932h;
            }
            bxxk bxxk = f140933i;
            if (bxxk == null) {
                synchronized (bqje.class) {
                    bxxk = f140933i;
                    if (bxxk == null) {
                        bxxk = new bxve(f140932h);
                        f140933i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
