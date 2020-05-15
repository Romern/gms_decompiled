package p000;

/* renamed from: bwyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwyj extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bwyj f161464j;

    /* renamed from: k */
    private static volatile bxxk f161465k;

    /* renamed from: a */
    public int f161466a;

    /* renamed from: b */
    public String f161467b = "";

    /* renamed from: c */
    public bwya f161468c;

    /* renamed from: d */
    public int f161469d;

    /* renamed from: e */
    public bwya f161470e;

    /* renamed from: f */
    public bwya f161471f;

    /* renamed from: g */
    public int f161472g;

    /* renamed from: h */
    public int f161473h = 2;

    /* renamed from: i */
    public int f161474i;

    static {
        bwyj bwyj = new bwyj();
        f161464j = bwyj;
        bxvk.m124024a(bwyj.class, bwyj);
    }

    private bwyj() {
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
            return bxvk.m124022a(f161464j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဋ\u0002\u0004ဌ\u0005\u0005ဉ\u0003\u0006ဌ\u0006\u0007ဉ\u0004\bဌ\u0007", new Object[]{"a", "b", "c", "d", "g", bwye.m122428b(), "e", "h", bwyi.m122436b(), "f", "i", bwyg.m122432b()});
        } else if (i2 == 3) {
            return new bwyj();
        } else {
            if (i2 == 4) {
                return new bxvd(f161464j);
            }
            if (i2 == 5) {
                return f161464j;
            }
            bxxk bxxk = f161465k;
            if (bxxk == null) {
                synchronized (bwyj.class) {
                    bxxk = f161465k;
                    if (bxxk == null) {
                        bxxk = new bxve(f161464j);
                        f161465k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
