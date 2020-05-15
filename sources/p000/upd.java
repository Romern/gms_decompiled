package p000;

import com.google.android.gms.drive.events.ChangeEvent;

/* renamed from: upd */
final /* synthetic */ class upd implements uox {

    /* renamed from: a */
    private final upf f48452a;

    /* renamed from: b */
    private final ChangeEvent f48453b;

    /* renamed from: c */
    private final ujx f48454c;

    public upd(upf upf, ChangeEvent changeEvent, ujx ujx) {
        this.f48452a = upf;
        this.f48453b = changeEvent;
        this.f48454c = ujx;
    }

    /* renamed from: a */
    public final boolean mo27802a(uqi uqi) {
        upf upf = this.f48452a;
        ChangeEvent changeEvent = this.f48453b;
        ujx ujx = this.f48454c;
        if (((upm) uqi).mo27828a(changeEvent, ujx.mo27642y())) {
            upf.f48457a.mo25369a("Raised change event to listener: %s", changeEvent);
            upf.mo27824a(25, ujx);
        }
        return true;
    }
}
