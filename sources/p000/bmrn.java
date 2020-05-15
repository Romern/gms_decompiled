package p000;

/* renamed from: bmrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmrn extends GeneratedMessageLite implements bxxd {

    /* renamed from: i */
    public static final bmrn f130543i;

    /* renamed from: j */
    private static volatile bxxk f130544j;

    /* renamed from: a */
    public int f130545a;

    /* renamed from: b */
    public bxwc f130546b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f130547c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f130548d = bxxn.f165040b;

    /* renamed from: e */
    public bmkv f130549e;

    /* renamed from: f */
    public bxwc f130550f = bxxn.f165040b;

    /* renamed from: g */
    public ByteString f130551g = ByteString.f164797b;

    /* renamed from: h */
    public bmeu f130552h;

    static {
        bmrn bmrn = new bmrn();
        f130543i = bmrn;
        GeneratedMessageLite.m124024a(bmrn.class, bmrn);
    }

    private bmrn() {
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
            return GeneratedMessageLite.m124022a(f130543i, "\u0001\u0007\u0000\u0001\u0004\u000b\u0007\u0000\u0004\u0000\u0004\u001b\u0005\u001b\u0006\u001a\u0007ဉ\u0000\b\u001b\tည\u0001\u000bဉ\u0002", new Object[]{"a", "b", bmed.class, "c", bmfc.class, "d", "e", "f", bmog.class, "g", "h"});
        } else if (i2 == 3) {
            return new bmrn();
        } else {
            if (i2 == 4) {
                return new bmrm();
            }
            if (i2 == 5) {
                return f130543i;
            }
            bxxk bxxk = f130544j;
            if (bxxk == null) {
                synchronized (bmrn.class) {
                    bxxk = f130544j;
                    if (bxxk == null) {
                        bxxk = new bxve(f130543i);
                        f130544j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo66808b() {
        if (!this.f130547c.mo73666a()) {
            this.f130547c = GeneratedMessageLite.m124021a(this.f130547c);
        }
    }

    /* renamed from: c */
    public final void mo66809c() {
        if (!this.f130550f.mo73666a()) {
            this.f130550f = GeneratedMessageLite.m124021a(this.f130550f);
        }
    }

    /* renamed from: a */
    public final void mo66807a() {
        if (!this.f130546b.mo73666a()) {
            this.f130546b = GeneratedMessageLite.m124021a(this.f130546b);
        }
    }
}
