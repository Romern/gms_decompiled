package p000;

/* renamed from: boho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boho extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final boho f133117d;

    /* renamed from: e */
    private static volatile bxxk f133118e;

    /* renamed from: a */
    public int f133119a;

    /* renamed from: b */
    public String f133120b = "";

    /* renamed from: c */
    public long f133121c;

    static {
        boho boho = new boho();
        f133117d = boho;
        GeneratedMessageLite.m124024a(boho.class, boho);
    }

    private boho() {
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
            return GeneratedMessageLite.m124022a(f133117d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new boho();
        } else {
            if (i2 == 4) {
                return new bxvd(f133117d);
            }
            if (i2 == 5) {
                return f133117d;
            }
            bxxk bxxk = f133118e;
            if (bxxk == null) {
                synchronized (boho.class) {
                    bxxk = f133118e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133117d);
                        f133118e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
