package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.service.WearableChimeraService;

/* renamed from: ayia */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayia extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97644c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayia(String str, axrs axrs) {
        super(str);
        this.f97644c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            if (Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "WearableChimeraService.clearStorage");
            }
            for (ayjh ayjh : WearableChimeraService.f110998a) {
                ayjh.mo53580a();
            }
            if (Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "WearableChimeraService.clearStorage: clearing prefs");
            }
            ayfz.m83948a().edit().clear().commit();
            if (Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "WearableChimeraService.clearStorage: killing process");
            }
            System.exit(1);
            if (Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "WearableChimeraService.clearStorage: process should be dead by now");
            }
            this.f97644c.mo53437a(Status.f30107a);
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("clearStorage: exception during clearing storage: ");
            sb.append(valueOf);
            Log.e("WearableService", sb.toString());
            this.f97644c.mo53437a(Status.f30109c);
        }
    }
}
