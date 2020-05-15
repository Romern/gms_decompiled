package p000;

import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.UpdateFenceOperation;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;

/* renamed from: tke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tke extends tmb {

    /* renamed from: a */
    final /* synthetic */ FenceUpdateRequestImpl f46224a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tke(rkb rkb, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        super(rkb);
        this.f46224a = fenceUpdateRequestImpl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        lrj lrj;
        tmd tmd = (tmd) rjd;
        FenceUpdateRequestImpl fenceUpdateRequestImpl = this.f46224a;
        tmd.mo25288A();
        if (tmd.f46259d == null) {
            tmd.f46259d = new egk(tmd.f46257b, tkj.f46227a);
        }
        egk egk = tmd.f46259d;
        ArrayList arrayList = fenceUpdateRequestImpl.f30661a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
            if (updateFenceOperation.f30664c == null && (lrj = updateFenceOperation.f30665d) != null) {
                updateFenceOperation.f30664c = (tku) egk.mo10090a(lrj);
            }
        }
        tmi a = tmi.m37203a(this, (tmc) null);
        ContextManagerClientInfo contextManagerClientInfo = tmd.f46258c;
        ((tmr) tmd.mo25289B()).mo9988a(a, contextManagerClientInfo.f30678b, contextManagerClientInfo.f30677a, contextManagerClientInfo.f30680d, fenceUpdateRequestImpl);
    }
}
