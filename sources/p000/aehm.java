package p000;

import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aehm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aehm {

    /* renamed from: a */
    private final List f63406a = new ArrayList();

    /* renamed from: b */
    private int f63407b = 5;

    /* renamed from: c */
    private String f63408c = "";

    /* renamed from: a */
    public static int m51846a(int i) {
        return i & 7;
    }

    /* renamed from: b */
    public final void mo34153b(int i) {
        this.f63407b = m51846a(i);
    }

    /* renamed from: a */
    public final GeofencingRequest mo34149a() {
        sdo.m34975b(!this.f63406a.isEmpty(), "No geofence has been added to this request.");
        return new GeofencingRequest(this.f63406a, this.f63407b, this.f63408c);
    }

    /* renamed from: a */
    public final void mo34150a(ParcelableGeofence parcelableGeofence) {
        sdo.checkIfNull(parcelableGeofence, "geofence can't be null.");
        sdo.m34975b(parcelableGeofence instanceof ParcelableGeofence, "Geofence must be created using Geofence.Builder.");
        this.f63406a.add(parcelableGeofence);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo34151a(String str) {
        sdo.checkIfNull((Object) str, (Object) "Can not set tag to null");
        sdo.m34975b(!str.isEmpty(), "Can not use empty string for tag");
        this.f63408c = str;
    }

    /* renamed from: a */
    public final void mo34152a(List list) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ParcelableGeofence parcelableGeofence = (ParcelableGeofence) list.get(i);
                if (parcelableGeofence != null) {
                    mo34150a(parcelableGeofence);
                }
            }
        }
    }
}
