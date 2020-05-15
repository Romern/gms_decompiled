package p000;

/* renamed from: byze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byze extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byze f169064e;

    /* renamed from: f */
    private static volatile bxxk f169065f;

    /* renamed from: a */
    public int f169066a;

    /* renamed from: b */
    public byzh f169067b;

    /* renamed from: c */
    public ByteString f169068c = ByteString.f164797b;

    /* renamed from: d */
    public long f169069d;

    static {
        byze byze = new byze();
        f169064e = byze;
        GeneratedMessageLite.m124024a(byze.class, byze);
    }

    private byze() {
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
            return GeneratedMessageLite.m124022a(f169064e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0000\u0003ည\u0001\u0004ဂ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new byze();
        } else {
            if (i2 == 4) {
                return new bxvd(f169064e);
            }
            if (i2 == 5) {
                return f169064e;
            }
            bxxk bxxk = f169065f;
            if (bxxk == null) {
                synchronized (byze.class) {
                    bxxk = f169065f;
                    if (bxxk == null) {
                        bxxk = new bxve(f169064e);
                        f169065f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
