package p000;

/* renamed from: calo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class calo extends bxvk implements bxxd {

    /* renamed from: l */
    public static final calo f175155l;

    /* renamed from: m */
    private static volatile bxxk f175156m;

    /* renamed from: a */
    public int f175157a;

    /* renamed from: b */
    public int f175158b;

    /* renamed from: c */
    public int f175159c;

    /* renamed from: d */
    public int f175160d;

    /* renamed from: e */
    public int f175161e;

    /* renamed from: f */
    public int f175162f;

    /* renamed from: g */
    public int f175163g;

    /* renamed from: h */
    public int f175164h;

    /* renamed from: i */
    public int f175165i;

    /* renamed from: j */
    public int f175166j;

    /* renamed from: k */
    public int f175167k;

    static {
        calo calo = new calo();
        f175155l = calo;
        bxvk.m124024a(calo.class, calo);
    }

    private calo() {
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
            return bxvk.m124022a(f175155l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0002\u0003ဌ\u0003\u0004ဌ\u0004\u0005ဌ\u0005\u0006ဌ\u0006\u0007ဌ\u0007\bဌ\b\tဌ\t\nဌ\u0001", new Object[]{"a", "b", calm.f175154a, "d", calm.f175154a, "e", calm.f175154a, "f", calm.f175154a, "g", calm.f175154a, "h", calm.f175154a, "i", calm.f175154a, "j", calm.f175154a, "k", calm.f175154a, "c", calm.f175154a});
        } else if (i2 == 3) {
            return new calo();
        } else {
            if (i2 == 4) {
                return new bxvd(f175155l);
            }
            if (i2 == 5) {
                return f175155l;
            }
            bxxk bxxk = f175156m;
            if (bxxk == null) {
                synchronized (calo.class) {
                    bxxk = f175156m;
                    if (bxxk == null) {
                        bxxk = new bxve(f175155l);
                        f175156m = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
