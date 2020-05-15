package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.ActionTargetEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.OzDeviceInfoEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.OzEventEntity;
import java.util.HashSet;

/* renamed from: aohp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aohp implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new OzEventEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        ActionTargetEntity actionTargetEntity = null;
        OzDeviceInfoEntity ozDeviceInfoEntity = null;
        FavaDiagnosticsEntity favaDiagnosticsEntity = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                actionTargetEntity = (ActionTargetEntity) sed.m34998a(parcel, readInt, ActionTargetEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 5) {
                ozDeviceInfoEntity = (OzDeviceInfoEntity) sed.m34998a(parcel, readInt, OzDeviceInfoEntity.CREATOR);
                hashSet.add(5);
            } else if (a == 7) {
                favaDiagnosticsEntity = (FavaDiagnosticsEntity) sed.m34998a(parcel, readInt, FavaDiagnosticsEntity.CREATOR);
                hashSet.add(7);
            } else if (a == 10) {
                z = sed.m35006c(parcel, readInt);
                hashSet.add(10);
            } else if (a == 14) {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(14);
            } else if (a != 15) {
                sed.m35002b(parcel, readInt);
            } else {
                str2 = sed.m35020q(parcel, readInt);
                hashSet.add(15);
            }
        }
        if (parcel.dataPosition() == b) {
            return new OzEventEntity(hashSet, i, actionTargetEntity, ozDeviceInfoEntity, favaDiagnosticsEntity, z, str, str2);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
