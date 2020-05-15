package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.result.BleDevicesResult;
import java.util.ArrayList;

/* renamed from: zfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleDevicesResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        Status status = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, BleDevice.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                status = (Status) sed.m34998a(parcel, readInt, Status.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new BleDevicesResult(arrayList, status);
    }
}
