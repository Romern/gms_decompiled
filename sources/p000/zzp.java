package p000;

/* renamed from: zzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zzp extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final zzp f56314g;

    /* renamed from: h */
    private static volatile bxxk f56315h;

    /* renamed from: a */
    public int f56316a;

    /* renamed from: b */
    public String f56317b = "";

    /* renamed from: c */
    public int f56318c;

    /* renamed from: d */
    public int f56319d;

    /* renamed from: e */
    public String f56320e = "";

    /* renamed from: f */
    public int f56321f;

    static {
        zzp zzp = new zzp();
        f56314g = zzp;
        GeneratedMessageLite.m124024a(zzp.class, zzp);
    }

    private zzp() {
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
            return GeneratedMessageLite.m124022a(f56314g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", zzo.f56313a});
        } else if (i2 == 3) {
            return new zzp();
        } else {
            if (i2 == 4) {
                return new bxvd(f56314g);
            }
            if (i2 == 5) {
                return f56314g;
            }
            bxxk bxxk = f56315h;
            if (bxxk == null) {
                synchronized (zzp.class) {
                    bxxk = f56315h;
                    if (bxxk == null) {
                        bxxk = new bxve(f56314g);
                        f56315h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
