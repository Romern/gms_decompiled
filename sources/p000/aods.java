package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aods */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aods implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountField[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = null;
        String str = null;
        AccountField.LabelEntity labelEntity = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        AccountField.ValueEntity valueEntity = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    arrayList = sed.m35005c(parcel, readInt, AccountField.ErrorsEntity.CREATOR);
                    hashSet.add(2);
                    break;
                case 3:
                    z = sed.m35006c(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                default:
                    sed.m35002b(parcel, readInt);
                    break;
                case 6:
                    labelEntity = (AccountField.LabelEntity) sed.m34998a(parcel, readInt, AccountField.LabelEntity.CREATOR);
                    hashSet.add(6);
                    break;
                case 7:
                    z2 = sed.m35006c(parcel, readInt);
                    hashSet.add(7);
                    break;
                case 8:
                    arrayList2 = sed.m35005c(parcel, readInt, AccountField.OptionsEntity.CREATOR);
                    hashSet.add(8);
                    break;
                case 9:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(9);
                    break;
                case 10:
                    valueEntity = (AccountField.ValueEntity) sed.m34998a(parcel, readInt, AccountField.ValueEntity.CREATOR);
                    hashSet.add(10);
                    break;
                case 11:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(11);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountField(hashSet, i, arrayList, z, str, labelEntity, z2, arrayList2, str2, valueEntity, str3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
