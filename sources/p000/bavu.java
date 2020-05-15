package p000;

/* renamed from: bavu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bavu extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bavu f101935d;

    /* renamed from: e */
    private static volatile bxxk f101936e;

    /* renamed from: a */
    public int f101937a;

    /* renamed from: b */
    public String f101938b = "";

    /* renamed from: c */
    public int f101939c;

    static {
        bavu bavu = new bavu();
        f101935d = bavu;
        GeneratedMessageLite.m124024a(bavu.class, bavu);
    }

    private bavu() {
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
            return GeneratedMessageLite.m124022a(f101935d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဈ\u0000\u0005ဌ\u0001", new Object[]{"a", "b", "c", bavq.m87610b()});
        } else if (i2 == 3) {
            return new bavu();
        } else {
            if (i2 == 4) {
                return new bxvd(f101935d);
            }
            if (i2 == 5) {
                return f101935d;
            }
            bxxk bxxk = f101936e;
            if (bxxk == null) {
                synchronized (bavu.class) {
                    bxxk = f101936e;
                    if (bxxk == null) {
                        bxxk = new bxve(f101935d);
                        f101936e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
