package p000;

/* renamed from: brwy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brwy implements brxe {

    /* renamed from: a */
    private final bruo f143551a;

    public brwy(bruo bruo) {
        this.f143551a = bruo;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.b(int, int):void
      bmxy.b(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final bryh mo70011a(brxa brxa) {
        chqo chqo = brxa.f143554b;
        bmxy.m108601b(true, (Object) "Cronet does not support CallOptions.withAuthority(). See https://github.com/grpc/grpc-java/issues/1767");
        brum brum = (brum) chqo.mo85548a(brum.f143417a);
        if (brum == null) {
            String str = brxa.f143555c.f189150b;
            brum = this.f143551a.mo69988a(str);
            bmxy.m108587a(brum, "Could not find RpcId for method %s.Is portable_proto_filter set in your android_rpc_service?", str);
            chqo = chqo.mo85545a(brum.f143417a, brum);
        }
        return bryh.m114873a(chqo.mo85545a(aytz.f98488a, brum.mo69982a()));
    }

    /* renamed from: c */
    public final bryi mo70018c() {
        return bryi.f143654a;
    }

    /* renamed from: b */
    public final bryh mo70016b() {
        return bryh.f143647a;
    }

    /* renamed from: b */
    public final bryh mo70017b(brxa brxa) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryh mo70012a(brxb brxb) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryi mo70013a(brwz brwz) {
        return bryi.f143654a;
    }

    /* renamed from: a */
    public final bryi mo70014a(brxc brxc) {
        return bryi.f143654a;
    }
}
