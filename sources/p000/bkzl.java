package p000;

/* renamed from: bkzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzl extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkzl f125612d;

    /* renamed from: e */
    private static volatile bxxk f125613e;

    /* renamed from: a */
    public int f125614a;

    /* renamed from: b */
    public int f125615b;

    /* renamed from: c */
    public long f125616c;

    static {
        bkzl bkzl = new bkzl();
        f125612d = bkzl;
        bxvk.m124024a(bkzl.class, bkzl);
    }

    private bkzl() {
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
            return bxvk.m124022a(f125612d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkzl();
        } else {
            if (i2 == 4) {
                return new bxvd(f125612d);
            }
            if (i2 == 5) {
                return f125612d;
            }
            bxxk bxxk = f125613e;
            if (bxxk == null) {
                synchronized (bkzl.class) {
                    bxxk = f125613e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125612d);
                        f125613e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
