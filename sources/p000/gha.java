package p000;

/* renamed from: gha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gha extends bxvk implements bxxd {

    /* renamed from: f */
    public static final gha f18210f;

    /* renamed from: g */
    private static volatile bxxk f18211g;

    /* renamed from: a */
    public int f18212a;

    /* renamed from: b */
    public ghe f18213b;

    /* renamed from: c */
    public ghf f18214c;

    /* renamed from: d */
    public ghj f18215d;

    /* renamed from: e */
    public ghc f18216e;

    static {
        gha gha = new gha();
        f18210f = gha;
        bxvk.m124024a(gha.class, gha);
    }

    private gha() {
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
            return bxvk.m124022a(f18210f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new gha();
        } else {
            if (i2 == 4) {
                return new bxvd(f18210f);
            }
            if (i2 == 5) {
                return f18210f;
            }
            bxxk bxxk = f18211g;
            if (bxxk == null) {
                synchronized (gha.class) {
                    bxxk = f18211g;
                    if (bxxk == null) {
                        bxxk = new bxve(f18210f);
                        f18211g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
