package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
import java.util.UUID;

/* renamed from: bbxs */
final /* synthetic */ class bbxs implements Runnable {

    /* renamed from: a */
    private final bbxu f103712a;

    /* renamed from: b */
    private final bcoh f103713b;

    /* renamed from: c */
    private final ConversationId f103714c;

    /* renamed from: d */
    private final boolean f103715d;

    /* renamed from: e */
    private final long f103716e;

    /* renamed from: f */
    private final int f103717f;

    public bbxs(bbxu bbxu, bcoh bcoh, ConversationId conversationId, boolean z, long j, int i) {
        this.f103712a = bbxu;
        this.f103713b = bcoh;
        this.f103714c = conversationId;
        this.f103715d = z;
        this.f103716e = j;
        this.f103717f = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcnk, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    public final void run() {
        bbxu bbxu = this.f103712a;
        bcoh bcoh = this.f103713b;
        ConversationId conversationId = this.f103714c;
        boolean z = this.f103715d;
        long j = this.f103716e;
        int i = this.f103717f;
        if (bbxu.mo56499a()) {
            synchronized (bbxu) {
                Map map = bbxu.f103727e;
                bbon.m88284a();
                map.put(conversationId, Long.valueOf(System.currentTimeMillis()));
            }
            bcei c = bcej.m88869c();
            c.f104034a = "send typing indicator";
            c.mo56735a(bcen.f104044e);
            bcej a = c.mo56734a();
            bbxw bbxw = bbxu.f103724b;
            bcnk bcnk = new bcnk(bcoh, conversationId, z, j, bcku.m89204a(conversationId));
            bcku bcku = (bcku) bbxw;
            bcfx bcfx = bcku.f104415c;
            bcnr q = bcns.m89409q();
            q.mo57011b(18);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57013b(bcnk.f104545a);
            q.mo57008a(conversationId);
            bcfx.mo56753a(q.mo57002a());
            bcfx bcfx2 = bcku.f104415c;
            bcnr q2 = bcns.m89409q();
            q2.mo57011b(46);
            q2.mo57003a(i);
            q2.mo57012b(bcoh.mo57058b().mo57074e());
            q2.mo57010a(bcoh.mo57059c().mo73781l());
            q2.mo57013b(bcnk.f104545a);
            q2.mo57008a(conversationId);
            bcfx2.mo56753a(q2.mo57002a());
            bqga.m112781a(bcku.f104413a.mo56941a(UUID.randomUUID(), (bcnl) bcnk, bcku.f104413a.f104335d.mo56962d(), bcoh, a, true), new bckr(bcku, bcoh, bcnk, conversationId), bqfb.INSTANCE);
        }
    }
}
