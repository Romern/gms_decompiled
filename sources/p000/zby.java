package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;
import com.google.android.gms.fitness.request.SensorUnregistrationRequest;

/* renamed from: zby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zby extends dck implements zbz {

    /* renamed from: a */
    final /* synthetic */ zon f54909a;

    /* renamed from: b */
    private final ytu f54910b;

    public zby() {
        super("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
    }

    /* renamed from: a */
    public final void mo30920a(DataSourcesRequest dataSourcesRequest) {
        this.f54910b.mo30771a(0, dataSourcesRequest);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zby(zon zon, ytu ytu) {
        super("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
        this.f54909a = zon;
        this.f54910b = ytu;
    }

    /* renamed from: a */
    public final void mo30921a(SensorRegistrationRequest sensorRegistrationRequest) {
        try {
            DataType dataType = sensorRegistrationRequest.f32275b;
            if (dataType != null) {
                zon zon = this.f54909a;
                srn srn = zon.f55609d;
                if (!zdk.m45330b(zon.f55428a, this.f54910b.f54621a, dataType)) {
                    sensorRegistrationRequest.f32275b = null;
                }
            }
            DataSource dataSource = sensorRegistrationRequest.f32274a;
            if (dataSource != null) {
                zon zon2 = this.f54909a;
                srn srn2 = zon.f55609d;
                if (!zdk.m45330b(zon2.f55428a, this.f54910b.f54621a, dataSource.f32005a)) {
                    sensorRegistrationRequest.f32274a = null;
                }
            }
            this.f54910b.mo30771a(1, sensorRegistrationRequest);
        } catch (zdj e) {
            zcl zcl = sensorRegistrationRequest.f32284k;
            sdo.m34959a(zcl);
            zcl.mo30933a(new Status(5025));
        }
    }

    /* renamed from: a */
    public final void mo30922a(SensorUnregistrationRequest sensorUnregistrationRequest) {
        this.f54910b.mo30771a(2, sensorUnregistrationRequest);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo30920a((DataSourcesRequest) dcl.m8163a(parcel, DataSourcesRequest.CREATOR));
        } else if (i == 2) {
            mo30921a((SensorRegistrationRequest) dcl.m8163a(parcel, SensorRegistrationRequest.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo30922a((SensorUnregistrationRequest) dcl.m8163a(parcel, SensorUnregistrationRequest.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
