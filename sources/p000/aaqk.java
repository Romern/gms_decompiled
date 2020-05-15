package p000;

/* renamed from: aaqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaqk extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final aaqk f28904k;

    /* renamed from: l */
    private static volatile bxxk f28905l;

    /* renamed from: a */
    public int f28906a;

    /* renamed from: b */
    public int f28907b = 0;

    /* renamed from: c */
    public Object f28908c;

    /* renamed from: d */
    public String f28909d = "";

    /* renamed from: e */
    public String f28910e = "";

    /* renamed from: f */
    public int f28911f;

    /* renamed from: g */
    public int f28912g;

    /* renamed from: h */
    public int f28913h;

    /* renamed from: i */
    public int f28914i;

    /* renamed from: j */
    public int f28915j;

    static {
        aaqk aaqk = new aaqk();
        f28904k = aaqk;
        GeneratedMessageLite.m124024a(aaqk.class, aaqk);
    }

    private aaqk() {
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
            return GeneratedMessageLite.m124022a(f28904k, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ြ\u0000\u0005ဿ\u0000\u0006ဿ\u0000\u0007ဿ\u0000\bဿ\u0000\tင\u0003\nင\u0004\u000bင\u0005\fဌ\u0006\r်\u0000", new Object[]{"c", "b", "a", "d", "e", "f", aaqo.class, aaqi.m21818b(), aaqj.f28903a, aaqg.m21814b(), aaqd.m21809b(), "g", "h", "i", "j", aaqe.f28881a});
        } else if (i2 == 3) {
            return new aaqk();
        } else {
            if (i2 == 4) {
                return new bxvd(f28904k);
            }
            if (i2 == 5) {
                return f28904k;
            }
            bxxk bxxk = f28905l;
            if (bxxk == null) {
                synchronized (aaqk.class) {
                    bxxk = f28905l;
                    if (bxxk == null) {
                        bxxk = new bxve(f28904k);
                        f28905l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
