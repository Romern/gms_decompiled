package p000;

import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: bcmk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcmk implements bcnl {

    /* renamed from: a */
    public final bcoh f104479a;

    /* renamed from: b */
    private final int f104480b;

    /* renamed from: c */
    private final String f104481c;

    public bcmk(bcoh bcoh, int i, String str) {
        this.f104479a = bcoh;
        this.f104480b = i;
        this.f104481c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcmi((cbck) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbck.f176660d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbck cbck = (cbck) da.f164949b;
        cbmo.getClass();
        cbck.f176662a = cbmo;
        cbck.f176663b = this.f104480b;
        if (!TextUtils.isEmpty(this.f104481c)) {
            String str = this.f104481c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((cbck) da.f164949b).f176664c = str;
        }
        return bqga.m112775a((cbck) da.mo74062i());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bxwc, bcmj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cbcl cbcl = (cbcl) obj;
        bbpd c = bbpe.m88313c();
        c.mo56299a(cbcl.f176668b);
        c.mo56298a(bngx.m109368a((Collection) bnkn.m109668a((List) cbcl.f176667a, (bmxj) new bcmj(this))));
        return c.mo56297a();
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104479a.mo57058b().mo57074e());
        q.mo57010a(this.f104479a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(8);
        q.mo57003a(i);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bbpe bbpe = (bbpe) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104479a.mo57058b().mo57074e());
        q.mo57010a(this.f104479a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(8);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
