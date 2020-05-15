package p000;

import android.os.Bundle;

/* renamed from: auls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auls extends aulp {

    /* renamed from: a */
    private static final aunx f92057a = new aunx("TrustAgent", "CheckTrustAgentStatusOperation");

    public auls(auqe auqe, Bundle bundle) {
        super(auqe, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo50660a(Bundle bundle) {
        f92057a.mo50711a("doExecute", new Object[0]);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("trustagent.api.bridge.be.GetIsTrustagentStartOperation.is_trustagent_start_key", aurj.m77699a().mo50827d());
        return bundle2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50661a() {
    }
}
