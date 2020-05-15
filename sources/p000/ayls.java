package p000;

/* renamed from: ayls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayls extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ayls f97925d;

    /* renamed from: f */
    private static volatile bxxk f97926f;

    /* renamed from: a */
    public String f97927a = "";

    /* renamed from: b */
    public long f97928b;

    /* renamed from: c */
    public int f97929c;

    /* renamed from: e */
    private int f97930e;

    static {
        ayls ayls = new ayls();
        f97925d = ayls;
        GeneratedMessageLite.m124024a(ayls.class, ayls);
    }

    private ayls() {
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
            return GeneratedMessageLite.m124022a(f97925d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", ayly.f97947a});
        } else if (i2 == 3) {
            return new ayls();
        } else {
            if (i2 == 4) {
                return new bxvd(f97925d);
            }
            if (i2 == 5) {
                return f97925d;
            }
            bxxk bxxk = f97926f;
            if (bxxk == null) {
                synchronized (ayls.class) {
                    bxxk = f97926f;
                    if (bxxk == null) {
                        bxxk = new bxve(f97925d);
                        f97926f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
