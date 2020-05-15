package p000;

/* renamed from: bmmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmmh extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bmmh f130011c;

    /* renamed from: e */
    private static volatile bxxk f130012e;

    /* renamed from: a */
    public int f130013a;

    /* renamed from: b */
    public ByteString f130014b = ByteString.f164797b;

    /* renamed from: d */
    private int f130015d;

    static {
        bmmh bmmh = new bmmh();
        f130011c = bmmh;
        GeneratedMessageLite.m124024a(bmmh.class, bmmh);
    }

    private bmmh() {
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
            return GeneratedMessageLite.m124022a(f130011c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"d", "a", bwgz.m121953b(), "b"});
        } else if (i2 == 3) {
            return new bmmh();
        } else {
            if (i2 == 4) {
                return new bxvd(f130011c);
            }
            if (i2 == 5) {
                return f130011c;
            }
            bxxk bxxk = f130012e;
            if (bxxk == null) {
                synchronized (bmmh.class) {
                    bxxk = f130012e;
                    if (bxxk == null) {
                        bxxk = new bxve(f130011c);
                        f130012e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
