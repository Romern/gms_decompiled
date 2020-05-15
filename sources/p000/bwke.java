package p000;

/* renamed from: bwke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwke extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bwke f159958f;

    /* renamed from: g */
    private static volatile bxxk f159959g;

    /* renamed from: a */
    public int f159960a;

    /* renamed from: b */
    public bmaj f159961b;

    /* renamed from: c */
    public int f159962c;

    /* renamed from: d */
    public ByteString f159963d = ByteString.f164797b;

    /* renamed from: e */
    public ByteString f159964e = ByteString.f164797b;

    static {
        bwke bwke = new bwke();
        f159958f = bwke;
        GeneratedMessageLite.m124024a(bwke.class, bwke);
    }

    private bwke() {
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
            return GeneratedMessageLite.m124022a(f159958f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", bwkd.f159957a, "d", "e"});
        } else if (i2 == 3) {
            return new bwke();
        } else {
            if (i2 == 4) {
                return new bxvd(f159958f);
            }
            if (i2 == 5) {
                return f159958f;
            }
            bxxk bxxk = f159959g;
            if (bxxk == null) {
                synchronized (bwke.class) {
                    bxxk = f159959g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159958f);
                        f159959g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
