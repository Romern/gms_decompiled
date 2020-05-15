package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.AccountField;
import java.util.HashSet;

/* renamed from: aoej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoej implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AccountField.ValueEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        AccountField.ValueEntity.NameEntity nameEntity = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    z = sed.m35006c(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    nameEntity = (AccountField.ValueEntity.NameEntity) sed.m34998a(parcel, readInt, AccountField.ValueEntity.NameEntity.CREATOR);
                    hashSet.add(4);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(6);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new AccountField.ValueEntity(hashSet, i, z, str, nameEntity, str2, str3);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
