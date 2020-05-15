package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.RemoveGeofencingRequest;

/* renamed from: bigp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bigp extends bhpv {

    /* renamed from: b */
    final /* synthetic */ RemoveGeofencingRequest f120536b;

    /* renamed from: c */
    final /* synthetic */ bigu f120537c;

    /* renamed from: d */
    final /* synthetic */ bigx f120538d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bigp(bigx bigx, rkb rkb, RemoveGeofencingRequest removeGeofencingRequest, bigu bigu) {
        super(rkb);
        this.f120538d = bigx;
        this.f120536b = removeGeofencingRequest;
        this.f120537c = bigu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final rke mo64140a() {
        bigx bigx = this.f120538d;
        aejs aejs = bigx.f120574x;
        return aejs.m51942a(bigx.f120561k, this.f120536b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        super.mo9454a(status);
        this.f120538d.f120554d.post(new bigo(this, status));
    }
}
