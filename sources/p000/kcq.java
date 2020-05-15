package p000;

/* renamed from: kcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcq extends bxvk implements bxxd {

    /* renamed from: g */
    public static final kcq f23829g;

    /* renamed from: i */
    private static volatile bxxk f23830i;

    /* renamed from: a */
    public int f23831a;

    /* renamed from: b */
    public String f23832b = "";

    /* renamed from: c */
    public String f23833c = "";

    /* renamed from: d */
    public String f23834d = "";

    /* renamed from: e */
    public String f23835e = "";

    /* renamed from: f */
    public String f23836f = "";

    /* renamed from: h */
    private byte f23837h = 2;

    static {
        kcq kcq = new kcq();
        f23829g = kcq;
        bxvk.m124024a(kcq.class, kcq);
    }

    private kcq() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f23837h);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f23837h = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f23829g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new kcq();
        } else {
            if (i2 == 4) {
                return new bxvd(f23829g);
            }
            if (i2 == 5) {
                return f23829g;
            }
            bxxk bxxk = f23830i;
            if (bxxk == null) {
                synchronized (kcq.class) {
                    bxxk = f23830i;
                    if (bxxk == null) {
                        bxxk = new bxve(f23829g);
                        f23830i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
