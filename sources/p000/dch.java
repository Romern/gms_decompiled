package p000;

/* renamed from: dch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dch extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final dch f12805e;

    /* renamed from: f */
    private static volatile bxxk f12806f;

    /* renamed from: a */
    public int f12807a;

    /* renamed from: b */
    public dci f12808b;

    /* renamed from: c */
    public ByteString f12809c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f12810d = ByteString.f164797b;

    static {
        dch dch = new dch();
        f12805e = dch;
        GeneratedMessageLite.m124024a(dch.class, dch);
    }

    private dch() {
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
            return GeneratedMessageLite.m124022a(f12805e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new dch();
        } else {
            if (i2 == 4) {
                return new bxvd(f12805e);
            }
            if (i2 == 5) {
                return f12805e;
            }
            bxxk bxxk = f12806f;
            if (bxxk == null) {
                synchronized (dch.class) {
                    bxxk = f12806f;
                    if (bxxk == null) {
                        bxxk = new bxve(f12805e);
                        f12806f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
