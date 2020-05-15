package p000;

/* renamed from: cbfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbfw f176979c;

    /* renamed from: d */
    private static volatile bxxk f176980d;

    /* renamed from: a */
    public String f176981a = "";

    /* renamed from: b */
    public cbfu f176982b;

    static {
        cbfw cbfw = new cbfw();
        f176979c = cbfw;
        bxvk.m124024a(cbfw.class, cbfw);
    }

    private cbfw() {
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
            return bxvk.m124022a(f176979c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbfw();
        } else {
            if (i2 == 4) {
                return new bxvd(f176979c);
            }
            if (i2 == 5) {
                return f176979c;
            }
            bxxk bxxk = f176980d;
            if (bxxk == null) {
                synchronized (cbfw.class) {
                    bxxk = f176980d;
                    if (bxxk == null) {
                        bxxk = new bxve(f176979c);
                        f176980d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
