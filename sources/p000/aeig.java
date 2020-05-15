package p000;

import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import java.util.ArrayList;

/* renamed from: aeig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeig {

    /* renamed from: a */
    public final ArrayList f63416a = new ArrayList();

    /* renamed from: b */
    public boolean f63417b = false;

    /* renamed from: a */
    public final LocationSettingsRequest mo34171a() {
        return new LocationSettingsRequest(this.f63416a, this.f63417b, false, null);
    }

    /* renamed from: a */
    public final void mo34172a(LocationRequest locationRequest) {
        if (locationRequest != null) {
            this.f63416a.add(locationRequest);
        }
    }
}
