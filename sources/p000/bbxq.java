package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbxq */
final /* synthetic */ class bbxq implements Runnable {

    /* renamed from: a */
    private final bbxu f103701a;

    /* renamed from: b */
    private final bcoh f103702b;

    /* renamed from: c */
    private final ConversationId f103703c;

    /* renamed from: d */
    private final long f103704d;

    /* renamed from: e */
    private final long f103705e;

    public bbxq(bbxu bbxu, bcoh bcoh, ConversationId conversationId, long j, long j2) {
        this.f103701a = bbxu;
        this.f103702b = bcoh;
        this.f103703c = conversationId;
        this.f103704d = j;
        this.f103705e = j2;
    }

    public final void run() {
        this.f103701a.mo56497a(this.f103702b, this.f103703c, this.f103704d, this.f103705e);
    }
}
