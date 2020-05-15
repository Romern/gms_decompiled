package p000;

/* renamed from: bpwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwr extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bpwr f139552e;

    /* renamed from: f */
    private static volatile bxxk f139553f;

    /* renamed from: a */
    public int f139554a;

    /* renamed from: b */
    public boolean f139555b;

    /* renamed from: c */
    public boolean f139556c;

    /* renamed from: d */
    public boolean f139557d;

    static {
        bpwr bpwr = new bpwr();
        f139552e = bpwr;
        GeneratedMessageLite.m124024a(bpwr.class, bpwr);
    }

    private bpwr() {
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
            return GeneratedMessageLite.m124022a(f139552e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpwr();
        } else {
            if (i2 == 4) {
                return new bxvd(f139552e);
            }
            if (i2 == 5) {
                return f139552e;
            }
            bxxk bxxk = f139553f;
            if (bxxk == null) {
                synchronized (bpwr.class) {
                    bxxk = f139553f;
                    if (bxxk == null) {
                        bxxk = new bxve(f139552e);
                        f139553f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
