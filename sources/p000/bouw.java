package p000;

/* renamed from: bouw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bouw extends GeneratedMessageLite implements bxxd {

    /* renamed from: h */
    public static final bouw f134960h;

    /* renamed from: i */
    private static volatile bxxk f134961i;

    /* renamed from: a */
    public int f134962a;

    /* renamed from: b */
    public int f134963b;

    /* renamed from: c */
    public int f134964c;

    /* renamed from: d */
    public int f134965d;

    /* renamed from: e */
    public int f134966e;

    /* renamed from: f */
    public int f134967f;

    /* renamed from: g */
    public int f134968g;

    static {
        bouw bouw = new bouw();
        f134960h = bouw;
        GeneratedMessageLite.m124024a(bouw.class, bouw);
    }

    private bouw() {
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
            return GeneratedMessageLite.m124022a(f134960h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", bour.f134955a, "c", bouq.f134954a, "d", bouu.f134958a, "e", bouv.f134959a, "f", bout.f134957a, "g", bous.f134956a});
        } else if (i2 == 3) {
            return new bouw();
        } else {
            if (i2 == 4) {
                return new bxvd(f134960h);
            }
            if (i2 == 5) {
                return f134960h;
            }
            bxxk bxxk = f134961i;
            if (bxxk == null) {
                synchronized (bouw.class) {
                    bxxk = f134961i;
                    if (bxxk == null) {
                        bxxk = new bxve(f134960h);
                        f134961i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
