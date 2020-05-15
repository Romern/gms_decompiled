package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.EstimationOptions;
import com.google.android.gms.userlocation.SemanticLocationUpdateRequest;
import com.google.android.userlocation.SemanticLocationUpdateSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: bifr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifr implements bieq {

    /* renamed from: a */
    private final String f120467a;

    /* renamed from: b */
    private final rnt f120468b;

    public bifr(String str, rnt rnt) {
        sdo.m34959a((Object) str);
        sdo.m34974b(!str.isEmpty());
        sdo.m34959a(rnt);
        this.f120467a = str;
        this.f120468b = rnt;
    }

    /* renamed from: b */
    private final void m102282b(Status status) {
        try {
            this.f120468b.mo11797a(status);
        } catch (RemoteException e) {
        }
    }

    /* renamed from: a */
    public final int mo64569a() {
        return 2;
    }

    /* renamed from: b */
    public final int mo64573b() {
        return 2;
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
     method: bhqq.b(com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk
     arg types: [com.google.android.gms.location.places.internal.PlacesParams, int]
     candidates:
      bhqq.b(int, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.b(com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk */
    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        return bhqq.m101364b(placesParams, false);
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
    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        boolean z;
        String str = this.f120467a;
        avwx avwx = new avwx();
        sdo.m34969a(str, (Object) "Request ID cannot be empty.");
        if (str.length() <= 30) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "Request ID cannot exceed length of 30");
        avwx.f94053a = str;
        if (stm.m36302d(avwx.f94053a)) {
            String valueOf = String.valueOf(avwx.f94053a);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid request ID: ") : "Invalid request ID: ".concat(valueOf));
        }
        try {
            m102282b((Status) bidp.mo64553b(new SemanticLocationUpdateSubscription(new SemanticLocationUpdateRequest(avwx.f94053a, 2, new EstimationOptions(true, true)), placesParams, null)).get());
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new aaaj(13, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102282b(status);
    }
}
