package p000;

/* renamed from: btkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkt extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final btkt f149301l;

    /* renamed from: m */
    private static volatile bxxk f149302m;

    /* renamed from: a */
    public int f149303a = 0;

    /* renamed from: b */
    public Object f149304b;

    /* renamed from: c */
    public int f149305c;

    /* renamed from: d */
    public long f149306d;

    /* renamed from: e */
    public ByteString f149307e = ByteString.f164797b;

    /* renamed from: f */
    public bxvt f149308f = bxvm.f164965b;

    /* renamed from: g */
    public btkr f149309g;

    /* renamed from: h */
    public btkp f149310h;

    /* renamed from: i */
    public String f149311i = "";

    /* renamed from: j */
    public String f149312j = "";

    /* renamed from: k */
    public ByteString f149313k = ByteString.f164797b;

    static {
        btkt btkt = new btkt();
        f149301l = btkt;
        GeneratedMessageLite.m124024a(btkt.class, btkt);
    }

    private btkt() {
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
            return GeneratedMessageLite.m124022a(f149301l, "\u0000\u000b\u0001\u0000\u0001\f\u000b\u0000\u0001\u0000\u0001\f\u0002\u0002\u0003\n\u0004<\u0000\u0005<\u0000\u0006,\u0007\t\bȈ\tȈ\n\t\f\n", new Object[]{"b", "a", "c", "d", "e", btks.class, btkq.class, "f", "g", "i", "j", "h", "k"});
        } else if (i2 == 3) {
            return new btkt();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f149301l;
            }
            bxxk bxxk = f149302m;
            if (bxxk == null) {
                synchronized (btkt.class) {
                    bxxk = f149302m;
                    if (bxxk == null) {
                        bxxk = new bxve(f149301l);
                        f149302m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
