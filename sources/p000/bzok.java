package p000;

/* renamed from: bzok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzok extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bzok f170824c;

    /* renamed from: f */
    private static volatile bxxk f170825f;

    /* renamed from: a */
    public String f170826a = "";

    /* renamed from: b */
    public String f170827b = "";

    /* renamed from: d */
    private byds f170828d;

    /* renamed from: e */
    private byte f170829e = 2;

    static {
        bzok bzok = new bzok();
        f170824c = bzok;
        GeneratedMessageLite.m124024a(bzok.class, bzok);
    }

    private bzok() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170829e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170829e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170824c, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0000\u0001\u0001Ȉ\u0004Ȉ\u0007Љ", new Object[]{"a", "b", "d"});
        } else if (i2 == 3) {
            return new bzok();
        } else {
            if (i2 == 4) {
                return new bxvd(f170824c);
            }
            if (i2 == 5) {
                return f170824c;
            }
            bxxk bxxk = f170825f;
            if (bxxk == null) {
                synchronized (bzok.class) {
                    bxxk = f170825f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170824c);
                        f170825f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
