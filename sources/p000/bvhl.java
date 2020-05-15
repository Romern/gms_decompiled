package p000;

/* renamed from: bvhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvhl extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bvhl f156085g;

    /* renamed from: h */
    private static volatile bxxk f156086h;

    /* renamed from: a */
    public int f156087a;

    /* renamed from: b */
    public long f156088b;

    /* renamed from: c */
    public String f156089c = "";

    /* renamed from: d */
    public String f156090d = "";

    /* renamed from: e */
    public bxwc f156091e = bxxn.f165040b;

    /* renamed from: f */
    public ByteString f156092f = ByteString.f164797b;

    static {
        bvhl bvhl = new bvhl();
        f156085g = bvhl;
        GeneratedMessageLite.m124024a(bvhl.class, bvhl);
    }

    private bvhl() {
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
            return GeneratedMessageLite.m124022a(f156085g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b\u0006ည\u0004", new Object[]{"a", "b", "c", "d", "e", bvhj.class, "f"});
        } else if (i2 == 3) {
            return new bvhl();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f156085g;
            }
            bxxk bxxk = f156086h;
            if (bxxk == null) {
                synchronized (bvhl.class) {
                    bxxk = f156086h;
                    if (bxxk == null) {
                        bxxk = new bxve(f156085g);
                        f156086h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
