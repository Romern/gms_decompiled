package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import java.util.ArrayList;

/* renamed from: zef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zef implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DataDeleteRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 2:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 3:
                    arrayList = sed.m35005c(parcel2, readInt, DataSource.CREATOR);
                    break;
                case 4:
                    arrayList2 = sed.m35005c(parcel2, readInt, DataType.CREATOR);
                    break;
                case 5:
                    arrayList3 = sed.m35005c(parcel2, readInt, Session.CREATOR);
                    break;
                case 6:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                case 9:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 10:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new DataDeleteRequest(j, j2, arrayList, arrayList2, arrayList3, z, z2, z3, z4, iBinder);
    }
}
