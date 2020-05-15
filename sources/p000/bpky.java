package p000;

/* renamed from: bpky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpky extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpky f138032d;

    /* renamed from: e */
    private static volatile bxxk f138033e;

    /* renamed from: a */
    public int f138034a;

    /* renamed from: b */
    public int f138035b;

    /* renamed from: c */
    public bpkf f138036c;

    static {
        bpky bpky = new bpky();
        f138032d = bpky;
        GeneratedMessageLite.m124024a(bpky.class, bpky);
    }

    private bpky() {
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
            return GeneratedMessageLite.m124022a(f138032d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpky();
        } else {
            if (i2 == 4) {
                return new bxvd(f138032d);
            }
            if (i2 == 5) {
                return f138032d;
            }
            bxxk bxxk = f138033e;
            if (bxxk == null) {
                synchronized (bpky.class) {
                    bxxk = f138033e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138032d);
                        f138033e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
