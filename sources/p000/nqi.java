package p000;

/* renamed from: nqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nqi extends bxvk implements bxxd {

    /* renamed from: i */
    public static final nqi f36409i;

    /* renamed from: j */
    private static volatile bxxk f36410j;

    /* renamed from: a */
    public int f36411a;

    /* renamed from: b */
    public int f36412b;

    /* renamed from: c */
    public int f36413c;

    /* renamed from: d */
    public boolean f36414d;

    /* renamed from: e */
    public int f36415e;

    /* renamed from: f */
    public nqf f36416f;

    /* renamed from: g */
    public boolean f36417g;

    /* renamed from: h */
    public int f36418h;

    static {
        nqi nqi = new nqi();
        f36409i = nqi;
        bxvk.m124024a(nqi.class, nqi);
    }

    private nqi() {
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
            return bxvk.m124022a(f36409i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new nqi();
        } else {
            if (i2 == 4) {
                return new bxvd(f36409i);
            }
            if (i2 == 5) {
                return f36409i;
            }
            bxxk bxxk = f36410j;
            if (bxxk == null) {
                synchronized (nqi.class) {
                    bxxk = f36410j;
                    if (bxxk == null) {
                        bxxk = new bxve(f36409i);
                        f36410j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
