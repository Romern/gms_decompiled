package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.userlocation.SemanticLocationEventSubscription;
import java.util.concurrent.ExecutionException;

/* renamed from: bifq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bifq implements bieq {

    /* renamed from: a */
    private final String f120465a;

    /* renamed from: b */
    private final rnt f120466b;

    public bifq(String str, rnt rnt) {
        sdo.m34959a((Object) str);
        sdo.m34974b(!str.isEmpty());
        sdo.m34959a(rnt);
        this.f120465a = str;
        this.f120466b = rnt;
    }

    /* renamed from: b */
    private final void m102274b(Status status) {
        try {
            this.f120466b.mo11797a(status);
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
     method: bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk
     arg types: [com.google.android.gms.location.places.internal.PlacesParams, int]
     candidates:
      bhqq.a(int, java.lang.String):bpov
      bhqq.a(java.util.Collection, boolean):bppt
      bhqq.a(int, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(com.google.android.gms.location.places.PlaceFilter, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, int):bpqk
      bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, java.util.List):bpqk
      bhqq.a(java.util.List, com.google.android.gms.location.places.internal.PlacesParams):bpqk
      bhqq.a(com.google.android.gms.location.places.internal.PlacesParams, boolean):bpqk */
    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        return bhqq.m101356a(placesParams, false);
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        String str = this.f120465a;
        avwg avwg = new avwg();
        avwg.mo51668a(1);
        avwg.mo51669a(str);
        try {
            m102274b((Status) bidp.mo64553b(new SemanticLocationEventSubscription(avwg.mo51667a(), placesParams, null)).get());
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new aaaj(13, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102274b(status);
    }
}
