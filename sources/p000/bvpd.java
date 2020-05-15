package p000;

/* renamed from: bvpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvpd extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bvpd f157270b;

    /* renamed from: c */
    private static volatile bxxk f157271c;

    /* renamed from: a */
    public bxwc f157272a = bxxn.f165040b;

    static {
        bvpd bvpd = new bvpd();
        f157270b = bvpd;
        GeneratedMessageLite.m124024a(bvpd.class, bvpd);
    }

    private bvpd() {
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
            return GeneratedMessageLite.m124022a(f157270b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bvpc.class});
        } else if (i2 == 3) {
            return new bvpd();
        } else {
            if (i2 == 4) {
                return new bxvd(f157270b);
            }
            if (i2 == 5) {
                return f157270b;
            }
            bxxk bxxk = f157271c;
            if (bxxk == null) {
                synchronized (bvpd.class) {
                    bxxk = f157271c;
                    if (bxxk == null) {
                        bxxk = new bxve(f157270b);
                        f157271c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
