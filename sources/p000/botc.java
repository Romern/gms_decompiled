package p000;

/* renamed from: botc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class botc extends bxvk implements bxxd {

    /* renamed from: f */
    public static final botc f134764f;

    /* renamed from: g */
    private static volatile bxxk f134765g;

    /* renamed from: a */
    public int f134766a;

    /* renamed from: b */
    public boolean f134767b;

    /* renamed from: c */
    public boolean f134768c;

    /* renamed from: d */
    public boolean f134769d;

    /* renamed from: e */
    public int f134770e;

    static {
        botc botc = new botc();
        f134764f = botc;
        bxvk.m124024a(botc.class, botc);
    }

    private botc() {
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
            return bxvk.m124022a(f134764f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", botb.f134763a});
        } else if (i2 == 3) {
            return new botc();
        } else {
            if (i2 == 4) {
                return new bxvd(f134764f);
            }
            if (i2 == 5) {
                return f134764f;
            }
            bxxk bxxk = f134765g;
            if (bxxk == null) {
                synchronized (botc.class) {
                    bxxk = f134765g;
                    if (bxxk == null) {
                        bxxk = new bxve(f134764f);
                        f134765g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
