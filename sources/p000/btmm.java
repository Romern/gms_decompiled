package p000;

/* renamed from: btmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btmm extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btmm f149510f;

    /* renamed from: g */
    private static volatile bxxk f149511g;

    /* renamed from: a */
    public int f149512a = 0;

    /* renamed from: b */
    public Object f149513b;

    /* renamed from: c */
    public btiy f149514c;

    /* renamed from: d */
    public String f149515d = "";

    /* renamed from: e */
    public ByteString f149516e = ByteString.f164797b;

    static {
        btmm btmm = new btmm();
        f149510f = btmm;
        GeneratedMessageLite.m124024a(btmm.class, btmm);
    }

    private btmm() {
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
            return GeneratedMessageLite.m124022a(f149510f, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002Ȼ\u0000\u0003Ȉ\u0004\n\u0005Ȼ\u0000", new Object[]{"b", "a", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btmm();
        } else {
            if (i2 == 4) {
                return new bxvd(f149510f);
            }
            if (i2 == 5) {
                return f149510f;
            }
            bxxk bxxk = f149511g;
            if (bxxk == null) {
                synchronized (btmm.class) {
                    bxxk = f149511g;
                    if (bxxk == null) {
                        bxxk = new bxve(f149510f);
                        f149511g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
