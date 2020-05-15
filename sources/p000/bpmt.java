package p000;

/* renamed from: bpmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmt extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bpmt f138341m;

    /* renamed from: n */
    private static volatile bxxk f138342n;

    /* renamed from: a */
    public int f138343a;

    /* renamed from: b */
    public long f138344b;

    /* renamed from: c */
    public bpmn f138345c;

    /* renamed from: d */
    public bpmn f138346d;

    /* renamed from: e */
    public bpmw f138347e;

    /* renamed from: f */
    public bpmq f138348f;

    /* renamed from: g */
    public bpmi f138349g;

    /* renamed from: h */
    public bpmy f138350h;

    /* renamed from: i */
    public bpmz f138351i;

    /* renamed from: j */
    public bpmu f138352j;

    /* renamed from: k */
    public bpmg f138353k;

    /* renamed from: l */
    public bpmj f138354l;

    static {
        bpmt bpmt = new bpmt();
        f138341m = bpmt;
        bxvk.m124024a(bpmt.class, bpmt);
    }

    private bpmt() {
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
            return bxvk.m124022a(f138341m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i2 == 3) {
            return new bpmt();
        } else {
            if (i2 == 4) {
                return new bxvd(f138341m);
            }
            if (i2 == 5) {
                return f138341m;
            }
            bxxk bxxk = f138342n;
            if (bxxk == null) {
                synchronized (bpmt.class) {
                    bxxk = f138342n;
                    if (bxxk == null) {
                        bxxk = new bxve(f138341m);
                        f138342n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
