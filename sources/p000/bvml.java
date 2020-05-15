package p000;

/* renamed from: bvml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvml extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bvml f156751f;

    /* renamed from: g */
    private static volatile bxxk f156752g;

    /* renamed from: a */
    public int f156753a;

    /* renamed from: b */
    public bvov f156754b;

    /* renamed from: c */
    public int f156755c;

    /* renamed from: d */
    public int f156756d;

    /* renamed from: e */
    public bxwc f156757e = bxxn.f165040b;

    static {
        bvml bvml = new bvml();
        f156751f = bvml;
        GeneratedMessageLite.m124024a(bvml.class, bvml);
    }

    private bvml() {
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
            return GeneratedMessageLite.m124022a(f156751f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", bvmo.class});
        } else if (i2 == 3) {
            return new bvml();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (int[]) null);
            }
            if (i2 == 5) {
                return f156751f;
            }
            bxxk bxxk = f156752g;
            if (bxxk == null) {
                synchronized (bvml.class) {
                    bxxk = f156752g;
                    if (bxxk == null) {
                        bxxk = new bxve(f156751f);
                        f156752g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
