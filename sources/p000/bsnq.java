package p000;

/* renamed from: bsnq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsnq extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bsnq f146315f;

    /* renamed from: g */
    private static volatile bxxk f146316g;

    /* renamed from: a */
    public ByteString f146317a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f146318b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f146319c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f146320d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f146321e = ByteString.f164797b;

    static {
        bsnq bsnq = new bsnq();
        f146315f = bsnq;
        GeneratedMessageLite.m124024a(bsnq.class, bsnq);
    }

    private bsnq() {
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
            return GeneratedMessageLite.m124022a(f146315f, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002\n\u0003\n\u0004\n\u0005\n\u0006\n", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bsnq();
        } else {
            if (i2 == 4) {
                return new bxvd(f146315f);
            }
            if (i2 == 5) {
                return f146315f;
            }
            bxxk bxxk = f146316g;
            if (bxxk == null) {
                synchronized (bsnq.class) {
                    bxxk = f146316g;
                    if (bxxk == null) {
                        bxxk = new bxve(f146315f);
                        f146316g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
