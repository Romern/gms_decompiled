package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;

/* renamed from: dsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dsb implements rlf {

    /* renamed from: a */
    final /* synthetic */ dsc f13918a;

    public dsb(dsc dsc) {
        this.f13918a = dsc;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
    }

    /* renamed from: b */
    public final void mo9526b(Status status) {
        if (!status.mo17710c()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dsb", "b", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[EvaluateFenceOperation] Unable to perform fence update operations: error %s", status);
            this.f13918a.mo9527a(status.f30115i, (FenceStateImpl) null);
            return;
        }
        this.f13918a.f13920d = new dsa(this);
        dwq.m9667k().mo9434a(this.f13918a.f13920d, cdgp.m133207p(), dqy.m9123a("EvaluateFenceOperation_timeout"));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        Status status = (Status) obj;
        if (!status.mo17710c()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("dsb", "b", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[EvaluateFenceOperation] Unable to perform fence update operations: error %s", status);
            this.f13918a.mo9527a(status.f30115i, (FenceStateImpl) null);
            return;
        }
        this.f13918a.f13920d = new dsa(this);
        dwq.m9667k().mo9434a(this.f13918a.f13920d, cdgp.m133207p(), dqy.m9123a("EvaluateFenceOperation_timeout"));
    }
}
