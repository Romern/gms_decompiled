package p000;

/* renamed from: bmsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmsx extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmsx f130780i;

    /* renamed from: j */
    private static volatile bxxk f130781j;

    /* renamed from: a */
    public ByteString f130782a = ByteString.f164797b;

    /* renamed from: b */
    public ByteString f130783b = ByteString.f164797b;

    /* renamed from: c */
    public ByteString f130784c = ByteString.f164797b;

    /* renamed from: d */
    public ByteString f130785d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f130786e = ByteString.f164797b;

    /* renamed from: f */
    public ByteString f130787f = ByteString.f164797b;

    /* renamed from: g */
    public ByteString f130788g = ByteString.f164797b;

    /* renamed from: h */
    public ByteString f130789h = ByteString.f164797b;

    static {
        bmsx bmsx = new bmsx();
        f130780i = bmsx;
        GeneratedMessageLite.m124024a(bmsx.class, bmsx);
    }

    private bmsx() {
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
            return GeneratedMessageLite.m124022a(f130780i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i2 == 3) {
            return new bmsx();
        } else {
            if (i2 == 4) {
                return new bxvd(f130780i);
            }
            if (i2 == 5) {
                return f130780i;
            }
            bxxk bxxk = f130781j;
            if (bxxk == null) {
                synchronized (bmsx.class) {
                    bxxk = f130781j;
                    if (bxxk == null) {
                        bxxk = new bxve(f130780i);
                        f130781j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
