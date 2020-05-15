package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbul */
final /* synthetic */ class bbul implements Runnable {

    /* renamed from: a */
    private final bbwq f103436a;

    /* renamed from: b */
    private final bcoh f103437b;

    /* renamed from: c */
    private final bctr f103438c;

    public bbul(bbwq bbwq, bcoh bcoh, bctr bctr) {
        this.f103436a = bbwq;
        this.f103437b = bcoh;
        this.f103438c = bctr;
    }

    public final void run() {
        bbwq bbwq = this.f103436a;
        bcoh bcoh = this.f103437b;
        bctr bctr = this.f103438c;
        bbwq.f103617o.mo56305a(bcoh, bctr.mo57360b()).mo57832f();
        if (bctr.mo57361c().mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
            bbwq.f103617o.mo56305a(bcoh, bctr.mo57361c().mo60558e()).mo57832f();
            return;
        }
        bbwq.mo56309a(bcoh, bctr.mo57361c()).mo57832f();
    }
}
