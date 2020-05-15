package p000;

/* renamed from: bodg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bodg extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bodg f132676e;

    /* renamed from: f */
    private static volatile bxxk f132677f;

    /* renamed from: a */
    public int f132678a;

    /* renamed from: b */
    public String f132679b = "";

    /* renamed from: c */
    public int f132680c;

    /* renamed from: d */
    public int f132681d;

    static {
        bodg bodg = new bodg();
        f132676e = bodg;
        GeneratedMessageLite.m124024a(bodg.class, bodg);
    }

    private bodg() {
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
            return GeneratedMessageLite.m124022a(f132676e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bodf.f132675a});
        } else if (i2 == 3) {
            return new bodg();
        } else {
            if (i2 == 4) {
                return new bxvd(f132676e);
            }
            if (i2 == 5) {
                return f132676e;
            }
            bxxk bxxk = f132677f;
            if (bxxk == null) {
                synchronized (bodg.class) {
                    bxxk = f132677f;
                    if (bxxk == null) {
                        bxxk = new bxve(f132676e);
                        f132677f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
