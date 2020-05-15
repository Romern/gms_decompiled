package p000;

import com.google.android.gms.octarine.p057ui.OctarineWebviewChimeraActivity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: akyx */
public final /* synthetic */ class akyx implements Runnable {

    /* renamed from: a */
    private final OctarineWebviewChimeraActivity f73144a;

    public akyx(OctarineWebviewChimeraActivity octarineWebviewChimeraActivity) {
        this.f73144a = octarineWebviewChimeraActivity;
    }

    public final void run() {
        alaf alaf = this.f73144a.f81389N;
        if (cfri.m142691b() && alaf.f73216j != null && alaf.f73210d.mo40018a() != null) {
            AccountParticleDisc accountParticleDisc = alaf.f73216j;
            bddn g = bddo.m90606g();
            g.mo57907a(alaf.f73210d.mo40018a());
            accountParticleDisc.mo60577a(g.mo57906a());
        }
    }
}
