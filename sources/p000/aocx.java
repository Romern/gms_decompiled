package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.pos.PlusonesEntity;
import java.util.HashSet;

/* renamed from: aocx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlusonesEntity.MetadataEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        PlusonesEntity.MetadataEntity.GlobalCountsEntity globalCountsEntity = null;
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel, readInt);
                    hashSet.add(1);
                    break;
                case 2:
                    j2 = sed.m35012i(parcel, readInt);
                    hashSet.add(2);
                    break;
                case 3:
                    j = sed.m35012i(parcel, readInt);
                    hashSet.add(3);
                    break;
                case 4:
                    globalCountsEntity = (PlusonesEntity.MetadataEntity.GlobalCountsEntity) sed.m34998a(parcel, readInt, PlusonesEntity.MetadataEntity.GlobalCountsEntity.CREATOR);
                    hashSet.add(4);
                    break;
                case 5:
                    str = sed.m35020q(parcel, readInt);
                    hashSet.add(5);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel, readInt);
                    hashSet.add(6);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlusonesEntity.MetadataEntity(hashSet, i, j2, j, globalCountsEntity, str, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
