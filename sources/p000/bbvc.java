package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: bbvc */
final /* synthetic */ class bbvc implements Callable {

    /* renamed from: a */
    private final bbwq f103492a;

    /* renamed from: b */
    private final bqgg f103493b;

    /* renamed from: c */
    private final bcoh f103494c;

    /* renamed from: d */
    private final ConversationId f103495d;

    public bbvc(bbwq bbwq, bqgg bqgg, bcoh bcoh, ConversationId conversationId) {
        this.f103492a = bbwq;
        this.f103493b = bqgg;
        this.f103494c = bcoh;
        this.f103495d = conversationId;
    }

    public final Object call() {
        bbwq bbwq = this.f103492a;
        bqgg bqgg = this.f103493b;
        bcoh bcoh = this.f103494c;
        ConversationId conversationId = this.f103495d;
        try {
            bbyg bbyg = (bbyg) bqga.m112780a((Future) bqgg);
            int b = bbyg.mo56504b();
            if (b == 0) {
                throw null;
            } else if (b != 2) {
                return false;
            } else {
                bbsi bbsi = bbwq.f103609g;
                bcid bcid = new bcid(conversationId, bbyg.mo56503a());
                bbsi.f103295a.mo56561a(bcoh).mo56627a(bcid.f104197a, bcid.f104198b);
                for (bclf bclf : bbwq.f103620r.values()) {
                    bclf.mo56975a(conversationId);
                }
                return true;
            }
        } catch (ExecutionException e) {
            bbos.m88292b("LiMsgController", "Fail to delete conversation on cloud. ", e);
            return false;
        }
    }
}
