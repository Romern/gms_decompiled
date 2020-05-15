package p000;

/* renamed from: atzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atzl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final atzl f91238d;

    /* renamed from: e */
    private static volatile bxxk f91239e;

    /* renamed from: a */
    public atzk f91240a;

    /* renamed from: b */
    public int f91241b;

    /* renamed from: c */
    public boolean f91242c;

    static {
        atzl atzl = new atzl();
        f91238d = atzl;
        bxvk.m124024a(atzl.class, atzl);
    }

    private atzl() {
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
            return bxvk.m124022a(f91238d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u0004\u0003\u0007", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new atzl();
        } else {
            if (i2 == 4) {
                return new bxvd(f91238d);
            }
            if (i2 == 5) {
                return f91238d;
            }
            bxxk bxxk = f91239e;
            if (bxxk == null) {
                synchronized (atzl.class) {
                    bxxk = f91239e;
                    if (bxxk == null) {
                        bxxk = new bxve(f91238d);
                        f91239e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
