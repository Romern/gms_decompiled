package p000;

/* renamed from: btdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btdr extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final btdr f148438g;

    /* renamed from: h */
    private static volatile bxxk f148439h;

    /* renamed from: a */
    public bxwc f148440a = bxxn.f165040b;

    /* renamed from: b */
    public int f148441b;

    /* renamed from: c */
    public int f148442c;

    /* renamed from: d */
    public btea f148443d;

    /* renamed from: e */
    public bteh f148444e;

    /* renamed from: f */
    public btdy f148445f;

    static {
        btdr btdr = new btdr();
        f148438g = btdr;
        GeneratedMessageLite.m124024a(btdr.class, btdr);
    }

    private btdr() {
        bxvm bxvm = bxvm.f164965b;
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
            return GeneratedMessageLite.m124022a(f148438g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001Ț\u0002\f\u0003\f\u0005\t\u0006\t\b\t", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new btdr();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][]) null, (short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f148438g;
            }
            bxxk bxxk = f148439h;
            if (bxxk == null) {
                synchronized (btdr.class) {
                    bxxk = f148439h;
                    if (bxxk == null) {
                        bxxk = new bxve(f148438g);
                        f148439h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
