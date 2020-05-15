package p000;

/* renamed from: bpro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpro extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpro f138878d;

    /* renamed from: e */
    private static volatile bxxk f138879e;

    /* renamed from: a */
    public int f138880a;

    /* renamed from: b */
    public int f138881b;

    /* renamed from: c */
    public int f138882c;

    static {
        bpro bpro = new bpro();
        f138878d = bpro;
        GeneratedMessageLite.m124024a(bpro.class, bpro);
    }

    private bpro() {
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
            return GeneratedMessageLite.m124022a(f138878d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpro();
        } else {
            if (i2 == 4) {
                return new bxvd(f138878d);
            }
            if (i2 == 5) {
                return f138878d;
            }
            bxxk bxxk = f138879e;
            if (bxxk == null) {
                synchronized (bpro.class) {
                    bxxk = f138879e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138878d);
                        f138879e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
