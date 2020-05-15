package p000;

/* renamed from: btmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btmu f149546d;

    /* renamed from: e */
    private static volatile bxxk f149547e;

    /* renamed from: a */
    public int f149548a;

    /* renamed from: b */
    public ByteString f149549b = ByteString.f164797b;

    /* renamed from: c */
    public btms f149550c;

    static {
        btmu btmu = new btmu();
        f149546d = btmu;
        GeneratedMessageLite.m124024a(btmu.class, btmu);
    }

    private btmu() {
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
            return GeneratedMessageLite.m124022a(f149546d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0003\n\u0004\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btmu();
        } else {
            if (i2 == 4) {
                return new bxvd(f149546d);
            }
            if (i2 == 5) {
                return f149546d;
            }
            bxxk bxxk = f149547e;
            if (bxxk == null) {
                synchronized (btmu.class) {
                    bxxk = f149547e;
                    if (bxxk == null) {
                        bxxk = new bxve(f149546d);
                        f149547e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
