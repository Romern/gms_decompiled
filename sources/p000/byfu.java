package p000;

/* renamed from: byfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byfu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byfu f166067b;

    /* renamed from: c */
    private static volatile bxxk f166068c;

    /* renamed from: a */
    public bxwc f166069a = bxxn.f165040b;

    static {
        byfu byfu = new byfu();
        f166067b = byfu;
        GeneratedMessageLite.m124024a(byfu.class, byfu);
    }

    private byfu() {
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
            return GeneratedMessageLite.m124022a(f166067b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", byfv.class});
        } else if (i2 == 3) {
            return new byfu();
        } else {
            if (i2 == 4) {
                return new bxvd(f166067b);
            }
            if (i2 == 5) {
                return f166067b;
            }
            bxxk bxxk = f166068c;
            if (bxxk == null) {
                synchronized (byfu.class) {
                    bxxk = f166068c;
                    if (bxxk == null) {
                        bxxk = new bxve(f166067b);
                        f166068c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
