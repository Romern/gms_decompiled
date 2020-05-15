package p000;

/* renamed from: braw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class braw extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bxvu f142192e = new brav();

    /* renamed from: g */
    public static final braw f142193g;

    /* renamed from: h */
    private static volatile bxxk f142194h;

    /* renamed from: a */
    public int f142195a;

    /* renamed from: b */
    public bral f142196b;

    /* renamed from: c */
    public boolean f142197c;

    /* renamed from: d */
    public bxvt f142198d = bxvm.f164965b;

    /* renamed from: f */
    public bree f142199f;

    static {
        braw braw = new braw();
        f142193g = braw;
        GeneratedMessageLite.m124024a(braw.class, braw);
    }

    private braw() {
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
            return GeneratedMessageLite.m124022a(f142193g, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003\u001e\u0005ဉ\u0003", new Object[]{"a", "b", "c", "d", brej.m113931b(), "f"});
        } else if (i2 == 3) {
            return new braw();
        } else {
            if (i2 == 4) {
                return new bxvd(f142193g);
            }
            if (i2 == 5) {
                return f142193g;
            }
            bxxk bxxk = f142194h;
            if (bxxk == null) {
                synchronized (braw.class) {
                    bxxk = f142194h;
                    if (bxxk == null) {
                        bxxk = new bxve(f142193g);
                        f142194h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
