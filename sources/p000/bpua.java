package p000;

/* renamed from: bpua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpua extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bpua f139219f;

    /* renamed from: g */
    private static volatile bxxk f139220g;

    /* renamed from: a */
    public int f139221a;

    /* renamed from: b */
    public int f139222b;

    /* renamed from: c */
    public String f139223c = "";

    /* renamed from: d */
    public int f139224d;

    /* renamed from: e */
    public int f139225e;

    static {
        bpua bpua = new bpua();
        f139219f = bpua;
        bxvk.m124024a(bpua.class, bpua);
    }

    private bpua() {
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
            return bxvk.m124022a(f139219f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", sgj.m35207b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new bpua();
        } else {
            if (i2 == 4) {
                return new bxvd(f139219f);
            }
            if (i2 == 5) {
                return f139219f;
            }
            bxxk bxxk = f139220g;
            if (bxxk == null) {
                synchronized (bpua.class) {
                    bxxk = f139220g;
                    if (bxxk == null) {
                        bxxk = new bxve(f139219f);
                        f139220g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
