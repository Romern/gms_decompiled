package p000;

/* renamed from: bpay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpay extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bpay f135565j;

    /* renamed from: k */
    private static volatile bxxk f135566k;

    /* renamed from: a */
    public int f135567a;

    /* renamed from: b */
    public boolean f135568b;

    /* renamed from: c */
    public long f135569c;

    /* renamed from: d */
    public bxvt f135570d = bxvm.f164965b;

    /* renamed from: e */
    public bxvt f135571e = bxvm.f164965b;

    /* renamed from: f */
    public bxvt f135572f = bxvm.f164965b;

    /* renamed from: g */
    public bxvt f135573g = bxvm.f164965b;

    /* renamed from: h */
    public bxvt f135574h = bxvm.f164965b;

    /* renamed from: i */
    public long f135575i;

    static {
        bpay bpay = new bpay();
        f135565j = bpay;
        GeneratedMessageLite.m124024a(bpay.class, bpay);
    }

    private bpay() {
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
            return GeneratedMessageLite.m124022a(f135565j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0005\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003\u001e\u0004\u001e\u0005\u001e\u0006\u001e\u0007\u001e\bဂ\u0002", new Object[]{"a", "b", "c", "d", bpax.m111736b(), "e", bpax.m111736b(), "f", bpax.m111736b(), "g", bpax.m111736b(), "h", bpax.m111736b(), "i"});
        } else if (i2 == 3) {
            return new bpay();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f135565j;
            }
            bxxk bxxk = f135566k;
            if (bxxk == null) {
                synchronized (bpay.class) {
                    bxxk = f135566k;
                    if (bxxk == null) {
                        bxxk = new bxve(f135565j);
                        f135566k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
