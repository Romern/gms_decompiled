package p000;

/* renamed from: bzhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhq extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bzhq f170101e;

    /* renamed from: f */
    private static volatile bxxk f170102f;

    /* renamed from: a */
    public int f170103a;

    /* renamed from: b */
    public String f170104b = "";

    /* renamed from: c */
    public String f170105c = "";

    /* renamed from: d */
    public int f170106d;

    static {
        bzhq bzhq = new bzhq();
        f170101e = bzhq;
        bxvk.m124024a(bzhq.class, bzhq);
    }

    private bzhq() {
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
            return bxvk.m124022a(f170101e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", bzho.f170100a});
        } else if (i2 == 3) {
            return new bzhq();
        } else {
            if (i2 == 4) {
                return new bxvd(f170101e);
            }
            if (i2 == 5) {
                return f170101e;
            }
            bxxk bxxk = f170102f;
            if (bxxk == null) {
                synchronized (bzhq.class) {
                    bxxk = f170102f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170101e);
                        f170102f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
