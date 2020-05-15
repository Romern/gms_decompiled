package p000;

/* renamed from: bzpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzpm extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzpm f170933c;

    /* renamed from: d */
    private static volatile bxxk f170934d;

    /* renamed from: a */
    public int f170935a;

    /* renamed from: b */
    public int f170936b;

    static {
        bzpm bzpm = new bzpm();
        f170933c = bzpm;
        bxvk.m124024a(bzpm.class, bzpm);
    }

    private bzpm() {
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
            return bxvk.m124022a(f170933c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", bzpn.f170937a});
        } else if (i2 == 3) {
            return new bzpm();
        } else {
            if (i2 == 4) {
                return new bxvd(f170933c);
            }
            if (i2 == 5) {
                return f170933c;
            }
            bxxk bxxk = f170934d;
            if (bxxk == null) {
                synchronized (bzpm.class) {
                    bxxk = f170934d;
                    if (bxxk == null) {
                        bxxk = new bxve(f170933c);
                        f170934d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
