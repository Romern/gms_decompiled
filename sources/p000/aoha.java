package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsNamespacedTypeEntity;
import java.util.HashSet;

/* renamed from: aoha */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoha implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FavaDiagnosticsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity = null;
        FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity2 = null;
        FavaDiagnosticsNamespacedTypeEntity favaDiagnosticsNamespacedTypeEntity3 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 20) {
                favaDiagnosticsNamespacedTypeEntity3 = (FavaDiagnosticsNamespacedTypeEntity) sed.m34998a(parcel, readInt, FavaDiagnosticsNamespacedTypeEntity.CREATOR);
                hashSet.add(20);
            } else if (a == 24) {
                i2 = sed.m35010g(parcel, readInt);
                hashSet.add(24);
            } else if (a == 3) {
                favaDiagnosticsNamespacedTypeEntity = (FavaDiagnosticsNamespacedTypeEntity) sed.m34998a(parcel, readInt, FavaDiagnosticsNamespacedTypeEntity.CREATOR);
                hashSet.add(3);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                favaDiagnosticsNamespacedTypeEntity2 = (FavaDiagnosticsNamespacedTypeEntity) sed.m34998a(parcel, readInt, FavaDiagnosticsNamespacedTypeEntity.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == b) {
            return new FavaDiagnosticsEntity(hashSet, i, favaDiagnosticsNamespacedTypeEntity, favaDiagnosticsNamespacedTypeEntity2, favaDiagnosticsNamespacedTypeEntity3, i2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
