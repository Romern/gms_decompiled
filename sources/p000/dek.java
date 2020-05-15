package p000;

import android.content.Context;
import android.telecom.InCallService;
import android.telecom.Phone;

/* renamed from: dek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dek extends InCallService {

    /* renamed from: a */
    final /* synthetic */ com.google.android.chimera.InCallService f12977a;

    public dek(com.google.android.chimera.InCallService inCallService) {
        this.f12977a = inCallService;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void onPhoneCreated(Phone phone) {
        this.f12977a.onPhoneCreated(phone);
    }

    public final void onPhoneDestroyed(Phone phone) {
        this.f12977a.onPhoneDestroyed(phone);
    }
}
