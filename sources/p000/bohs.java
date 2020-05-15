package p000;

/* renamed from: bohs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bohs extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bohs f133145d;

    /* renamed from: e */
    private static volatile bxxk f133146e;

    /* renamed from: a */
    public int f133147a;

    /* renamed from: b */
    public long f133148b;

    /* renamed from: c */
    public String f133149c = "";

    static {
        bohs bohs = new bohs();
        f133145d = bohs;
        GeneratedMessageLite.m124024a(bohs.class, bohs);
    }

    private bohs() {
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
            return GeneratedMessageLite.m124022a(f133145d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bohs();
        } else {
            if (i2 == 4) {
                return new bxvd(f133145d);
            }
            if (i2 == 5) {
                return f133145d;
            }
            bxxk bxxk = f133146e;
            if (bxxk == null) {
                synchronized (bohs.class) {
                    bxxk = f133146e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133145d);
                        f133146e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
