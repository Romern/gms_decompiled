package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

/* renamed from: zlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zlw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FitnessSensorServiceRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        DataSource dataSource = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                dataSource = (DataSource) sed.m34998a(parcel, readInt, DataSource.CREATOR);
            } else if (a == 2) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 3) {
                j = sed.m35012i(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                j2 = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new FitnessSensorServiceRequest(dataSource, iBinder, j, j2);
    }
}
