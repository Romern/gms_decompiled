package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbwg */
final /* synthetic */ class bbwg implements bdaq {

    /* renamed from: a */
    private final bbwq f103581a;

    /* renamed from: b */
    private final ConversationId f103582b;

    /* renamed from: c */
    private final bchq f103583c;

    /* renamed from: d */
    private final bcoh f103584d;

    public bbwg(bbwq bbwq, ConversationId conversationId, bchq bchq, bcoh bcoh) {
        this.f103581a = bbwq;
        this.f103582b = conversationId;
        this.f103583c = bchq;
        this.f103584d = bcoh;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        bbwq bbwq = this.f103581a;
        ConversationId conversationId = this.f103582b;
        bchq bchq = this.f103583c;
        bcoh bcoh = this.f103584d;
        bmxv bmxv = (bmxv) obj;
        if (!bmxv.mo66813a()) {
            String valueOf = String.valueOf(conversationId);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
            sb.append("Profile changes received for non-existent conversation: ");
            sb.append(valueOf);
            bbos.m88294d("LiMsgController", sb.toString());
            return;
        }
        String valueOf2 = String.valueOf(bchq);
        String valueOf3 = String.valueOf(conversationId);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36 + String.valueOf(valueOf3).length());
        sb2.append("Profile changes: ");
        sb2.append(valueOf2);
        sb2.append(" for conversation: ");
        sb2.append(valueOf3);
        bbos.m88289a("LiMsgController", sb2.toString());
        bbwq.f103606d.mo25812a(new bbwc(bbwq, bmxv, bchq, bcoh));
    }
}
