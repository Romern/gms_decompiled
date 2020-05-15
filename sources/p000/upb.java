package p000;

import com.google.android.gms.drive.events.TransferProgressEvent;

/* renamed from: upb */
final /* synthetic */ class upb implements uox {

    /* renamed from: a */
    private final TransferProgressEvent f48448a;

    /* renamed from: b */
    private final String f48449b;

    public upb(TransferProgressEvent transferProgressEvent, String str) {
        this.f48448a = transferProgressEvent;
        this.f48449b = str;
    }

    /* renamed from: a */
    public final boolean mo27802a(uqi uqi) {
        TransferProgressEvent transferProgressEvent = this.f48448a;
        String str = this.f48449b;
        sbw sbw = upf.f48457a;
        if (((uqv) uqi).mo27897a(transferProgressEvent)) {
            upf.f48457a.mo25369a("Raised %s progress event to listener: %s", str, transferProgressEvent);
        }
        return true;
    }
}
