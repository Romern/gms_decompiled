package p000;

/* renamed from: bpkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpkr extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpkr f138007d;

    /* renamed from: e */
    private static volatile bxxk f138008e;

    /* renamed from: a */
    public int f138009a;

    /* renamed from: b */
    public String f138010b = "";

    /* renamed from: c */
    public boolean f138011c;

    static {
        bpkr bpkr = new bpkr();
        f138007d = bpkr;
        GeneratedMessageLite.m124024a(bpkr.class, bpkr);
    }

    private bpkr() {
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
            return GeneratedMessageLite.m124022a(f138007d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f138007d);
            }
            if (i2 == 5) {
                return f138007d;
            }
            bxxk bxxk = f138008e;
            if (bxxk == null) {
                synchronized (bpkr.class) {
                    bxxk = f138008e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138007d);
                        f138008e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
