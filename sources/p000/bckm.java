package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

/* renamed from: bckm */
final /* synthetic */ class bckm implements bqeh {

    /* renamed from: a */
    private final bcku f104387a;

    /* renamed from: b */
    private final bcoh f104388b;

    /* renamed from: c */
    private final ConversationId f104389c;

    /* renamed from: d */
    private final List f104390d;

    /* renamed from: e */
    private final bcej f104391e;

    public bckm(bcku bcku, bcoh bcoh, ConversationId conversationId, List list, bcej bcej) {
        this.f104387a = bcku;
        this.f104388b = bcoh;
        this.f104389c = conversationId;
        this.f104390d = list;
        this.f104391e = bcej;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bcku bcku = this.f104387a;
        bcoh bcoh = this.f104388b;
        ConversationId conversationId = this.f104389c;
        List list = this.f104390d;
        bcej bcej = this.f104391e;
        if (!((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) null);
        }
        return bcku.mo56965a(bcoh, conversationId, list, bcej, false);
    }
}
