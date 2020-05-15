package p000;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.SemanticLocation;
import java.util.concurrent.ExecutionException;

/* renamed from: biet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biet implements bieq {

    /* renamed from: a */
    private final String f120408a;

    /* renamed from: b */
    private final avxh f120409b;

    public biet(String str, avxh avxh) {
        sdo.m34959a(avxh);
        this.f120409b = avxh;
        this.f120408a = str;
    }

    /* renamed from: a */
    private final void m102169a(Status status, SemanticLocation semanticLocation) {
        try {
            this.f120409b.mo51685a(status, semanticLocation);
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

    /* renamed from: a */
    public final bpqk mo64570a(PlacesParams placesParams) {
        return bhqq.m101354a(placesParams, 6);
    }

    /* renamed from: a */
    public final void mo64571a(Context context, bidp bidp, PlacesParams placesParams) {
        try {
            m102169a(Status.f30107a, bjdk.m103240a((bhqz) bidp.mo64552a(this.f120408a).get()));
        } catch (InterruptedException e) {
            throw new biem(14);
        } catch (ExecutionException e2) {
            throw new aaaj(13, e2.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64572a(Status status) {
        m102169a(status, null);
    }
}
