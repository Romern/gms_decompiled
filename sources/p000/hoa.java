package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: hoa */
final /* synthetic */ class hoa implements bqeg {

    /* renamed from: a */
    private final hoh f20106a;

    /* renamed from: b */
    private final hez f20107b;

    public hoa(hoh hoh, hez hez) {
        this.f20106a = hoh;
        this.f20107b = hez;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adax.a(bngx, bmxj):bqgg
     arg types: [bngx, hof]
     candidates:
      adax.a(bqgg, java.lang.Object):bqgg
      adax.a(java.lang.Iterable, bmxj):bqgg
      adax.a(bngx, bmxj):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        hoh hoh = this.f20106a;
        hez hez = this.f20107b;
        bngs j = bngx.m109377j();
        bnre i = hoh.f20117d.listIterator();
        while (i.hasNext()) {
            j.mo67668c(bqdf.m112619a(hez.mo12447a(adbj.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_LIST_CREDENTIALS, hoh.f20115b.mo12597a((acyr) i.next(), hoh.f20116c), ((Long) hfa.f19634c.mo58455c()).longValue(), TimeUnit.MILLISECONDS), Exception.class, hoe.f20111a, bqfb.INSTANCE));
        }
        return adax.m50091a(j.mo67664a(), (bmxj) new hof(hoh));
    }
}
