package p000;

/* renamed from: bqsj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqsj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bqsj f141531c;

    /* renamed from: d */
    private static volatile bxxk f141532d;

    /* renamed from: a */
    public int f141533a;

    /* renamed from: b */
    public bxwc f141534b = bxxn.f165040b;

    static {
        bqsj bqsj = new bqsj();
        f141531c = bqsj;
        bxvk.m124024a(bqsj.class, bqsj);
    }

    private bqsj() {
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
            return bxvk.m124022a(f141531c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"a", "b", bqsi.class});
        } else if (i2 == 3) {
            return new bqsj();
        } else {
            if (i2 == 4) {
                return new bqsh();
            }
            if (i2 == 5) {
                return f141531c;
            }
            bxxk bxxk = f141532d;
            if (bxxk == null) {
                synchronized (bqsj.class) {
                    bxxk = f141532d;
                    if (bxxk == null) {
                        bxxk = new bxve(f141531c);
                        f141532d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo69328a() {
        if (!this.f141534b.mo73666a()) {
            this.f141534b = bxvk.m124021a(this.f141534b);
        }
    }
}
