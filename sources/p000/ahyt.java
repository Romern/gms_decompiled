package p000;

/* renamed from: ahyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahyt extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ahyt f68381d;

    /* renamed from: e */
    private static volatile bxxk f68382e;

    /* renamed from: a */
    public int f68383a;

    /* renamed from: b */
    public String f68384b = "";

    /* renamed from: c */
    public String f68385c = "";

    static {
        ahyt ahyt = new ahyt();
        f68381d = ahyt;
        GeneratedMessageLite.m124024a(ahyt.class, ahyt);
    }

    private ahyt() {
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
            return GeneratedMessageLite.m124022a(f68381d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new ahyt();
        } else {
            if (i2 == 4) {
                return new bxvd(f68381d);
            }
            if (i2 == 5) {
                return f68381d;
            }
            bxxk bxxk = f68382e;
            if (bxxk == null) {
                synchronized (ahyt.class) {
                    bxxk = f68382e;
                    if (bxxk == null) {
                        bxxk = new bxve(f68381d);
                        f68382e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
