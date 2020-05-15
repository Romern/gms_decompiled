package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bbvw */
final /* synthetic */ class bbvw implements Callable {

    /* renamed from: a */
    private final bbwq f103547a;

    /* renamed from: b */
    private final bcoh f103548b;

    /* renamed from: c */
    private final bnhe f103549c;

    /* renamed from: d */
    private final ConversationId f103550d;

    public bbvw(bbwq bbwq, bcoh bcoh, bnhe bnhe, ConversationId conversationId) {
        this.f103547a = bbwq;
        this.f103548b = bcoh;
        this.f103549c = bnhe;
        this.f103550d = conversationId;
    }

    public final Object call() {
        this.f103547a.mo56473c(this.f103548b).mo56633a((List) this.f103549c.get(this.f103550d));
        return null;
    }
}
