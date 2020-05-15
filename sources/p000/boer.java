package p000;

/* renamed from: boer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boer extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boer f132825d;

    /* renamed from: e */
    private static volatile bxxk f132826e;

    /* renamed from: a */
    public int f132827a;

    /* renamed from: b */
    public boolean f132828b;

    /* renamed from: c */
    public int f132829c = 1;

    static {
        boer boer = new boer();
        f132825d = boer;
        GeneratedMessageLite.m124024a(boer.class, boer);
    }

    private boer() {
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
            return GeneratedMessageLite.m124022a(f132825d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", boeq.f132824a});
        } else if (i2 == 3) {
            return new boer();
        } else {
            if (i2 == 4) {
                return new bxvd(f132825d);
            }
            if (i2 == 5) {
                return f132825d;
            }
            bxxk bxxk = f132826e;
            if (bxxk == null) {
                synchronized (boer.class) {
                    bxxk = f132826e;
                    if (bxxk == null) {
                        bxxk = new bxve(f132825d);
                        f132826e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
