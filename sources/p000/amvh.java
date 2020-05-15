package p000;

/* renamed from: amvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvh extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final amvh f76004g;

    /* renamed from: h */
    private static volatile bxxk f76005h;

    /* renamed from: a */
    public int f76006a;

    /* renamed from: b */
    public String f76007b = "";

    /* renamed from: c */
    public String f76008c = "";

    /* renamed from: d */
    public String f76009d = "";

    /* renamed from: e */
    public String f76010e = "";

    /* renamed from: f */
    public long f76011f;

    static {
        amvh amvh = new amvh();
        f76004g = amvh;
        GeneratedMessageLite.m124024a(amvh.class, amvh);
    }

    private amvh() {
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
            return GeneratedMessageLite.m124022a(f76004g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new amvh();
        } else {
            if (i2 == 4) {
                return new bxvd(f76004g);
            }
            if (i2 == 5) {
                return f76004g;
            }
            bxxk bxxk = f76005h;
            if (bxxk == null) {
                synchronized (amvh.class) {
                    bxxk = f76005h;
                    if (bxxk == null) {
                        bxxk = new bxve(f76004g);
                        f76005h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
