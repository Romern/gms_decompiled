package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import java.util.ArrayList;

/* renamed from: zfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StartBleScanRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, DataType.CREATOR);
            } else if (a == 2) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 3) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                iBinder2 = sed.m35021r(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new StartBleScanRequest(arrayList, iBinder, i, iBinder2);
    }
}
