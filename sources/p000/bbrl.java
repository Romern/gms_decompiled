package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bbrl */
final /* synthetic */ class bbrl implements bqeg {

    /* renamed from: a */
    private final bbrr f103217a;

    /* renamed from: b */
    private final bcoh f103218b;

    /* renamed from: c */
    private final ConversationId f103219c;

    /* renamed from: d */
    private final bcej f103220d;

    public bbrl(bbrr bbrr, bcoh bcoh, ConversationId conversationId, bcej bcej) {
        this.f103217a = bbrr;
        this.f103218b = bcoh;
        this.f103219c = conversationId;
        this.f103220d = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcnn, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bbrr bbrr = this.f103217a;
        bcoh bcoh = this.f103218b;
        ConversationId conversationId = this.f103219c;
        bcej bcej = this.f103220d;
        bcki bcki = bbrr.f103238f;
        return bcki.f104374a.mo56941a(UUID.randomUUID(), (bcnl) new bcnn(bcoh, conversationId), bcki.f104374a.f104335d.mo56961c(), bcoh, bcej, true);
    }
}
