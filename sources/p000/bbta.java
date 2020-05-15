package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;

/* renamed from: bbta */
final /* synthetic */ class bbta implements bdaq {

    /* renamed from: a */
    private final bbub f103323a;

    /* renamed from: b */
    private final ConversationId f103324b;

    /* renamed from: c */
    private final Map f103325c;

    /* renamed from: d */
    private final bcej f103326d;

    public bbta(bbub bbub, ConversationId conversationId, Map map, bcej bcej) {
        this.f103323a = bbub;
        this.f103324b = conversationId;
        this.f103325c = map;
        this.f103326d = bcej;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        bbub bbub = this.f103323a;
        ConversationId conversationId = this.f103324b;
        Map map = this.f103325c;
        bcej bcej = this.f103326d;
        if (!((bcsh) obj).mo57298a()) {
            bbub.f103387h.mo25812a(new bbto(bbub, conversationId, map, bcej));
        }
    }
}
