package p000;

/* renamed from: bsiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsiw extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bsiw f144758d;

    /* renamed from: e */
    private static volatile bxxk f144759e;

    /* renamed from: a */
    public bxwc f144760a = bxxn.f165040b;

    /* renamed from: b */
    public boolean f144761b;

    /* renamed from: c */
    public long f144762c;

    static {
        bsiw bsiw = new bsiw();
        f144758d = bsiw;
        GeneratedMessageLite.m124024a(bsiw.class, bsiw);
    }

    private bsiw() {
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
            return GeneratedMessageLite.m124022a(f144758d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003\u0002", new Object[]{"a", bsjf.class, "b", "c"});
        } else if (i2 == 3) {
            return new bsiw();
        } else {
            if (i2 == 4) {
                return new bsiv();
            }
            if (i2 == 5) {
                return f144758d;
            }
            bxxk bxxk = f144759e;
            if (bxxk == null) {
                synchronized (bsiw.class) {
                    bxxk = f144759e;
                    if (bxxk == null) {
                        bxxk = new bxve(f144758d);
                        f144759e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: a */
    public final void mo70625a() {
        if (!this.f144760a.mo73666a()) {
            this.f144760a = GeneratedMessageLite.m124021a(this.f144760a);
        }
    }
}
