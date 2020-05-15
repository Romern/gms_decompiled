package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.FilterHolder;
import com.google.android.gms.drive.query.internal.NotFilter;

/* renamed from: vgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new NotFilter[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        FilterHolder filterHolder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 1) {
                sed.m35002b(parcel, readInt);
            } else {
                filterHolder = (FilterHolder) sed.m34998a(parcel, readInt, FilterHolder.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new NotFilter(filterHolder);
    }
}
