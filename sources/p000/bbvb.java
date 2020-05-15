package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bbvb */
final /* synthetic */ class bbvb implements bqeg {

    /* renamed from: a */
    private final bbwq f103488a;

    /* renamed from: b */
    private final ConversationId f103489b;

    /* renamed from: c */
    private final long f103490c;

    /* renamed from: d */
    private final bcoh f103491d;

    public bbvb(bbwq bbwq, ConversationId conversationId, long j, bcoh bcoh) {
        this.f103488a = bbwq;
        this.f103489b = conversationId;
        this.f103490c = j;
        this.f103491d = bcoh;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcmh, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bbwq bbwq = this.f103488a;
        ConversationId conversationId = this.f103489b;
        long j = this.f103490c;
        bcoh bcoh = this.f103491d;
        bbxw bbxw = bbwq.f103604b;
        bcei c = bcej.m88869c();
        c.f104034a = "delete conversations";
        c.mo56735a(bcen.f104044e);
        bcej a = c.mo56734a();
        bcmh bcmh = new bcmh(bngx.m109356a(conversationId), j, bcoh);
        bcku bcku = (bcku) bbxw;
        return bcku.f104413a.mo56941a(UUID.randomUUID(), (bcnl) bcmh, bqga.m112775a(new bcjn((cbdb) ciih.m150373a(new cbda(), bcku.f104413a.f104335d.f104373c))), bcoh, a, true);
    }
}
