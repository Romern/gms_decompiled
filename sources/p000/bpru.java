package p000;

/* renamed from: bpru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpru extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpru f138903d;

    /* renamed from: e */
    private static volatile bxxk f138904e;

    /* renamed from: a */
    public int f138905a;

    /* renamed from: b */
    public int f138906b;

    /* renamed from: c */
    public int f138907c;

    static {
        bpru bpru = new bpru();
        f138903d = bpru;
        GeneratedMessageLite.m124024a(bpru.class, bpru);
    }

    private bpru() {
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
            return GeneratedMessageLite.m124022a(f138903d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bpru();
        } else {
            if (i2 == 4) {
                return new bxvd(f138903d);
            }
            if (i2 == 5) {
                return f138903d;
            }
            bxxk bxxk = f138904e;
            if (bxxk == null) {
                synchronized (bpru.class) {
                    bxxk = f138904e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138903d);
                        f138904e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
