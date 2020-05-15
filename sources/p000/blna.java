package p000;

/* renamed from: blna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blna extends bxvk implements bxxd {

    /* renamed from: g */
    public static final blna f126922g;

    /* renamed from: j */
    private static volatile bxxk f126923j;

    /* renamed from: a */
    public int f126924a;

    /* renamed from: b */
    public int f126925b;

    /* renamed from: c */
    public String f126926c = "";

    /* renamed from: d */
    public blmr f126927d;

    /* renamed from: e */
    public int f126928e;

    /* renamed from: f */
    public long f126929f;

    /* renamed from: h */
    private blmq f126930h;

    /* renamed from: i */
    private byte f126931i = 2;

    static {
        blna blna = new blna();
        f126922g = blna;
        bxvk.m124024a(blna.class, blna);
    }

    private blna() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f126931i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f126931i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f126922g, "\u0001\u0006\u0000\u0001\u0002\f\u0006\u0000\u0000\u0004\u0002ᔌ\u0001\u0003ᔈ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006\nင\t\fဂ\u000b", new Object[]{"a", "b", blmz.f126921a, "c", "h", "d", "e", "f"});
        } else if (i2 == 3) {
            return new blna();
        } else {
            if (i2 == 4) {
                return new blmy();
            }
            if (i2 == 5) {
                return f126922g;
            }
            bxxk bxxk = f126923j;
            if (bxxk == null) {
                synchronized (blna.class) {
                    bxxk = f126923j;
                    if (bxxk == null) {
                        bxxk = new bxve(f126922g);
                        f126923j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
