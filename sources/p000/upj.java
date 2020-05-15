package p000;

import com.google.android.gms.drive.events.ChangeEvent;

/* renamed from: upj */
final /* synthetic */ class upj implements uox {

    /* renamed from: a */
    private final upl f48475a;

    /* renamed from: b */
    private final ChangeEvent f48476b;

    /* renamed from: c */
    private final ujx f48477c;

    public upj(upl upl, ChangeEvent changeEvent, ujx ujx) {
        this.f48475a = upl;
        this.f48476b = changeEvent;
        this.f48477c = ujx;
    }

    /* renamed from: a */
    public final boolean mo27802a(uqi uqi) {
        upl upl = this.f48475a;
        ChangeEvent changeEvent = this.f48476b;
        ujx ujx = this.f48477c;
        if (((upm) uqi).mo27828a(changeEvent, ujx.mo27642y())) {
            upl.f48480a.mo25369a("Raised change event to listener: %s", changeEvent);
            upl.mo27826a(25, ujx);
        }
        return true;
    }
}
