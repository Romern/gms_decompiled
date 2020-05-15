package p000;

/* renamed from: btam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btam extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final btam f148005f;

    /* renamed from: g */
    private static volatile bxxk f148006g;

    /* renamed from: a */
    public String f148007a = "";

    /* renamed from: b */
    public long f148008b;

    /* renamed from: c */
    public int f148009c;

    /* renamed from: d */
    public bszf f148010d;

    /* renamed from: e */
    public bszs f148011e;

    static {
        btam btam = new btam();
        f148005f = btam;
        GeneratedMessageLite.m124024a(btam.class, btam);
    }

    private btam() {
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
            return GeneratedMessageLite.m124022a(f148005f, "\u0000\u0005\u0000\u0000\u0001?\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\f\u0004\t?\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new btam();
        } else {
            if (i2 == 4) {
                return new bxvd(f148005f);
            }
            if (i2 == 5) {
                return f148005f;
            }
            bxxk bxxk = f148006g;
            if (bxxk == null) {
                synchronized (btam.class) {
                    bxxk = f148006g;
                    if (bxxk == null) {
                        bxxk = new bxve(f148005f);
                        f148006g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
