package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.pos.PlusonesEntity;
import java.util.HashSet;

/* renamed from: aocw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocw implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlusonesEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        String str2 = null;
        String str3 = null;
        PlusonesEntity.MetadataEntity metadataEntity = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(2);
            } else if (a == 3) {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(3);
            } else if (a == 4) {
                str3 = sed.m35020q(parcel, readInt);
                hashSet.add(4);
            } else if (a == 5) {
                z = sed.m35006c(parcel, readInt);
                hashSet.add(5);
            } else if (a != 7) {
                sed.m35002b(parcel, readInt);
            } else {
                metadataEntity = (PlusonesEntity.MetadataEntity) sed.m34998a(parcel, readInt, PlusonesEntity.MetadataEntity.CREATOR);
                hashSet.add(7);
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlusonesEntity(hashSet, i, str, str2, str3, z, metadataEntity);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
