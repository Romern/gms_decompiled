package p000;

/* renamed from: bbui */
final /* synthetic */ class bbui implements bqeh {

    /* renamed from: a */
    private final bbwq f103427a;

    /* renamed from: b */
    private final bcoh f103428b;

    /* renamed from: c */
    private final bctr f103429c;

    /* renamed from: d */
    private final int f103430d;

    public bbui(bbwq bbwq, bcoh bcoh, bctr bctr, int i) {
        this.f103427a = bbwq;
        this.f103428b = bcoh;
        this.f103429c = bctr;
        this.f103430d = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbwq.a(bcoh, bctr, boolean):bqgg
     arg types: [bcoh, bctr, int]
     candidates:
      bbwq.a(bcsp, bchq, long):bcsp
      bbwq.a(bcoh, int, int):bdar
      bbwq.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bbwq.a(bcoh, java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bbwq.a(bcoh, bctr, int):bqgg
      bbwq.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.String):void
      bbwq.a(bcoh, java.lang.String, bcsp):void
      bbpk.a(bcoh, int, int):bdar
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, int):bdar
      bbpk.a(bcoh, java.lang.String, com.google.android.libraries.messaging.lighter.model.ConversationId):bdar
      bbpk.a(bcoh, bctr, int):bqgg
      bbpk.a(bcoh, com.google.android.libraries.messaging.lighter.model.ConversationId, java.lang.String):void
      bbwq.a(bcoh, bctr, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbwq bbwq = this.f103427a;
        bcoh bcoh = this.f103428b;
        bctr bctr = this.f103429c;
        int i = this.f103430d;
        if (!Boolean.TRUE.equals((Boolean) obj)) {
            return bqga.m112775a((Object) null);
        }
        bqgg a = bbwq.mo56469a(bcoh, bctr, false);
        int a2 = bctr.mo57365f().mo57180a();
        if (a2 != 0) {
            bqgg a3 = (a2 != 3 || !bbwq.f103620r.containsKey(bctr.mo57365f().mo57184b().mo57379a())) ? a : bqdx.m112674a(a, new bbuj(bbwq, bctr, bcoh), bqfb.INSTANCE);
            bqgg a4 = bqdx.m112674a(a3, new bbuk(bbwq, bcoh), bqfb.INSTANCE);
            bbwq.f103606d.mo25812a(new bbul(bbwq, bcoh, bctr));
            bqgg a5 = bqdf.m112619a(a3, Throwable.class, new bbum(bctr), bqfb.INSTANCE);
            bqgg a6 = bqga.m112783b(a, a4, a5).mo69216a(new bbun(bbwq, a5, a4, bcoh, bctr, i), bqfb.INSTANCE);
            return bqga.m112786c(a6).mo69216a(new bbuo(a6), bqfb.INSTANCE);
        }
        throw null;
    }
}
