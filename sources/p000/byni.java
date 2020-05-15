package p000;

/* renamed from: byni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class byni implements Runnable {

    /* renamed from: a */
    final /* synthetic */ botw f167111a;

    /* renamed from: b */
    final /* synthetic */ botw f167112b;

    /* renamed from: c */
    final /* synthetic */ bynm f167113c;

    public byni(bynm bynm, botw botw, botw botw2) {
        this.f167113c = bynm;
        this.f167111a = botw;
        this.f167112b = botw2;
    }

    public final void run() {
        bxvd da = botv.f134879b.mo74144da();
        botw botw = this.f167111a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botv botv = (botv) da.f164949b;
        botw.getClass();
        if (!botv.f134881a.mo73666a()) {
            botv.f134881a = bxvk.m124021a(botv.f134881a);
        }
        botv.f134881a.add(botw);
        botv botv2 = (botv) da.mo74062i();
        bxvd da2 = boty.f134893g.mo74144da();
        botw botw2 = this.f167112b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        boty boty = (boty) da2.f164949b;
        botw2.getClass();
        boty.f134896b = botw2;
        int i = boty.f134895a | 1;
        boty.f134895a = i;
        botv2.getClass();
        boty.f134898d = botv2;
        boty.f134895a = i | 4;
        this.f167113c.mo74409a((boty) da2.mo74062i());
    }
}
