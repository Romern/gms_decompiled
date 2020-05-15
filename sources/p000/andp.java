package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Flag;

/* renamed from: andp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Flag[] flagArr = null;
        String[] strArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 3) {
                flagArr = (Flag[]) sed.m35004b(parcel, readInt, Flag.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                strArr = sed.m34989A(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Configuration(i, flagArr, strArr);
    }
}
