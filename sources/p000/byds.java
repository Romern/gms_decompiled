package p000;

/* renamed from: byds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byds extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final byds f165840a;

    /* renamed from: k */
    private static volatile bxxk f165841k;

    /* renamed from: b */
    private int f165842b;

    /* renamed from: c */
    private bydt f165843c;

    /* renamed from: d */
    private bydl f165844d;

    /* renamed from: e */
    private bydr f165845e;

    /* renamed from: f */
    private bydn f165846f;

    /* renamed from: g */
    private bydo f165847g;

    /* renamed from: h */
    private bydp f165848h;

    /* renamed from: i */
    private bydq f165849i;

    /* renamed from: j */
    private byte f165850j = 2;

    static {
        byds byds = new byds();
        f165840a = byds;
        GeneratedMessageLite.m124024a(byds.class, byds);
    }

    private byds() {
        ByteString bxtx = bxtx.f164797b;
        bxxn bxxn = bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165850j);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165850j = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f165840a, "\u0001\u0007\u0000\u0001\u000f\u0015\u0007\u0000\u0000\u0007\u000fᐉ\r\u0010ᐉ\u000e\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u0011\u0014ᐉ\u0012\u0015ᐉ\u0013", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new byds();
        } else {
            if (i2 == 4) {
                return new bxvd(f165840a);
            }
            if (i2 == 5) {
                return f165840a;
            }
            bxxk bxxk = f165841k;
            if (bxxk == null) {
                synchronized (byds.class) {
                    bxxk = f165841k;
                    if (bxxk == null) {
                        bxxk = new bxve(f165840a);
                        f165841k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
