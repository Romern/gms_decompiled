package p000;

/* renamed from: bxie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxie extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxie f163506e;

    /* renamed from: f */
    private static volatile bxxk f163507f;

    /* renamed from: a */
    public int f163508a;

    /* renamed from: b */
    public int f163509b;

    /* renamed from: c */
    public long f163510c;

    /* renamed from: d */
    public double f163511d;

    static {
        bxie bxie = new bxie();
        f163506e = bxie;
        GeneratedMessageLite.m124024a(bxie.class, bxie);
    }

    private bxie() {
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
            return GeneratedMessageLite.m124022a(f163506e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003က\u0002", new Object[]{"a", "b", bxid.f163505a, "c", "d"});
        } else if (i2 == 3) {
            return new bxie();
        } else {
            if (i2 == 4) {
                return new bxvd(f163506e);
            }
            if (i2 == 5) {
                return f163506e;
            }
            bxxk bxxk = f163507f;
            if (bxxk == null) {
                synchronized (bxie.class) {
                    bxxk = f163507f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163506e);
                        f163507f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
