package p000;

/* renamed from: bprt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bprt f138898d;

    /* renamed from: e */
    private static volatile bxxk f138899e;

    /* renamed from: a */
    public int f138900a;

    /* renamed from: b */
    public String f138901b = "";

    /* renamed from: c */
    public int f138902c;

    static {
        bprt bprt = new bprt();
        f138898d = bprt;
        GeneratedMessageLite.m124024a(bprt.class, bprt);
    }

    private bprt() {
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
            return GeneratedMessageLite.m124022a(f138898d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bprt();
        } else {
            if (i2 == 4) {
                return new bxvd(f138898d);
            }
            if (i2 == 5) {
                return f138898d;
            }
            bxxk bxxk = f138899e;
            if (bxxk == null) {
                synchronized (bprt.class) {
                    bxxk = f138899e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138898d);
                        f138899e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
