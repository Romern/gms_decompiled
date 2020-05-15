package p000;

/* renamed from: byyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyo extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final byyo f168979d;

    /* renamed from: e */
    private static volatile bxxk f168980e;

    /* renamed from: a */
    public int f168981a;

    /* renamed from: b */
    public int f168982b = 6;

    /* renamed from: c */
    public String f168983c = "GCS";

    static {
        byyo byyo = new byyo();
        f168979d = byyo;
        GeneratedMessageLite.m124024a(byyo.class, byyo);
    }

    private byyo() {
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
            return GeneratedMessageLite.m124022a(f168979d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new byyo();
        } else {
            if (i2 == 4) {
                return new byyn();
            }
            if (i2 == 5) {
                return f168979d;
            }
            bxxk bxxk = f168980e;
            if (bxxk == null) {
                synchronized (byyo.class) {
                    bxxk = f168980e;
                    if (bxxk == null) {
                        bxxk = new bxve(f168979d);
                        f168980e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
