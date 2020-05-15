package p000;

/* renamed from: cily */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cily extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final cily f190683f;

    /* renamed from: g */
    private static volatile bxxk f190684g;

    /* renamed from: a */
    public int f190685a;

    /* renamed from: b */
    public String f190686b = "";

    /* renamed from: c */
    public int f190687c;

    /* renamed from: d */
    public long f190688d;

    /* renamed from: e */
    public int f190689e;

    static {
        cily cily = new cily();
        f190683f = cily;
        GeneratedMessageLite.m124024a(cily.class, cily);
    }

    private cily() {
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
            return GeneratedMessageLite.m124022a(f190683f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", cilv.f190677a, "d", "e", cilt.f190675a});
        } else if (i2 == 3) {
            return new cily();
        } else {
            if (i2 == 4) {
                return new bxvd(f190683f);
            }
            if (i2 == 5) {
                return f190683f;
            }
            bxxk bxxk = f190684g;
            if (bxxk == null) {
                synchronized (cily.class) {
                    bxxk = f190684g;
                    if (bxxk == null) {
                        bxxk = new bxve(f190683f);
                        f190684g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
