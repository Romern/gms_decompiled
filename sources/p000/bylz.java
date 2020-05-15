package p000;

/* renamed from: bylz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bylz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bylz f166971d;

    /* renamed from: e */
    private static volatile bxxk f166972e;

    /* renamed from: a */
    public int f166973a;

    /* renamed from: b */
    public String f166974b = "";

    /* renamed from: c */
    public long f166975c;

    static {
        bylz bylz = new bylz();
        f166971d = bylz;
        bxvk.m124024a(bylz.class, bylz);
    }

    private bylz() {
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
            return bxvk.m124022a(f166971d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဂ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bylz();
        } else {
            if (i2 == 4) {
                return new bxvd(f166971d);
            }
            if (i2 == 5) {
                return f166971d;
            }
            bxxk bxxk = f166972e;
            if (bxxk == null) {
                synchronized (bylz.class) {
                    bxxk = f166972e;
                    if (bxxk == null) {
                        bxxk = new bxve(f166971d);
                        f166972e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
