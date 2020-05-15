package p000;

/* renamed from: bgli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgli implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bgll f116762a;

    public bgli(bgll bgll) {
        this.f116762a = bgll;
    }

    public final void run() {
        bglo bglo = (bglo) this.f116762a.f116768d;
        bglo.f116775a.mo62049a(bfos.CHRE_AR_AVAILABLE, bglo.f116784j.mo62983b());
        bglo.mo62985a();
        if (!bglo.f116777c) {
            return;
        }
        if (!bglo.f116785k.mo62973a() || !bglo.f116784j.mo62982a(bgld.m99230a(bglo.f116778d, bglo.f116779e))) {
            bglo.mo62986h();
        }
    }
}
