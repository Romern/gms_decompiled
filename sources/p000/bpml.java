package p000;

/* renamed from: bpml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpml extends bxvk implements bxxd {

    /* renamed from: j */
    public static final bpml f138283j;

    /* renamed from: k */
    private static volatile bxxk f138284k;

    /* renamed from: a */
    public int f138285a;

    /* renamed from: b */
    public String f138286b = "";

    /* renamed from: c */
    public int f138287c;

    /* renamed from: d */
    public int f138288d;

    /* renamed from: e */
    public int f138289e;

    /* renamed from: f */
    public int f138290f;

    /* renamed from: g */
    public int f138291g;

    /* renamed from: h */
    public bxwc f138292h = bxxn.f165040b;

    /* renamed from: i */
    public int f138293i;

    static {
        bpml bpml = new bpml();
        f138283j = bpml;
        bxvk.m124024a(bpml.class, bpml);
    }

    private bpml() {
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
            return bxvk.m124022a(f138283j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007\u001b\bင\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", bpmk.class, "i"});
        } else if (i2 == 3) {
            return new bpml();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f138283j;
            }
            bxxk bxxk = f138284k;
            if (bxxk == null) {
                synchronized (bpml.class) {
                    bxxk = f138284k;
                    if (bxxk == null) {
                        bxxk = new bxve(f138283j);
                        f138284k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
