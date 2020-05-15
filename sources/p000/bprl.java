package p000;

/* renamed from: bprl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bprl extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bprl f138862d;

    /* renamed from: g */
    private static volatile bxxk f138863g;

    /* renamed from: a */
    public int f138864a;

    /* renamed from: b */
    public String f138865b = "";

    /* renamed from: c */
    public int f138866c;

    /* renamed from: e */
    private bpli f138867e;

    /* renamed from: f */
    private byte f138868f = 2;

    static {
        bprl bprl = new bprl();
        f138862d = bprl;
        GeneratedMessageLite.m124024a(bprl.class, bprl);
    }

    private bprl() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f138868f);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f138868f = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f138862d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "e", "b", "c", bprk.f138861a});
        } else if (i2 == 3) {
            return new bprl();
        } else {
            if (i2 == 4) {
                return new bxvd(f138862d);
            }
            if (i2 == 5) {
                return f138862d;
            }
            bxxk bxxk = f138863g;
            if (bxxk == null) {
                synchronized (bprl.class) {
                    bxxk = f138863g;
                    if (bxxk == null) {
                        bxxk = new bxve(f138862d);
                        f138863g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
