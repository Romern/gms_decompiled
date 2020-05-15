package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: bhac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bhac extends aeaa {

    /* renamed from: a */
    final /* synthetic */ bhad f118183a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhac(bhad bhad) {
        super("location");
        this.f118183a = bhad;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        if (!chcs.m148240l()) {
            if (Log.isLoggable("GCoreLocationSettings", 4)) {
                Log.i("GCoreLocationSettings", "BaseUserLocationSettingsChimeraActivity.onServiceDisconnected()");
            }
            this.f118183a.f118185c = null;
        }
    }

    /* renamed from: a */
    public void mo6501a(ComponentName componentName, IBinder iBinder) {
        bgxe bgxe;
        if (!chcs.m148240l()) {
            bhad bhad = this.f118183a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.location.reporting.service.IPreferenceService");
                bgxe = queryLocalInterface instanceof bgxe ? (bgxe) queryLocalInterface : new bgxc(iBinder);
            } else {
                bgxe = null;
            }
            bhad.f118185c = bgxe;
            this.f118183a.mo63480g();
        }
    }
}
