package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;

/* renamed from: yxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yxs implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Subscription[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        DataSource dataSource = null;
        DataType dataType = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                dataSource = (DataSource) sed.m34998a(parcel, readInt, DataSource.CREATOR);
            } else if (a == 2) {
                dataType = (DataType) sed.m34998a(parcel, readInt, DataType.CREATOR);
            } else if (a == 3) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 4) {
                i = sed.m35010g(parcel, readInt);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                i2 = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Subscription(dataSource, dataType, j, i, i2);
    }
}
