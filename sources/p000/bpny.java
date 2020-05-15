package p000;

/* renamed from: bpny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpny extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bpny f138453c;

    /* renamed from: d */
    private static volatile bxxk f138454d;

    /* renamed from: a */
    public int f138455a;

    /* renamed from: b */
    public int f138456b;

    static {
        bpny bpny = new bpny();
        f138453c = bpny;
        GeneratedMessageLite.m124024a(bpny.class, bpny);
    }

    private bpny() {
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
            return GeneratedMessageLite.m124022a(f138453c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bpny();
        } else {
            if (i2 == 4) {
                return new bxvd(f138453c);
            }
            if (i2 == 5) {
                return f138453c;
            }
            bxxk bxxk = f138454d;
            if (bxxk == null) {
                synchronized (bpny.class) {
                    bxxk = f138454d;
                    if (bxxk == null) {
                        bxxk = new bxve(f138453c);
                        f138454d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
