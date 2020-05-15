package p000;

import android.content.Context;
import java.util.Map;
import java.util.UUID;

/* renamed from: bcng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcng implements bcnl {

    /* renamed from: a */
    private final bcoh f104533a;

    /* renamed from: b */
    private final Context f104534b;

    /* renamed from: c */
    private final bctr f104535c;

    /* renamed from: d */
    private final cbds f104536d;

    /* renamed from: e */
    private final Map f104537e;

    public bcng(bcoh bcoh, Context context, bctr bctr, cbds cbds, Map map) {
        this.f104533a = bcoh;
        this.f104534b = context;
        this.f104535c = bctr;
        this.f104536d = cbds;
        this.f104537e = map;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcnf((byeb) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = byeb.f165885d.mo74144da();
        cbds cbds = this.f104536d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byeb byeb = (byeb) da.f164949b;
        cbds.getClass();
        byeb.f165888b = cbds;
        cbmo.getClass();
        byeb.f165887a = cbmo;
        cbff a = bclm.m89254a(this.f104534b, this.f104535c, this.f104537e);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((byeb) da.f164949b).f165889c = a;
        return bqga.m112775a((byeb) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        bbyt bbyt = new bbyt(null);
        bbyt.f103769b = 1;
        bbyt.f103768a = bmxv.m108566b(Long.valueOf(((byec) obj).f165892a));
        bbyt.f103769b = 2;
        return new bbye(2, bbyt.f103768a);
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104533a.mo57058b().mo57074e());
        q.mo57010a(this.f104533a.mo57059c().mo73781l());
        q.mo57013b(this.f104535c.mo57359a());
        q.mo57008a(this.f104535c.mo57361c());
        q.mo57014c(12);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57003a(i);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bbyu bbyu = (bbyu) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104533a.mo57058b().mo57074e());
        q.mo57010a(this.f104533a.mo57059c().mo73781l());
        q.mo57013b(this.f104535c.mo57359a());
        q.mo57008a(this.f104535c.mo57361c());
        q.mo57014c(12);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
