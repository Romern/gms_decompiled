package p000;

/* renamed from: bqli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqli extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bqli f141098e;

    /* renamed from: f */
    private static volatile bxxk f141099f;

    /* renamed from: a */
    public String f141100a = "";

    /* renamed from: b */
    public bqlr f141101b;

    /* renamed from: c */
    public String f141102c = "";

    /* renamed from: d */
    public String f141103d = "";

    static {
        bqli bqli = new bqli();
        f141098e = bqli;
        GeneratedMessageLite.m124024a(bqli.class, bqli);
    }

    private bqli() {
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
            return GeneratedMessageLite.m124022a(f141098e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bqli();
        } else {
            if (i2 == 4) {
                return new bxvd(f141098e);
            }
            if (i2 == 5) {
                return f141098e;
            }
            bxxk bxxk = f141099f;
            if (bxxk == null) {
                synchronized (bqli.class) {
                    bxxk = f141099f;
                    if (bxxk == null) {
                        bxxk = new bxve(f141098e);
                        f141099f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
