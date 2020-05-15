package p000;

/* renamed from: byog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byog extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final byog f167196i;

    /* renamed from: j */
    private static volatile bxxk f167197j;

    /* renamed from: a */
    public int f167198a;

    /* renamed from: b */
    public int f167199b;

    /* renamed from: c */
    public int f167200c = 1;

    /* renamed from: d */
    public bxvw f167201d = bxwq.f165002b;

    /* renamed from: e */
    public boolean f167202e = true;

    /* renamed from: f */
    public boolean f167203f;

    /* renamed from: g */
    public int f167204g = -1;

    /* renamed from: h */
    public boolean f167205h = true;

    static {
        byog byog = new byog();
        f167196i = byog;
        GeneratedMessageLite.m124024a(byog.class, byog);
    }

    private byog() {
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
            return GeneratedMessageLite.m124022a(f167196i, "\u0001\u0007\u0000\u0001\u0006\u000e\u0007\u0000\u0001\u0000\u0006ဏ\u0004\u0007\u0014\bဇ\u0005\tဇ\u0006\u000bဌ\u0002\rဏ\u0007\u000eဇ\b", new Object[]{"a", "c", "d", "e", "f", "b", byoe.f167195a, "g", "h"});
        } else if (i2 == 3) {
            return new byog();
        } else {
            if (i2 == 4) {
                return new bxvd(f167196i);
            }
            if (i2 == 5) {
                return f167196i;
            }
            bxxk bxxk = f167197j;
            if (bxxk == null) {
                synchronized (byog.class) {
                    bxxk = f167197j;
                    if (bxxk == null) {
                        bxxk = new bxve(f167196i);
                        f167197j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
