package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbva */
final /* synthetic */ class bbva implements Runnable {

    /* renamed from: a */
    private final bbwq f103485a;

    /* renamed from: b */
    private final bcoh f103486b;

    /* renamed from: c */
    private final ConversationId f103487c;

    public bbva(bbwq bbwq, bcoh bcoh, ConversationId conversationId) {
        this.f103485a = bbwq;
        this.f103486b = bcoh;
        this.f103487c = conversationId;
    }

    public final void run() {
        bbwq bbwq = this.f103485a;
        bcoh bcoh = this.f103486b;
        ConversationId conversationId = this.f103487c;
        bcfx bcfx = bbwq.f103608f;
        bcnr q = bcns.m89409q();
        q.mo57011b(10017);
        q.mo57012b(bcoh.mo57058b().mo57074e());
        q.mo57008a(conversationId);
        bcfx.mo56753a(q.mo57002a());
        bbwq.mo56473c(bcoh).mo56646b(conversationId);
        bcfx bcfx2 = bbwq.f103608f;
        bcnr q2 = bcns.m89409q();
        q2.mo57011b(10018);
        q2.mo57012b(bcoh.mo57058b().mo57074e());
        q2.mo57008a(conversationId);
        bcfx2.mo56753a(q2.mo57002a());
        bcfx bcfx3 = bbwq.f103608f;
        bcnr q3 = bcns.m89409q();
        q3.mo57011b(10019);
        q3.mo57012b(bcoh.mo57058b().mo57074e());
        q3.mo57008a(conversationId);
        bcfx3.mo56753a(q3.mo57002a());
    }
}
