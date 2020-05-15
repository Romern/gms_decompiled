package p000;

/* renamed from: bpvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpvn extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bpvn f139389h;

    /* renamed from: i */
    private static volatile bxxk f139390i;

    /* renamed from: a */
    public int f139391a;

    /* renamed from: b */
    public int f139392b;

    /* renamed from: c */
    public String f139393c = "";

    /* renamed from: d */
    public ByteString f139394d = ByteString.f164797b;

    /* renamed from: e */
    public int f139395e;

    /* renamed from: f */
    public int f139396f;

    /* renamed from: g */
    public int f139397g;

    static {
        bpvn bpvn = new bpvn();
        f139389h = bpvn;
        GeneratedMessageLite.m124024a(bpvn.class, bpvn);
    }

    private bpvn() {
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
            return GeneratedMessageLite.m124022a(f139389h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004င\u0004\u0005င\u0005\u0006ည\u0002\u0007ဌ\u0006", new Object[]{"a", "b", "c", "e", "f", "d", "g", sgj.m35207b()});
        } else if (i2 == 3) {
            return new bpvn();
        } else {
            if (i2 == 4) {
                return new bxvd(f139389h);
            }
            if (i2 == 5) {
                return f139389h;
            }
            bxxk bxxk = f139390i;
            if (bxxk == null) {
                synchronized (bpvn.class) {
                    bxxk = f139390i;
                    if (bxxk == null) {
                        bxxk = new bxve(f139389h);
                        f139390i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
