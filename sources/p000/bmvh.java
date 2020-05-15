package p000;

/* renamed from: bmvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmvh extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmvh f131044d;

    /* renamed from: e */
    private static volatile bxxk f131045e;

    /* renamed from: a */
    public int f131046a;

    /* renamed from: b */
    public long f131047b;

    /* renamed from: c */
    public String f131048c = "";

    static {
        bmvh bmvh = new bmvh();
        f131044d = bmvh;
        GeneratedMessageLite.m124024a(bmvh.class, bmvh);
    }

    private bmvh() {
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
            return GeneratedMessageLite.m124022a(f131044d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bmvh();
        } else {
            if (i2 == 4) {
                return new bxvd(f131044d);
            }
            if (i2 == 5) {
                return f131044d;
            }
            bxxk bxxk = f131045e;
            if (bxxk == null) {
                synchronized (bmvh.class) {
                    bxxk = f131045e;
                    if (bxxk == null) {
                        bxxk = new bxve(f131044d);
                        f131045e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
