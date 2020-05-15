package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbxt */
final /* synthetic */ class bbxt implements Runnable {

    /* renamed from: a */
    private final bbxu f103718a;

    /* renamed from: b */
    private final bcoh f103719b;

    /* renamed from: c */
    private final ConversationId f103720c;

    /* renamed from: d */
    private final long f103721d;

    /* renamed from: e */
    private final long f103722e;

    public bbxt(bbxu bbxu, bcoh bcoh, ConversationId conversationId, long j, long j2) {
        this.f103718a = bbxu;
        this.f103719b = bcoh;
        this.f103720c = conversationId;
        this.f103721d = j;
        this.f103722e = j2;
    }

    public final void run() {
        this.f103718a.mo56497a(this.f103719b, this.f103720c, this.f103721d, this.f103722e);
    }
}
