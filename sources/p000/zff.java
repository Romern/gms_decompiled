package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.SessionReadRequest;
import java.util.ArrayList;

/* renamed from: zff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zff implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SessionReadRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    arrayList = sed.m35005c(parcel2, readInt, DataType.CREATOR);
                    break;
                case 6:
                    arrayList2 = sed.m35005c(parcel2, readInt, DataSource.CREATOR);
                    break;
                case 7:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    arrayList3 = sed.m34992D(parcel2, readInt);
                    break;
                case 10:
                    iBinder = sed.m35021r(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new SessionReadRequest(str, str2, j, j2, arrayList, arrayList2, z, z2, arrayList3, iBinder);
    }
}
