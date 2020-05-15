package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bcnn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcnn implements bcnl {

    /* renamed from: a */
    private final bcoh f104552a;

    /* renamed from: b */
    private final ConversationId f104553b;

    public bcnn(bcoh bcoh, ConversationId conversationId) {
        this.f104552a = bcoh;
        this.f104553b = conversationId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcnm((cbcm) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbcm.f176669c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo.getClass();
        ((cbcm) da.f164949b).f176671a = cbmo;
        cbdl a = bcli.m89240a(this.f104553b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbcm) da.f164949b).f176672b = a;
        return bqga.m112775a((cbcm) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cbcn cbcn = (cbcn) obj;
        return null;
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104552a.mo57058b().mo57074e());
        q.mo57010a(this.f104552a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57008a(this.f104553b);
        q.mo57014c(7);
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
        q.mo57012b(this.f104552a.mo57058b().mo57074e());
        q.mo57010a(this.f104552a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57008a(this.f104553b);
        q.mo57014c(7);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
