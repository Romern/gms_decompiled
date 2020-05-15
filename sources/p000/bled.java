package p000;

/* renamed from: bled */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bled extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bled f126176f;

    /* renamed from: g */
    private static volatile bxxk f126177g;

    /* renamed from: a */
    public int f126178a;

    /* renamed from: b */
    public bleu f126179b;

    /* renamed from: c */
    public String f126180c = "";

    /* renamed from: d */
    public String f126181d = "";

    /* renamed from: e */
    public String f126182e = "";

    static {
        bled bled = new bled();
        f126176f = bled;
        bxvk.m124024a(bled.class, bled);
    }

    private bled() {
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
            return bxvk.m124022a(f126176f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new bled();
        } else {
            if (i2 == 4) {
                return new bxvd(f126176f);
            }
            if (i2 == 5) {
                return f126176f;
            }
            bxxk bxxk = f126177g;
            if (bxxk == null) {
                synchronized (bled.class) {
                    bxxk = f126177g;
                    if (bxxk == null) {
                        bxxk = new bxve(f126176f);
                        f126177g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
