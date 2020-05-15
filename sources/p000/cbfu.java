package p000;

/* renamed from: cbfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbfu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbfu f176973b;

    /* renamed from: c */
    private static volatile bxxk f176974c;

    /* renamed from: a */
    public bxwc f176975a = bxxn.f165040b;

    static {
        cbfu cbfu = new cbfu();
        f176973b = cbfu;
        GeneratedMessageLite.m124024a(cbfu.class, cbfu);
    }

    private cbfu() {
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
            return GeneratedMessageLite.m124022a(f176973b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", cbfy.class});
        } else if (i2 == 3) {
            return new cbfu();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f176973b;
            }
            bxxk bxxk = f176974c;
            if (bxxk == null) {
                synchronized (cbfu.class) {
                    bxxk = f176974c;
                    if (bxxk == null) {
                        bxxk = new bxve(f176973b);
                        f176974c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
