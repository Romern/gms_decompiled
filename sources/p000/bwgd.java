package p000;

/* renamed from: bwgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwgd extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bwgd f159176g;

    /* renamed from: h */
    private static volatile bxxk f159177h;

    /* renamed from: a */
    public int f159178a;

    /* renamed from: b */
    public bmaj f159179b;

    /* renamed from: c */
    public String f159180c = "";

    /* renamed from: d */
    public String f159181d = "";

    /* renamed from: e */
    public int f159182e = 3;

    /* renamed from: f */
    public int f159183f;

    static {
        bwgd bwgd = new bwgd();
        f159176g = bwgd;
        bxvk.m124024a(bwgd.class, bwgd);
    }

    private bwgd() {
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
            return bxvk.m124022a(f159176g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", bmbm.m107870b()});
        } else if (i2 == 3) {
            return new bwgd();
        } else {
            if (i2 == 4) {
                return new bxvd(f159176g);
            }
            if (i2 == 5) {
                return f159176g;
            }
            bxxk bxxk = f159177h;
            if (bxxk == null) {
                synchronized (bwgd.class) {
                    bxxk = f159177h;
                    if (bxxk == null) {
                        bxxk = new bxve(f159176g);
                        f159177h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
