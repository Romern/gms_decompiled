package p000;

/* renamed from: bomo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bomo extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bomo f133678j;

    /* renamed from: k */
    private static volatile bxxk f133679k;

    /* renamed from: a */
    public int f133680a;

    /* renamed from: b */
    public int f133681b;

    /* renamed from: c */
    public int f133682c;

    /* renamed from: d */
    public int f133683d;

    /* renamed from: e */
    public int f133684e;

    /* renamed from: f */
    public int f133685f;

    /* renamed from: g */
    public int f133686g;

    /* renamed from: h */
    public long f133687h;

    /* renamed from: i */
    public boolean f133688i;

    static {
        bomo bomo = new bomo();
        f133678j = bomo;
        GeneratedMessageLite.m124024a(bomo.class, bomo);
    }

    private bomo() {
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
            return GeneratedMessageLite.m124022a(f133678j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0006\u0004ဇ\u0007\u0005ဌ\u0002\u0006ဌ\u0003\u0007ဌ\u0004\bဌ\u0005", new Object[]{"a", "b", adbo.m50127b(), "c", adbm.m50123b(), "h", "i", "d", adco.m50169b(), "e", adcu.m50181b(), "f", adcq.m50173b(), "g", adcs.m50177b()});
        } else if (i2 == 3) {
            return new bomo();
        } else {
            if (i2 == 4) {
                return new bxvd(f133678j);
            }
            if (i2 == 5) {
                return f133678j;
            }
            bxxk bxxk = f133679k;
            if (bxxk == null) {
                synchronized (bomo.class) {
                    bxxk = f133679k;
                    if (bxxk == null) {
                        bxxk = new bxve(f133678j);
                        f133679k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
