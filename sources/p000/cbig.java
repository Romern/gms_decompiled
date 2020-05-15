package p000;

/* renamed from: cbig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbig extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbig f177238c;

    /* renamed from: d */
    private static volatile bxxk f177239d;

    /* renamed from: a */
    public cbhj f177240a;

    /* renamed from: b */
    public cbhj f177241b;

    static {
        cbig cbig = new cbig();
        f177238c = cbig;
        GeneratedMessageLite.m124024a(cbig.class, cbig);
    }

    private cbig() {
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
            return GeneratedMessageLite.m124022a(f177238c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbig();
        } else {
            if (i2 == 4) {
                return new bxvd(f177238c);
            }
            if (i2 == 5) {
                return f177238c;
            }
            bxxk bxxk = f177239d;
            if (bxxk == null) {
                synchronized (cbig.class) {
                    bxxk = f177239d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177238c);
                        f177239d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
