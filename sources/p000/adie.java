package p000;

/* renamed from: adie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adie extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final adie f61780d;

    /* renamed from: e */
    private static volatile bxxk f61781e;

    /* renamed from: a */
    public bxwc f61782a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f61783b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f61784c = bxxn.f165040b;

    static {
        adie adie = new adie();
        f61780d = adie;
        GeneratedMessageLite.m124024a(adie.class, adie);
    }

    private adie() {
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
            return GeneratedMessageLite.m124022a(f61780d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001Ț\u0002Ț\u0003Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new adie();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][][]) null, (int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f61780d;
            }
            bxxk bxxk = f61781e;
            if (bxxk == null) {
                synchronized (adie.class) {
                    bxxk = f61781e;
                    if (bxxk == null) {
                        bxxk = new bxve(f61780d);
                        f61781e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }

    /* renamed from: b */
    public final void mo33524b() {
        if (!this.f61783b.mo73666a()) {
            this.f61783b = GeneratedMessageLite.m124021a(this.f61783b);
        }
    }

    /* renamed from: c */
    public final void mo33525c() {
        if (!this.f61784c.mo73666a()) {
            this.f61784c = GeneratedMessageLite.m124021a(this.f61784c);
        }
    }

    /* renamed from: a */
    public final void mo33523a() {
        if (!this.f61782a.mo73666a()) {
            this.f61782a = GeneratedMessageLite.m124021a(this.f61782a);
        }
    }
}
