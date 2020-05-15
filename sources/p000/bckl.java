package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

/* renamed from: bckl */
public final /* synthetic */ class bckl implements bqeh {

    /* renamed from: a */
    private final bcku f104382a;

    /* renamed from: b */
    private final bcoh f104383b;

    /* renamed from: c */
    private final ConversationId f104384c;

    /* renamed from: d */
    private final List f104385d;

    /* renamed from: e */
    private final bcej f104386e;

    public bckl(bcku bcku, bcoh bcoh, ConversationId conversationId, List list, bcej bcej) {
        this.f104382a = bcku;
        this.f104383b = bcoh;
        this.f104384c = conversationId;
        this.f104385d = list;
        this.f104386e = bcej;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bcku bcku = this.f104382a;
        bcoh bcoh = this.f104383b;
        ConversationId conversationId = this.f104384c;
        List list = this.f104385d;
        bcej bcej = this.f104386e;
        if (!((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) null);
        }
        return bcku.mo56965a(bcoh, conversationId, list, bcej, true);
    }
}
