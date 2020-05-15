package p000;

import android.app.PendingIntent;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: edb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class edb extends tmq implements aaai {

    /* renamed from: a */
    private final dro f14715a = dwq.m9670n();

    /* renamed from: b */
    private ContextManagerClientInfo f14716b;

    public edb(ContextManagerClientInfo contextManagerClientInfo) {
        this.f14716b = contextManagerClientInfo;
    }

    /* renamed from: a */
    private final int m10145a(String str, String str2, String str3, int i) {
        if (this.f14716b == null) {
            rfz.m33557a(dwq.m9662f()).mo24605a(str);
            this.f14716b = new ContextManagerClientInfo(str2, str, Binder.getCallingUid(), str3, 0, 1, Binder.getCallingPid());
        }
        if (TextUtils.isEmpty(str2)) {
            return 7504;
        }
        if (TextUtils.isEmpty(str3)) {
            return 7500;
        }
        if (!TextUtils.equals(str2, this.f14716b.f30677a)) {
            return 7510;
        }
        if (!TextUtils.equals(str3, this.f14716b.f30680d)) {
            return 7511;
        }
        if (i == 0 && this.f14716b.mo18070e()) {
            return 7512;
        }
        return Binder.getCallingUid() != this.f14716b.f30679c ? 7513 : 0;
    }

    /* renamed from: a */
    private static boolean m10146a(int i) {
        return i == 0;
    }

    /* renamed from: b */
    public final void mo9996b(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
        int a = m10145a(str, str2, str3, 0);
        if (!m10146a(a)) {
            drn.m9165a(tmo, a, (DataHolder) null);
        } else if (contextDataFilterImpl != null) {
            dro dro = this.f14715a;
            ContextManagerClientInfo contextManagerClientInfo = this.f14716b;
            new Object[1][0] = contextManagerClientInfo;
            dro.m9170a(new dsh(tmo, contextManagerClientInfo, contextDataFilterImpl), dqy.m9124a("Read", dro.f13884a, contextManagerClientInfo.f30678b));
        } else {
            drn.m9165a(tmo, 0, (DataHolder) null);
        }
    }

    /* renamed from: a */
    public final void mo9985a(tmo tmo, String str, String str2, String str3, SnapshotRequest snapshotRequest) {
        int a = m10145a(str, str2, str3, 1);
        if (!m10146a(a)) {
            drn.m9164a(tmo, a, (Snapshot) null);
            return;
        }
        dro dro = this.f14715a;
        ContextManagerClientInfo contextManagerClientInfo = this.f14716b;
        new Object[1][0] = contextManagerClientInfo;
        dro.m9170a(new edn(tmo, contextManagerClientInfo, snapshotRequest), dqy.m9124a("GetSnapshot", dro.f13884a, contextManagerClientInfo.f30678b));
    }

    /* renamed from: a */
    public final void mo9986a(tmo tmo, String str, String str2, String str3, ContextFenceStub contextFenceStub) {
        int a = m10145a(str, str2, str3, 0);
        if (!m10146a(a)) {
            drn.m9166a(tmo, a, (FenceStateImpl) null);
            return;
        }
        dro dro = this.f14715a;
        ContextManagerClientInfo contextManagerClientInfo = this.f14716b;
        new Object[1][0] = contextFenceStub;
        dro.m9170a(new dsc(tmo, contextManagerClientInfo, contextFenceStub), dqy.m9124a("evaluateFence", dro.f13884a, contextManagerClientInfo.f30678b));
    }

    /* renamed from: a */
    public final void mo9987a(tmo tmo, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl) {
        int a = m10145a(str, str2, str3, 1);
        if (!m10146a(a)) {
            drn.m9167a(tmo, a, (FenceStateMapImpl) null);
            return;
        }
        dro dro = this.f14715a;
        ContextManagerClientInfo contextManagerClientInfo = this.f14716b;
        new Object[1][0] = fenceQueryRequestImpl;
        dro.m9170a(new dsg(tmo, contextManagerClientInfo, fenceQueryRequestImpl), dqy.m9124a("queryFences", dro.f13884a, contextManagerClientInfo.f30678b));
    }

    /* renamed from: a */
    public final void mo9988a(tmo tmo, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        int a = m10145a(str, str2, str3, 1);
        if (!m10146a(a)) {
            drn.m9163a(tmo, a);
        } else {
            this.f14715a.mo9501a(tmo, this.f14716b, fenceUpdateRequestImpl);
        }
    }

    /* renamed from: a */
    public final void mo9989a(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
        int a = m10145a(str, str2, str3, 0);
        if (!m10146a(a)) {
            drn.m9169b(tmo, a, null);
            return;
        }
        dro dro = this.f14715a;
        ContextManagerClientInfo contextManagerClientInfo = this.f14716b;
        new Object[1][0] = contextManagerClientInfo;
        dro.m9170a(new dsf(tmo, contextManagerClientInfo, contextDataFilterImpl), dqy.m9124a("GetCurrentContext", dro.f13884a, contextManagerClientInfo.f30678b));
    }

    /* renamed from: a */
    public final void mo9990a(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, tml tml) {
        mo9991a(tmo, str, str2, str3, contextDataFilterImpl, tml, null);
    }

    /* renamed from: a */
    public final void mo9991a(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, tml tml, PendingIntent pendingIntent) {
        int a = m10145a(str, str2, str3, 0);
        if (!m10146a(a)) {
            drn.m9163a(tmo, a);
        } else if (contextDataFilterImpl != null) {
            dro dro = this.f14715a;
            ContextManagerClientInfo contextManagerClientInfo = this.f14716b;
            new Object[1][0] = contextManagerClientInfo;
            dro.m9170a(new dsl(tmo, contextManagerClientInfo, new drc(contextManagerClientInfo, tml, pendingIntent, contextDataFilterImpl)), dqy.m9124a("RegisterContextListener", dro.f13884a, contextManagerClientInfo.f30678b));
        } else {
            drn.m9163a(tmo, 0);
        }
    }

    /* renamed from: a */
    public final void mo9992a(tmo tmo, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl) {
        int a = m10145a(str, str2, str3, 0);
        if (!m10146a(a)) {
            drn.m9163a(tmo, a);
        } else if (interestUpdateBatchImpl != null) {
            dro dro = this.f14715a;
            ContextManagerClientInfo contextManagerClientInfo = this.f14716b;
            new Object[1][0] = contextManagerClientInfo;
            dro.m9170a(new dsq(tmo, contextManagerClientInfo, interestUpdateBatchImpl), dqy.m9124a("UpdateInterests", dro.f13884a, contextManagerClientInfo.f30678b));
        } else {
            drn.m9163a(tmo, 0);
        }
    }

    /* renamed from: a */
    public final void mo9993a(tmo tmo, String str, String str2, String str3, WriteBatchImpl writeBatchImpl) {
        int a = m10145a(str, str2, str3, 0);
        if (!m10146a(a)) {
            drn.m9168a(tmo, a, (WriteBatchImpl) null);
        } else if (writeBatchImpl != null) {
            dro dro = this.f14715a;
            ContextManagerClientInfo contextManagerClientInfo = this.f14716b;
            new Object[1][0] = contextManagerClientInfo;
            dro.m9170a(new dsr(tmo, contextManagerClientInfo, writeBatchImpl), dqy.m9124a("WriteBatch", dro.f13884a, contextManagerClientInfo.f30678b));
        } else {
            drn.m9168a(tmo, 0, (WriteBatchImpl) null);
        }
    }

    /* renamed from: a */
    public final void mo9994a(tmo tmo, String str, String str2, String str3, tml tml) {
        mo9995a(tmo, str, str2, str3, tml, (PendingIntent) null);
    }

    /* renamed from: a */
    public final void mo9995a(tmo tmo, String str, String str2, String str3, tml tml, PendingIntent pendingIntent) {
        int a = m10145a(str, str2, str3, 0);
        if (!m10146a(a)) {
            drn.m9163a(tmo, a);
            return;
        }
        dro dro = this.f14715a;
        ContextManagerClientInfo contextManagerClientInfo = this.f14716b;
        new Object[1][0] = contextManagerClientInfo;
        dro.m9170a(new dsm(tmo, contextManagerClientInfo, new drc(contextManagerClientInfo, tml, pendingIntent, null)), dqy.m9124a("UnregisterContextListener", dro.f13884a, contextManagerClientInfo.f30678b));
    }
}
