package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: bbtp */
final /* synthetic */ class bbtp implements Callable {

    /* renamed from: a */
    private final bbub f103356a;

    /* renamed from: b */
    private final Map f103357b;

    /* renamed from: c */
    private final ConversationId f103358c;

    public bbtp(bbub bbub, Map map, ConversationId conversationId) {
        this.f103356a = bbub;
        this.f103357b = map;
        this.f103358c = conversationId;
    }

    public final Object call() {
        this.f103356a.f103384e.mo56633a((List) bngx.m109368a((Collection) this.f103357b.get(this.f103358c)));
        return null;
    }
}
