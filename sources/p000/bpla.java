package p000;

/* renamed from: bpla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpla extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpla f138048d;

    /* renamed from: e */
    private static volatile bxxk f138049e;

    /* renamed from: a */
    public int f138050a;

    /* renamed from: b */
    public bpkf f138051b;

    /* renamed from: c */
    public int f138052c;

    static {
        bpla bpla = new bpla();
        f138048d = bpla;
        GeneratedMessageLite.m124024a(bpla.class, bpla);
    }

    private bpla() {
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
            return GeneratedMessageLite.m124022a(f138048d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0004င\u0003", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpla();
        } else {
            if (i2 == 4) {
                return new bxvd(f138048d);
            }
            if (i2 == 5) {
                return f138048d;
            }
            bxxk bxxk = f138049e;
            if (bxxk == null) {
                synchronized (bpla.class) {
                    bxxk = f138049e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138048d);
                        f138049e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
