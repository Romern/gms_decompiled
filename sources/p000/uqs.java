package p000;

import android.os.RemoteException;
import com.google.android.gms.drive.events.ChangesAvailableEvent;

/* renamed from: uqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uqs implements upr {

    /* renamed from: a */
    final /* synthetic */ uqu f48556a;

    /* renamed from: b */
    private final String f48557b;

    public uqs(uqu uqu, String str) {
        this.f48556a = uqu;
        this.f48557b = str;
    }

    /* renamed from: a */
    public final void mo27832a(ChangesAvailableEvent changesAvailableEvent) {
        try {
            this.f48556a.f48562c.mo27884a(this.f48557b, changesAvailableEvent);
            uqu.f48560a.mo25369a("Raised changes available event to subscription: %s", changesAvailableEvent);
        } catch (Exception e) {
            uqu.f48560a.mo25378c("SubscriptionStore", String.format("Error delivering changes available event to subscription: %s", this.f48557b), e);
            throw new RemoteException();
        }
    }
}
