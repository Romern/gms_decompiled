package p000;

/* renamed from: cinu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cinu extends bxvk implements bxxd {

    /* renamed from: h */
    public static final cinu f190982h;

    /* renamed from: j */
    private static volatile bxxk f190983j;

    /* renamed from: a */
    public int f190984a;

    /* renamed from: b */
    public long f190985b;

    /* renamed from: c */
    public int f190986c;

    /* renamed from: d */
    public bxwc f190987d = bxxn.f165040b;

    /* renamed from: e */
    public float f190988e;

    /* renamed from: f */
    public cinr f190989f;

    /* renamed from: g */
    public cinz f190990g;

    /* renamed from: i */
    private byte f190991i = 2;

    static {
        cinu cinu = new cinu();
        f190982h = cinu;
        bxvk.m124024a(cinu.class, cinu);
    }

    private cinu() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f190991i);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f190991i = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f190982h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003ဌ\u0001\u0004ခ\u0002\u0005ဉ\u0003\u0006ဉ\u0004", new Object[]{"a", "b", "d", cinx.class, "c", cint.f190981a, "e", "f", "g"});
        } else if (i2 == 3) {
            return new cinu();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return f190982h;
            }
            bxxk bxxk = f190983j;
            if (bxxk == null) {
                synchronized (cinu.class) {
                    bxxk = f190983j;
                    if (bxxk == null) {
                        bxxk = new bxve(f190982h);
                        f190983j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: c */
    public final void mo86262c() {
        if (!this.f190987d.mo73666a()) {
            this.f190987d = bxvk.m124021a(this.f190987d);
        }
    }
}
