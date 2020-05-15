package p000;

/* renamed from: byat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byat extends bxvk implements bxxd {

    /* renamed from: l */
    public static final byat f165321l;

    /* renamed from: m */
    private static volatile bxxk f165322m;

    /* renamed from: a */
    public int f165323a;

    /* renamed from: b */
    public int f165324b;

    /* renamed from: c */
    public int f165325c;

    /* renamed from: d */
    public int f165326d;

    /* renamed from: e */
    public bybk f165327e;

    /* renamed from: f */
    public bybk f165328f;

    /* renamed from: g */
    public bybk f165329g;

    /* renamed from: h */
    public long f165330h;

    /* renamed from: i */
    public long f165331i;

    /* renamed from: j */
    public long f165332j;

    /* renamed from: k */
    public long f165333k;

    static {
        byat byat = new byat();
        f165321l = byat;
        bxvk.m124024a(byat.class, byat);
    }

    private byat() {
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
            return bxvk.m124022a(f165321l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t", new Object[]{"a", "b", byas.f165320a, "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i2 == 3) {
            return new byat();
        } else {
            if (i2 == 4) {
                return new bxvd(f165321l);
            }
            if (i2 == 5) {
                return f165321l;
            }
            bxxk bxxk = f165322m;
            if (bxxk == null) {
                synchronized (byat.class) {
                    bxxk = f165322m;
                    if (bxxk == null) {
                        bxxk = new bxve(f165321l);
                        f165322m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
