package p000;

/* renamed from: btse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btse extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final btse f150191c;

    /* renamed from: d */
    private static volatile bxxk f150192d;

    /* renamed from: a */
    public int f150193a;

    /* renamed from: b */
    public ByteString f150194b = ByteString.f164797b;

    static {
        btse btse = new btse();
        f150191c = btse;
        GeneratedMessageLite.m124024a(btse.class, btse);
    }

    private btse() {
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
            return GeneratedMessageLite.m124022a(f150191c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btse();
        } else {
            if (i2 == 4) {
                return new bxvd(f150191c);
            }
            if (i2 == 5) {
                return f150191c;
            }
            bxxk bxxk = f150192d;
            if (bxxk == null) {
                synchronized (btse.class) {
                    bxxk = f150192d;
                    if (bxxk == null) {
                        bxxk = new bxve(f150191c);
                        f150192d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
