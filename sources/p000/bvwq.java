package p000;

/* renamed from: bvwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvwq extends bxvk implements bxxd {

    /* renamed from: r */
    public static final bvwq f157983r;

    /* renamed from: s */
    private static volatile bxxk f157984s;

    /* renamed from: a */
    public int f157985a;

    /* renamed from: b */
    public long f157986b;

    /* renamed from: c */
    public bvxc f157987c;

    /* renamed from: d */
    public bvww f157988d;

    /* renamed from: e */
    public bvvz f157989e;

    /* renamed from: f */
    public bvwp f157990f;

    /* renamed from: g */
    public bvvl f157991g;

    /* renamed from: h */
    public bvvy f157992h;

    /* renamed from: i */
    public bxwc f157993i = bxxn.f165040b;

    /* renamed from: j */
    public bvva f157994j;

    /* renamed from: k */
    public bvwt f157995k;

    /* renamed from: l */
    public bvwd f157996l;

    /* renamed from: m */
    public bvxv f157997m;

    /* renamed from: n */
    public bvwr f157998n;

    /* renamed from: o */
    public bvwk f157999o;

    /* renamed from: p */
    public bvvr f158000p;

    /* renamed from: q */
    public bvxq f158001q;

    static {
        bvwq bvwq = new bvwq();
        f157983r = bvwq;
        bxvk.m124024a(bvwq.class, bvwq);
    }

    private bvwq() {
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
            return bxvk.m124022a(f157983r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b\u001b\tဉ\u0007\nဉ\b\u000bဉ\t\fဉ\n\rဉ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", bvyq.class, "j", "k", "l", "m", "n", "o", "p", "q"});
        } else if (i2 == 3) {
            return new bvwq();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[][][]) null, (short[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f157983r;
            }
            bxxk bxxk = f157984s;
            if (bxxk == null) {
                synchronized (bvwq.class) {
                    bxxk = f157984s;
                    if (bxxk == null) {
                        bxxk = new bxve(f157983r);
                        f157984s = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo73394a() {
        if (!this.f157993i.mo73666a()) {
            this.f157993i = bxvk.m124021a(this.f157993i);
        }
    }
}
