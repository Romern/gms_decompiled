package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bcmc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcmc implements bcnl {

    /* renamed from: a */
    private final bcoh f104460a;

    /* renamed from: b */
    private final ConversationId f104461b;

    /* renamed from: c */
    private final boolean f104462c;

    public bcmc(bcoh bcoh, ConversationId conversationId, boolean z) {
        this.f104460a = bcoh;
        this.f104461b = conversationId;
        this.f104462c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcmb((cbci) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbci.f176653d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbci cbci = (cbci) da.f164949b;
        cbmo.getClass();
        cbci.f176655a = cbmo;
        cbci.f176657c = this.f104462c;
        cbdl a = bcli.m89240a(this.f104461b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbci) da.f164949b).f176656b = a;
        return bqga.m112775a((cbci) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cbcj cbcj = (cbcj) obj;
        return null;
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104460a.mo57058b().mo57074e());
        q.mo57010a(this.f104460a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57008a(this.f104461b);
        q.mo57014c(6);
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
        q.mo57012b(this.f104460a.mo57058b().mo57074e());
        q.mo57010a(this.f104460a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57008a(this.f104461b);
        q.mo57014c(6);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
