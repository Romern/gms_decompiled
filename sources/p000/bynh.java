package p000;

/* renamed from: bynh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bynh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ botw f167108a;

    /* renamed from: b */
    final /* synthetic */ botx f167109b;

    /* renamed from: c */
    final /* synthetic */ bynm f167110c;

    public bynh(bynm bynm, botw botw, botx botx) {
        this.f167110c = bynm;
        this.f167108a = botw;
        this.f167109b = botx;
    }

    public final void run() {
        bxvd da = boty.f134893g.mo74144da();
        botw botw = this.f167108a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boty boty = (boty) da.f164949b;
        botw.getClass();
        boty.f134896b = botw;
        int i = boty.f134895a | 1;
        boty.f134895a = i;
        botx botx = this.f167109b;
        botx.getClass();
        boty.f134897c = botx;
        boty.f134895a = i | 2;
        this.f167110c.mo74409a((boty) da.mo74062i());
    }
}
