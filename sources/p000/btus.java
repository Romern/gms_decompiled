package p000;

/* renamed from: btus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btus extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final btus f150619g;

    /* renamed from: i */
    private static volatile bxxk f150620i;

    /* renamed from: a */
    public int f150621a;

    /* renamed from: b */
    public String f150622b = "";

    /* renamed from: c */
    public boolean f150623c;

    /* renamed from: d */
    public long f150624d;

    /* renamed from: e */
    public long f150625e;

    /* renamed from: f */
    public String f150626f = "";

    /* renamed from: h */
    private boolean f150627h;

    static {
        btus btus = new btus();
        f150619g = btus;
        GeneratedMessageLite.m124024a(btus.class, btus);
    }

    private btus() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m117166a(btus btus) {
        btus.f150621a |= 128;
        btus.f150627h = true;
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
            return GeneratedMessageLite.m124022a(f150619g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0003\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "h"});
        } else if (i2 == 3) {
            return new btus();
        } else {
            if (i2 == 4) {
                return new bxvd(f150619g);
            }
            if (i2 == 5) {
                return f150619g;
            }
            bxxk bxxk = f150620i;
            if (bxxk == null) {
                synchronized (btus.class) {
                    bxxk = f150620i;
                    if (bxxk == null) {
                        bxxk = new bxve(f150619g);
                        f150620i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
