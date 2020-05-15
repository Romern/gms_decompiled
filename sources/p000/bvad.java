package p000;

/* renamed from: bvad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvad extends bxvg implements bxvh {

    /* renamed from: e */
    public static final bvad f155465e;

    /* renamed from: g */
    private static volatile bxxk f155466g;

    /* renamed from: a */
    public int f155467a;

    /* renamed from: b */
    public int f155468b;

    /* renamed from: c */
    public buzj f155469c;

    /* renamed from: d */
    public buzb f155470d;

    /* renamed from: f */
    private byte f155471f = 2;

    static {
        bvad bvad = new bvad();
        f155465e = bvad;
        bxvk.m124024a(bvad.class, bvad);
    }

    private bvad() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f155471f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f155471f = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f155465e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", bvaj.f155486a, "c", "d"});
        } else if (i2 == 3) {
            return new bvad();
        } else {
            if (i2 == 4) {
                return new bxvf(f155465e);
            }
            if (i2 == 5) {
                return f155465e;
            }
            bxxk bxxk = f155466g;
            if (bxxk == null) {
                synchronized (bvad.class) {
                    bxxk = f155466g;
                    if (bxxk == null) {
                        bxxk = new bxve(f155465e);
                        f155466g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
