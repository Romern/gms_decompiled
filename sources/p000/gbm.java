package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.common.api.Status;
import java.util.UUID;

/* renamed from: gbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gbm extends aaab {

    /* renamed from: a */
    public static final Logger f17836a = tea.m36798a("api_get_asterism_consent");

    /* renamed from: b */
    public final gbx f17837b;

    /* renamed from: c */
    public int f17838c;

    /* renamed from: d */
    public final tds f17839d;

    /* renamed from: e */
    public final UUID f17840e;

    /* renamed from: f */
    private final Context f17841f;

    /* renamed from: g */
    private final GetAsterismConsentRequest f17842g;

    /* renamed from: h */
    private cbnw f17843h;

    /* renamed from: i */
    private final tdl f17844i = new gbl(this, new snr(new sns(10)));

    public gbm(Context context, gbx gbx, GetAsterismConsentRequest getAsterismConsentRequest) {
        super(ErrorInfo.TYPE_SDU_UNKNOWN, "GetAsterismConsent");
        this.f17841f = context;
        this.f17837b = gbx;
        this.f17842g = getAsterismConsentRequest;
        this.f17839d = tds.m36774a(context);
        this.f17840e = UUID.randomUUID();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        this.f17839d.mo26401a(this.f17840e, 14);
        if (!cdfb.m132904b()) {
            this.f17839d.mo26414b(this.f17840e, 57, 62);
            mo6503a(new Status(34500));
            return;
        }
        GetAsterismConsentRequest getAsterismConsentRequest = this.f17842g;
        if (getAsterismConsentRequest == null) {
            this.f17839d.mo26414b(this.f17840e, 57, 63);
            mo6503a(new Status(34502));
            return;
        }
        this.f17838c = getAsterismConsentRequest.f9825a;
        int i = getAsterismConsentRequest.f9826b;
        if (i == 1) {
            this.f17843h = cbnw.CONSTELLATION;
        } else if (i != 2) {
            this.f17839d.mo26414b(this.f17840e, 57, 64);
            mo6503a(new Status(34502));
            return;
        } else {
            this.f17843h = cbnw.RCS;
        }
        sxt.m36563a();
        UUID uuid = this.f17840e;
        cbnw cbnw = this.f17843h;
        tdl tdl = this.f17844i;
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.GET_ASTERISM_CONSENT");
        startIntent.putExtra("eventmanager.session_id", uuid.toString());
        startIntent.putExtra("eventmanager.trigger_type", 7);
        startIntent.putExtra("eventmanager.extra_param", Bundle.EMPTY);
        startIntent.putExtra("eventmanager.aster_client", cbnw.mo3214a());
        startIntent.putExtra("eventmanager.on_sync_complete_callback_key", tdl.f45700e);
        context.startService(startIntent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        gbf gbf = new gbf();
        gbf.f17817a = this.f17838c;
        gbf.f17818b = 0;
        this.f17837b.mo11626a(status, gbf.mo11614a());
    }
}
