package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.ArrayList;

/* renamed from: zeh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zeh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataReadRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        DataSource dataSource = null;
        IBinder iBinder = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    arrayList = sed.m35005c(parcel2, readInt, DataType.CREATOR);
                    break;
                case 2:
                    arrayList2 = sed.m35005c(parcel2, readInt, DataSource.CREATOR);
                    break;
                case 3:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    arrayList3 = sed.m35005c(parcel2, readInt, DataType.CREATOR);
                    break;
                case 6:
                    arrayList4 = sed.m35005c(parcel2, readInt, DataSource.CREATOR);
                    break;
                case 7:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 9:
                    dataSource = (DataSource) sed.m34998a(parcel2, readInt, DataSource.CREATOR);
                    break;
                case 10:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 11:
                case 15:
                case 16:
                case 17:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 12:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 13:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 18:
                    arrayList5 = sed.m34991C(parcel2, readInt);
                    break;
                case 19:
                    arrayList6 = sed.m34991C(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new DataReadRequest(arrayList, arrayList2, j, j2, arrayList3, arrayList4, i, j3, dataSource, i2, z, z2, iBinder, arrayList5, arrayList6);
    }
}
