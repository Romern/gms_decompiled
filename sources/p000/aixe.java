package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.ble.BleFilter;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;

/* renamed from: aixe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MessageFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, MessageType.CREATOR);
            } else if (a == 2) {
                arrayList2 = sed.m35005c(parcel, readInt, NearbyDeviceFilter.CREATOR);
            } else if (a == 3) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 4) {
                arrayList3 = sed.m35005c(parcel, readInt, BleFilter.CREATOR);
            } else if (a == 5) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new MessageFilter(i, arrayList, arrayList2, z, arrayList3, i2);
    }
}
