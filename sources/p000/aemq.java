package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.places.internal.AutocompletePredictionEntity;
import java.util.ArrayList;

/* renamed from: aemq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aemq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutocompletePredictionEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        ArrayList arrayList3 = null;
        String str4 = null;
        ArrayList arrayList4 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    arrayList = sed.m34990B(parcel, readInt);
                    break;
                case 4:
                    arrayList2 = sed.m35005c(parcel, readInt, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                case 5:
                    i = sed.m35010g(parcel, readInt);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    arrayList3 = sed.m35005c(parcel, readInt, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
                case 9:
                    arrayList4 = sed.m35005c(parcel, readInt, AutocompletePredictionEntity.SubstringEntity.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AutocompletePredictionEntity(str, arrayList, i, str2, arrayList2, str3, arrayList3, str4, arrayList4);
    }
}
