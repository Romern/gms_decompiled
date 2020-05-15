package p000;

/* renamed from: bpwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpwb extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpwb f139452d;

    /* renamed from: e */
    private static volatile bxxk f139453e;

    /* renamed from: a */
    public int f139454a;

    /* renamed from: b */
    public int f139455b;

    /* renamed from: c */
    public int f139456c;

    static {
        bpwb bpwb = new bpwb();
        f139452d = bpwb;
        GeneratedMessageLite.m124024a(bpwb.class, bpwb);
    }

    private bpwb() {
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
            return GeneratedMessageLite.m124022a(f139452d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", bpwa.f139451a, "c", bpvz.f139450a});
        } else if (i2 == 3) {
            return new bpwb();
        } else {
            if (i2 == 4) {
                return new bxvd(f139452d);
            }
            if (i2 == 5) {
                return f139452d;
            }
            bxxk bxxk = f139453e;
            if (bxxk == null) {
                synchronized (bpwb.class) {
                    bxxk = f139453e;
                    if (bxxk == null) {
                        bxxk = new bxve(f139452d);
                        f139453e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
