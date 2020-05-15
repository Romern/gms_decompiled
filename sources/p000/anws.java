package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import java.util.ArrayList;

/* renamed from: anws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anws implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AppAclsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        Audience audience = null;
        ArrayList arrayList = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = sed.m35020q(parcel2, readInt);
                        continue;
                    case 2:
                        audience = (Audience) sed.m34998a(parcel2, readInt, Audience.CREATOR);
                        continue;
                    case 3:
                        arrayList = sed.m35005c(parcel2, readInt, AudienceMember.CREATOR);
                        continue;
                    case 4:
                        z = sed.m35006c(parcel2, readInt);
                        continue;
                    case 5:
                        z2 = sed.m35006c(parcel2, readInt);
                        continue;
                    case 6:
                        z3 = sed.m35006c(parcel2, readInt);
                        continue;
                    case 7:
                        z4 = sed.m35006c(parcel2, readInt);
                        continue;
                    case 8:
                        i2 = sed.m35010g(parcel2, readInt);
                        continue;
                    case 9:
                        str2 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 10:
                        str3 = sed.m35020q(parcel2, readInt);
                        continue;
                    default:
                        sed.m35002b(parcel2, readInt);
                        continue;
                }
            } else {
                i = sed.m35010g(parcel2, readInt);
            }
        }
        sed.m34994F(parcel2, b);
        return new AppAclsEntity(i, str, audience, arrayList, z, z2, z3, z4, i2, str2, str3);
    }
}
