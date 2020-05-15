package p000;

/* renamed from: bshv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bshv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bshv f144631d;

    /* renamed from: e */
    private static volatile bxxk f144632e;

    /* renamed from: a */
    public String f144633a = "";

    /* renamed from: b */
    public ByteString f144634b = ByteString.f164797b;

    /* renamed from: c */
    public bsib f144635c;

    static {
        bshv bshv = new bshv();
        f144631d = bshv;
        GeneratedMessageLite.m124024a(bshv.class, bshv);
    }

    private bshv() {
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
            return GeneratedMessageLite.m124022a(f144631d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bshv();
        } else {
            if (i2 == 4) {
                return new bxvd(f144631d);
            }
            if (i2 == 5) {
                return f144631d;
            }
            bxxk bxxk = f144632e;
            if (bxxk == null) {
                synchronized (bshv.class) {
                    bxxk = f144632e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144631d);
                        f144632e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
