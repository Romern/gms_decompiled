package p000;

import android.content.Intent;
import com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService;

/* renamed from: aeum */
public final /* synthetic */ class aeum implements aubt {

    /* renamed from: a */
    private final GcmReceiverChimeraService f63846a;

    /* renamed from: b */
    private final aucb f63847b;

    /* renamed from: c */
    private final Intent f63848c;

    public aeum(GcmReceiverChimeraService gcmReceiverChimeraService, aucb aucb, Intent intent) {
        this.f63846a = gcmReceiverChimeraService;
        this.f63847b = aucb;
        this.f63848c = intent;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        int i;
        GcmReceiverChimeraService gcmReceiverChimeraService = this.f63846a;
        aucb aucb = this.f63847b;
        Intent intent = this.f63848c;
        if (exc != null) {
            bnsl bnsl = (bnsl) GcmReceiverChimeraService.f79670b.mo68388c();
            bnsl.mo68437a(exc);
            bnsl.mo68432a("com.google.android.gms.locationsharing.ovenfresh.GcmReceiverChimeraService", "a", 734, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("startBurst failed with exception");
        }
        try {
            gcmReceiverChimeraService.f79676d = ((aeqp) aucb.mo50386d()).f63635a.f30115i;
        } catch (IllegalStateException e) {
            i = 14;
        } catch (aubz e2) {
            i = 13;
        }
        gcmReceiverChimeraService.mo43798a(intent, 9);
        gcmReceiverChimeraService.f79676d = i;
        gcmReceiverChimeraService.mo43798a(intent, 9);
    }
}
