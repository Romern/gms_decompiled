package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.RemoveGeofencingRequest;

/* renamed from: bigr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bigr extends bhpv {

    /* renamed from: b */
    final /* synthetic */ RemoveGeofencingRequest f120541b;

    /* renamed from: c */
    final /* synthetic */ bigu f120542c;

    /* renamed from: d */
    final /* synthetic */ bigx f120543d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bigr(bigx bigx, rkb rkb, RemoveGeofencingRequest removeGeofencingRequest, bigu bigu) {
        super(rkb);
        this.f120543d = bigx;
        this.f120541b = removeGeofencingRequest;
        this.f120542c = bigu;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final rke mo64140a() {
        bigx bigx = this.f120543d;
        aejs aejs = bigx.f120574x;
        return aejs.m51942a(bigx.f120561k, this.f120541b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        Status status = (Status) rkk;
        super.mo9454a(status);
        this.f120543d.f120554d.post(new bigq(this, status));
    }
}
