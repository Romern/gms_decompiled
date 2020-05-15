package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.Map;

/* renamed from: bbto */
final /* synthetic */ class bbto implements Runnable {

    /* renamed from: a */
    private final bbub f103352a;

    /* renamed from: b */
    private final ConversationId f103353b;

    /* renamed from: c */
    private final Map f103354c;

    /* renamed from: d */
    private final bcej f103355d;

    public bbto(bbub bbub, ConversationId conversationId, Map map, bcej bcej) {
        this.f103352a = bbub;
        this.f103353b = conversationId;
        this.f103354c = map;
        this.f103355d = bcej;
    }

    public final void run() {
        bbub bbub = this.f103352a;
        ConversationId conversationId = this.f103353b;
        Map map = this.f103354c;
        bqga.m112786c(bbub.f103383d.mo56502a(bbub.f103381b, conversationId, bngx.m109368a((Collection) map.get(conversationId)), this.f103355d)).mo69216a(new bbtp(bbub, map, conversationId), bbub.f103387h);
    }
}
