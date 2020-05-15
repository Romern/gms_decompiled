package p000;

/* renamed from: bzqp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzqp extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bzqp f171047j;

    /* renamed from: l */
    private static volatile bxxk f171048l;

    /* renamed from: a */
    public int f171049a;

    /* renamed from: b */
    public bzqo f171050b;

    /* renamed from: c */
    public bzqu f171051c;

    /* renamed from: d */
    public bzqm f171052d;

    /* renamed from: e */
    public bzqn f171053e;

    /* renamed from: f */
    public bzqr f171054f;

    /* renamed from: g */
    public bxwc f171055g = bxxn.f165040b;

    /* renamed from: h */
    public bzqt f171056h;

    /* renamed from: i */
    public bzqs f171057i;

    /* renamed from: k */
    private byte f171058k = 2;

    static {
        bzqp bzqp = new bzqp();
        f171047j = bzqp;
        GeneratedMessageLite.m124024a(bzqp.class, bzqp);
    }

    private bzqp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f171058k);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f171058k = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f171047j, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\nဉ\t\f\u001b\rဉ\u000b\u000eဉ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", bzql.class, "h", "i"});
        } else if (i2 == 3) {
            return new bzqp();
        } else {
            if (i2 == 4) {
                return new bxvd(f171047j);
            }
            if (i2 == 5) {
                return f171047j;
            }
            bxxk bxxk = f171048l;
            if (bxxk == null) {
                synchronized (bzqp.class) {
                    bxxk = f171048l;
                    if (bxxk == null) {
                        bxxk = new bxve(f171047j);
                        f171048l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
