package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: jre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jre extends aaab {

    /* renamed from: a */
    private final rnt f23117a;

    /* renamed from: b */
    private final PendingIntent f23118b;

    /* renamed from: c */
    private final Role f23119c;

    /* renamed from: d */
    private final List f23120d;

    /* renamed from: e */
    private final String f23121e;

    static {
        jsy.m17256a("UnregisterDevicesForRole");
    }

    public jre(rnt rnt, Role role, List list, PendingIntent pendingIntent, String str) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, "UnregisterDevicesForRole");
        this.f23117a = rnt;
        this.f23119c = role;
        this.f23120d = list;
        this.f23118b = pendingIntent;
        this.f23121e = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!jqd.m17109a(this.f23118b, this.f23121e) || !jqd.m17111a(this.f23120d, this.f23119c)) {
            this.f23117a.mo11797a(Status.f30109c);
            return;
        }
        FirstPartyDeviceRegistrationChimeraService.m6797a(this.f23120d, this.f23119c, this.f23118b, this.f23121e, context, false);
        this.f23117a.mo11797a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23117a.mo11797a(status);
    }
}
