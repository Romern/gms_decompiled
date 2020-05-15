package p000;

import java.util.List;
import java.util.UUID;

/* renamed from: bcma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcma implements bcnl {

    /* renamed from: a */
    private final bcoh f104457a;

    /* renamed from: b */
    private final List f104458b;

    public bcma(bcoh bcoh, List list) {
        this.f104457a = bcoh;
        this.f104458b = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bclz((cbjk) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbjk.f177337c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo.getClass();
        ((cbjk) da.f164949b).f177339a = cbmo;
        List a = bclm.m89258a(this.f104457a, this.f104458b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbjk cbjk = (cbjk) da.f164949b;
        if (!cbjk.f177340b.mo73666a()) {
            cbjk.f177340b = GeneratedMessageLite.m124021a(cbjk.f177340b);
        }
        bxsy.m123078a(a, cbjk.f177340b);
        return bqga.m112775a((cbjk) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cbjl cbjl = (cbjl) obj;
        return null;
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104457a.mo57058b().mo57074e());
        q.mo57010a(this.f104457a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(13);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57003a(i);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        Void voidR = (Void) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104457a.mo57058b().mo57074e());
        q.mo57010a(this.f104457a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(13);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
