package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.fencing.PlacefencingFilter;
import com.google.android.gms.location.places.fencing.PlacefencingRequest;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.placefencing.PlacefencingSubscription;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: bifv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifv implements bieq {

    /* renamed from: a */
    private final String f120480a;

    /* renamed from: b */
    private final rnt f120481b;

    public bifv(String str, rnt rnt) {
        sdo.m34959a((Object) str);
        sdo.m34974b(!str.isEmpty());
        sdo.m34959a(rnt);
        this.f120480a = str;
        this.f120481b = rnt;
    }

    /* renamed from: b */
    private final void m102314b(Status status) {
        try {
            this.f120481b.mo11797a(status);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final int mo64569a() {
        return 2;
    }

    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        return null;
    }

    /* renamed from: b */
    public final int mo64573b() {
        return 1;
    }

    /* renamed from: c */
    public final String mo64574c() {
        return "android.permission.ACCESS_FINE_LOCATION";
    }

    /* renamed from: d */
    public final boolean mo64575d() {
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
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
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        String str = this.f120480a;
        List<String> singletonList = Collections.singletonList("ignored");
        for (String str2 : singletonList) {
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("Null or empty client identifiers are not valid.");
            }
        }
        PlacefencingFilter placefencingFilter = new PlacefencingFilter(null, null, singletonList);
        aemo aemo = new aemo();
        sdo.m34969a(str, (Object) "Request ID cannot be empty.");
        boolean z = false;
        sdo.m34975b(str.length() <= 50, "Request ID cannotexceed length of 50");
        aemo.f63524a = str;
        sdo.checkIfNull(placefencingFilter, "Filter cannot be null.");
        aemo.f63525b = placefencingFilter;
        aemo.f63526c = 1;
        sdo.checkIfNull((Object) aemo.f63524a, (Object) "Request ID may not be null, did you forget to call PlacefencingRequest.Builder.setRequestId(String)?");
        sdo.checkIfNull(aemo.f63525b, "Filter may not be null, did you forget to call PlacefencingRequest.Builder.setPlacefencingFilter(PlacefencingFilter)?");
        if (aemo.f63526c != 0) {
            z = true;
        }
        sdo.m34975b(z, "Transitions must be set, did you forget to call PlacefencingRequest.Builder.setTransitions(int)?");
        try {
            m102314b((Status) bidp.mo64553b(PlacefencingSubscription.m117719a(new PlacefencingRequest(aemo.f63524a, aemo.f63525b, aemo.f63526c, 5, 0, 0), placesParams, (PendingIntent) null)).get());
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102314b(status);
    }
}
