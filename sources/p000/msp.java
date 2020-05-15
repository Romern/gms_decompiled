package p000;

/* renamed from: msp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class msp extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final msp f34574e;

    /* renamed from: f */
    private static volatile bxxk f34575f;

    /* renamed from: a */
    public int f34576a;

    /* renamed from: b */
    public int f34577b;

    /* renamed from: c */
    public String f34578c = "";

    /* renamed from: d */
    public int f34579d;

    static {
        msp msp = new msp();
        f34574e = msp;
        GeneratedMessageLite.m124024a(msp.class, msp);
    }

    private msp() {
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
            return GeneratedMessageLite.m124022a(f34574e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", mso.f34573a, "c", "d", mqi.f34230a});
        } else if (i2 == 3) {
            return new msp();
        } else {
            if (i2 == 4) {
                return new bxvd(f34574e);
            }
            if (i2 == 5) {
                return f34574e;
            }
            bxxk bxxk = f34575f;
            if (bxxk == null) {
                synchronized (msp.class) {
                    bxxk = f34575f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34574e);
                        f34575f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
