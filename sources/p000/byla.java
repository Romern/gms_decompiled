package p000;

/* renamed from: byla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byla extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byla f166805d;

    /* renamed from: e */
    private static volatile bxxk f166806e;

    /* renamed from: a */
    public int f166807a;

    /* renamed from: b */
    public bykf f166808b;

    /* renamed from: c */
    public bykh f166809c;

    static {
        byla byla = new byla();
        f166805d = byla;
        GeneratedMessageLite.m124024a(byla.class, byla);
    }

    private byla() {
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
            return GeneratedMessageLite.m124022a(f166805d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byla();
        } else {
            if (i2 == 4) {
                return new bxvd(f166805d);
            }
            if (i2 == 5) {
                return f166805d;
            }
            bxxk bxxk = f166806e;
            if (bxxk == null) {
                synchronized (byla.class) {
                    bxxk = f166806e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166805d);
                        f166806e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
