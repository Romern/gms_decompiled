package p000;

/* renamed from: yjj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yjj extends ylm {

    /* renamed from: a */
    public final String f53926a;

    /* renamed from: b */
    public String f53927b;

    /* renamed from: c */
    public String f53928c;

    /* renamed from: d */
    public String f53929d;

    /* renamed from: e */
    public yjx f53930e = null;

    public yjj(String str) {
        this.f53926a = str;
        this.f54040r = ynn.LOCAL_AND_REMOTE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final yha mo30553a() {
        return yji.m44229a(this.f53927b, yjk.f53931c, this.f53928c);
    }

    /* renamed from: b */
    public final yjk mo30569b() {
        bmxy.m108582a(this.f53927b, "mergedStreamName not set");
        bmxy.m108582a(this.f53928c, "outputDataTypeName not set");
        bmxy.m108582a(this.f53929d, "outputStreamName not set");
        return new yjk(this);
    }
}
