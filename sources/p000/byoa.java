package p000;

/* renamed from: byoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byoa extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final byoa f167173e;

    /* renamed from: h */
    private static volatile bxxk f167174h;

    /* renamed from: a */
    public int f167175a;

    /* renamed from: b */
    public bxwc f167176b = bxxn.f165040b;

    /* renamed from: c */
    public int f167177c;

    /* renamed from: d */
    public int f167178d = 2;

    /* renamed from: f */
    private byov f167179f;

    /* renamed from: g */
    private byov f167180g;

    static {
        byoa byoa = new byoa();
        f167173e = byoa;
        GeneratedMessageLite.m124024a(byoa.class, byoa);
    }

    private byoa() {
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
            return GeneratedMessageLite.m124022a(f167173e, "\u0001\u0005\u0000\u0001\u0001c\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဌ\u0002cင\u0006", new Object[]{"a", "f", "b", byor.class, "g", "c", bypk.f167353a, "d"});
        } else if (i2 == 3) {
            return new byoa();
        } else {
            if (i2 == 4) {
                return new bxvd(f167173e);
            }
            if (i2 == 5) {
                return f167173e;
            }
            bxxk bxxk = f167174h;
            if (bxxk == null) {
                synchronized (byoa.class) {
                    bxxk = f167174h;
                    if (bxxk == null) {
                        bxxk = new bxve(f167173e);
                        f167174h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
