package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataInsertRequest;

/* renamed from: zeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zeg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataInsertRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DataSet dataSet = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                dataSet = (DataSet) sed.m34998a(parcel, readInt, DataSet.CREATOR);
            } else if (a == 2) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                z = sed.m35006c(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new DataInsertRequest(dataSet, iBinder, z);
    }
}
