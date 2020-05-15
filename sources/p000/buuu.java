package p000;

/* renamed from: buuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buuu extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final buuu f154985f;

    /* renamed from: g */
    private static volatile bxxk f154986g;

    /* renamed from: a */
    public int f154987a;

    /* renamed from: b */
    public int f154988b;

    /* renamed from: c */
    public buut f154989c;

    /* renamed from: d */
    public buuq f154990d;

    /* renamed from: e */
    public buun f154991e;

    static {
        buuu buuu = new buuu();
        f154985f = buuu;
        GeneratedMessageLite.m124024a(buuu.class, buuu);
    }

    private buuu() {
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
            return GeneratedMessageLite.m124022a(f154985f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", buup.m120470b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new buuu();
        } else {
            if (i2 == 4) {
                return new bxvd(f154985f);
            }
            if (i2 == 5) {
                return f154985f;
            }
            bxxk bxxk = f154986g;
            if (bxxk == null) {
                synchronized (buuu.class) {
                    bxxk = f154986g;
                    if (bxxk == null) {
                        bxxk = new bxve(f154985f);
                        f154986g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
