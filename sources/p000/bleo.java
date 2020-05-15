package p000;

/* renamed from: bleo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bleo extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bleo f126228j;

    /* renamed from: k */
    private static volatile bxxk f126229k;

    /* renamed from: a */
    public int f126230a;

    /* renamed from: b */
    public bleu f126231b;

    /* renamed from: c */
    public String f126232c = "";

    /* renamed from: d */
    public String f126233d = "";

    /* renamed from: e */
    public String f126234e = "";

    /* renamed from: f */
    public String f126235f = "";

    /* renamed from: g */
    public String f126236g = "";

    /* renamed from: h */
    public String f126237h = "";

    /* renamed from: i */
    public int f126238i;

    static {
        bleo bleo = new bleo();
        f126228j = bleo;
        GeneratedMessageLite.m124024a(bleo.class, bleo);
    }

    private bleo() {
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
            return GeneratedMessageLite.m124022a(f126228j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\bဈ\u0007\nဌ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", blem.f126227a});
        } else if (i2 == 3) {
            return new bleo();
        } else {
            if (i2 == 4) {
                return new bxvd(f126228j);
            }
            if (i2 == 5) {
                return f126228j;
            }
            bxxk bxxk = f126229k;
            if (bxxk == null) {
                synchronized (bleo.class) {
                    bxxk = f126229k;
                    if (bxxk == null) {
                        bxxk = new bxve(f126228j);
                        f126229k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
