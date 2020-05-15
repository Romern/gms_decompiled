package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbuq */
final /* synthetic */ class bbuq implements bqeh {

    /* renamed from: a */
    private final bbwq f103452a;

    /* renamed from: b */
    private final bcoh f103453b;

    /* renamed from: c */
    private final ConversationId f103454c;

    /* renamed from: d */
    private final String f103455d;

    public bbuq(bbwq bbwq, bcoh bcoh, ConversationId conversationId, String str) {
        this.f103452a = bbwq;
        this.f103453b = bcoh;
        this.f103454c = conversationId;
        this.f103455d = str;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbwq bbwq = this.f103452a;
        bcoh bcoh = this.f103453b;
        ConversationId conversationId = this.f103454c;
        String str = this.f103455d;
        if (!((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) null);
        }
        bqgy c = bqgy.m112818c();
        bbwq.f103607e.mo56561a(bcoh).mo56612a(conversationId, 1, 0, bctq.f104885f).mo57830c(new bbuu(c));
        return bqdx.m112674a(c, new bbut(bbwq, bcoh, conversationId, str), bbwq.f103606d);
    }
}
