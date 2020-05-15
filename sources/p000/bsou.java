package p000;

/* renamed from: bsou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsou extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bsou f146425e;

    /* renamed from: f */
    private static volatile bxxk f146426f;

    /* renamed from: a */
    public int f146427a;

    /* renamed from: b */
    public String f146428b = "";

    /* renamed from: c */
    public int f146429c;

    /* renamed from: d */
    public boolean f146430d;

    static {
        bsou bsou = new bsou();
        f146425e = bsou;
        bxvk.m124024a(bsou.class, bsou);
    }

    private bsou() {
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
            return bxvk.m124022a(f146425e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", bsoy.m116053b(), "d"});
        } else if (i2 == 3) {
            return new bsou();
        } else {
            if (i2 == 4) {
                return new bxvd(f146425e);
            }
            if (i2 == 5) {
                return f146425e;
            }
            bxxk bxxk = f146426f;
            if (bxxk == null) {
                synchronized (bsou.class) {
                    bxxk = f146426f;
                    if (bxxk == null) {
                        bxxk = new bxve(f146425e);
                        f146426f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
