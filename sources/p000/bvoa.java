package p000;

/* renamed from: bvoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvoa extends bxvk implements bxxd {

    /* renamed from: o */
    public static final bvoa f156994o;

    /* renamed from: q */
    private static volatile bxxk f156995q;

    /* renamed from: a */
    public int f156996a;

    /* renamed from: b */
    public bvni f156997b;

    /* renamed from: c */
    public boolean f156998c;

    /* renamed from: d */
    public int f156999d;

    /* renamed from: e */
    public int f157000e;

    /* renamed from: f */
    public String f157001f = "";

    /* renamed from: g */
    public int f157002g;

    /* renamed from: h */
    public bxwc f157003h = bxxn.f165040b;

    /* renamed from: i */
    public bxwc f157004i = bxxn.f165040b;

    /* renamed from: j */
    public bxwc f157005j;

    /* renamed from: k */
    public int f157006k;

    /* renamed from: l */
    public bvni f157007l;

    /* renamed from: m */
    public bxvs f157008m;

    /* renamed from: n */
    public bvnx f157009n;

    /* renamed from: p */
    private byte f157010p = 2;

    static {
        bvoa bvoa = new bvoa();
        f156994o = bvoa;
        bxvk.m124024a(bvoa.class, bvoa);
    }

    private bvoa() {
        bxwq bxwq = bxwq.f165002b;
        this.f157005j = bxxn.f165040b;
        this.f157008m = bxuz.f164939b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f157010p);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f157010p = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f156994o, "\u0001\r\u0000\u0001\u0001\u001b\r\u0000\u0004\u0004\u0001ᐉ\u0000\u0002ဍ\u0002\u0003ဍ\u0003\u0005ဈ\u0005\n\u001b\u000bဇ\u0001\f\u001b\u0012Л\u0015ဏ\u000e\u0017ᐉ\u0010\u0018$\u001aဌ\b\u001bᐉ\u0012", new Object[]{"a", "b", "d", "e", "f", "h", bvnz.class, "c", "i", bvod.class, "j", bvnc.class, "k", "l", "m", "g", bvng.f156860a, "n"});
        } else if (i2 == 3) {
            return new bvoa();
        } else {
            if (i2 == 4) {
                return new bxvd(f156994o);
            }
            if (i2 == 5) {
                return f156994o;
            }
            bxxk bxxk = f156995q;
            if (bxxk == null) {
                synchronized (bvoa.class) {
                    bxxk = f156995q;
                    if (bxxk == null) {
                        bxxk = new bxve(f156994o);
                        f156995q = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
