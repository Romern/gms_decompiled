package p000;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.location.settings.GoogleLocationSettingsChimeraActivity;

/* renamed from: bhaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhaf extends aeaa {

    /* renamed from: a */
    final /* synthetic */ GoogleLocationSettingsChimeraActivity f118190a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhaf(GoogleLocationSettingsChimeraActivity googleLocationSettingsChimeraActivity) {
        super("location");
        this.f118190a = googleLocationSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f118190a.f150921b = null;
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bgxe bgxe;
        GoogleLocationSettingsChimeraActivity googleLocationSettingsChimeraActivity = this.f118190a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.location.reporting.service.IPreferenceService");
            bgxe = queryLocalInterface instanceof bgxe ? (bgxe) queryLocalInterface : new bgxc(iBinder);
        } else {
            bgxe = null;
        }
        googleLocationSettingsChimeraActivity.f150921b = bgxe;
    }
}
