package p000;

/* renamed from: apzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzg extends GeneratedMessageLite implements bxxd {

    /* renamed from: l */
    public static final apzg f85233l;

    /* renamed from: m */
    private static volatile bxxk f85234m;

    /* renamed from: a */
    public int f85235a;

    /* renamed from: b */
    public String f85236b = "";

    /* renamed from: c */
    public boolean f85237c;

    /* renamed from: d */
    public ByteString f85238d = ByteString.f164797b;

    /* renamed from: e */
    public bxwc f85239e = bxxn.f165040b;

    /* renamed from: f */
    public int f85240f;

    /* renamed from: g */
    public bxwc f85241g = bxxn.f165040b;

    /* renamed from: h */
    public bxwc f85242h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f85243i = bxxn.f165040b;

    /* renamed from: j */
    public int f85244j;

    /* renamed from: k */
    public boolean f85245k;

    static {
        apzg apzg = new apzg();
        f85233l = apzg;
        GeneratedMessageLite.m124024a(apzg.class, apzg);
    }

    private apzg() {
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
            return GeneratedMessageLite.m124022a(f85233l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0004\u0000\u0001ဈ\u0000\u0004ဇ\u0001\u0005ည\u0002\u0006\u001c\u0007င\u0003\b\u001a\t\u001a\n\u001b\u000bင\u0004\fဇ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", aqah.class, "j", "k"});
        } else if (i2 == 3) {
            return new apzg();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null);
            }
            if (i2 == 5) {
                return f85233l;
            }
            bxxk bxxk = f85234m;
            if (bxxk == null) {
                synchronized (apzg.class) {
                    bxxk = f85234m;
                    if (bxxk == null) {
                        bxxk = new bxve(f85233l);
                        f85234m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
