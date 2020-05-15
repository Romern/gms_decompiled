package p000;

import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: jqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jqc extends aaab {

    /* renamed from: a */
    private final rnt f23041a;

    /* renamed from: b */
    private final jsm f23042b;

    static {
        jsy.m17256a("RemoveChannelCallback");
    }

    public jqc(rnt rnt, jsm jsm) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, "RemoveChannelCallback");
        sdo.m34959a(rnt);
        this.f23041a = rnt;
        this.f23042b = jsm;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        Status status;
        if (this.f23042b != null) {
            rex rex = new rex();
            jpg a = FirstPartyDeviceRegistrationChimeraService.m6794a(rex, context);
            if (a == null) {
                this.f23041a.mo11797a(Status.f30109c);
                return;
            }
            rnt rnt = this.f23041a;
            jsm jsm = this.f23042b;
            FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService = a.f22969a;
            synchronized (firstPartyDeviceRegistrationChimeraService.f11170c) {
                firstPartyDeviceRegistrationChimeraService.f11171d.mo13938a(jsm);
                status = Status.f30107a;
            }
            rnt.mo11797a(status);
            skh.m35531a().mo25689a(context, rex);
            return;
        }
        this.f23041a.mo11797a(Status.f30109c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23041a.mo11797a(status);
    }
}
