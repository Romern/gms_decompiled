package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocation;

/* renamed from: bier */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bier implements bieq {

    /* renamed from: a */
    private final avxh f120403a;

    public bier(avxh avxh) {
        sdo.m34959a(avxh);
        this.f120403a = avxh;
    }

    /* renamed from: b */
    private final void m102152b(Status status) {
        try {
            this.f120403a.mo51685a(status, (SemanticLocation) null);
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

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        m102152b(Status.f30109c);
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102152b(status);
    }
}
