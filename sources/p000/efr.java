package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: efr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class efr implements rlf {

    /* renamed from: a */
    final /* synthetic */ efs f14841a;

    public efr(efs efs) {
        this.f14841a = efs;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("efr", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("[ReportServerFenceResultsOperation] Unable remove server fence %s: error %s", this.f14841a.f14842a.f14122e, status);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        Status status = (Status) obj;
        new Object[1][0] = this.f14841a.f14842a.f14122e;
    }
}
