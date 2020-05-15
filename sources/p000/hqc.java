package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: hqc */
final /* synthetic */ class hqc implements bqeh {

    /* renamed from: a */
    private final hql f20218a;

    /* renamed from: b */
    private final hez f20219b;

    public hqc(hql hql, hez hez) {
        this.f20218a = hql;
        this.f20219b = hez;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adax.a(bngx, bmxj):bqgg
     arg types: [bngx, hqi]
     candidates:
      adax.a(bqgg, java.lang.Object):bqgg
      adax.a(java.lang.Iterable, bmxj):bqgg
      adax.a(bngx, bmxj):bqgg */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hql hql = this.f20218a;
        hez hez = this.f20219b;
        bngs j = bngx.m109377j();
        bnre i = ((bngx) obj).listIterator();
        while (i.hasNext()) {
            acyr acyr = (acyr) i.next();
            bnre i2 = hql.f20229b.listIterator();
            while (i2.hasNext()) {
                j.mo67668c(bqdf.m112619a(hez.mo12447a(adbj.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_HINTS_LIST_HINTS, ((hkz) i2.next()).mo12600a(acyr, hql.f20230c), ((Long) hfa.f19634c.mo58455c()).longValue(), TimeUnit.MILLISECONDS), Exception.class, hqh.f20224a, bqfb.INSTANCE));
            }
        }
        return adax.m50091a(j.mo67664a(), (bmxj) new hqi(hql));
    }
}
