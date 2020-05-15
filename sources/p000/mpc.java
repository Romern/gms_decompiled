package p000;

/* renamed from: mpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mpc extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final mpc f34104e;

    /* renamed from: f */
    private static volatile bxxk f34105f;

    /* renamed from: a */
    public int f34106a;

    /* renamed from: b */
    public bxwc f34107b = bxxn.f165040b;

    /* renamed from: c */
    public long f34108c;

    /* renamed from: d */
    public boolean f34109d;

    static {
        mpc mpc = new mpc();
        f34104e = mpc;
        GeneratedMessageLite.m124024a(mpc.class, mpc);
    }

    private mpc() {
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
            return GeneratedMessageLite.m124022a(f34104e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", mpb.class, "c", "d"});
        } else if (i2 == 3) {
            return new mpc();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f34104e;
            }
            bxxk bxxk = f34105f;
            if (bxxk == null) {
                synchronized (mpc.class) {
                    bxxk = f34105f;
                    if (bxxk == null) {
                        bxxk = new bxve(f34104e);
                        f34105f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
