package p000;

/* renamed from: dje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dje extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final dje f13319b;

    /* renamed from: c */
    private static volatile bxxk f13320c;

    /* renamed from: a */
    public bxwc f13321a = bxxn.f165040b;

    static {
        dje dje = new dje();
        f13319b = dje;
        GeneratedMessageLite.m124024a(dje.class, dje);
    }

    private dje() {
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
            return GeneratedMessageLite.m124022a(f13319b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djd.class});
        } else if (i2 == 3) {
            return new dje();
        } else {
            if (i2 == 4) {
                return new bxvd(f13319b);
            }
            if (i2 == 5) {
                return f13319b;
            }
            bxxk bxxk = f13320c;
            if (bxxk == null) {
                synchronized (dje.class) {
                    bxxk = f13320c;
                    if (bxxk == null) {
                        bxxk = new bxve(f13319b);
                        f13320c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
