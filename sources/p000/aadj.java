package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.appcontent.AppContentActionEntity;
import com.google.android.gms.games.appcontent.AppContentAnnotationEntity;
import com.google.android.gms.games.appcontent.AppContentConditionEntity;
import java.util.ArrayList;

/* renamed from: aadj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aadj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppContentActionEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        ArrayList arrayList = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        AppContentAnnotationEntity appContentAnnotationEntity = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    arrayList = sed.m35005c(parcel, readInt, AppContentConditionEntity.CREATOR);
                    break;
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    bundle = sed.m35022s(parcel, readInt);
                    break;
                case 4:
                case 5:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel, readInt);
                    break;
                case 8:
                    appContentAnnotationEntity = (AppContentAnnotationEntity) sed.m34998a(parcel, readInt, AppContentAnnotationEntity.CREATOR);
                    break;
                case 9:
                    str4 = sed.m35020q(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new AppContentActionEntity(arrayList, str, bundle, str2, str3, appContentAnnotationEntity, str4);
    }
}
