package p000;

/* renamed from: aqcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcj extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final aqcj f85659g;

    /* renamed from: h */
    private static volatile bxxk f85660h;

    /* renamed from: a */
    public int f85661a;

    /* renamed from: b */
    public int f85662b;

    /* renamed from: c */
    public int f85663c;

    /* renamed from: d */
    public int f85664d;

    /* renamed from: e */
    public ByteString f85665e = ByteString.f164797b;

    /* renamed from: f */
    public aqci f85666f;

    static {
        aqcj aqcj = new aqcj();
        f85659g = aqcj;
        GeneratedMessageLite.m124024a(aqcj.class, aqcj);
    }

    private aqcj() {
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
            return GeneratedMessageLite.m124022a(f85659g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ည\u0003\u0004ဉ\u0004\u0005ဌ\u0002", new Object[]{"a", "b", "c", "e", "f", "d", aqda.m71370b()});
        } else if (i2 == 3) {
            return new aqcj();
        } else {
            if (i2 == 4) {
                return new bxvd(f85659g);
            }
            if (i2 == 5) {
                return f85659g;
            }
            bxxk bxxk = f85660h;
            if (bxxk == null) {
                synchronized (aqcj.class) {
                    bxxk = f85660h;
                    if (bxxk == null) {
                        bxxk = new bxve(f85659g);
                        f85660h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
