package p000;

/* renamed from: cbhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhk extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final cbhk f177138d;

    /* renamed from: e */
    private static volatile bxxk f177139e;

    /* renamed from: a */
    public cbhx f177140a;

    /* renamed from: b */
    public cbhx f177141b;

    /* renamed from: c */
    public cbhy f177142c;

    static {
        cbhk cbhk = new cbhk();
        f177138d = cbhk;
        GeneratedMessageLite.m124024a(cbhk.class, cbhk);
    }

    private cbhk() {
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
            return GeneratedMessageLite.m124022a(f177138d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbhk();
        } else {
            if (i2 == 4) {
                return new bxvd(f177138d);
            }
            if (i2 == 5) {
                return f177138d;
            }
            bxxk bxxk = f177139e;
            if (bxxk == null) {
                synchronized (cbhk.class) {
                    bxxk = f177139e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177138d);
                        f177139e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
