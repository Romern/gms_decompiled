package p000;

/* renamed from: amod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amod extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final amod f75579f;

    /* renamed from: g */
    private static volatile bxxk f75580g;

    /* renamed from: a */
    public int f75581a;

    /* renamed from: b */
    public int f75582b;

    /* renamed from: c */
    public String f75583c = "";

    /* renamed from: d */
    public int f75584d;

    /* renamed from: e */
    public long f75585e;

    static {
        amod amod = new amod();
        f75579f = amod;
        GeneratedMessageLite.m124024a(amod.class, amod);
    }

    private amod() {
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
            return GeneratedMessageLite.m124022a(f75579f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", amoa.f75577a, "c", "d", amob.f75578a, "e"});
        } else if (i2 == 3) {
            return new amod();
        } else {
            if (i2 == 4) {
                return new bxvd(f75579f);
            }
            if (i2 == 5) {
                return f75579f;
            }
            bxxk bxxk = f75580g;
            if (bxxk == null) {
                synchronized (amod.class) {
                    bxxk = f75580g;
                    if (bxxk == null) {
                        bxxk = new bxve(f75579f);
                        f75580g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
