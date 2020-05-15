package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.TimeUnit;

/* renamed from: bbuy */
final /* synthetic */ class bbuy implements Runnable {

    /* renamed from: a */
    private final bbwq f103481a;

    /* renamed from: b */
    private final bcoh f103482b;

    /* renamed from: c */
    private final ConversationId f103483c;

    public bbuy(bbwq bbwq, bcoh bcoh, ConversationId conversationId) {
        this.f103481a = bbwq;
        this.f103482b = bcoh;
        this.f103483c = conversationId;
    }

    public final void run() {
        bbwq bbwq = this.f103481a;
        bcoh bcoh = this.f103482b;
        ConversationId conversationId = this.f103483c;
        bnre i = bbwq.mo56473c(bcoh).mo56618a(conversationId, bctk.f104859b, bctk.f104860c).listIterator();
        while (i.hasNext()) {
            bcfx bcfx = bbwq.f103608f;
            bcnr q = bcns.m89409q();
            q.mo57011b(4);
            q.mo57012b(bcoh.mo57058b().mo57074e());
            q.mo57010a(bcoh.mo57059c().mo73781l());
            q.mo57013b((String) i.next());
            q.mo57008a(conversationId);
            bcfx.mo56753a(q.mo57002a());
        }
        if (((Boolean) bbqt.m88417a(bbwq.f103603a).f103088J.mo58455c()).booleanValue()) {
            bcei c = bcej.m88869c();
            c.f104034a = "message receipt";
            c.mo56735a(bcen.f104044e);
            bcej a = c.mo56734a();
            bdal c2 = bbwq.mo56473c(bcoh);
            bctk bctk = bctk.f104860c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bbon.m88284a();
            bngx a2 = c2.mo56617a(conversationId, bctk, timeUnit.toMicros(System.currentTimeMillis() - ((Long) bbqt.m88417a(bbwq.f103603a).f103182x.mo58455c()).longValue()));
            if (!a2.isEmpty()) {
                bcku bcku = (bcku) bbwq.f103604b;
                bqga.m112786c(bqdx.m112674a(bbqt.m88418a(bbqt.m88417a(bcku.f104414b).f103088J, bqgs.m112810a()), new bckl(bcku, bcoh, conversationId, a2, a), bqfb.INSTANCE)).mo69215a(new bbuw(bbwq, bcoh, conversationId, a2), bqfb.INSTANCE);
            }
        }
    }
}
