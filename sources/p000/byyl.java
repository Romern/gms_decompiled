package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: byyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byyl extends bxvg implements bxvh {

    /* renamed from: v */
    public static final byyl f168949v;

    /* renamed from: x */
    private static volatile bxxk f168950x;

    /* renamed from: a */
    public int f168951a;

    /* renamed from: b */
    public boolean f168952b = true;

    /* renamed from: c */
    public boolean f168953c = true;

    /* renamed from: d */
    public boolean f168954d = true;

    /* renamed from: e */
    public boolean f168955e = true;

    /* renamed from: f */
    public boolean f168956f = true;

    /* renamed from: g */
    public boolean f168957g;

    /* renamed from: h */
    public boolean f168958h;

    /* renamed from: i */
    public int f168959i = 3;

    /* renamed from: j */
    public long f168960j = 1000;

    /* renamed from: k */
    public long f168961k = 5000;

    /* renamed from: l */
    public String f168962l = "";

    /* renamed from: n */
    public boolean f168963n;

    /* renamed from: o */
    public boolean f168964o;

    /* renamed from: p */
    public boolean f168965p;

    /* renamed from: q */
    public boolean f168966q;

    /* renamed from: r */
    public long f168967r = 86400000;

    /* renamed from: s */
    public int f168968s;

    /* renamed from: t */
    public boolean f168969t = true;

    /* renamed from: u */
    public int f168970u;

    /* renamed from: w */
    private byte f168971w = 2;

    static {
        byyl byyl = new byyl();
        f168949v = byyl;
        GeneratedMessageLite.m124024a(byyl.class, byyl);
    }

    private byyl() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m125521a(byyl byyl) {
        byyl.f168951a |= 128;
        byyl.f168959i = 3;
    }

    /* renamed from: b */
    public static /* synthetic */ void m125522b(byyl byyl) {
        byyl.f168951a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        byyl.f168960j = 1000;
    }

    /* renamed from: c */
    public static /* synthetic */ void m125523c(byyl byyl) {
        byyl.f168951a |= 512;
        byyl.f168961k = 5000;
    }

    /* renamed from: d */
    public static /* synthetic */ void m125524d(byyl byyl) {
        byyl.f168951a |= 4096;
        byyl.f168963n = false;
    }

    /* renamed from: e */
    public static /* synthetic */ void m125525e(byyl byyl) {
        byyl.f168951a |= 8192;
        byyl.f168964o = false;
    }

    /* renamed from: f */
    public static /* synthetic */ void m125526f(byyl byyl) {
        byyl.f168951a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        byyl.f168967r = 86400000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f168971w);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f168971w = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f168949v, "\u0001\u0013\u0000\u0001\u0001&\u0013\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\u0012င\u0007\u0013ဂ\b\u0015ဂ\t\u0017ဈ\n\u0019ဇ\f\u001aဇ\r\u001bဇ\u000e\u001cဇ\u000f!ဂ\u0011#င\u0012%ဇ\u0013&င\u0014", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "o", "p", "q", "r", "s", "t", "u"});
        } else if (i2 == 3) {
            return new byyl();
        } else {
            if (i2 == 4) {
                return new bxvf(f168949v);
            }
            if (i2 == 5) {
                return f168949v;
            }
            bxxk bxxk = f168950x;
            if (bxxk == null) {
                synchronized (byyl.class) {
                    bxxk = f168950x;
                    if (bxxk == null) {
                        bxxk = new bxve(f168949v);
                        f168950x = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
