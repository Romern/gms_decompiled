package p000;

import android.os.Parcel;
import com.google.android.gms.fitness.request.DeleteAllUserDataRequest;
import com.google.android.gms.fitness.request.GetStoredDataSourcesRequest;
import com.google.android.gms.fitness.request.PurgeDataSourcesRequest;

/* renamed from: zbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbs extends dck implements zbt {

    /* renamed from: a */
    final /* synthetic */ znp f54907a;

    /* renamed from: b */
    private final ytu f54908b;

    public zbs() {
        super("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
    }

    /* renamed from: a */
    public final void mo30914a(DeleteAllUserDataRequest deleteAllUserDataRequest) {
        this.f54907a.mo31237b(this.f54908b.f54621a);
        this.f54908b.mo30771a(0, deleteAllUserDataRequest);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zbs(znp znp, ytu ytu) {
        super("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
        this.f54907a = znp;
        this.f54908b = ytu;
    }

    /* renamed from: a */
    public final void mo30915a(GetStoredDataSourcesRequest getStoredDataSourcesRequest) {
        this.f54907a.mo31237b(this.f54908b.f54621a);
        this.f54908b.mo30771a(2, getStoredDataSourcesRequest);
    }

    /* renamed from: a */
    public final void mo30916a(PurgeDataSourcesRequest purgeDataSourcesRequest) {
        this.f54907a.mo31237b(this.f54908b.f54621a);
        this.f54908b.mo30771a(1, purgeDataSourcesRequest);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo30914a((DeleteAllUserDataRequest) dcl.m8163a(parcel, DeleteAllUserDataRequest.CREATOR));
        } else if (i == 2) {
            mo30916a((PurgeDataSourcesRequest) dcl.m8163a(parcel, PurgeDataSourcesRequest.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo30915a((GetStoredDataSourcesRequest) dcl.m8163a(parcel, GetStoredDataSourcesRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
