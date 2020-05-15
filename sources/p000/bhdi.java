package p000;

import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.location.wearable.WearableLocationChimeraService;
import java.util.Collection;

/* renamed from: bhdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdi implements axou {

    /* renamed from: a */
    final /* synthetic */ WearableLocationChimeraService f118323a;

    public bhdi() {
    }

    public bhdi(WearableLocationChimeraService wearableLocationChimeraService) {
        this.f118323a = wearableLocationChimeraService;
    }

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        if ("com/google/android/location/fused/wearable/LOCATION_REQUESTS".equals(messageEventParcelable.f110947b)) {
            axos a = axos.m82822a(messageEventParcelable.f110948c);
            Collection a2 = bhdd.m100666a(a, this.f118323a);
            boolean g = a.mo53344g("TRIGGER_UPDATE");
            this.f118323a.mo63564a(messageEventParcelable.f110949d, a2, g);
        }
    }
}
