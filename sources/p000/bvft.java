package p000;

/* renamed from: bvft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvft extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bvft f155916e;

    /* renamed from: f */
    private static volatile bxxk f155917f;

    /* renamed from: a */
    public int f155918a;

    /* renamed from: b */
    public long f155919b;

    /* renamed from: c */
    public long f155920c;

    /* renamed from: d */
    public int f155921d;

    static {
        bvft bvft = new bvft();
        f155916e = bvft;
        bxvk.m124024a(bvft.class, bvft);
    }

    private bvft() {
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
            return bxvk.m124022a(f155916e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bvjd.f156340a});
        } else if (i2 == 3) {
            return new bvft();
        } else {
            if (i2 == 4) {
                return new bxvd(f155916e);
            }
            if (i2 == 5) {
                return f155916e;
            }
            bxxk bxxk = f155917f;
            if (bxxk == null) {
                synchronized (bvft.class) {
                    bxxk = f155917f;
                    if (bxxk == null) {
                        bxxk = new bxve(f155916e);
                        f155917f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
