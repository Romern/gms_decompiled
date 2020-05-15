package p000;

/* renamed from: bkzj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzj extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bkzj f125600d;

    /* renamed from: e */
    private static volatile bxxk f125601e;

    /* renamed from: a */
    public int f125602a;

    /* renamed from: b */
    public int f125603b;

    /* renamed from: c */
    public boolean f125604c;

    static {
        bkzj bkzj = new bkzj();
        f125600d = bkzj;
        bxvk.m124024a(bkzj.class, bkzj);
    }

    private bkzj() {
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
            return bxvk.m124022a(f125600d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bkzj();
        } else {
            if (i2 == 4) {
                return new bxvd(f125600d);
            }
            if (i2 == 5) {
                return f125600d;
            }
            bxxk bxxk = f125601e;
            if (bxxk == null) {
                synchronized (bkzj.class) {
                    bxxk = f125601e;
                    if (bxxk == null) {
                        bxxk = new bxve(f125600d);
                        f125601e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
