package p000;

/* renamed from: bori */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bori extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bori f134413f;

    /* renamed from: g */
    private static volatile bxxk f134414g;

    /* renamed from: a */
    public int f134415a;

    /* renamed from: b */
    public String f134416b = "";

    /* renamed from: c */
    public String f134417c = "";

    /* renamed from: d */
    public String f134418d = "";

    /* renamed from: e */
    public boolean f134419e;

    static {
        bori bori = new bori();
        f134413f = bori;
        bxvk.m124024a(bori.class, bori);
    }

    private bori() {
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
            return bxvk.m124022a(f134413f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bori();
        } else {
            if (i2 == 4) {
                return new bxvd(f134413f);
            }
            if (i2 == 5) {
                return f134413f;
            }
            bxxk bxxk = f134414g;
            if (bxxk == null) {
                synchronized (bori.class) {
                    bxxk = f134414g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134413f);
                        f134414g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
