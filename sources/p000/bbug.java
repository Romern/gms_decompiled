package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.ExecutionException;

/* renamed from: bbug */
final /* synthetic */ class bbug implements bmxj {

    /* renamed from: a */
    private final bbwq f103416a;

    /* renamed from: b */
    private final bcoh f103417b;

    /* renamed from: c */
    private final ConversationId f103418c;

    /* renamed from: d */
    private final Integer f103419d;

    /* renamed from: e */
    private final Integer f103420e;

    /* renamed from: f */
    private final bctq[] f103421f;

    public bbug(bbwq bbwq, bcoh bcoh, ConversationId conversationId, Integer num, Integer num2, bctq[] bctqArr) {
        this.f103416a = bbwq;
        this.f103417b = bcoh;
        this.f103418c = conversationId;
        this.f103419d = num;
        this.f103420e = num2;
        this.f103421f = bctqArr;
    }

    public final Object apply(Object obj) {
        bbwq bbwq = this.f103416a;
        bcoh bcoh = this.f103417b;
        ConversationId conversationId = this.f103418c;
        Integer num = this.f103419d;
        Integer num2 = this.f103420e;
        bctq[] bctqArr = this.f103421f;
        Integer num3 = (Integer) obj;
        try {
            long longValue = ((Long) bbqt.m88418a(bbqt.m88417a(bbwq.f103603a).f103181w, bqgs.m112810a()).get()).longValue();
            bbwq.mo56473c(bcoh).mo56628a(conversationId, ((Long) bbqt.m88418a(bbqt.m88417a(bbwq.f103603a).f103180v, bqgs.m112810a()).get()).longValue(), longValue);
        } catch (InterruptedException | ExecutionException e) {
            bbos.m88292b("LiMsgController", "Failed to update stale sending messages", e);
        }
        bdal c = bbwq.mo56473c(bcoh);
        if (num == null) {
            num = num3;
        }
        bdar a = c.mo56612a(conversationId, num.intValue(), num2.intValue(), bctqArr);
        if (((Boolean) bbqt.m88417a(bbwq.f103603a).f103151at.mo58455c()).booleanValue()) {
            a.mo57830c(new bbuc(bbwq.f103599A, bcoh));
        }
        return a;
    }
}
