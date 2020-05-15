package p000;

/* renamed from: bpqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpqz extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpqz f138811c;

    /* renamed from: d */
    private static volatile bxxk f138812d;

    /* renamed from: a */
    public int f138813a;

    /* renamed from: b */
    public int f138814b;

    static {
        bpqz bpqz = new bpqz();
        f138811c = bpqz;
        GeneratedMessageLite.m124024a(bpqz.class, bpqz);
    }

    private bpqz() {
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
            return GeneratedMessageLite.m124022a(f138811c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpqz();
        } else {
            if (i2 == 4) {
                return new bxvd(f138811c);
            }
            if (i2 == 5) {
                return f138811c;
            }
            bxxk bxxk = f138812d;
            if (bxxk == null) {
                synchronized (bpqz.class) {
                    bxxk = f138812d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138811c);
                        f138812d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
