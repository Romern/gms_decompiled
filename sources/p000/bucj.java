package p000;

/* renamed from: bucj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bucj extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bucj f153343e;

    /* renamed from: g */
    private static volatile bxxk f153344g;

    /* renamed from: a */
    public int f153345a;

    /* renamed from: b */
    public int f153346b;

    /* renamed from: c */
    public float f153347c;

    /* renamed from: d */
    public long f153348d;

    /* renamed from: f */
    private int f153349f;

    static {
        bucj bucj = new bucj();
        f153343e = bucj;
        bxvk.m124024a(bucj.class, bucj);
    }

    private bucj() {
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
            return bxvk.m124022a(f153343e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ခ\u0002\u0004ဃ\u0003", new Object[]{"f", "a", buch.f153342a, "b", bucf.f153341a, "c", "d"});
        } else if (i2 == 3) {
            return new bucj();
        } else {
            if (i2 == 4) {
                return new bxvd(f153343e);
            }
            if (i2 == 5) {
                return f153343e;
            }
            bxxk bxxk = f153344g;
            if (bxxk == null) {
                synchronized (bucj.class) {
                    bxxk = f153344g;
                    if (bxxk == null) {
                        bxxk = new bxve(f153343e);
                        f153344g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
