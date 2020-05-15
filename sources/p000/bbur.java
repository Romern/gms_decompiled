package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;

/* renamed from: bbur */
final /* synthetic */ class bbur implements Callable {

    /* renamed from: a */
    private final bbwq f103456a;

    /* renamed from: b */
    private final bcoh f103457b;

    /* renamed from: c */
    private final ConversationId f103458c;

    public bbur(bbwq bbwq, bcoh bcoh, ConversationId conversationId) {
        this.f103456a = bbwq;
        this.f103457b = bcoh;
        this.f103458c = conversationId;
    }

    public final Object call() {
        bbwq bbwq = this.f103456a;
        bcoh bcoh = this.f103457b;
        ConversationId conversationId = this.f103458c;
        bbqe a = bbqe.m88387a(bbwq.f103603a);
        if (!a.mo56357a(25, a.f103062a.f103159ba)) {
            return null;
        }
        ((bbsc) bbwq.f103617o).mo56392a(bcoh, conversationId.mo60558e(), bmyd.ALWAYS_TRUE).mo57832f();
        return null;
    }
}
