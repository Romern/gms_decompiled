package p000;

/* renamed from: bsqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsqn extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsqn f146664d;

    /* renamed from: e */
    private static volatile bxxk f146665e;

    /* renamed from: a */
    public int f146666a;

    /* renamed from: b */
    public bssl f146667b;

    /* renamed from: c */
    public int f146668c;

    static {
        bsqn bsqn = new bsqn();
        f146664d = bsqn;
        bxvk.m124024a(bsqn.class, bsqn);
    }

    private bsqn() {
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
            return bxvk.m124022a(f146664d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bsql.f146663a});
        } else if (i2 == 3) {
            return new bsqn();
        } else {
            if (i2 == 4) {
                return new bxvd(f146664d);
            }
            if (i2 == 5) {
                return f146664d;
            }
            bxxk bxxk = f146665e;
            if (bxxk == null) {
                synchronized (bsqn.class) {
                    bxxk = f146665e;
                    if (bxxk == null) {
                        bxxk = new bxve(f146664d);
                        f146665e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
