package p000;

/* renamed from: buyx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buyx extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final buyx f155353d;

    /* renamed from: e */
    private static volatile bxxk f155354e;

    /* renamed from: a */
    public int f155355a;

    /* renamed from: b */
    public boolean f155356b;

    /* renamed from: c */
    public int f155357c;

    static {
        buyx buyx = new buyx();
        f155353d = buyx;
        GeneratedMessageLite.m124024a(buyx.class, buyx);
    }

    private buyx() {
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
            return GeneratedMessageLite.m124022a(f155353d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", buyv.m120789b()});
        } else if (i2 == 3) {
            return new buyx();
        } else {
            if (i2 == 4) {
                return new bxvd(f155353d);
            }
            if (i2 == 5) {
                return f155353d;
            }
            bxxk bxxk = f155354e;
            if (bxxk == null) {
                synchronized (buyx.class) {
                    bxxk = f155354e;
                    if (bxxk == null) {
                        bxxk = new bxve(f155353d);
                        f155354e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
