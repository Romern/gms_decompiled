package p000;

/* renamed from: bovc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bovc extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bovc f134986j;

    /* renamed from: k */
    private static volatile bxxk f134987k;

    /* renamed from: a */
    public int f134988a;

    /* renamed from: b */
    public long f134989b;

    /* renamed from: c */
    public bovw f134990c;

    /* renamed from: d */
    public bovf f134991d;

    /* renamed from: e */
    public bowf f134992e;

    /* renamed from: f */
    public String f134993f = "";

    /* renamed from: g */
    public int f134994g;

    /* renamed from: h */
    public bova f134995h;

    /* renamed from: i */
    public bowb f134996i;

    static {
        bovc bovc = new bovc();
        f134986j = bovc;
        GeneratedMessageLite.m124024a(bovc.class, bovc);
    }

    private bovc() {
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
            return GeneratedMessageLite.m124022a(f134986j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bovc();
        } else {
            if (i2 == 4) {
                return new bxvd(f134986j);
            }
            if (i2 == 5) {
                return f134986j;
            }
            bxxk bxxk = f134987k;
            if (bxxk == null) {
                synchronized (bovc.class) {
                    bxxk = f134987k;
                    if (bxxk == null) {
                        bxxk = new bxve(f134986j);
                        f134987k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
