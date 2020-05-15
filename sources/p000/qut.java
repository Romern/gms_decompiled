package p000;

/* renamed from: qut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qut extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final qut f42198h;

    /* renamed from: i */
    private static volatile bxxk f42199i;

    /* renamed from: a */
    public int f42200a;

    /* renamed from: b */
    public String f42201b = "";

    /* renamed from: c */
    public bxwc f42202c = bxxn.f165040b;

    /* renamed from: d */
    public String f42203d = "";

    /* renamed from: e */
    public String f42204e = "";

    /* renamed from: f */
    public String f42205f = "";

    /* renamed from: g */
    public String f42206g = "";

    static {
        qut qut = new qut();
        f42198h = qut;
        GeneratedMessageLite.m124024a(qut.class, qut);
    }

    private qut() {
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
            return GeneratedMessageLite.m124022a(f42198h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\bဈ\u0007\nဈ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new qut();
        } else {
            if (i2 == 4) {
                return new bxvd(f42198h);
            }
            if (i2 == 5) {
                return f42198h;
            }
            bxxk bxxk = f42199i;
            if (bxxk == null) {
                synchronized (qut.class) {
                    bxxk = f42199i;
                    if (bxxk == null) {
                        bxxk = new bxve(f42198h);
                        f42199i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
