package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.HashSet;

/* renamed from: aoim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoim implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpgradeAccountEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        UpgradeAccountEntity.DescriptionEntity descriptionEntity = null;
        UpgradeAccountEntity.FormEntity formEntity = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a == 2) {
                descriptionEntity = (UpgradeAccountEntity.DescriptionEntity) sed.m34998a(parcel, readInt, UpgradeAccountEntity.DescriptionEntity.CREATOR);
                hashSet.add(2);
            } else if (a == 4) {
                formEntity = (UpgradeAccountEntity.FormEntity) sed.m34998a(parcel, readInt, UpgradeAccountEntity.FormEntity.CREATOR);
                hashSet.add(4);
            } else if (a != 6) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
                hashSet.add(6);
            }
        }
        if (parcel.dataPosition() == b) {
            return new UpgradeAccountEntity(hashSet, i, descriptionEntity, formEntity, str);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
