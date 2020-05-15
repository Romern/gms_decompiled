package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbvk */
final /* synthetic */ class bbvk implements Runnable {

    /* renamed from: a */
    private final bbwq f103516a;

    /* renamed from: b */
    private final bcoh f103517b;

    /* renamed from: c */
    private final ConversationId f103518c;

    public bbvk(bbwq bbwq, bcoh bcoh, ConversationId conversationId) {
        this.f103516a = bbwq;
        this.f103517b = bcoh;
        this.f103518c = conversationId;
    }

    public final void run() {
        bbwq bbwq = this.f103516a;
        bcoh bcoh = this.f103517b;
        ConversationId conversationId = this.f103518c;
        bbpi bbpi = bbwq.f103605c;
        new Object[1][0] = conversationId;
        azbq azbq = (azbq) bbpi;
        azph.m85998a(azbq.f98916a).mo55146a(1719, conversationId);
        if (!cfgs.m139400f()) {
            azbq.mo54576a(bcoh, conversationId);
        }
    }
}
