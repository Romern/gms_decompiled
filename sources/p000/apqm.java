package p000;

import android.os.Parcel;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;

/* renamed from: apqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apqm extends dck implements apqn {

    /* renamed from: a */
    private final aucf f84797a;

    public apqm() {
        super("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
    }

    /* renamed from: a */
    public final void mo47530a(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response) {
        rpc.m34202a(getCurrentExperimentIdsCall$Response.f107410a, getCurrentExperimentIdsCall$Response.f107411b, this.f84797a);
    }

    /* renamed from: a */
    public final void mo47531a(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response) {
        rpc.m34202a(getGlobalSearchSourcesCall$Response.f107427a, getGlobalSearchSourcesCall$Response.f107428b, this.f84797a);
    }

    public apqm(aucf aucf) {
        super("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
        this.f84797a = aucf;
    }

    /* renamed from: a */
    public final void mo47532a(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response) {
        rpc.m34202a(getPendingExperimentIdsCall$Response.f107429a, getPendingExperimentIdsCall$Response.f107430b, this.f84797a);
    }

    /* renamed from: a */
    public final void mo47533a(SetExperimentIdsCall$Response setExperimentIdsCall$Response) {
        rpc.m34202a(setExperimentIdsCall$Response.f107433a, null, this.f84797a);
    }

    /* renamed from: a */
    public final void mo47534a(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response) {
        rpc.m34202a(setIncludeInGlobalSearchCall$Response.f107437a, null, this.f84797a);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            mo47531a((GetGlobalSearchSourcesCall$Response) dcl.m8163a(parcel, GetGlobalSearchSourcesCall$Response.CREATOR));
            return true;
        } else if (i == 3) {
            mo47533a((SetExperimentIdsCall$Response) dcl.m8163a(parcel, SetExperimentIdsCall$Response.CREATOR));
            return true;
        } else if (i == 4) {
            mo47530a((GetCurrentExperimentIdsCall$Response) dcl.m8163a(parcel, GetCurrentExperimentIdsCall$Response.CREATOR));
            return true;
        } else if (i == 5) {
            mo47532a((GetPendingExperimentIdsCall$Response) dcl.m8163a(parcel, GetPendingExperimentIdsCall$Response.CREATOR));
            return true;
        } else if (i != 8) {
            return false;
        } else {
            mo47534a((SetIncludeInGlobalSearchCall$Response) dcl.m8163a(parcel, SetIncludeInGlobalSearchCall$Response.CREATOR));
            return true;
        }
    }
}
