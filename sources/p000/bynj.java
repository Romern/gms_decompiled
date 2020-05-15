package p000;

/* renamed from: bynj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bynj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bott f167114a;

    /* renamed from: b */
    final /* synthetic */ botw f167115b;

    /* renamed from: c */
    final /* synthetic */ bynm f167116c;

    public bynj(bynm bynm, bott bott, botw botw) {
        this.f167116c = bynm;
        this.f167114a = bott;
        this.f167115b = botw;
    }

    public final void run() {
        bxvd da = botu.f134876b.mo74144da();
        bott bott = this.f167114a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botu botu = (botu) da.f164949b;
        bott.getClass();
        if (!botu.f134878a.mo73666a()) {
            botu.f134878a = bxvk.m124021a(botu.f134878a);
        }
        botu.f134878a.add(bott);
        botu botu2 = (botu) da.mo74062i();
        bxvd da2 = boty.f134893g.mo74144da();
        botw botw = this.f167115b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boty boty = (boty) da2.f164949b;
        botw.getClass();
        boty.f134896b = botw;
        int i = boty.f134895a | 1;
        boty.f134895a = i;
        botu2.getClass();
        boty.f134899e = botu2;
        boty.f134895a = i | 8;
        this.f167116c.mo74409a((boty) da2.mo74062i());
    }
}
