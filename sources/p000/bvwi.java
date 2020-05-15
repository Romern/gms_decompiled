package p000;

/* renamed from: bvwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwi extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bvwi f157931f;

    /* renamed from: g */
    private static volatile bxxk f157932g;

    /* renamed from: a */
    public int f157933a;

    /* renamed from: b */
    public int f157934b;

    /* renamed from: c */
    public int f157935c = 1;

    /* renamed from: d */
    public int f157936d = 1;

    /* renamed from: e */
    public int f157937e;

    static {
        bvwi bvwi = new bvwi();
        f157931f = bvwi;
        bxvk.m124024a(bvwi.class, bvwi);
    }

    private bvwi() {
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
            return bxvk.m124022a(f157931f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0003\u0004ဌ\u0002", new Object[]{"a", "b", "c", bvwh.f157930a, "e", "d", bvwh.f157930a});
        } else if (i2 == 3) {
            return new bvwi();
        } else {
            if (i2 == 4) {
                return new bxvd(f157931f);
            }
            if (i2 == 5) {
                return f157931f;
            }
            bxxk bxxk = f157932g;
            if (bxxk == null) {
                synchronized (bvwi.class) {
                    bxxk = f157932g;
                    if (bxxk == null) {
                        bxxk = new bxve(f157931f);
                        f157932g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
