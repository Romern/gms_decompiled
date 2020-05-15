package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: byya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byya extends bxvg implements bxvh {

    /* renamed from: j */
    public static final byya f168860j;

    /* renamed from: p */
    private static volatile bxxk f168861p;

    /* renamed from: a */
    public int f168862a;

    /* renamed from: b */
    public long f168863b = 3000;

    /* renamed from: c */
    public long f168864c = 1000;

    /* renamed from: d */
    public long f168865d = 5000;

    /* renamed from: e */
    public byxz f168866e;

    /* renamed from: f */
    public byxy f168867f;

    /* renamed from: g */
    public int f168868g;

    /* renamed from: h */
    public int f168869h = 1;

    /* renamed from: i */
    public int f168870i = 60;

    /* renamed from: k */
    private int f168871k = -77;

    /* renamed from: l */
    private boolean f168872l;

    /* renamed from: n */
    private int f168873n = 50;

    /* renamed from: o */
    private byte f168874o = 2;

    static {
        byya byya = new byya();
        f168860j = byya;
        GeneratedMessageLite.m124024a(byya.class, byya);
    }

    private byya() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125482a(byya byya) {
        byya.f168862a |= 1;
        byya.f168863b = 3000;
    }

    /* renamed from: b */
    public static /* synthetic */ void m125483b(byya byya) {
        byya.f168862a |= 2;
        byya.f168864c = 1000;
    }

    /* renamed from: c */
    public static /* synthetic */ void m125484c(byya byya) {
        byya.f168862a |= 4;
        byya.f168865d = 5000;
    }

    /* renamed from: d */
    public static /* synthetic */ void m125485d(byya byya) {
        byya.f168862a |= 64;
        byya.f168868g = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
    }

    /* renamed from: e */
    public static /* synthetic */ void m125486e(byya byya) {
        byya.f168862a |= 128;
        byya.f168871k = -77;
    }

    /* renamed from: f */
    public static /* synthetic */ void m125487f(byya byya) {
        byya.f168862a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        byya.f168872l = false;
    }

    /* renamed from: g */
    public static /* synthetic */ void m125488g(byya byya) {
        byya.f168862a |= 512;
        byya.f168869h = 1;
    }

    /* renamed from: h */
    public static /* synthetic */ void m125489h(byya byya) {
        byya.f168862a |= 1024;
        byya.f168873n = 50;
    }

    /* renamed from: i */
    public static /* synthetic */ void m125490i(byya byya) {
        byya.f168862a |= 2048;
        byya.f168870i = 60;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168874o);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168874o = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168860j, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0006ဉ\u0005\u0007င\u0006\bင\u0007\u000bဇ\b\rင\t\u000eင\n\u000fင\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "k", "l", "h", "n", "i"});
        } else if (i2 == 3) {
            return new byya();
        } else {
            if (i2 == 4) {
                return new bxvf(f168860j);
            }
            if (i2 == 5) {
                return f168860j;
            }
            bxxk bxxk = f168861p;
            if (bxxk == null) {
                synchronized (byya.class) {
                    bxxk = f168861p;
                    if (bxxk == null) {
                        bxxk = new bxve(f168860j);
                        f168861p = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
