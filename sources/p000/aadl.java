package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.appcontent.AppContentActionEntity;
import com.google.android.gms.games.appcontent.AppContentAnnotationEntity;
import com.google.android.gms.games.appcontent.AppContentCardEntity;
import com.google.android.gms.games.appcontent.AppContentConditionEntity;
import java.util.ArrayList;

/* renamed from: aadl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aadl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppContentCardEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    arrayList = sed.m35005c(parcel2, readInt, AppContentActionEntity.CREATOR);
                    break;
                case 2:
                    arrayList2 = sed.m35005c(parcel2, readInt, AppContentAnnotationEntity.CREATOR);
                    break;
                case 3:
                    arrayList3 = sed.m35005c(parcel2, readInt, AppContentConditionEntity.CREATOR);
                    break;
                case 4:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 8:
                case 9:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 10:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 14:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AppContentCardEntity(arrayList, arrayList2, arrayList3, str, i, str2, bundle, str3, str4, i2, str5, str6);
    }
}
