package p000;

/* renamed from: bpid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpid extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bpid f137722e;

    /* renamed from: f */
    private static volatile bxxk f137723f;

    /* renamed from: a */
    public int f137724a;

    /* renamed from: b */
    public int f137725b;

    /* renamed from: c */
    public int f137726c;

    /* renamed from: d */
    public long f137727d = -1;

    static {
        bpid bpid = new bpid();
        f137722e = bpid;
        bxvk.m124024a(bpid.class, bpid);
    }

    private bpid() {
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
            return bxvk.m124022a(f137722e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bpid();
        } else {
            if (i2 == 4) {
                return new bxvd(f137722e);
            }
            if (i2 == 5) {
                return f137722e;
            }
            bxxk bxxk = f137723f;
            if (bxxk == null) {
                synchronized (bpid.class) {
                    bxxk = f137723f;
                    if (bxxk == null) {
                        bxxk = new bxve(f137722e);
                        f137723f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
