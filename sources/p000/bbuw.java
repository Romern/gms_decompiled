package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;

/* renamed from: bbuw */
final /* synthetic */ class bbuw implements Runnable {

    /* renamed from: a */
    private final bbwq f103474a;

    /* renamed from: b */
    private final bcoh f103475b;

    /* renamed from: c */
    private final ConversationId f103476c;

    /* renamed from: d */
    private final bngx f103477d;

    public bbuw(bbwq bbwq, bcoh bcoh, ConversationId conversationId, bngx bngx) {
        this.f103474a = bbwq;
        this.f103475b = bcoh;
        this.f103476c = conversationId;
        this.f103477d = bngx;
    }

    public final void run() {
        bbwq bbwq = this.f103474a;
        bcoh bcoh = this.f103475b;
        ConversationId conversationId = this.f103476c;
        bngx bngx = this.f103477d;
        bbwq.mo56473c(bcoh).mo56631a(conversationId, bngx, Arrays.asList(bctk.f104860c), bctk.f104861d);
    }
}
