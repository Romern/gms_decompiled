package p000;

import android.content.Intent;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;

@Deprecated
/* renamed from: aerj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aerj {

    /* renamed from: a */
    public LocationSettingsRequest f63669a;

    /* renamed from: b */
    public String f63670b;

    /* renamed from: c */
    private final ArrayList f63671c = new ArrayList();

    /* renamed from: d */
    private boolean f63672d = false;

    /* renamed from: a */
    public final Intent mo34488a() {
        LocationSettingsRequest locationSettingsRequest = this.f63669a;
        if (locationSettingsRequest == null) {
            aeig aeig = new aeig();
            ArrayList arrayList = this.f63671c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                LocationRequest locationRequest = (LocationRequest) arrayList.get(i);
                if (locationRequest != null) {
                    aeig.f63416a.add(locationRequest);
                }
            }
            aeig.f63417b = this.f63672d;
            locationSettingsRequest = aeig.mo34171a();
        }
        Intent intent = new Intent("com.google.android.gms.location.settings.CHECK_SETTINGS");
        sef.m35071a(locationSettingsRequest, intent, "locationSettingsRequests");
        String str = this.f63670b;
        if (str != null) {
            intent.putExtra("originalPackageName", str);
        }
        intent.setPackage("com.google.android.gms");
        return intent;
    }

    /* renamed from: b */
    public final void mo34490b() {
        this.f63672d = true;
    }

    /* renamed from: a */
    public final void mo34489a(LocationRequest locationRequest) {
        this.f63671c.add(locationRequest);
    }
}
