package p000;

/* renamed from: bpmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmp extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bpmp f138316d;

    /* renamed from: e */
    private static volatile bxxk f138317e;

    /* renamed from: a */
    public int f138318a;

    /* renamed from: b */
    public bxwc f138319b = bxxn.f165040b;

    /* renamed from: c */
    public long f138320c;

    static {
        bpmp bpmp = new bpmp();
        f138316d = bpmp;
        GeneratedMessageLite.m124024a(bpmp.class, bpmp);
    }

    private bpmp() {
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
            return GeneratedMessageLite.m124022a(f138316d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"a", "b", bpmo.class, "c"});
        } else if (i2 == 3) {
            return new bpmp();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f138316d;
            }
            bxxk bxxk = f138317e;
            if (bxxk == null) {
                synchronized (bpmp.class) {
                    bxxk = f138317e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138316d);
                        f138317e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
