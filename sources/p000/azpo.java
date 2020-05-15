package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: azpo */
final /* synthetic */ class azpo implements bdaq {

    /* renamed from: a */
    private final azpw f99838a;

    /* renamed from: b */
    private final bcoh f99839b;

    /* renamed from: c */
    private final ConversationId f99840c;

    public azpo(azpw azpw, bcoh bcoh, ConversationId conversationId) {
        this.f99838a = azpw;
        this.f99839b = bcoh;
        this.f99840c = conversationId;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        azpw azpw = this.f99838a;
        bcoh bcoh = this.f99839b;
        ConversationId conversationId = this.f99840c;
        Integer num = (Integer) obj;
        if (num.intValue() > 0) {
            new soa(9, new azpt(azpw, bcoh, conversationId, num)).start();
        }
    }
}
