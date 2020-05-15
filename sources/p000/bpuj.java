package p000;

/* renamed from: bpuj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpuj extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bpuj f139241k;

    /* renamed from: l */
    private static volatile bxxk f139242l;

    /* renamed from: a */
    public int f139243a;

    /* renamed from: b */
    public String f139244b = "";

    /* renamed from: c */
    public String f139245c = "";

    /* renamed from: d */
    public long f139246d;

    /* renamed from: e */
    public int f139247e;

    /* renamed from: f */
    public long f139248f;

    /* renamed from: g */
    public boolean f139249g;

    /* renamed from: h */
    public boolean f139250h;

    /* renamed from: i */
    public int f139251i;

    /* renamed from: j */
    public int f139252j;

    static {
        bpuj bpuj = new bpuj();
        f139241k = bpuj;
        GeneratedMessageLite.m124024a(bpuj.class, bpuj);
    }

    private bpuj() {
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
            return GeneratedMessageLite.m124022a(f139241k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဌ\b", new Object[]{"a", "b", "c", "d", "e", bpui.f139240a, "f", "g", "h", "i", "j", bpug.f139239a});
        } else if (i2 == 3) {
            return new bpuj();
        } else {
            if (i2 == 4) {
                return new bxvd(f139241k);
            }
            if (i2 == 5) {
                return f139241k;
            }
            bxxk bxxk = f139242l;
            if (bxxk == null) {
                synchronized (bpuj.class) {
                    bxxk = f139242l;
                    if (bxxk == null) {
                        bxxk = new bxve(f139241k);
                        f139242l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
