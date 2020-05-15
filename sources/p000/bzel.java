package p000;

/* renamed from: bzel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzel extends GeneratedMessageLite implements bxxd {

    /* renamed from: p */
    public static final bzel f169667p;

    /* renamed from: q */
    private static volatile bxxk f169668q;

    /* renamed from: a */
    public int f169669a;

    /* renamed from: b */
    public bzeb f169670b;

    /* renamed from: c */
    public bzej f169671c;

    /* renamed from: d */
    public bzem f169672d;

    /* renamed from: e */
    public bzek f169673e;

    /* renamed from: f */
    public bzdy f169674f;

    /* renamed from: g */
    public bzdx f169675g;

    /* renamed from: h */
    public bzei f169676h;

    /* renamed from: i */
    public bzdv f169677i;

    /* renamed from: j */
    public bzdu f169678j;

    /* renamed from: k */
    public bzdz f169679k;

    /* renamed from: l */
    public bzeh f169680l;

    /* renamed from: m */
    public bzed f169681m;

    /* renamed from: n */
    public bzeg f169682n;

    /* renamed from: o */
    public bzea f169683o;

    static {
        bzel bzel = new bzel();
        f169667p = bzel;
        GeneratedMessageLite.m124024a(bzel.class, bzel);
    }

    private bzel() {
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
            return GeneratedMessageLite.m124022a(f169667p, "\u0000\u000f\u0000\u0000\u0001\u0010\u000f\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\t\t\n\t\u000b\t\f\t\r\t\u000e\t\u000f\t\u0010\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i2 == 3) {
            return new bzel();
        } else {
            if (i2 == 4) {
                return new bxvd(f169667p);
            }
            if (i2 == 5) {
                return f169667p;
            }
            bxxk bxxk = f169668q;
            if (bxxk == null) {
                synchronized (bzel.class) {
                    bxxk = f169668q;
                    if (bxxk == null) {
                        bxxk = new bxve(f169667p);
                        f169668q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
