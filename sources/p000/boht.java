package p000;

/* renamed from: boht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boht extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boht f133150d;

    /* renamed from: e */
    private static volatile bxxk f133151e;

    /* renamed from: a */
    public int f133152a;

    /* renamed from: b */
    public int f133153b;

    /* renamed from: c */
    public String f133154c = "";

    static {
        boht boht = new boht();
        f133150d = boht;
        GeneratedMessageLite.m124024a(boht.class, boht);
    }

    private boht() {
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
            return GeneratedMessageLite.m124022a(f133150d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boht();
        } else {
            if (i2 == 4) {
                return new bxvd(f133150d);
            }
            if (i2 == 5) {
                return f133150d;
            }
            bxxk bxxk = f133151e;
            if (bxxk == null) {
                synchronized (boht.class) {
                    bxxk = f133151e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133150d);
                        f133151e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
