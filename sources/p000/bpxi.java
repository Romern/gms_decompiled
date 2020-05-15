package p000;

/* renamed from: bpxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpxi extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpxi f139713e;

    /* renamed from: f */
    private static volatile bxxk f139714f;

    /* renamed from: a */
    public int f139715a;

    /* renamed from: b */
    public String f139716b = "";

    /* renamed from: c */
    public int f139717c;

    /* renamed from: d */
    public int f139718d;

    static {
        bpxi bpxi = new bpxi();
        f139713e = bpxi;
        bxvk.m124024a(bpxi.class, bpxi);
    }

    private bpxi() {
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
            return bxvk.m124022a(f139713e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", bpzu.m112451b(), "d", bpzs.m112447b()});
        } else if (i2 == 3) {
            return new bpxi();
        } else {
            if (i2 == 4) {
                return new bxvd(f139713e);
            }
            if (i2 == 5) {
                return f139713e;
            }
            bxxk bxxk = f139714f;
            if (bxxk == null) {
                synchronized (bpxi.class) {
                    bxxk = f139714f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139713e);
                        f139714f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
