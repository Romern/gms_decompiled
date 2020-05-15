package p000;

/* renamed from: bbvx */
final /* synthetic */ class bbvx implements Runnable {

    /* renamed from: a */
    private final bbwq f103551a;

    /* renamed from: b */
    private final bcoh f103552b;

    /* renamed from: c */
    private final bmxv f103553c;

    public bbvx(bbwq bbwq, bcoh bcoh, bmxv bmxv) {
        this.f103551a = bbwq;
        this.f103552b = bcoh;
        this.f103553c = bmxv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbub.a(bcia, boolean):void
     arg types: [bcia, int]
     candidates:
      bbub.a(com.google.android.libraries.messaging.lighter.model.ConversationId, long):boolean
      bbub.a(com.google.android.libraries.messaging.lighter.model.ConversationId, com.google.android.libraries.messaging.lighter.model.ContactId):void
      bbub.a(bcia, boolean):void */
    public final void run() {
        this.f103551a.mo56475d(this.f103552b).mo56419a((bcia) this.f103553c.mo66814b(), false);
    }
}
