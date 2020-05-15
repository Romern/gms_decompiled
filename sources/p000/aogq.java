package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzEventEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientOzExtensionEntity;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aogq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aogq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientOzExtensionEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    str3 = sed.m35020q(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    arrayList = sed.m35005c(parcel, readInt, ClientOzEventEntity.CREATOR);
                    hashSet.add(3);
                    break;
                case 4:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(4);
                    break;
                case 5:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    j = sed.m35012i(parcel, readInt);
                    hashSet.add(6);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ClientOzExtensionEntity(hashSet, i, str3, arrayList, str, str2, j);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
