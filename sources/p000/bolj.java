package p000;

/* renamed from: bolj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bolj extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bolj f133546h;

    /* renamed from: i */
    private static volatile bxxk f133547i;

    /* renamed from: a */
    public int f133548a;

    /* renamed from: b */
    public String f133549b = "";

    /* renamed from: c */
    public String f133550c = "";

    /* renamed from: d */
    public String f133551d = "";

    /* renamed from: e */
    public bolp f133552e;

    /* renamed from: f */
    public boli f133553f;

    /* renamed from: g */
    public bolt f133554g;

    static {
        bolj bolj = new bolj();
        f133546h = bolj;
        GeneratedMessageLite.m124024a(bolj.class, bolj);
    }

    private bolj() {
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
            return GeneratedMessageLite.m124022a(f133546h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bolj();
        } else {
            if (i2 == 4) {
                return new bxvd(f133546h);
            }
            if (i2 == 5) {
                return f133546h;
            }
            bxxk bxxk = f133547i;
            if (bxxk == null) {
                synchronized (bolj.class) {
                    bxxk = f133547i;
                    if (bxxk == null) {
                        bxxk = new bxve(f133546h);
                        f133547i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
