package p000;

/* renamed from: bodi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodi extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bodi f132694f;

    /* renamed from: g */
    private static volatile bxxk f132695g;

    /* renamed from: a */
    public int f132696a;

    /* renamed from: b */
    public String f132697b = "";

    /* renamed from: c */
    public int f132698c;

    /* renamed from: d */
    public long f132699d;

    /* renamed from: e */
    public String f132700e = "";

    static {
        bodi bodi = new bodi();
        f132694f = bodi;
        GeneratedMessageLite.m124024a(bodi.class, bodi);
    }

    private bodi() {
        bxxn bxxn = bxxn.f165040b;
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
            return GeneratedMessageLite.m124022a(f132694f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003င\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bodi();
        } else {
            if (i2 == 4) {
                return new bxvd(f132694f);
            }
            if (i2 == 5) {
                return f132694f;
            }
            bxxk bxxk = f132695g;
            if (bxxk == null) {
                synchronized (bodi.class) {
                    bxxk = f132695g;
                    if (bxxk == null) {
                        bxxk = new bxve(f132694f);
                        f132695g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
