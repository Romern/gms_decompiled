package p000;

/* renamed from: brcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcx extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final brcx f142447e;

    /* renamed from: f */
    private static volatile bxxk f142448f;

    /* renamed from: a */
    public int f142449a;

    /* renamed from: b */
    public brak f142450b;

    /* renamed from: c */
    public String f142451c = "";

    /* renamed from: d */
    public braq f142452d;

    static {
        brcx brcx = new brcx();
        f142447e = brcx;
        GeneratedMessageLite.m124024a(brcx.class, brcx);
    }

    private brcx() {
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
            return GeneratedMessageLite.m124022a(f142447e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new brcx();
        } else {
            if (i2 == 4) {
                return new bxvd(f142447e);
            }
            if (i2 == 5) {
                return f142447e;
            }
            bxxk bxxk = f142448f;
            if (bxxk == null) {
                synchronized (brcx.class) {
                    bxxk = f142448f;
                    if (bxxk == null) {
                        bxxk = new bxve(f142447e);
                        f142448f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
