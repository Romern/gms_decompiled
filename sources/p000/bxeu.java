package p000;

/* renamed from: bxeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxeu extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxeu f163125e;

    /* renamed from: f */
    private static volatile bxxk f163126f;

    /* renamed from: a */
    public int f163127a;

    /* renamed from: b */
    public int f163128b = 3;

    /* renamed from: c */
    public long f163129c;

    /* renamed from: d */
    public long f163130d;

    static {
        bxeu bxeu = new bxeu();
        f163125e = bxeu;
        GeneratedMessageLite.m124024a(bxeu.class, bxeu);
    }

    private bxeu() {
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
            return GeneratedMessageLite.m124022a(f163125e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", bxes.f163124a, "c", "d"});
        } else if (i2 == 3) {
            return new bxeu();
        } else {
            if (i2 == 4) {
                return new bxvd(f163125e);
            }
            if (i2 == 5) {
                return f163125e;
            }
            bxxk bxxk = f163126f;
            if (bxxk == null) {
                synchronized (bxeu.class) {
                    bxxk = f163126f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163125e);
                        f163126f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
