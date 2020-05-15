package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import com.google.android.gms.mdh.SyncStatus;
import java.util.ArrayList;

/* renamed from: afkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afkv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MdhFootprintsReadResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        SyncStatus syncStatus = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, MdhFootprint.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                syncStatus = (SyncStatus) sed.m34998a(parcel, readInt, SyncStatus.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new MdhFootprintsReadResult(arrayList, syncStatus);
    }
}
