package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;

/* renamed from: zbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbi extends dcj implements zbk {
    public zbi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
    }

    /* renamed from: a */
    public final void mo30907a(DataTypeCreateRequest dataTypeCreateRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataTypeCreateRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo30908a(DataTypeReadRequest dataTypeReadRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataTypeReadRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo30909a(DisableFitRequest disableFitRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, disableFitRequest);
        mo8528b(22, bj);
    }
}
