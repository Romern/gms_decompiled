package p000;

/* renamed from: bxdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxdy extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bxdy f163071d;

    /* renamed from: f */
    private static volatile bxxk f163072f;

    /* renamed from: a */
    public int f163073a;

    /* renamed from: b */
    public long f163074b;

    /* renamed from: c */
    public int f163075c;

    /* renamed from: e */
    private int f163076e;

    static {
        bxdy bxdy = new bxdy();
        f163071d = bxdy;
        bxvk.m124024a(bxdy.class, bxdy);
    }

    private bxdy() {
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
            return bxvk.m124022a(f163071d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", bxdw.f163070a, "b", "c", bxmf.f163931a});
        } else if (i2 == 3) {
            return new bxdy();
        } else {
            if (i2 == 4) {
                return new bxvd(f163071d);
            }
            if (i2 == 5) {
                return f163071d;
            }
            bxxk bxxk = f163072f;
            if (bxxk == null) {
                synchronized (bxdy.class) {
                    bxxk = f163072f;
                    if (bxxk == null) {
                        bxxk = new bxve(f163071d);
                        f163072f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
