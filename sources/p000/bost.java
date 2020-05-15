package p000;

/* renamed from: bost */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bost extends GeneratedMessageLite implements bxxd {

    /* renamed from: j */
    public static final bost f134657j;

    /* renamed from: k */
    private static volatile bxxk f134658k;

    /* renamed from: a */
    public int f134659a;

    /* renamed from: b */
    public int f134660b;

    /* renamed from: c */
    public boolean f134661c;

    /* renamed from: d */
    public int f134662d;

    /* renamed from: e */
    public boolean f134663e;

    /* renamed from: f */
    public int f134664f;

    /* renamed from: g */
    public int f134665g;

    /* renamed from: h */
    public boss f134666h;

    /* renamed from: i */
    public int f134667i;

    static {
        bost bost = new bost();
        f134657j = bost;
        GeneratedMessageLite.m124024a(bost.class, bost);
    }

    private bost() {
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
            return GeneratedMessageLite.m124022a(f134657j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007ဉ\u0006\bင\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i2 == 3) {
            return new bost();
        } else {
            if (i2 == 4) {
                return new bxvd(f134657j);
            }
            if (i2 == 5) {
                return f134657j;
            }
            bxxk bxxk = f134658k;
            if (bxxk == null) {
                synchronized (bost.class) {
                    bxxk = f134658k;
                    if (bxxk == null) {
                        bxxk = new bxve(f134657j);
                        f134658k = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
