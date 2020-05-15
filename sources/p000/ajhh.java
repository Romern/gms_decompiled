package p000;

/* renamed from: ajhh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajhh extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final ajhh f70628f;

    /* renamed from: g */
    private static volatile bxxk f70629g;

    /* renamed from: a */
    public int f70630a;

    /* renamed from: b */
    public String f70631b = "";

    /* renamed from: c */
    public String f70632c = "";

    /* renamed from: d */
    public String f70633d = "";

    /* renamed from: e */
    public ByteString f70634e = ByteString.f164797b;

    static {
        ajhh ajhh = new ajhh();
        f70628f = ajhh;
        GeneratedMessageLite.m124024a(ajhh.class, ajhh);
    }

    private ajhh() {
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
            return GeneratedMessageLite.m124022a(f70628f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ajhh();
        } else {
            if (i2 == 4) {
                return new bxvd(f70628f);
            }
            if (i2 == 5) {
                return f70628f;
            }
            bxxk bxxk = f70629g;
            if (bxxk == null) {
                synchronized (ajhh.class) {
                    bxxk = f70629g;
                    if (bxxk == null) {
                        bxxk = new bxve(f70628f);
                        f70629g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
