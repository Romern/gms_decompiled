package p000;

import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: tma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tma extends rle {
    public tma(rkb rkb) {
        super(tjj.f46189a, rkb);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        super.mo17716a((rkk) obj);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new tlz(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        tmd tmd = (tmd) rjd;
        SnapshotRequest snapshotRequest = new SnapshotRequest();
        tmd.mo25288A();
        tmi a = tmi.m37202a(this);
        ContextManagerClientInfo contextManagerClientInfo = tmd.f46258c;
        ((tmr) tmd.mo25289B()).mo9985a(a, contextManagerClientInfo.f30678b, contextManagerClientInfo.f30677a, contextManagerClientInfo.f30680d, snapshotRequest);
    }
}
