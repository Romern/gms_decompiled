package p000;

/* renamed from: bolt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bolt extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bolt f133572i;

    /* renamed from: j */
    private static volatile bxxk f133573j;

    /* renamed from: a */
    public int f133574a;

    /* renamed from: b */
    public int f133575b;

    /* renamed from: c */
    public int f133576c;

    /* renamed from: d */
    public int f133577d;

    /* renamed from: e */
    public int f133578e;

    /* renamed from: f */
    public long f133579f;

    /* renamed from: g */
    public int f133580g;

    /* renamed from: h */
    public long f133581h;

    static {
        bolt bolt = new bolt();
        f133572i = bolt;
        GeneratedMessageLite.m124024a(bolt.class, bolt);
    }

    private bolt() {
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
            return GeneratedMessageLite.m124022a(f133572i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဌ\u0005\u0007ဂ\u0006", new Object[]{"a", "b", bolq.f133569a, "c", bols.f133571a, "d", bolk.f133555a, "e", bolk.f133555a, "f", "g", bolr.f133570a, "h"});
        } else if (i2 == 3) {
            return new bolt();
        } else {
            if (i2 == 4) {
                return new bxvd(f133572i);
            }
            if (i2 == 5) {
                return f133572i;
            }
            bxxk bxxk = f133573j;
            if (bxxk == null) {
                synchronized (bolt.class) {
                    bxxk = f133573j;
                    if (bxxk == null) {
                        bxxk = new bxve(f133572i);
                        f133573j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
