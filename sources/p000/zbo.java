package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataInsertRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.GetSyncInfoRequest;

/* renamed from: zbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbo extends dcj implements zbq {
    public zbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
    }

    /* renamed from: a */
    public final void mo30910a(DataDeleteRequest dataDeleteRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataDeleteRequest);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo30911a(DataInsertRequest dataInsertRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataInsertRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo30912a(DataReadRequest dataReadRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataReadRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo30913a(GetSyncInfoRequest getSyncInfoRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, getSyncInfoRequest);
        mo8528b(4, bj);
    }
}
