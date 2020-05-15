package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbsl */
public final /* synthetic */ class bbsl implements bqeh {

    /* renamed from: a */
    private final bbsw f103298a;

    /* renamed from: b */
    private final bqgg f103299b;

    /* renamed from: c */
    private final bcoh f103300c;

    /* renamed from: d */
    private final ConversationId f103301d;

    public bbsl(bbsw bbsw, bqgg bqgg, bcoh bcoh, ConversationId conversationId) {
        this.f103298a = bbsw;
        this.f103299b = bqgg;
        this.f103300c = bcoh;
        this.f103301d = conversationId;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbsw bbsw = this.f103298a;
        bqgg bqgg = this.f103299b;
        bcoh bcoh = this.f103300c;
        ConversationId conversationId = this.f103301d;
        Boolean bool = (Boolean) obj;
        if (!bool.booleanValue()) {
            return bqgg;
        }
        bqgy c = bqgy.m112818c();
        bbsw.f103317c.mo56561a(bcoh).mo56610a(conversationId).mo57830c(new bbsm(bbsw, c, bool, bqgg));
        return c;
    }
}
