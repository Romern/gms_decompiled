package p000;

/* renamed from: camb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class camb extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final camb f175235c;

    /* renamed from: e */
    private static volatile bxxk f175236e;

    /* renamed from: a */
    public bxwc f175237a = bxxn.f165040b;

    /* renamed from: b */
    public boolean f175238b;

    /* renamed from: d */
    private int f175239d;

    static {
        camb camb = new camb();
        f175235c = camb;
        GeneratedMessageLite.m124024a(camb.class, camb);
    }

    private camb() {
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
            return GeneratedMessageLite.m124022a(f175235c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004ဇ\u0000", new Object[]{"d", "a", camd.class, "b"});
        } else if (i2 == 3) {
            return new camb();
        } else {
            if (i2 == 4) {
                return new bxvd(f175235c);
            }
            if (i2 == 5) {
                return f175235c;
            }
            bxxk bxxk = f175236e;
            if (bxxk == null) {
                synchronized (camb.class) {
                    bxxk = f175236e;
                    if (bxxk == null) {
                        bxxk = new bxve(f175235c);
                        f175236e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
