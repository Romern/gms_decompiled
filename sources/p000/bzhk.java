package p000;

/* renamed from: bzhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzhk extends GeneratedMessageLite implements bxxd {

    /* renamed from: o */
    public static final bzhk f170059o;

    /* renamed from: q */
    private static volatile bxxk f170060q;

    /* renamed from: a */
    public int f170061a;

    /* renamed from: b */
    public bzjl f170062b;

    /* renamed from: c */
    public bzjd f170063c;

    /* renamed from: d */
    public bzjh f170064d;

    /* renamed from: e */
    public bzia f170065e;

    /* renamed from: f */
    public bzhe f170066f;

    /* renamed from: g */
    public bzih f170067g;

    /* renamed from: h */
    public bzjq f170068h;

    /* renamed from: i */
    public bzjt f170069i;

    /* renamed from: j */
    public bzil f170070j;

    /* renamed from: k */
    public bzij f170071k;

    /* renamed from: l */
    public bzhs f170072l;

    /* renamed from: m */
    public bzhx f170073m;

    /* renamed from: n */
    public bzjo f170074n;

    /* renamed from: p */
    private byte f170075p = 2;

    static {
        bzhk bzhk = new bzhk();
        f170059o = bzhk;
        GeneratedMessageLite.m124024a(bzhk.class, bzhk);
    }

    private bzhk() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f170075p);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f170075p = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f170059o, "\u0001\r\u0000\u0001\u0002\u0014\r\u0000\u0000\u0001\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\tᐉ\u0007\nဉ\b\fဉ\n\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        } else if (i2 == 3) {
            return new bzhk();
        } else {
            if (i2 == 4) {
                return new bxvd(f170059o);
            }
            if (i2 == 5) {
                return f170059o;
            }
            bxxk bxxk = f170060q;
            if (bxxk == null) {
                synchronized (bzhk.class) {
                    bxxk = f170060q;
                    if (bxxk == null) {
                        bxxk = new bxve(f170059o);
                        f170060q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
