package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.appcontent.AppContentActionEntity;
import com.google.android.gms.games.appcontent.AppContentAnnotationEntity;
import com.google.android.gms.games.appcontent.AppContentCardEntity;
import com.google.android.gms.games.appcontent.AppContentSectionEntity;
import java.util.ArrayList;

/* renamed from: aadn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aadn implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppContentSectionEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList3 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                arrayList = sed.m35005c(parcel, readInt, AppContentActionEntity.CREATOR);
            } else if (a != 14) {
                switch (a) {
                    case 3:
                        arrayList2 = sed.m35005c(parcel, readInt, AppContentCardEntity.CREATOR);
                        continue;
                    case 4:
                        str = sed.m35020q(parcel, readInt);
                        continue;
                    case 5:
                        bundle = sed.m35022s(parcel, readInt);
                        continue;
                    case 6:
                        str2 = sed.m35020q(parcel, readInt);
                        continue;
                    case 7:
                        str3 = sed.m35020q(parcel, readInt);
                        continue;
                    case 8:
                        str4 = sed.m35020q(parcel, readInt);
                        continue;
                    case 9:
                        str5 = sed.m35020q(parcel, readInt);
                        continue;
                    case 10:
                        str6 = sed.m35020q(parcel, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel, readInt);
                        continue;
                }
            } else {
                arrayList3 = sed.m35005c(parcel, readInt, AppContentAnnotationEntity.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new AppContentSectionEntity(arrayList, arrayList2, str, bundle, str2, str3, str4, str5, str6, arrayList3);
    }
}
