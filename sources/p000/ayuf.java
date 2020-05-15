package p000;

/* renamed from: ayuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayuf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final ayuf f98514d;

    /* renamed from: f */
    private static volatile bxxk f98515f;

    /* renamed from: a */
    public int f98516a;

    /* renamed from: b */
    public int f98517b = 1;

    /* renamed from: c */
    public dcp f98518c;

    /* renamed from: e */
    private byte f98519e = 2;

    static {
        ayuf ayuf = new ayuf();
        f98514d = ayuf;
        GeneratedMessageLite.m124024a(ayuf.class, ayuf);
    }

    private ayuf() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f98519e);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f98519e = b;
            return null;
        } else if (i2 == 2) {
            return GeneratedMessageLite.m124022a(f98514d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", ayug.f98520a, "c"});
        } else if (i2 == 3) {
            return new ayuf();
        } else {
            if (i2 == 4) {
                return new bxvd(f98514d);
            }
            if (i2 == 5) {
                return f98514d;
            }
            bxxk bxxk = f98515f;
            if (bxxk == null) {
                synchronized (ayuf.class) {
                    bxxk = f98515f;
                    if (bxxk == null) {
                        bxxk = new bxve(f98514d);
                        f98515f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
