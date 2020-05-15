package p000;

/* renamed from: btyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btyc extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final btyc f152879d;

    /* renamed from: e */
    private static volatile bxxk f152880e;

    /* renamed from: a */
    public int f152881a;

    /* renamed from: b */
    public String f152882b = "";

    /* renamed from: c */
    public String f152883c = "";

    static {
        btyc btyc = new btyc();
        f152879d = btyc;
        GeneratedMessageLite.m124024a(btyc.class, btyc);
    }

    private btyc() {
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
            return GeneratedMessageLite.m124022a(f152879d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btyc();
        } else {
            if (i2 == 4) {
                return new bxvd(f152879d);
            }
            if (i2 == 5) {
                return f152879d;
            }
            bxxk bxxk = f152880e;
            if (bxxk == null) {
                synchronized (btyc.class) {
                    bxxk = f152880e;
                    if (bxxk == null) {
                        bxxk = new bxve(f152879d);
                        f152880e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
