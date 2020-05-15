package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bbvm */
final /* synthetic */ class bbvm implements bmxj {

    /* renamed from: a */
    private final bbwq f103519a;

    /* renamed from: b */
    private final bcoh f103520b;

    /* renamed from: c */
    private final bcsp f103521c;

    public bbvm(bbwq bbwq, bcoh bcoh, bcsp bcsp) {
        this.f103519a = bbwq;
        this.f103520b = bcoh;
        this.f103521c = bcsp;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcmm, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    public final Object apply(Object obj) {
        bbwq bbwq = this.f103519a;
        bcoh bcoh = this.f103520b;
        bcsp bcsp = this.f103521c;
        if (!((Boolean) obj).booleanValue()) {
            return false;
        }
        bbxw bbxw = bbwq.f103604b;
        ConversationId a = bcsp.mo57317a();
        bcei c = bcej.m88869c();
        c.f104034a = "get conversation properties";
        c.mo56735a(bcen.f104044e);
        bcku bcku = (bcku) bbxw;
        bqgg a2 = bcku.f104413a.mo56941a(UUID.randomUUID(), (bcnl) new bcmm(bcoh, a, bcku.f104416d), bcku.f104413a.f104335d.mo56963e(), bcoh, c.mo56734a(), true);
        int nextInt = bbwq.f103612j.nextInt(((Integer) bbqt.m88417a(bbwq.f103603a).f103143al.mo58455c()).intValue());
        try {
            Long valueOf = Long.valueOf(((Long) bbqt.m88417a(bbwq.f103603a).f103142ak.mo58455c()).longValue() + ((long) nextInt));
            bdal c2 = bbwq.mo56473c(bcoh);
            ConversationId a3 = bcsp.mo57317a();
            bngx a4 = ((bbyi) bqga.m112780a((Future) a2)).mo56508a();
            bbon.m88284a();
            return Boolean.valueOf(c2.mo56635a(a3, a4, System.currentTimeMillis() + valueOf.longValue()));
        } catch (ExecutionException e) {
            bbos.m88292b("LiMsgController", "Failed to get conversation properties", e);
            bbwq.mo56473c(bcoh).mo56635a(bcsp.mo57317a(), bcsp.mo57327k(), bcsp.mo57328l().longValue() + ((long) nextInt));
            return false;
        }
    }
}
