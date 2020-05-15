package p000;

/* renamed from: cioa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cioa extends bxvk implements bxxd {

    /* renamed from: f */
    public static final cioa f191029f;

    /* renamed from: g */
    private static volatile bxxk f191030g;

    /* renamed from: a */
    public int f191031a;

    /* renamed from: b */
    public long f191032b;

    /* renamed from: c */
    public boolean f191033c;

    /* renamed from: d */
    public int f191034d;

    /* renamed from: e */
    public String f191035e = "";

    static {
        cioa cioa = new cioa();
        f191029f = cioa;
        bxvk.m124024a(cioa.class, cioa);
    }

    private cioa() {
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
            return bxvk.m124022a(f191029f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new cioa();
        } else {
            if (i2 == 4) {
                return new bxvd(f191029f);
            }
            if (i2 == 5) {
                return f191029f;
            }
            bxxk bxxk = f191030g;
            if (bxxk == null) {
                synchronized (cioa.class) {
                    bxxk = f191030g;
                    if (bxxk == null) {
                        bxxk = new bxve(f191029f);
                        f191030g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
