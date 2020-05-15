package p000;

/* renamed from: bopq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bopq extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bopq f134165k;

    /* renamed from: l */
    private static volatile bxxk f134166l;

    /* renamed from: a */
    public String f134167a = "";

    /* renamed from: b */
    public String f134168b = "";

    /* renamed from: c */
    public String f134169c = "";

    /* renamed from: d */
    public long f134170d;

    /* renamed from: e */
    public String f134171e = "";

    /* renamed from: f */
    public String f134172f = "";

    /* renamed from: g */
    public long f134173g;

    /* renamed from: h */
    public long f134174h;

    /* renamed from: i */
    public String f134175i = "";

    /* renamed from: j */
    public int f134176j;

    static {
        bopq bopq = new bopq();
        f134165k = bopq;
        GeneratedMessageLite.m124024a(bopq.class, bopq);
    }

    private bopq() {
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
            return GeneratedMessageLite.m124022a(f134165k, "\u0000\n\u0000\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0002\u0005Ȉ\u0006Ȉ\u0007\u0002\b\u0002\tȈ\n\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bopq();
        } else {
            if (i2 == 4) {
                return new bxvd(f134165k);
            }
            if (i2 == 5) {
                return f134165k;
            }
            bxxk bxxk = f134166l;
            if (bxxk == null) {
                synchronized (bopq.class) {
                    bxxk = f134166l;
                    if (bxxk == null) {
                        bxxk = new bxve(f134165k);
                        f134166l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
