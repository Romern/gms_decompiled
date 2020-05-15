package p000;

/* renamed from: bqmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmf extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bqmf f141201f;

    /* renamed from: g */
    private static volatile bxxk f141202g;

    /* renamed from: a */
    public String f141203a = "";

    /* renamed from: b */
    public String f141204b = "";

    /* renamed from: c */
    public bxwc f141205c = bxxn.f165040b;

    /* renamed from: d */
    public bqlr f141206d;

    /* renamed from: e */
    public bxtx f141207e = bxtx.f164797b;

    static {
        bqmf bqmf = new bqmf();
        f141201f = bqmf;
        bxvk.m124024a(bqmf.class, bqmf);
    }

    private bqmf() {
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
            return bxvk.m124022a(f141201f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0005\t\u0006\n", new Object[]{"a", "b", "c", bqme.class, "d", "e"});
        } else if (i2 == 3) {
            return new bqmf();
        } else {
            if (i2 == 4) {
                return new bqmc();
            }
            if (i2 == 5) {
                return f141201f;
            }
            bxxk bxxk = f141202g;
            if (bxxk == null) {
                synchronized (bqmf.class) {
                    bxxk = f141202g;
                    if (bxxk == null) {
                        bxxk = new bxve(f141201f);
                        f141202g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
