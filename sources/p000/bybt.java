package p000;

/* renamed from: bybt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bybt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bybt f165594d;

    /* renamed from: e */
    private static volatile bxxk f165595e;

    /* renamed from: a */
    public String f165596a = "";

    /* renamed from: b */
    public bxyk f165597b;

    /* renamed from: c */
    public String f165598c = "";

    static {
        bybt bybt = new bybt();
        f165594d = bybt;
        GeneratedMessageLite.m124024a(bybt.class, bybt);
    }

    private bybt() {
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
            return GeneratedMessageLite.m124022a(f165594d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bybt();
        } else {
            if (i2 == 4) {
                return new bxvd(f165594d);
            }
            if (i2 == 5) {
                return f165594d;
            }
            bxxk bxxk = f165595e;
            if (bxxk == null) {
                synchronized (bybt.class) {
                    bxxk = f165595e;
                    if (bxxk == null) {
                        bxxk = new bxve(f165594d);
                        f165595e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
