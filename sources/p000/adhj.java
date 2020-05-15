package p000;

/* renamed from: adhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhj extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final adhj f61710c;

    /* renamed from: d */
    private static volatile bxxk f61711d;

    /* renamed from: a */
    public int f61712a;

    /* renamed from: b */
    public int f61713b;

    static {
        adhj adhj = new adhj();
        f61710c = adhj;
        GeneratedMessageLite.m124024a(adhj.class, adhj);
    }

    private adhj() {
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
            return GeneratedMessageLite.m124022a(f61710c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new adhj();
        } else {
            if (i2 == 4) {
                return new bxvd(f61710c);
            }
            if (i2 == 5) {
                return f61710c;
            }
            bxxk bxxk = f61711d;
            if (bxxk == null) {
                synchronized (adhj.class) {
                    bxxk = f61711d;
                    if (bxxk == null) {
                        bxxk = new bxve(f61710c);
                        f61711d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
