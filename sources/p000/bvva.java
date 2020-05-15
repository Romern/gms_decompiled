package p000;

/* renamed from: bvva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvva extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bvva f157773e;

    /* renamed from: f */
    private static volatile bxxk f157774f;

    /* renamed from: a */
    public int f157775a;

    /* renamed from: b */
    public int f157776b;

    /* renamed from: c */
    public String f157777c = "";

    /* renamed from: d */
    public ByteString f157778d = ByteString.f164797b;

    static {
        bvva bvva = new bvva();
        f157773e = bvva;
        GeneratedMessageLite.m124024a(bvva.class, bvva);
    }

    private bvva() {
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
            return GeneratedMessageLite.m124022a(f157773e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bvva();
        } else {
            if (i2 == 4) {
                return new bxvd(f157773e);
            }
            if (i2 == 5) {
                return f157773e;
            }
            bxxk bxxk = f157774f;
            if (bxxk == null) {
                synchronized (bvva.class) {
                    bxxk = f157774f;
                    if (bxxk == null) {
                        bxxk = new bxve(f157773e);
                        f157774f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
