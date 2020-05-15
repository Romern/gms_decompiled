package p000;

/* renamed from: cipc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cipc extends bxvk implements bxxd {

    /* renamed from: e */
    public static final cipc f191180e;

    /* renamed from: f */
    private static volatile bxxk f191181f;

    /* renamed from: a */
    public ciou f191182a;

    /* renamed from: b */
    public ciov f191183b;

    /* renamed from: c */
    public cipe f191184c;

    /* renamed from: d */
    public cioy f191185d;

    static {
        cipc cipc = new cipc();
        f191180e = cipc;
        bxvk.m124024a(cipc.class, cipc);
    }

    private cipc() {
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
            return bxvk.m124022a(f191180e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new cipc();
        } else {
            if (i2 == 4) {
                return new bxvd(f191180e);
            }
            if (i2 == 5) {
                return f191180e;
            }
            bxxk bxxk = f191181f;
            if (bxxk == null) {
                synchronized (cipc.class) {
                    bxxk = f191181f;
                    if (bxxk == null) {
                        bxxk = new bxve(f191180e);
                        f191181f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
