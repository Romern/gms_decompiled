package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: yja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class yja extends ylm {

    /* renamed from: l */
    private static final ykz f53899l = new yky().mo30593a();

    /* renamed from: a */
    public final String f53900a;

    /* renamed from: b */
    public yjf f53901b;

    /* renamed from: c */
    public ygd f53902c;

    /* renamed from: d */
    public bmxz f53903d;

    /* renamed from: e */
    public yjx f53904e;

    /* renamed from: f */
    public long f53905f;

    /* renamed from: g */
    protected String f53906g;

    /* renamed from: h */
    public String f53907h;

    /* renamed from: i */
    public String f53908i;

    /* renamed from: j */
    public String f53909j;

    /* renamed from: k */
    public boolean f53910k;

    /* renamed from: m */
    private long f53911m;

    /* renamed from: n */
    private int f53912n;

    public yja(String str) {
        this.f53901b = f53899l;
        this.f53902c = ygv.f53779i;
        this.f53903d = bmyd.ALWAYS_TRUE;
        this.f53904e = new yjr();
        this.f53905f = 0;
        this.f53911m = 0;
        this.f53912n = 0;
        this.f53910k = false;
        this.f54040r = ynn.LOCAL_AND_REMOTE;
        this.f53900a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public yha mo30553a() {
        ygy ygy = new ygy(this.f53907h);
        ygy.mo30480c(this.f53905f, TimeUnit.MILLISECONDS);
        ygy.mo30478b(this.f53911m, TimeUnit.MILLISECONDS);
        ygy.f53795j = this.f53912n;
        yha yha = new yha(bngx.m109356a(ygy));
        yha.mo30484a(this.f53907h, yhc.m44077a(ygv.m44053a(ygv.m44056b(ygv.m44057b(this.f53909j)), mo30558c(), this.f53902c), this.f54040r));
        return yha;
    }

    /* renamed from: b */
    public final void mo30557b() {
        boolean z;
        long j = this.f53905f;
        if (j <= 0 || this.f53912n <= 0) {
            z = true;
        } else {
            z = false;
        }
        int i = this.f53912n;
        if (!z) {
            throw new IllegalArgumentException(bmzh.m108675a("cannot set both read behind values, read behind millis: %s, read behind data limit: %s", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ygd mo30558c() {
        String str = this.f53908i;
        if (str != null) {
            return ygv.m44056b(ygv.m44050a(str));
        }
        return ygv.f53779i;
    }

    /* renamed from: d */
    public final void mo30559d() {
        this.f53912n = 1;
    }

    public yja(String str, byte[] bArr) {
        this(str);
        this.f53907h = "com.google.activity.segment";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo30554a(String str) {
        bmxy.m108589a(true, (Object) "invalid merged stream name specified");
        this.f53906g = str;
    }

    /* renamed from: a */
    public final void mo30555a(TimeUnit timeUnit) {
        this.f53911m = timeUnit.toMillis(1);
    }

    /* renamed from: a */
    public final void mo30556a(yjf yjf) {
        bmxy.m108589a(yjf != null, "invalid sensor comparator specified");
        this.f53901b = yjf;
    }
}
