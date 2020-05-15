package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;

/* renamed from: apql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apql extends dcj implements apqn {
    public apql(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
    }

    /* renamed from: a */
    public final void mo47530a(GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getCurrentExperimentIdsCall$Response);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo47531a(GetGlobalSearchSourcesCall$Response getGlobalSearchSourcesCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getGlobalSearchSourcesCall$Response);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo47532a(GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getPendingExperimentIdsCall$Response);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo47533a(SetExperimentIdsCall$Response setExperimentIdsCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setExperimentIdsCall$Response);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo47534a(SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, setIncludeInGlobalSearchCall$Response);
        mo8530c(8, bj);
    }
}
