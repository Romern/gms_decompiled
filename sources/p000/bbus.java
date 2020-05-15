package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bbus */
final /* synthetic */ class bbus implements bqeg {

    /* renamed from: a */
    private final bbwq f103459a;

    /* renamed from: b */
    private final bcoh f103460b;

    /* renamed from: c */
    private final ConversationId f103461c;

    /* renamed from: d */
    private final bcop f103462d;

    /* renamed from: e */
    private final String f103463e;

    /* renamed from: f */
    private final bmxv f103464f;

    public bbus(bbwq bbwq, bcoh bcoh, ConversationId conversationId, bcop bcop, String str, bmxv bmxv) {
        this.f103459a = bbwq;
        this.f103460b = bcoh;
        this.f103461c = conversationId;
        this.f103462d = bcop;
        this.f103463e = str;
        this.f103464f = bmxv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcne, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bbwq bbwq = this.f103459a;
        bcoh bcoh = this.f103460b;
        ConversationId conversationId = this.f103461c;
        bcop bcop = this.f103462d;
        String str = this.f103463e;
        bmxv bmxv = this.f103464f;
        bbxw bbxw = bbwq.f103604b;
        bcei c = bcej.m88869c();
        c.f104034a = "send button or chip clicked event";
        c.mo56735a(bcen.f104044e);
        bcej a = c.mo56734a();
        bcne bcne = new bcne(bcoh, conversationId, bclk.m89244a(bcop), bmxv, str);
        bcku bcku = (bcku) bbxw;
        bcfx bcfx = bcku.f104415c;
        bcnr q = bcns.m89409q();
        q.mo57011b(18);
        q.mo57012b(bcoh.mo57058b().mo57074e());
        q.mo57010a(bcoh.mo57059c().mo73781l());
        q.mo57013b(bcne.f104526a);
        q.mo57008a(conversationId);
        bcfx.mo56753a(q.mo57002a());
        bqgg a2 = bcku.f104413a.mo56941a(UUID.randomUUID(), (bcnl) bcne, bcku.f104413a.f104335d.mo56962d(), bcoh, a, true);
        bqga.m112781a(a2, new bckt(bcku, bcoh, bcne, conversationId), bqfb.INSTANCE);
        return a2;
    }
}
