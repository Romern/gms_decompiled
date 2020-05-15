package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: azpt */
final /* synthetic */ class azpt implements Runnable {

    /* renamed from: a */
    private final azpw f99849a;

    /* renamed from: b */
    private final bcoh f99850b;

    /* renamed from: c */
    private final ConversationId f99851c;

    /* renamed from: d */
    private final Integer f99852d;

    public azpt(azpw azpw, bcoh bcoh, ConversationId conversationId, Integer num) {
        this.f99849a = azpw;
        this.f99850b = bcoh;
        this.f99851c = conversationId;
        this.f99852d = num;
    }

    public final void run() {
        azpw azpw = this.f99849a;
        bcoh bcoh = this.f99850b;
        ConversationId conversationId = this.f99851c;
        int intValue = this.f99852d.intValue();
        azam b = azpw.mo55202b(bcoh, conversationId);
        azpw.mo55197a(bcoh, b, conversationId, intValue);
        b.f98854r = bmxv.m108566b(4);
        azpw.mo55195a(b, conversationId);
    }
}
