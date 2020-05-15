package p000;

/* renamed from: byvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byvm extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final byvm f168451k;

    /* renamed from: l */
    private static volatile bxxk f168452l;

    /* renamed from: a */
    public int f168453a;

    /* renamed from: b */
    public byvr f168454b;

    /* renamed from: c */
    public String f168455c = "";

    /* renamed from: d */
    public String f168456d = "";

    /* renamed from: e */
    public int f168457e;

    /* renamed from: f */
    public bywn f168458f;

    /* renamed from: g */
    public bywm f168459g;

    /* renamed from: h */
    public bywk f168460h;

    /* renamed from: i */
    public bywl f168461i;

    /* renamed from: j */
    public byvn f168462j;

    static {
        byvm byvm = new byvm();
        f168451k = byvm;
        GeneratedMessageLite.m124024a(byvm.class, byvm);
    }

    private byvm() {
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
            return GeneratedMessageLite.m124022a(f168451k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n", new Object[]{"a", "b", "c", "d", "e", bzba.f169242a, "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new byvm();
        } else {
            if (i2 == 4) {
                return new bxvd(f168451k);
            }
            if (i2 == 5) {
                return f168451k;
            }
            bxxk bxxk = f168452l;
            if (bxxk == null) {
                synchronized (byvm.class) {
                    bxxk = f168452l;
                    if (bxxk == null) {
                        bxxk = new bxve(f168451k);
                        f168452l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
