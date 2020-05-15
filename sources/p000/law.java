package p000;

/* renamed from: law */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class law extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final law f25629c;

    /* renamed from: d */
    private static volatile bxxk f25630d;

    /* renamed from: a */
    public int f25631a;

    /* renamed from: b */
    public int f25632b;

    static {
        law law = new law();
        f25629c = law;
        GeneratedMessageLite.m124024a(law.class, law);
    }

    private law() {
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
            return GeneratedMessageLite.m124022a(f25629c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new law();
        } else {
            if (i2 == 4) {
                return new bxvd(f25629c);
            }
            if (i2 == 5) {
                return f25629c;
            }
            bxxk bxxk = f25630d;
            if (bxxk == null) {
                synchronized (law.class) {
                    bxxk = f25630d;
                    if (bxxk == null) {
                        bxxk = new bxve(f25629c);
                        f25630d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
