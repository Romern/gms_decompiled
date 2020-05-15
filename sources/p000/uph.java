package p000;

import com.google.android.gms.drive.events.TransferProgressEvent;

/* renamed from: uph */
final /* synthetic */ class uph implements uox {

    /* renamed from: a */
    private final TransferProgressEvent f48471a;

    /* renamed from: b */
    private final String f48472b;

    public uph(TransferProgressEvent transferProgressEvent, String str) {
        this.f48471a = transferProgressEvent;
        this.f48472b = str;
    }

    /* renamed from: a */
    public final boolean mo27802a(uqi uqi) {
        TransferProgressEvent transferProgressEvent = this.f48471a;
        String str = this.f48472b;
        sbw sbw = upl.f48480a;
        if (((uqv) uqi).mo27897a(transferProgressEvent)) {
            upl.f48480a.mo25369a("Raised %s progress event to listener: %s", str, transferProgressEvent);
        }
        return true;
    }
}
