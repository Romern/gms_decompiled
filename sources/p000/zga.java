package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fitness.result.ReadRawResult;
import java.util.ArrayList;

/* renamed from: zga */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zga implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReadRawResult[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DataHolder dataHolder = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                dataHolder = (DataHolder) sed.m34998a(parcel, readInt, DataHolder.CREATOR);
            } else if (a != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, DataHolder.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new ReadRawResult(dataHolder, arrayList);
    }
}
