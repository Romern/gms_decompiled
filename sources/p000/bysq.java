package p000;

/* renamed from: bysq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bysq extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bysq f167593f;

    /* renamed from: g */
    private static volatile bxxk f167594g;

    /* renamed from: a */
    public int f167595a;

    /* renamed from: b */
    public int f167596b;

    /* renamed from: c */
    public bxtx f167597c = bxtx.f164797b;

    /* renamed from: d */
    public int f167598d;

    /* renamed from: e */
    public bxtx f167599e = bxtx.f164797b;

    static {
        bysq bysq = new bysq();
        f167593f = bysq;
        bxvk.m124024a(bysq.class, bysq);
    }

    private bysq() {
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
            return bxvk.m124022a(f167593f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ဌ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", bysl.f167586a, "e"});
        } else if (i2 == 3) {
            return new bysq();
        } else {
            if (i2 == 4) {
                return new bxvd(f167593f);
            }
            if (i2 == 5) {
                return f167593f;
            }
            bxxk bxxk = f167594g;
            if (bxxk == null) {
                synchronized (bysq.class) {
                    bxxk = f167594g;
                    if (bxxk == null) {
                        bxxk = new bxve(f167593f);
                        f167594g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
