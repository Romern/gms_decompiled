package p000;

import java.util.List;
import java.util.UUID;

/* renamed from: bcmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcmy implements bcnl {

    /* renamed from: a */
    private final bcoh f104511a;

    /* renamed from: b */
    private final bbpw f104512b;

    public bcmy(bcoh bcoh, bbpw bbpw) {
        this.f104511a = bcoh;
        this.f104512b = bbpw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcmx((cbcu) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbcu.f176689d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo.getClass();
        ((cbcu) da.f164949b).f176691a = cbmo;
        bxtx c = this.f104511a.mo57059c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        c.getClass();
        ((cbcu) da.f164949b).f176692b = c;
        List a = this.f104512b.mo56349a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbcu cbcu = (cbcu) da.f164949b;
        if (!cbcu.f176693c.mo73666a()) {
            cbcu.f176693c = bxvk.m124019a(cbcu.f176693c);
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cbcu.f176693c.mo74153d(((Integer) a.get(i)).intValue());
        }
        return bqga.m112775a((cbcu) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cbcv cbcv = (cbcv) obj;
        return null;
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104511a.mo57058b().mo57074e());
        q.mo57010a(this.f104511a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(20);
        q.mo57003a(i);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        Void voidR = (Void) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104511a.mo57058b().mo57074e());
        q.mo57010a(this.f104511a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(20);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
