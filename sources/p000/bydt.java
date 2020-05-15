package p000;

/* renamed from: bydt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bydt extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bydt f165851a;

    /* renamed from: f */
    private static volatile bxxk f165852f;

    /* renamed from: b */
    private int f165853b;

    /* renamed from: c */
    private String f165854c = "";

    /* renamed from: d */
    private String f165855d = "";

    /* renamed from: e */
    private byte f165856e = 2;

    static {
        bydt bydt = new bydt();
        f165851a = bydt;
        GeneratedMessageLite.m124024a(bydt.class, bydt);
    }

    private bydt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f165856e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f165856e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f165851a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new bydt();
        } else {
            if (i2 == 4) {
                return new bxvd(f165851a);
            }
            if (i2 == 5) {
                return f165851a;
            }
            bxxk bxxk = f165852f;
            if (bxxk == null) {
                synchronized (bydt.class) {
                    bxxk = f165852f;
                    if (bxxk == null) {
                        bxxk = new bxve(f165851a);
                        f165852f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
