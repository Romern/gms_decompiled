package p000;

/* renamed from: bvae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvae extends bxvg implements bxvh {

    /* renamed from: e */
    public static final bvae f155472e;

    /* renamed from: g */
    private static volatile bxxk f155473g;

    /* renamed from: a */
    public int f155474a;

    /* renamed from: b */
    public int f155475b;

    /* renamed from: c */
    public buzg f155476c;

    /* renamed from: d */
    public buyw f155477d;

    /* renamed from: f */
    private byte f155478f = 2;

    static {
        bvae bvae = new bvae();
        f155472e = bvae;
        bxvk.m124024a(bvae.class, bvae);
    }

    private bvae() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155478f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155478f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f155472e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0004ဉ\u0001\u0005ᐉ\u0002", new Object[]{"a", "b", bvaf.f155479a, "c", "d"});
        } else if (i2 == 3) {
            return new bvae();
        } else {
            if (i2 == 4) {
                return new bxvf(f155472e);
            }
            if (i2 == 5) {
                return f155472e;
            }
            bxxk bxxk = f155473g;
            if (bxxk == null) {
                synchronized (bvae.class) {
                    bxxk = f155473g;
                    if (bxxk == null) {
                        bxxk = new bxve(f155472e);
                        f155473g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
