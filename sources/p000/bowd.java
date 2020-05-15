package p000;

/* renamed from: bowd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bowd extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bowd f135096f;

    /* renamed from: g */
    private static volatile bxxk f135097g;

    /* renamed from: a */
    public int f135098a;

    /* renamed from: b */
    public int f135099b;

    /* renamed from: c */
    public int f135100c;

    /* renamed from: d */
    public int f135101d;

    /* renamed from: e */
    public int f135102e;

    static {
        bowd bowd = new bowd();
        f135096f = bowd;
        GeneratedMessageLite.m124024a(bowd.class, bowd);
    }

    private bowd() {
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
            return GeneratedMessageLite.m124022a(f135096f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bowd();
        } else {
            if (i2 == 4) {
                return new bxvd(f135096f);
            }
            if (i2 == 5) {
                return f135096f;
            }
            bxxk bxxk = f135097g;
            if (bxxk == null) {
                synchronized (bowd.class) {
                    bxxk = f135097g;
                    if (bxxk == null) {
                        bxxk = new bxve(f135096f);
                        f135097g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
