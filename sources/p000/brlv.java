package p000;

/* renamed from: brlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brlv implements aubg {

    /* renamed from: a */
    final /* synthetic */ brpk f142945a;

    public brlv(brpk brpk) {
        this.f142945a = brpk;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo7031a(aucb aucb) {
        if (!aucb.mo50384b()) {
            return aucu.m76777a(aucb.mo50387e());
        }
        brpk brpk = this.f142945a;
        brpk.mo69764a((bxxc) aucb.mo50386d());
        if (brpk != null) {
            return aucu.m76778a(brpk);
        }
        return aucu.m76777a((Exception) new brmg("Error parsing response."));
    }
}
