package p000;

/* renamed from: bzeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzeu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzeu f169727d;

    /* renamed from: e */
    private static volatile bxxk f169728e;

    /* renamed from: a */
    public int f169729a;

    /* renamed from: b */
    public String f169730b = "";

    /* renamed from: c */
    public int f169731c;

    static {
        bzeu bzeu = new bzeu();
        f169727d = bzeu;
        bxvk.m124024a(bzeu.class, bzeu);
    }

    private bzeu() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f169727d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bzeu();
        } else {
            if (i2 == 4) {
                return new bxvd(f169727d);
            }
            if (i2 == 5) {
                return f169727d;
            }
            bxxk bxxk = f169728e;
            if (bxxk == null) {
                synchronized (bzeu.class) {
                    bxxk = f169728e;
                    if (bxxk == null) {
                        bxxk = new bxve(f169727d);
                        f169728e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
