package p000;

import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.HashMap;
import java.util.Random;

/* renamed from: bbwf */
final /* synthetic */ class bbwf implements bmxj {

    /* renamed from: a */
    private final bbwq f103576a;

    /* renamed from: b */
    private final ConversationId f103577b;

    /* renamed from: c */
    private final bmxz f103578c;

    /* renamed from: d */
    private final bmxz f103579d;

    /* renamed from: e */
    private final bcoh f103580e;

    public bbwf(bbwq bbwq, ConversationId conversationId, bmxz bmxz, bmxz bmxz2, bcoh bcoh) {
        this.f103576a = bbwq;
        this.f103577b = conversationId;
        this.f103578c = bmxz;
        this.f103579d = bmxz2;
        this.f103580e = bcoh;
    }

    public final Object apply(Object obj) {
        bcsp bcsp;
        boolean z;
        bqgg bqgg;
        boolean z2;
        bbwq bbwq = this.f103576a;
        ConversationId conversationId = this.f103577b;
        bmxz bmxz = this.f103578c;
        bmxz bmxz2 = this.f103579d;
        bcoh bcoh = this.f103580e;
        bmxv bmxv = (bmxv) obj;
        if (!bmxv.mo66813a()) {
            bcso n = bcsp.m89835n();
            n.mo57461a(conversationId);
            n.mo57462a((Long) -1L);
            n.mo57464a(new HashMap());
            if (conversationId.mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
                z2 = true;
            } else {
                z2 = false;
            }
            n.mo57465a(z2);
            bcsp = n.mo57457a();
            z = false;
        } else {
            z = bmxz.mo6527a((bcsp) bmxv.mo66814b());
            bcsp = (bcsp) bmxv.mo66814b();
        }
        boolean a = bmxz2.mo6527a(bcsp);
        bqgg a2 = bqga.m112775a(bcsp);
        if (z) {
            synchronized (bbwq.f103610h) {
                Pair create = Pair.create(bcoh, bcsp.mo57317a());
                bqgg = (bqgg) bbwq.f103614l.get(create);
                if (bqgg == null) {
                    bqgg a3 = bbqt.m88418a(bbqt.m88417a(bbwq.f103603a).f103178t, bbwq.f103606d);
                    Random random = bbwq.f103612j;
                    random.getClass();
                    bqgg a4 = bqdx.m112673a(a3, new bbvv(random), bqfb.INSTANCE);
                    bqgg a5 = bbqt.m88418a(bbqt.m88417a(bbwq.f103603a).f103177s, bbwq.f103606d);
                    bcei c = bcej.m88869c();
                    c.f104034a = "sync conversation profile";
                    c.mo56735a(bcen.f104044e);
                    bqgg a6 = bqga.m112771a(new bbvq(bbwq, bcoh, bcsp, c.mo56734a()), bbwq.f103606d);
                    bqgg = bqga.m112783b(a4, a5, a6).mo69216a(new bbvr(bbwq, bcoh, bcsp, a4, a5, a6), bqfb.INSTANCE);
                    bbwq.f103614l.put(create, bqgg);
                    bqgg.mo741a(new bbvn(bbwq, create), bqfb.INSTANCE);
                }
            }
            a2 = bqdx.m112674a(bqgg, new bbvo(bbwq, bcsp, bcoh), bqfb.INSTANCE);
        } else if (bcsp.mo57321e() && !bcsp.mo57320d().mo66813a()) {
            a2 = bbwq.mo56468a(bcoh, bcsp);
        }
        if (a) {
            bqga.m112783b(a2).mo69214a(new bbwe(bbwq, bcoh, bcsp), bbwq.f103606d);
        }
        return bcsp;
    }
}
