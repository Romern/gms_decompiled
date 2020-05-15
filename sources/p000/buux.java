package p000;

/* renamed from: buux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buux extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final buux f155003j;

    /* renamed from: k */
    private static volatile bxxk f155004k;

    /* renamed from: a */
    public int f155005a;

    /* renamed from: b */
    public int f155006b;

    /* renamed from: c */
    public buuc f155007c;

    /* renamed from: d */
    public buud f155008d;

    /* renamed from: e */
    public buuu f155009e;

    /* renamed from: f */
    public buty f155010f;

    /* renamed from: g */
    public buuf f155011g;

    /* renamed from: h */
    public buue f155012h;

    /* renamed from: i */
    public buuk f155013i;

    static {
        buux buux = new buux();
        f155003j = buux;
        GeneratedMessageLite.m124024a(buux.class, buux);
    }

    private buux() {
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
            return GeneratedMessageLite.m124022a(f155003j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", buuw.m120479b(), "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new buux();
        } else {
            if (i2 == 4) {
                return new bxvd(f155003j);
            }
            if (i2 == 5) {
                return f155003j;
            }
            bxxk bxxk = f155004k;
            if (bxxk == null) {
                synchronized (buux.class) {
                    bxxk = f155004k;
                    if (bxxk == null) {
                        bxxk = new bxve(f155003j);
                        f155004k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
