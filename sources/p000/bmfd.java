package p000;

/* renamed from: bmfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmfd extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmfd f129071d;

    /* renamed from: g */
    private static volatile bxxk f129072g;

    /* renamed from: a */
    public bmdn f129073a;

    /* renamed from: b */
    public bxwc f129074b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f129075c = bxxn.f165040b;

    /* renamed from: e */
    private int f129076e;

    /* renamed from: f */
    private byte f129077f = 2;

    static {
        bmfd bmfd = new bmfd();
        f129071d = bmfd;
        GeneratedMessageLite.m124024a(bmfd.class, bmfd);
    }

    private bmfd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f129077f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f129077f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f129071d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဉ\u0000\u0002Л\u0003\u001b", new Object[]{"e", "a", "b", bmff.class, "c", bmfh.class});
        } else if (i2 == 3) {
            return new bmfd();
        } else {
            if (i2 == 4) {
                return new bxvd(f129071d);
            }
            if (i2 == 5) {
                return f129071d;
            }
            bxxk bxxk = f129072g;
            if (bxxk == null) {
                synchronized (bmfd.class) {
                    bxxk = f129072g;
                    if (bxxk == null) {
                        bxxk = new bxve(f129071d);
                        f129072g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
