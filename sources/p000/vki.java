package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;
import java.util.ArrayList;

/* renamed from: vki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vki implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableEventList[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        DataHolder dataHolder = null;
        ArrayList arrayList2 = null;
        ParcelableChangeInfo parcelableChangeInfo = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, ParcelableEvent.CREATOR);
            } else if (a == 3) {
                dataHolder = (DataHolder) sed.m34998a(parcel, readInt, DataHolder.CREATOR);
            } else if (a == 4) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 5) {
                arrayList2 = sed.m34992D(parcel, readInt);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                parcelableChangeInfo = (ParcelableChangeInfo) sed.m34998a(parcel, readInt, ParcelableChangeInfo.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ParcelableEventList(arrayList, dataHolder, z, arrayList2, parcelableChangeInfo);
    }
}
