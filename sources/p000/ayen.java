package p000;

/* renamed from: ayen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayen extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final ayen f97331g;

    /* renamed from: h */
    private static volatile bxxk f97332h;

    /* renamed from: a */
    public int f97333a;

    /* renamed from: b */
    public int f97334b;

    /* renamed from: c */
    public int f97335c;

    /* renamed from: d */
    public ayei f97336d;

    /* renamed from: e */
    public ayel f97337e;

    /* renamed from: f */
    public ayej f97338f;

    static {
        ayen ayen = new ayen();
        f97331g = ayen;
        GeneratedMessageLite.m124024a(ayen.class, ayen);
    }

    private ayen() {
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
            return GeneratedMessageLite.m124022a(f97331g, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0006င\u0000\u0007င\u0001", new Object[]{"a", "d", "e", "f", "b", "c"});
        } else if (i2 == 3) {
            return new ayen();
        } else {
            if (i2 == 4) {
                return new bxvd(f97331g);
            }
            if (i2 == 5) {
                return f97331g;
            }
            bxxk bxxk = f97332h;
            if (bxxk == null) {
                synchronized (ayen.class) {
                    bxxk = f97332h;
                    if (bxxk == null) {
                        bxxk = new bxve(f97331g);
                        f97332h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
