package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.service.v1whitelisted.models.SettingEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.Settings;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: aoig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoig implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Settings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        HashSet hashSet = new HashSet();
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
                hashSet.add(1);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                arrayList = sed.m35005c(parcel, readInt, SettingEntity.CREATOR);
                hashSet.add(3);
            }
        }
        if (parcel.dataPosition() == b) {
            return new Settings(hashSet, i, arrayList);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new sec(sb.toString(), parcel);
    }
}
