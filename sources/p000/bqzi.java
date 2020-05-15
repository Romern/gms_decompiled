package p000;

/* renamed from: bqzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqzi extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bqzi f142041j;

    /* renamed from: l */
    private static volatile bxxk f142042l;

    /* renamed from: a */
    public String f142043a = "";

    /* renamed from: b */
    public long f142044b;

    /* renamed from: c */
    public boolean f142045c;

    /* renamed from: d */
    public double f142046d;

    /* renamed from: e */
    public String f142047e = "";

    /* renamed from: f */
    public bqzf f142048f;

    /* renamed from: g */
    public int f142049g;

    /* renamed from: h */
    public boolean f142050h;

    /* renamed from: i */
    public int f142051i;

    /* renamed from: k */
    private int f142052k;

    static {
        bqzi bqzi = new bqzi();
        f142041j = bqzi;
        GeneratedMessageLite.m124024a(bqzi.class, bqzi);
    }

    private bqzi() {
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
            return GeneratedMessageLite.m124022a(f142041j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004က\u0003\u0005ဈ\u0004\u0006ဉ\u0005\u0007ဇ\u0007\bင\b\tဌ\u0006", new Object[]{"k", "a", "b", "c", "d", "e", "f", "h", "i", "g", bqzg.f142040a});
        } else if (i2 == 3) {
            return new bqzi();
        } else {
            if (i2 == 4) {
                return new bxvd(f142041j);
            }
            if (i2 == 5) {
                return f142041j;
            }
            bxxk bxxk = f142042l;
            if (bxxk == null) {
                synchronized (bqzi.class) {
                    bxxk = f142042l;
                    if (bxxk == null) {
                        bxxk = new bxve(f142041j);
                        f142042l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
