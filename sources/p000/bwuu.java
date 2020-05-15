package p000;

/* renamed from: bwuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwuu extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bwuu f161066f;

    /* renamed from: g */
    public static final bxvj f161067g;

    /* renamed from: i */
    private static volatile bxxk f161068i;

    /* renamed from: a */
    public int f161069a = 0;

    /* renamed from: b */
    public Object f161070b;

    /* renamed from: c */
    public String f161071c = "";

    /* renamed from: d */
    public bwvd f161072d;

    /* renamed from: e */
    public bxwc f161073e = bxxn.f165040b;

    /* renamed from: h */
    private int f161074h;

    static {
        bwuu bwuu = new bwuu();
        f161066f = bwuu;
        bxvk.m124024a(bwuu.class, bwuu);
        bwny bwny = bwny.f160414k;
        bwuu bwuu2 = f161066f;
        f161067g = bxvk.m124006a(bwny, bwuu2, bwuu2, 220794717, bxzf.MESSAGE);
    }

    private bwuu() {
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
            return bxvk.m124022a(f161066f, "\u0001\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0001\u0000\u0002ျ\u0000\u0003ျ\u0000\u0004ဈ\u0003\u0005ဉ\u0004\u0006\u001b", new Object[]{"b", "a", "h", "c", "d", "e", bwve.class});
        } else if (i2 == 3) {
            return new bwuu();
        } else {
            if (i2 == 4) {
                return new bxvd(f161066f);
            }
            if (i2 == 5) {
                return f161066f;
            }
            bxxk bxxk = f161068i;
            if (bxxk == null) {
                synchronized (bwuu.class) {
                    bxxk = f161068i;
                    if (bxxk == null) {
                        bxxk = new bxve(f161066f);
                        f161068i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
