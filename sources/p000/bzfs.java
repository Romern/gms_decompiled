package p000;

/* renamed from: bzfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzfs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzfs f169863c;

    /* renamed from: d */
    private static volatile bxxk f169864d;

    /* renamed from: a */
    public int f169865a;

    /* renamed from: b */
    public bzfk f169866b;

    static {
        bzfs bzfs = new bzfs();
        f169863c = bzfs;
        bxvk.m124024a(bzfs.class, bzfs);
    }

    private bzfs() {
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
            return bxvk.m124022a(f169863c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzfs();
        } else {
            if (i2 == 4) {
                return new bxvd(f169863c);
            }
            if (i2 == 5) {
                return f169863c;
            }
            bxxk bxxk = f169864d;
            if (bxxk == null) {
                synchronized (bzfs.class) {
                    bxxk = f169864d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169863c);
                        f169864d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
