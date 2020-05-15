package p000;

/* renamed from: byzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byzt extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final byzt f169171b;

    /* renamed from: d */
    private static volatile bxxk f169172d;

    /* renamed from: a */
    public String f169173a = "";

    /* renamed from: c */
    private int f169174c;

    static {
        byzt byzt = new byzt();
        f169171b = byzt;
        GeneratedMessageLite.m124024a(byzt.class, byzt);
    }

    private byzt() {
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
            return GeneratedMessageLite.m124022a(f169171b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new byzt();
        } else {
            if (i2 == 4) {
                return new bxvd(f169171b);
            }
            if (i2 == 5) {
                return f169171b;
            }
            bxxk bxxk = f169172d;
            if (bxxk == null) {
                synchronized (byzt.class) {
                    bxxk = f169172d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169171b);
                        f169172d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
