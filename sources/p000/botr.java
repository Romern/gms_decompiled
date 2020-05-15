package p000;

/* renamed from: botr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botr extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final botr f134863f;

    /* renamed from: g */
    private static volatile bxxk f134864g;

    /* renamed from: a */
    public int f134865a;

    /* renamed from: b */
    public long f134866b;

    /* renamed from: c */
    public String f134867c = "";

    /* renamed from: d */
    public String f134868d = "";

    /* renamed from: e */
    public long f134869e;

    static {
        botr botr = new botr();
        f134863f = botr;
        GeneratedMessageLite.m124024a(botr.class, botr);
    }

    private botr() {
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
            return GeneratedMessageLite.m124022a(f134863f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new botr();
        } else {
            if (i2 == 4) {
                return new bxvd(f134863f);
            }
            if (i2 == 5) {
                return f134863f;
            }
            bxxk bxxk = f134864g;
            if (bxxk == null) {
                synchronized (botr.class) {
                    bxxk = f134864g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134863f);
                        f134864g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
