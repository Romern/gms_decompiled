package p000;

/* renamed from: boqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class boqk extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final boqk f134283f;

    /* renamed from: g */
    private static volatile bxxk f134284g;

    /* renamed from: a */
    public int f134285a;

    /* renamed from: b */
    public long f134286b;

    /* renamed from: c */
    public long f134287c;

    /* renamed from: d */
    public long f134288d;

    /* renamed from: e */
    public boolean f134289e;

    static {
        boqk boqk = new boqk();
        f134283f = boqk;
        GeneratedMessageLite.m124024a(boqk.class, boqk);
    }

    private boqk() {
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
            return GeneratedMessageLite.m124022a(f134283f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new boqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f134283f);
            }
            if (i2 == 5) {
                return f134283f;
            }
            bxxk bxxk = f134284g;
            if (bxxk == null) {
                synchronized (boqk.class) {
                    bxxk = f134284g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134283f);
                        f134284g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
