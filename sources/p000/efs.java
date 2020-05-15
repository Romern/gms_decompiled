package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: efs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efs extends dwu implements dqm {

    /* renamed from: a */
    public final duu f14842a;

    /* renamed from: b */
    private final doh f14843b;

    public efs(doh doh, duu duu) {
        super("ReportServerFenceResultsOperation", "report fence %s", duu.f14122e);
        this.f14843b = doh;
        this.f14842a = duu;
    }

    /* renamed from: a */
    public final Future mo9446a() {
        duu duu = this.f14842a;
        int i = duu.f14134q;
        if (i == 2 || i == 3) {
            new Object[1][0] = duu.f14122e;
            return dps.f13792a;
        }
        sdo.m34970a(!isDone());
        dwt w = dwq.m9679w();
        doh doh = this.f14843b;
        List singletonList = Collections.singletonList(this.f14842a);
        drv k = dwq.m9667k();
        dqx a = dqy.m9123a("ReportServerFenceResultsOperation");
        if (doh.mo9338b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dwt", "c", 245, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[NetworkManager] Cannot use an anonymous account for reportFenceResults RPC.");
            dwt.m9709a(this, k, a);
        } else {
            a.mo9467f();
            new dxj(w.f14313a, doh, singletonList, this, k).mo9516a(a);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof efs) {
            return this.f14842a.equals(((efs) obj).f14842a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14842a});
    }

    /* renamed from: a */
    public final void mo9477a(int i) {
        super.mo9477a(i);
        if (i == 11) {
            new Object[1][0] = this.f14842a.f14122e;
            dro n = dwq.m9670n();
            tmi a = tmi.m37203a(new efr(this), (tmc) null);
            ContextManagerClientInfo a2 = dtl.m9292a(this.f14843b);
            lrk lrk = new lrk();
            lrk.mo15390a(this.f14842a.f14118a);
            n.mo9501a(a, a2, lrk.mo15389a());
            return;
        }
        this.f14842a.f14134q = 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9478a(Object obj) {
        bxji bxji = (bxji) obj;
        duu duu = this.f14842a;
        new Object[1][0] = duu.f14122e;
        duu.f14134q = 3;
    }
}
