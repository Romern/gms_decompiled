package p000;

/* renamed from: zxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zxh extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final zxh f56095e;

    /* renamed from: g */
    private static volatile bxxk f56096g;

    /* renamed from: a */
    public zxf f56097a;

    /* renamed from: b */
    public zxj f56098b;

    /* renamed from: c */
    public zxg f56099c;

    /* renamed from: d */
    public zxg f56100d;

    /* renamed from: f */
    private int f56101f;

    static {
        zxh zxh = new zxh();
        f56095e = zxh;
        GeneratedMessageLite.m124024a(zxh.class, zxh);
    }

    private zxh() {
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
            return GeneratedMessageLite.m124022a(f56095e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new zxh();
        } else {
            if (i2 == 4) {
                return new bxvd(f56095e);
            }
            if (i2 == 5) {
                return f56095e;
            }
            bxxk bxxk = f56096g;
            if (bxxk == null) {
                synchronized (zxh.class) {
                    bxxk = f56096g;
                    if (bxxk == null) {
                        bxxk = new bxve(f56095e);
                        f56096g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
