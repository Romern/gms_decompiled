package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.beacon.BleFilter;
import com.google.android.gms.beacon.BleSettings;
import java.util.ArrayList;

/* renamed from: nen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nen implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BleSettings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        WorkSource workSource = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a == 4) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 6) {
                arrayList = sed.m35005c(parcel, readInt, BleFilter.CREATOR);
            } else if (a == 7) {
                workSource = (WorkSource) sed.m34998a(parcel, readInt, WorkSource.CREATOR);
            } else if (a != 8) {
                sed.m35002b(parcel, readInt);
            } else {
                i3 = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new BleSettings(i, i2, j, arrayList, workSource, i3);
    }
}
