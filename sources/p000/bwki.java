package p000;

/* renamed from: bwki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwki extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bwki f159970e;

    /* renamed from: g */
    private static volatile bxxk f159971g;

    /* renamed from: a */
    public int f159972a;

    /* renamed from: b */
    public bwkh f159973b;

    /* renamed from: c */
    public bxwc f159974c = bxxn.f165040b;

    /* renamed from: d */
    public ByteString f159975d = ByteString.f164797b;

    /* renamed from: f */
    private bmav f159976f;

    static {
        bwki bwki = new bwki();
        f159970e = bwki;
        GeneratedMessageLite.m124024a(bwki.class, bwki);
    }

    private bwki() {
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
            return GeneratedMessageLite.m124022a(f159970e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004\u001b\u0005ည\u0003", new Object[]{"a", "f", "b", "c", bwkk.class, "d"});
        } else if (i2 == 3) {
            return new bwki();
        } else {
            if (i2 == 4) {
                return new bxvd(f159970e);
            }
            if (i2 == 5) {
                return f159970e;
            }
            bxxk bxxk = f159971g;
            if (bxxk == null) {
                synchronized (bwki.class) {
                    bxxk = f159971g;
                    if (bxxk == null) {
                        bxxk = new bxve(f159970e);
                        f159971g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
