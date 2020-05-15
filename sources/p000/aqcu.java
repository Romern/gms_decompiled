package p000;

/* renamed from: aqcu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcu extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final aqcu f85707e;

    /* renamed from: g */
    private static volatile bxxk f85708g;

    /* renamed from: a */
    public long f85709a;

    /* renamed from: b */
    public int f85710b;

    /* renamed from: c */
    public int f85711c;

    /* renamed from: d */
    public ByteString f85712d = ByteString.f164797b;

    /* renamed from: f */
    private int f85713f;

    static {
        aqcu aqcu = new aqcu();
        f85707e = aqcu;
        GeneratedMessageLite.m124024a(aqcu.class, aqcu);
    }

    private aqcu() {
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
            return GeneratedMessageLite.m124022a(f85707e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001\u0003င\u0002\u0004ည\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqcu();
        } else {
            if (i2 == 4) {
                return new bxvd(f85707e);
            }
            if (i2 == 5) {
                return f85707e;
            }
            bxxk bxxk = f85708g;
            if (bxxk == null) {
                synchronized (aqcu.class) {
                    bxxk = f85708g;
                    if (bxxk == null) {
                        bxxk = new bxve(f85707e);
                        f85708g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
