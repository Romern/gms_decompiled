package p000;

/* renamed from: cblq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblq extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final cblq f177552c;

    /* renamed from: d */
    private static volatile bxxk f177553d;

    /* renamed from: a */
    public cbji f177554a;

    /* renamed from: b */
    public cblx f177555b;

    static {
        cblq cblq = new cblq();
        f177552c = cblq;
        GeneratedMessageLite.m124024a(cblq.class, cblq);
    }

    private cblq() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f177552c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0003\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cblq();
        } else {
            if (i2 == 4) {
                return new bxvd(f177552c);
            }
            if (i2 == 5) {
                return f177552c;
            }
            bxxk bxxk = f177553d;
            if (bxxk == null) {
                synchronized (cblq.class) {
                    bxxk = f177553d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177552c);
                        f177553d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
