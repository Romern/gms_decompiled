package p000;

/* renamed from: byht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byht extends bxvk implements bxxd {

    /* renamed from: d */
    public static final byht f166507d;

    /* renamed from: e */
    private static volatile bxxk f166508e;

    /* renamed from: a */
    public int f166509a;

    /* renamed from: b */
    public long f166510b = -1;

    /* renamed from: c */
    public bxtx f166511c = bxtx.f164797b;

    static {
        byht byht = new byht();
        f166507d = byht;
        bxvk.m124024a(byht.class, byht);
    }

    private byht() {
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
            return bxvk.m124022a(f166507d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byht();
        } else {
            if (i2 == 4) {
                return new bxvd(f166507d);
            }
            if (i2 == 5) {
                return f166507d;
            }
            bxxk bxxk = f166508e;
            if (bxxk == null) {
                synchronized (byht.class) {
                    bxxk = f166508e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166507d);
                        f166508e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
