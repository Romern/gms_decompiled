package p000;

/* renamed from: abpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abpy extends bxvk implements bxxd {

    /* renamed from: f */
    public static final abpy f57922f;

    /* renamed from: g */
    private static volatile bxxk f57923g;

    /* renamed from: a */
    public int f57924a;

    /* renamed from: b */
    public bxwc f57925b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f57926c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f57927d = bxxn.f165040b;

    /* renamed from: e */
    public int f57928e;

    static {
        abpy abpy = new abpy();
        f57922f = abpy;
        bxvk.m124024a(abpy.class, abpy);
    }

    private abpy() {
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
            return bxvk.m124022a(f57922f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001a\u0002\u001a\u0003\u001a\u0004ဌ\u0000", new Object[]{"a", "b", "c", "d", "e", abpz.f57929a});
        } else if (i2 == 3) {
            return new abpy();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f57922f;
            }
            bxxk bxxk = f57923g;
            if (bxxk == null) {
                synchronized (abpy.class) {
                    bxxk = f57923g;
                    if (bxxk == null) {
                        bxxk = new bxve(f57922f);
                        f57923g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo32282a() {
        if (!this.f57925b.mo73666a()) {
            this.f57925b = bxvk.m124021a(this.f57925b);
        }
    }
}
