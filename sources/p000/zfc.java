package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.SensorRegistrationRequest;

/* renamed from: zfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zfc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SensorRegistrationRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        DataSource dataSource = null;
        DataType dataType = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    dataSource = (DataSource) sed.m34998a(parcel2, readInt, DataSource.CREATOR);
                    break;
                case 2:
                    dataType = (DataType) sed.m34998a(parcel2, readInt, DataType.CREATOR);
                    break;
                case 3:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 4:
                case 5:
                case 11:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 6:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 8:
                    pendingIntent = (PendingIntent) sed.m34998a(parcel2, readInt, PendingIntent.CREATOR);
                    break;
                case 9:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 10:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    j4 = sed.m35012i(parcel2, readInt);
                    break;
                case 13:
                    iBinder2 = sed.m35021r(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new SensorRegistrationRequest(dataSource, dataType, iBinder, j, j2, pendingIntent, j3, i, j4, iBinder2);
    }
}
