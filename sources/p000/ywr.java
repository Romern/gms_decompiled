package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.Application;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;

/* renamed from: ywr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataSource[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DataType dataType = null;
        Device device = null;
        Application application = null;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                dataType = (DataType) sed.m34998a(parcel, readInt, DataType.CREATOR);
            } else if (a == 3) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                device = (Device) sed.m34998a(parcel, readInt, Device.CREATOR);
            } else if (a == 5) {
                application = (Application) sed.m34998a(parcel, readInt, Application.CREATOR);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new DataSource(dataType, i, device, application, str);
    }
}
