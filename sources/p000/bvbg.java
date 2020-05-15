package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.location.nearby.direct.client.internal.OperationRequest;

/* renamed from: bvbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvbg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OperationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        byte[] bArr = null;
        IBinder iBinder = null;
        WorkSource workSource = null;
        BleFilter[] bleFilterArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                bArr = sed.m35023t(parcel, readInt);
            } else if (a == 2) {
                iBinder = sed.m35021r(parcel, readInt);
            } else if (a == 3) {
                workSource = (WorkSource) sed.m34998a(parcel, readInt, WorkSource.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                bleFilterArr = (BleFilter[]) sed.m35004b(parcel, readInt, BleFilter.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new OperationRequest(bArr, iBinder, workSource, bleFilterArr);
    }
}
