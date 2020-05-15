package p000;

/* renamed from: cbhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhg extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cbhg f177127c;

    /* renamed from: d */
    private static volatile bxxk f177128d;

    /* renamed from: a */
    public cbmo f177129a;

    /* renamed from: b */
    public cbhu f177130b;

    static {
        cbhg cbhg = new cbhg();
        f177127c = cbhg;
        GeneratedMessageLite.m124024a(cbhg.class, cbhg);
    }

    private cbhg() {
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
            return GeneratedMessageLite.m124022a(f177127c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbhg();
        } else {
            if (i2 == 4) {
                return new bxvd(f177127c);
            }
            if (i2 == 5) {
                return f177127c;
            }
            bxxk bxxk = f177128d;
            if (bxxk == null) {
                synchronized (cbhg.class) {
                    bxxk = f177128d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177127c);
                        f177128d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
