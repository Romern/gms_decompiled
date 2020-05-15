package p000;

/* renamed from: lad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lad extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final lad f25522f;

    /* renamed from: g */
    private static volatile bxxk f25523g;

    /* renamed from: a */
    public String f25524a = "";

    /* renamed from: b */
    public String f25525b = "";

    /* renamed from: c */
    public int f25526c;

    /* renamed from: d */
    public boolean f25527d;

    /* renamed from: e */
    public boolean f25528e;

    static {
        lad lad = new lad();
        f25522f = lad;
        GeneratedMessageLite.m124024a(lad.class, lad);
    }

    private lad() {
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
            return GeneratedMessageLite.m124022a(f25522f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\u0007\u0005\u0007", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new lad();
        } else {
            if (i2 == 4) {
                return new bxvd(f25522f);
            }
            if (i2 == 5) {
                return f25522f;
            }
            bxxk bxxk = f25523g;
            if (bxxk == null) {
                synchronized (lad.class) {
                    bxxk = f25523g;
                    if (bxxk == null) {
                        bxxk = new bxve(f25522f);
                        f25523g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
