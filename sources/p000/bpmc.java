package p000;

/* renamed from: bpmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpmc extends bxvk implements bxxd {

    /* renamed from: m */
    public static final bpmc f138211m;

    /* renamed from: n */
    private static volatile bxxk f138212n;

    /* renamed from: a */
    public int f138213a;

    /* renamed from: b */
    public bpma f138214b;

    /* renamed from: c */
    public bxwc f138215c = bxxn.f165040b;

    /* renamed from: d */
    public bplt f138216d;

    /* renamed from: e */
    public bplt f138217e;

    /* renamed from: f */
    public bpkr f138218f;

    /* renamed from: g */
    public int f138219g;

    /* renamed from: h */
    public bplu f138220h;

    /* renamed from: i */
    public bpls f138221i;

    /* renamed from: j */
    public bplq f138222j;

    /* renamed from: k */
    public bplv f138223k;

    /* renamed from: l */
    public bxwc f138224l = bxxn.f165040b;

    static {
        bpmc bpmc = new bpmc();
        f138211m = bpmc;
        bxvk.m124024a(bpmc.class, bpmc);
    }

    private bpmc() {
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
            return bxvk.m124022a(f138211m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဌ\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000b\u001b", new Object[]{"a", "b", "c", bpmd.class, "d", "e", "f", "g", bpmb.f138210a, "h", "i", "j", "k", "l", bplz.class});
        } else if (i2 == 3) {
            return new bpmc();
        } else {
            if (i2 == 4) {
                return new bxvd((float[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return f138211m;
            }
            bxxk bxxk = f138212n;
            if (bxxk == null) {
                synchronized (bpmc.class) {
                    bxxk = f138212n;
                    if (bxxk == null) {
                        bxxk = new bxve(f138211m);
                        f138212n = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
