package p000;

/* renamed from: bwkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwkl extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bwkl f159983c;

    /* renamed from: d */
    private static volatile bxxk f159984d;

    /* renamed from: a */
    public int f159985a;

    /* renamed from: b */
    public bmaj f159986b;

    static {
        bwkl bwkl = new bwkl();
        f159983c = bwkl;
        GeneratedMessageLite.m124024a(bwkl.class, bwkl);
    }

    private bwkl() {
        ByteString bxtx = bxtx.f164797b;
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
            return GeneratedMessageLite.m124022a(f159983c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwkl();
        } else {
            if (i2 == 4) {
                return new bxvd(f159983c);
            }
            if (i2 == 5) {
                return f159983c;
            }
            bxxk bxxk = f159984d;
            if (bxxk == null) {
                synchronized (bwkl.class) {
                    bxxk = f159984d;
                    if (bxxk == null) {
                        bxxk = new bxve(f159983c);
                        f159984d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
