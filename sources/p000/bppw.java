package p000;

/* renamed from: bppw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppw extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bppw f138664f;

    /* renamed from: i */
    private static volatile bxxk f138665i;

    /* renamed from: a */
    public int f138666a;

    /* renamed from: b */
    public String f138667b = "";

    /* renamed from: c */
    public int f138668c;

    /* renamed from: d */
    public int f138669d;

    /* renamed from: e */
    public int f138670e;

    /* renamed from: g */
    private bpli f138671g;

    /* renamed from: h */
    private byte f138672h = 2;

    static {
        bppw bppw = new bppw();
        f138664f = bppw;
        GeneratedMessageLite.m124024a(bppw.class, bppw);
    }

    private bppw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138672h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138672h = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f138664f, "\u0001\u0005\u0000\u0001\u0002\n\u0005\u0000\u0000\u0001\u0002ဈ\u0001\u0004ᐉ\u0003\u0007ဌ\u0006\bင\u0007\nဌ\t", new Object[]{"a", "b", "g", "c", bppv.f138663a, "d", "e", bppu.f138662a});
        } else if (i2 == 3) {
            return new bppw();
        } else {
            if (i2 == 4) {
                return new bxvd(f138664f);
            }
            if (i2 == 5) {
                return f138664f;
            }
            bxxk bxxk = f138665i;
            if (bxxk == null) {
                synchronized (bppw.class) {
                    bxxk = f138665i;
                    if (bxxk == null) {
                        bxxk = new bxve(f138664f);
                        f138665i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
