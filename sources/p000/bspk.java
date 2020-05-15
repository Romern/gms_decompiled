package p000;

/* renamed from: bspk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bspk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bspk f146511f;

    /* renamed from: g */
    private static volatile bxxk f146512g;

    /* renamed from: a */
    public int f146513a;

    /* renamed from: b */
    public int f146514b;

    /* renamed from: c */
    public bspn f146515c;

    /* renamed from: d */
    public bsps f146516d;

    /* renamed from: e */
    public bspl f146517e;

    static {
        bspk bspk = new bspk();
        f146511f = bspk;
        bxvk.m124024a(bspk.class, bspk);
    }

    private bspk() {
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
            return bxvk.m124022a(f146511f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004", new Object[]{"a", "b", bspj.f146510a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new bspk();
        } else {
            if (i2 == 4) {
                return new bxvd(f146511f);
            }
            if (i2 == 5) {
                return f146511f;
            }
            bxxk bxxk = f146512g;
            if (bxxk == null) {
                synchronized (bspk.class) {
                    bxxk = f146512g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146511f);
                        f146512g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
