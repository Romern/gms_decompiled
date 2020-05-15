package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bcne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcne implements bcnl {

    /* renamed from: a */
    public final String f104526a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final ConversationId f104527b;

    /* renamed from: c */
    private final cbds f104528c;

    /* renamed from: d */
    private final bmxv f104529d;

    /* renamed from: e */
    private final String f104530e;

    /* renamed from: f */
    private final bcoh f104531f;

    public bcne(bcoh bcoh, ConversationId conversationId, cbds cbds, bmxv bmxv, String str) {
        this.f104531f = bcoh;
        this.f104527b = conversationId;
        this.f104528c = cbds;
        this.f104529d = bmxv;
        this.f104530e = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcnd((byeb) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = byeb.f165885d.mo74144da();
        cbds cbds = this.f104528c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byeb byeb = (byeb) da.f164949b;
        cbds.getClass();
        byeb.f165888b = cbds;
        cbmo.getClass();
        byeb.f165887a = cbmo;
        cbff a = bclm.m89255a(this.f104526a, this.f104527b, this.f104529d, this.f104530e);
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
        byec byec = (byec) obj;
        return null;
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104531f.mo57058b().mo57074e());
        q.mo57010a(this.f104531f.mo57059c().mo73781l());
        q.mo57013b(this.f104526a);
        q.mo57008a(this.f104527b);
        q.mo57014c(19);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57003a(i);
        q.mo57004a(j);
        bcuv h = bcux.m90080h();
        h.mo57584a((String) this.f104529d.mo66812a(""));
        q.mo57005a(h.mo57583a());
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        Void voidR = (Void) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104531f.mo57058b().mo57074e());
        q.mo57010a(this.f104531f.mo57059c().mo73781l());
        q.mo57013b(this.f104526a);
        q.mo57008a(this.f104527b);
        q.mo57014c(19);
        q.mo57003a(1);
        q.mo57004a(j);
        bcuv h = bcux.m90080h();
        h.mo57584a((String) this.f104529d.mo66812a(""));
        q.mo57005a(h.mo57583a());
        bcfx.mo56753a(q.mo57002a());
    }
}
