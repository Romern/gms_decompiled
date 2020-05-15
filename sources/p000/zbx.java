package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;

/* renamed from: zbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zbx extends dcj implements zbz {
    public zbx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
    }

    /* renamed from: a */
    public final void mo30920a(DataSourcesRequest dataSourcesRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataSourcesRequest);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo30921a(SensorRegistrationRequest sensorRegistrationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sensorRegistrationRequest);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo30922a(SensorUnregistrationRequest sensorUnregistrationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, sensorUnregistrationRequest);
        mo8528b(3, bj);
    }
}
