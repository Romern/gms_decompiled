package p000;

/* renamed from: bxob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxob extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bxob f164129b;

    /* renamed from: d */
    private static volatile bxxk f164130d;

    /* renamed from: a */
    public String f164131a = "";

    /* renamed from: c */
    private int f164132c;

    static {
        bxob bxob = new bxob();
        f164129b = bxob;
        GeneratedMessageLite.m124024a(bxob.class, bxob);
    }

    private bxob() {
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
            return GeneratedMessageLite.m124022a(f164129b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bxob();
        } else {
            if (i2 == 4) {
                return new bxvd(f164129b);
            }
            if (i2 == 5) {
                return f164129b;
            }
            bxxk bxxk = f164130d;
            if (bxxk == null) {
                synchronized (bxob.class) {
                    bxxk = f164130d;
                    if (bxxk == null) {
                        bxxk = new bxve(f164129b);
                        f164130d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
