package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;

/* renamed from: tms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tms extends tmb {

    /* renamed from: a */
    final /* synthetic */ InterestUpdateBatchImpl f46274a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tms(InterestUpdateBatchImpl interestUpdateBatchImpl, rkb rkb) {
        super(rkb);
        this.f46274a = interestUpdateBatchImpl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        tmd tmd = (tmd) rjd;
        InterestUpdateBatchImpl interestUpdateBatchImpl = this.f46274a;
        tmd.mo25288A();
        tmi a = tmi.m37203a(this, (tmc) null);
        ContextManagerClientInfo contextManagerClientInfo = tmd.f46258c;
        ((tmr) tmd.mo25289B()).mo9992a(a, contextManagerClientInfo.f30678b, contextManagerClientInfo.f30677a, contextManagerClientInfo.f30680d, interestUpdateBatchImpl);
    }
}
