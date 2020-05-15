package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Request;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;

/* renamed from: apqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apqe extends apqp implements sjr {

    /* renamed from: a */
    private final abrv f84794a;

    /* renamed from: b */
    private final abyy f84795b;

    public apqe(abrv abrv, abyy abyy) {
        sdo.m34959a(abrv);
        this.f84794a = abrv;
        this.f84795b = abyy;
    }

    /* renamed from: a */
    public final void mo47517a(apqn apqn) {
        GetCurrentExperimentIdsCall$Response getCurrentExperimentIdsCall$Response = new GetCurrentExperimentIdsCall$Response();
        getCurrentExperimentIdsCall$Response.f107411b = new int[0];
        getCurrentExperimentIdsCall$Response.f107410a = new Status(8, "API Disabled");
        apqn.mo47530a(getCurrentExperimentIdsCall$Response);
    }

    /* renamed from: b */
    public final void mo47520b(apqn apqn) {
        GetPendingExperimentIdsCall$Response getPendingExperimentIdsCall$Response = new GetPendingExperimentIdsCall$Response();
        getPendingExperimentIdsCall$Response.f107430b = new int[0];
        getPendingExperimentIdsCall$Response.f107429a = new Status(8, "API Disabled");
        apqn.mo47532a(getPendingExperimentIdsCall$Response);
    }

    /* renamed from: c */
    public final void mo47521c(apqn apqn) {
        SetExperimentIdsCall$Response setExperimentIdsCall$Response = new SetExperimentIdsCall$Response();
        setExperimentIdsCall$Response.f107433a = new Status(8, "API Disabled");
        apqn.mo47533a(setExperimentIdsCall$Response);
    }

    /* renamed from: a */
    public final void mo47518a(GetGlobalSearchSourcesCall$Request getGlobalSearchSourcesCall$Request, apqn apqn) {
        abrv abrv = this.f84794a;
        abrv.f58067c.mo32995d(new apqc(abrv, getGlobalSearchSourcesCall$Request, this.f84795b, apqn));
    }

    /* renamed from: a */
    public final void mo47519a(SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, apqn apqn) {
        abrv abrv = this.f84794a;
        abrv.f58067c.mo32995d(new apqd(abrv, setIncludeInGlobalSearchCall$Request, this.f84795b, apqn));
    }
}
