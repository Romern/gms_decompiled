package p000;

/* renamed from: agnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnq extends bxvk implements bxxd {

    /* renamed from: g */
    public static final agnq f66145g;

    /* renamed from: h */
    private static volatile bxxk f66146h;

    /* renamed from: a */
    public int f66147a;

    /* renamed from: b */
    public long f66148b;

    /* renamed from: c */
    public String f66149c = "";

    /* renamed from: d */
    public String f66150d = "";

    /* renamed from: e */
    public long f66151e;

    /* renamed from: f */
    public double f66152f;

    static {
        agnq agnq = new agnq();
        f66145g = agnq;
        bxvk.m124024a(agnq.class, agnq);
    }

    private agnq() {
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
            return bxvk.m124022a(f66145g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0006က\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new agnq();
        } else {
            if (i2 == 4) {
                return new bxvd(f66145g);
            }
            if (i2 == 5) {
                return f66145g;
            }
            bxxk bxxk = f66146h;
            if (bxxk == null) {
                synchronized (agnq.class) {
                    bxxk = f66146h;
                    if (bxxk == null) {
                        bxxk = new bxve(f66145g);
                        f66146h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
