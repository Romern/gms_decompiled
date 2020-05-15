package p000;

/* renamed from: bove */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bove extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bove f135002g;

    /* renamed from: h */
    private static volatile bxxk f135003h;

    /* renamed from: a */
    public int f135004a;

    /* renamed from: b */
    public int f135005b;

    /* renamed from: c */
    public int f135006c;

    /* renamed from: d */
    public boolean f135007d;

    /* renamed from: e */
    public bovd f135008e;

    /* renamed from: f */
    public int f135009f;

    static {
        bove bove = new bove();
        f135002g = bove;
        bxvk.m124024a(bove.class, bove);
    }

    private bove() {
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
            return bxvk.m124022a(f135002g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bove();
        } else {
            if (i2 == 4) {
                return new bxvd(f135002g);
            }
            if (i2 == 5) {
                return f135002g;
            }
            bxxk bxxk = f135003h;
            if (bxxk == null) {
                synchronized (bove.class) {
                    bxxk = f135003h;
                    if (bxxk == null) {
                        bxxk = new bxve(f135002g);
                        f135003h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
