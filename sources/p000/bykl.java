package p000;

/* renamed from: bykl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bykl extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bykl f166763e;

    /* renamed from: f */
    private static volatile bxxk f166764f;

    /* renamed from: a */
    public int f166765a;

    /* renamed from: b */
    public int f166766b;

    /* renamed from: c */
    public bxun f166767c;

    /* renamed from: d */
    public bxun f166768d;

    static {
        bykl bykl = new bykl();
        f166763e = bykl;
        GeneratedMessageLite.m124024a(bykl.class, bykl);
    }

    private bykl() {
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
            return GeneratedMessageLite.m124022a(f166763e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", bykj.f166762a, "c", "d"});
        } else if (i2 == 3) {
            return new bykl();
        } else {
            if (i2 == 4) {
                return new bxvd(f166763e);
            }
            if (i2 == 5) {
                return f166763e;
            }
            bxxk bxxk = f166764f;
            if (bxxk == null) {
                synchronized (bykl.class) {
                    bxxk = f166764f;
                    if (bxxk == null) {
                        bxxk = new bxve(f166763e);
                        f166764f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
