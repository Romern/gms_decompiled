package p000;

/* renamed from: btfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btfo extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final btfo f148718l;

    /* renamed from: m */
    private static volatile bxxk f148719m;

    /* renamed from: a */
    public String f148720a = "";

    /* renamed from: b */
    public String f148721b = "";

    /* renamed from: c */
    public String f148722c = "";

    /* renamed from: d */
    public String f148723d = "";

    /* renamed from: e */
    public int f148724e;

    /* renamed from: f */
    public String f148725f = "";

    /* renamed from: g */
    public String f148726g = "";

    /* renamed from: h */
    public String f148727h = "";

    /* renamed from: i */
    public String f148728i = "";

    /* renamed from: j */
    public String f148729j = "";

    /* renamed from: k */
    public int f148730k;

    static {
        btfo btfo = new btfo();
        f148718l = btfo;
        GeneratedMessageLite.m124024a(btfo.class, btfo);
    }

    private btfo() {
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
            return GeneratedMessageLite.m124022a(f148718l, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000b\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new btfo();
        } else {
            if (i2 == 4) {
                return new bxvd(f148718l);
            }
            if (i2 == 5) {
                return f148718l;
            }
            bxxk bxxk = f148719m;
            if (bxxk == null) {
                synchronized (btfo.class) {
                    bxxk = f148719m;
                    if (bxxk == null) {
                        bxxk = new bxve(f148718l);
                        f148719m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
