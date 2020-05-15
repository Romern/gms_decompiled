package p000;

/* renamed from: bmsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bmsk f130694b;

    /* renamed from: d */
    private static volatile bxxk f130695d;

    /* renamed from: a */
    public bxwc f130696a = bxxn.f165040b;

    /* renamed from: c */
    private byte f130697c = 2;

    static {
        bmsk bmsk = new bmsk();
        f130694b = bmsk;
        bxvk.m124024a(bmsk.class, bmsk);
    }

    private bmsk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f130697c);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f130697c = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f130694b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", bmfq.class});
        } else if (i2 == 3) {
            return new bmsk();
        } else {
            if (i2 == 4) {
                return new bxvd(f130694b);
            }
            if (i2 == 5) {
                return f130694b;
            }
            bxxk bxxk = f130695d;
            if (bxxk == null) {
                synchronized (bmsk.class) {
                    bxxk = f130695d;
                    if (bxxk == null) {
                        bxxk = new bxve(f130694b);
                        f130695d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
