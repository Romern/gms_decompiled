package p000;

import java.util.UUID;

/* renamed from: bcnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcnp implements bcnl {

    /* renamed from: a */
    private final bcoh f104555a;

    public bcnp(bcoh bcoh) {
        this.f104555a = bcoh;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcno((cbls) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbls.f177558b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo.getClass();
        ((cbls) da.f164949b).f177560a = cbmo;
        return bqga.m112775a((cbls) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cblt cblt = (cblt) obj;
        bbpq b = bbpr.m88358b();
        b.f103039a = 1;
        return b.mo56337a();
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104555a.mo57058b().mo57074e());
        q.mo57010a(this.f104555a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(4);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57003a(i);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bbpr bbpr = (bbpr) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104555a.mo57058b().mo57074e());
        q.mo57010a(this.f104555a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(4);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
