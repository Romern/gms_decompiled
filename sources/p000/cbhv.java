package p000;

/* renamed from: cbhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhv extends GeneratedMessageLite implements bxxd {

    /* renamed from: m */
    public static final cbhv f177190m;

    /* renamed from: n */
    private static volatile bxxk f177191n;

    /* renamed from: a */
    public String f177192a = "";

    /* renamed from: b */
    public String f177193b = "";

    /* renamed from: c */
    public String f177194c = "";

    /* renamed from: d */
    public String f177195d = "";

    /* renamed from: e */
    public cbhx f177196e;

    /* renamed from: f */
    public cbhx f177197f;

    /* renamed from: g */
    public String f177198g = "";

    /* renamed from: h */
    public String f177199h = "";

    /* renamed from: i */
    public bxwc f177200i = bxxn.f165040b;

    /* renamed from: j */
    public cbhp f177201j;

    /* renamed from: k */
    public cbht f177202k;

    /* renamed from: l */
    public cbhr f177203l;

    static {
        cbhv cbhv = new cbhv();
        f177190m = cbhv;
        GeneratedMessageLite.m124024a(cbhv.class, cbhv);
    }

    private cbhv() {
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
            return GeneratedMessageLite.m124022a(f177190m, "\u0000\f\u0000\u0000\u0002\u0013\f\u0000\u0001\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t\rȈ\u000eȈ\u000f\t\u0010\t\u0011\u001b\u0013\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "l", "k", "i", cbhm.class, "j"});
        } else if (i2 == 3) {
            return new cbhv();
        } else {
            if (i2 == 4) {
                return new bxvd(f177190m);
            }
            if (i2 == 5) {
                return f177190m;
            }
            bxxk bxxk = f177191n;
            if (bxxk == null) {
                synchronized (cbhv.class) {
                    bxxk = f177191n;
                    if (bxxk == null) {
                        bxxk = new bxve(f177190m);
                        f177191n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
