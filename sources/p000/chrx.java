package p000;

/* renamed from: chrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chrx {

    /* renamed from: a */
    public String f189067a;

    /* renamed from: b */
    public chry f189068b;

    /* renamed from: c */
    public chsi f189069c;

    /* renamed from: d */
    private Long f189070d;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.b(int, int):void
      bmxy.b(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final chrz mo85589a() {
        bmxy.m108582a(this.f189067a, "description");
        bmxy.m108582a(this.f189068b, "severity");
        bmxy.m108582a(this.f189070d, "timestampNanos");
        bmxy.m108601b(true, (Object) "at least one of channelRef and subchannelRef must be null");
        return new chrz(this.f189067a, this.f189068b, this.f189070d.longValue(), this.f189069c);
    }

    /* renamed from: a */
    public final void mo85590a(long j) {
        this.f189070d = Long.valueOf(j);
    }
}
