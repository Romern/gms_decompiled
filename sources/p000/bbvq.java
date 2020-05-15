package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bbvq */
final /* synthetic */ class bbvq implements bqeg {

    /* renamed from: a */
    private final bbwq f103530a;

    /* renamed from: b */
    private final bcoh f103531b;

    /* renamed from: c */
    private final bcsp f103532c;

    /* renamed from: d */
    private final bcej f103533d;

    public bbvq(bbwq bbwq, bcoh bcoh, bcsp bcsp, bcej bcej) {
        this.f103530a = bbwq;
        this.f103531b = bcoh;
        this.f103532c = bcsp;
        this.f103533d = bcej;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcmo, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo7073a() {
        bbwq bbwq = this.f103530a;
        bcoh bcoh = this.f103531b;
        bcsp bcsp = this.f103532c;
        bcej bcej = this.f103533d;
        bbxw bbxw = bbwq.f103604b;
        ConversationId a = bcsp.mo57317a();
        if (a.mo60556c() == ConversationId.IdType.GROUP) {
            bcku bcku = (bcku) bbxw;
            return bcku.f104413a.mo56941a(UUID.randomUUID(), (bcnl) new bcmo(bcoh, a, bcku.f104414b), bcku.f104413a.f104335d.mo56962d(), bcoh, bcej, true);
        }
        bbyj c = bbyk.m88611c();
        c.f103755b = 1;
        return bqga.m112775a(c.mo56546a());
    }
}
