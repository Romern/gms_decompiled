package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.request.DataSourceQueryParams;
import com.google.android.gms.fitness.request.ReadRawRequest;
import java.util.ArrayList;

/* renamed from: zfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReadRawRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        IBinder iBinder = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, DataSourceQueryParams.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ReadRawRequest(iBinder, arrayList);
    }
}
