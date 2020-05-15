package p000;

/* renamed from: btsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btsu extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final btsu f150275e;

    /* renamed from: f */
    private static volatile bxxk f150276f;

    /* renamed from: a */
    public int f150277a;

    /* renamed from: b */
    public btsi f150278b;

    /* renamed from: c */
    public bzvu f150279c;

    /* renamed from: d */
    public String f150280d = "";

    static {
        btsu btsu = new btsu();
        f150275e = btsu;
        GeneratedMessageLite.m124024a(btsu.class, btsu);
    }

    private btsu() {
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
            return GeneratedMessageLite.m124022a(f150275e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new btsu();
        } else {
            if (i2 == 4) {
                return new bxvd(f150275e);
            }
            if (i2 == 5) {
                return f150275e;
            }
            bxxk bxxk = f150276f;
            if (bxxk == null) {
                synchronized (btsu.class) {
                    bxxk = f150276f;
                    if (bxxk == null) {
                        bxxk = new bxve(f150275e);
                        f150276f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
