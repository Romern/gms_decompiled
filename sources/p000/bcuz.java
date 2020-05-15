package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.io.IOException;

/* renamed from: bcuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcuz implements bclf {

    /* renamed from: a */
    private final bcve f104980a;

    public bcuz(bcve bcve) {
        this.f104980a = bcve;
    }

    /* renamed from: a */
    public final bcle mo56971a() {
        return new bcwh();
    }

    /* renamed from: b */
    public final String mo56976b() {
        return "photos";
    }

    /* renamed from: a */
    public final bqgg mo56972a(bcoh bcoh, bctr bctr) {
        bcve bcve = this.f104980a;
        ConversationId c = bctr.mo57361c();
        bmxv a = bcva.m90099a(bctr);
        if (!a.mo66813a()) {
            bbos.m88293c("PhotosMsgController", "Attempted to upload a non-photo message");
            return bqga.m112777a((Throwable) new IOException("Cannot upload non-photo message"));
        }
        bcwr bcwr = (bcwr) a.mo66814b();
        if (bcwr.mo57623b() == null) {
            bbos.m88293c("PhotosMsgController", "Attempted to upload an image without a local copy");
            return bqga.m112777a((Throwable) new IOException("Missing local URI for upload"));
        } else if (bcwr.mo57622a() != null) {
            bbos.m88293c("PhotosMsgController", "Attempted to upload an image twice");
            return bqga.m112775a(bctr);
        } else {
            bcvt bcvt = (bcvt) bcve;
            return bcvt.f105029h.mo25819b(new bcvn(bcvt, bcwr, bctr, c, bcoh));
        }
    }

    /* renamed from: b */
    public final void mo56977b(bcoh bcoh, bctr bctr, bcnt bcnt) {
        bcnr q = bcns.m89409q();
        q.mo57011b(26);
        q.mo57012b(bcoh.mo57058b().mo57074e());
        q.mo57010a(bcoh.mo57059c().mo73781l());
        q.mo57013b(bctr.mo57359a());
        q.mo57008a(bctr.mo57361c());
        bcnt.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final void mo56973a(bcoh bcoh) {
        bcvt bcvt = (bcvt) this.f104980a;
        bcvt.f105028g.mo25819b(new bcvm(bcvt, bcoh));
    }

    /* renamed from: a */
    public final void mo56974a(bcoh bcoh, bctr bctr, bcnt bcnt) {
        bcnr q = bcns.m89409q();
        q.mo57011b(27);
        q.mo57012b(bcoh.mo57058b().mo57074e());
        q.mo57010a(bcoh.mo57059c().mo73781l());
        q.mo57013b(bctr.mo57359a());
        q.mo57008a(bctr.mo57361c());
        bcnt.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final void mo56975a(ConversationId conversationId) {
        bcvt bcvt = (bcvt) this.f104980a;
        bqgg b = bcvt.f105028g.mo25819b(new bcvh(bcvt, conversationId));
        bqgg b2 = bcvt.f105028g.mo25819b(new bcvk(bcvt, conversationId));
        bqga.m112783b(b, b2).mo69216a(new bcvl(b, b2), bcvt.f105028g);
    }
}
