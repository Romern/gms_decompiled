package p000;

import android.os.Parcel;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;

/* renamed from: zbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbj extends dck implements zbk {

    /* renamed from: a */
    private final ytu f54903a;

    public zbj() {
        super("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
    }

    /* renamed from: a */
    public final void mo30907a(DataTypeCreateRequest dataTypeCreateRequest) {
        this.f54903a.mo30771a(0, dataTypeCreateRequest);
    }

    /* renamed from: a */
    public final void mo30908a(DataTypeReadRequest dataTypeReadRequest) {
        this.f54903a.mo30771a(1, dataTypeReadRequest);
    }

    public zbj(ytu ytu) {
        super("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
        this.f54903a = ytu;
    }

    /* renamed from: a */
    public final void mo30909a(DisableFitRequest disableFitRequest) {
        this.f54903a.mo30771a(2, disableFitRequest);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo30907a((DataTypeCreateRequest) dcl.m8163a(parcel, DataTypeCreateRequest.CREATOR));
        } else if (i == 2) {
            mo30908a((DataTypeReadRequest) dcl.m8163a(parcel, DataTypeReadRequest.CREATOR));
        } else if (i != 22) {
            return false;
        } else {
            mo30909a((DisableFitRequest) dcl.m8163a(parcel, DisableFitRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
