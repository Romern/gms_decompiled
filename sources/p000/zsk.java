package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.store.listener.DataUpdateListener;

/* renamed from: zsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zsk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataUpdateListener[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        DataSource dataSource = null;
        DataType dataType = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                dataSource = (DataSource) sed.m34998a(parcel, readInt, DataSource.CREATOR);
            } else if (a == 4) {
                dataType = (DataType) sed.m34998a(parcel, readInt, DataType.CREATOR);
            } else if (a != 5) {
                sed.m35002b(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) sed.m34998a(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new DataUpdateListener(str, str2, dataSource, dataType, pendingIntent);
    }
}
