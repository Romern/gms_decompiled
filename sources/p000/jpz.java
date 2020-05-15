package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: jpz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jpz extends aaab {

    /* renamed from: a */
    private final rnt f23020a;

    /* renamed from: b */
    private final PendingIntent f23021b;

    /* renamed from: c */
    private final Role f23022c;

    /* renamed from: d */
    private final List f23023d;

    /* renamed from: e */
    private final String f23024e;

    static {
        jsy.m17256a("RegisterDevicesOperation");
    }

    public jpz(rnt rnt, Role role, List list, PendingIntent pendingIntent, String str) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, "RegisterDevicesForRole");
        this.f23020a = rnt;
        this.f23022c = role;
        this.f23023d = list;
        this.f23024e = str;
        this.f23021b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!jqd.m17109a(this.f23021b, this.f23024e) || !jqd.m17111a(this.f23023d, this.f23022c)) {
            this.f23020a.mo11797a(Status.f30109c);
            return;
        }
        FirstPartyDeviceRegistrationChimeraService.m6797a(this.f23023d, this.f23022c, this.f23021b, this.f23024e, context, true);
        this.f23020a.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23020a.mo11797a(status);
    }
}
