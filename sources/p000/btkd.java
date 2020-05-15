package p000;

/* renamed from: btkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkd extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final btkd f149233h;

    /* renamed from: i */
    private static volatile bxxk f149234i;

    /* renamed from: a */
    public int f149235a = 0;

    /* renamed from: b */
    public Object f149236b;

    /* renamed from: c */
    public ByteString f149237c = ByteString.f164797b;

    /* renamed from: d */
    public int f149238d;

    /* renamed from: e */
    public int f149239e;

    /* renamed from: f */
    public String f149240f = "";

    /* renamed from: g */
    public btiy f149241g;

    static {
        btkd btkd = new btkd();
        f149233h = btkd;
        GeneratedMessageLite.m124024a(btkd.class, btkd);
    }

    private btkd() {
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
            return GeneratedMessageLite.m124022a(f149233h, "\u0000\u0007\u0001\u0000\u0001\n\u0007\u0000\u0000\u0000\u0001\n\u0002\f\u0003<\u0000\u0004Ȼ\u0000\u0007Ȉ\t\t\n\f", new Object[]{"b", "a", "c", "d", btmo.class, "f", "g", "e"});
        } else if (i2 == 3) {
            return new btkd();
        } else {
            if (i2 == 4) {
                return new bxvd(f149233h);
            }
            if (i2 == 5) {
                return f149233h;
            }
            bxxk bxxk = f149234i;
            if (bxxk == null) {
                synchronized (btkd.class) {
                    bxxk = f149234i;
                    if (bxxk == null) {
                        bxxk = new bxve(f149233h);
                        f149234i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
