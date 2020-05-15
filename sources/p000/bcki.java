package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bcki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcki {

    /* renamed from: a */
    public final bcjm f104374a;

    public bcki(bcjm bcjm) {
        this.f104374a = bcjm;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcmc, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo56964a(bcoh bcoh, ConversationId conversationId, bcej bcej, boolean z) {
        return this.f104374a.mo56941a(UUID.randomUUID(), (bcnl) new bcmc(bcoh, conversationId, z), this.f104374a.f104335d.mo56961c(), bcoh, bcej, true);
    }
}
