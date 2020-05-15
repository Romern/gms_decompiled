package p000;

/* renamed from: byng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class byng implements Runnable {

    /* renamed from: a */
    final /* synthetic */ botw f167105a;

    /* renamed from: b */
    final /* synthetic */ botz f167106b;

    /* renamed from: c */
    final /* synthetic */ bynm f167107c;

    public byng(bynm bynm, botw botw, botz botz) {
        this.f167107c = bynm;
        this.f167105a = botw;
        this.f167106b = botz;
    }

    public final void run() {
        bxvd da = boty.f134893g.mo74144da();
        botw botw = this.f167105a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boty boty = (boty) da.f164949b;
        botw.getClass();
        boty.f134896b = botw;
        int i = boty.f134895a | 1;
        boty.f134895a = i;
        botz botz = this.f167106b;
        botz.getClass();
        boty.f134900f = botz;
        boty.f134895a = i | 16;
        this.f167107c.mo74409a((boty) da.mo74062i());
    }
}
