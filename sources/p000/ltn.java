package p000;

/* renamed from: ltn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ltn extends bxvk implements bxxd {

    /* renamed from: g */
    public static final ltn f32960g;

    /* renamed from: j */
    private static volatile bxxk f32961j;

    /* renamed from: a */
    public int f32962a;

    /* renamed from: b */
    public long f32963b;

    /* renamed from: c */
    public long f32964c;

    /* renamed from: d */
    public String f32965d = "";

    /* renamed from: e */
    public long f32966e;

    /* renamed from: f */
    public int f32967f;

    /* renamed from: h */
    private long f32968h;

    /* renamed from: i */
    private byte f32969i = 2;

    static {
        ltn ltn = new ltn();
        f32960g = ltn;
        bxvk.m124024a(ltn.class, ltn);
    }

    private ltn() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f32969i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f32969i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f32960g, "\u0001\u0006\u0000\u0001\b!\u0006\u0000\u0000\u0003\bᔂ\u0000\tᔃ\u0001\nᔃ\u0002\rဈ\u0003\u000fဃ\u0005!ဌ\n", new Object[]{"a", "b", "c", "h", "d", "e", "f", ltl.f32959a});
        } else if (i2 == 3) {
            return new ltn();
        } else {
            if (i2 == 4) {
                return new bxvd(f32960g);
            }
            if (i2 == 5) {
                return f32960g;
            }
            bxxk bxxk = f32961j;
            if (bxxk == null) {
                synchronized (ltn.class) {
                    bxxk = f32961j;
                    if (bxxk == null) {
                        bxxk = new bxve(f32960g);
                        f32961j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
