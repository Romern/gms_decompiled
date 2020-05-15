package p000;

import java.util.logging.Level;

/* renamed from: bkmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkmm implements bknm {

    /* renamed from: a */
    final /* synthetic */ bkmz f124886a;

    /* renamed from: b */
    final /* synthetic */ bkmo f124887b;

    public bkmm(bkmo bkmo, bkmz bkmz) {
        this.f124887b = bkmo;
        this.f124886a = bkmz;
    }

    /* renamed from: a */
    public final void mo28447a(bknn bknn) {
        this.f124887b.f124889a.logp(Level.INFO, "com.google.apps.brix.api.client.managers.NetworkOtProtocolManager$4", "onFailure", "Error sending operation(s) to Realtime server; retrying.");
        bkmo bkmo = this.f124887b;
        bkmo.f124890b = 0;
        bkmo.mo66119d();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28448a(Object obj) {
        Void voidR = (Void) obj;
        if (this.f124886a == null) {
            this.f124887b.mo66115a();
        }
    }
}
