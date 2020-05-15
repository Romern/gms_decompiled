package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

/* renamed from: ywm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ywm implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Bucket[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        Session session = null;
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
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
                    session = (Session) sed.m34998a(parcel2, readInt, Session.CREATOR);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    arrayList = sed.m35005c(parcel2, readInt, DataSet.CREATOR);
                    break;
                case 6:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new Bucket(j, j2, session, i, arrayList, i2, z);
    }
}
