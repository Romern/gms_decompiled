package p000;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;

/* renamed from: anwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ApplicationEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ApplicationInfo applicationInfo = null;
        AppAclsEntity appAclsEntity = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a != 1000) {
                switch (a) {
                    case 1:
                        str = sed.m35020q(parcel2, readInt);
                        continue;
                    case 2:
                        str2 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 3:
                        str3 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 4:
                        applicationInfo = (ApplicationInfo) sed.m34998a(parcel2, readInt, ApplicationInfo.CREATOR);
                        continue;
                    case 5:
                        appAclsEntity = (AppAclsEntity) sed.m34998a(parcel2, readInt, AppAclsEntity.CREATOR);
                        continue;
                    case 6:
                        z = sed.m35006c(parcel2, readInt);
                        continue;
                    case 7:
                        str4 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 8:
                        str5 = sed.m35020q(parcel2, readInt);
                        continue;
                    case 9:
                        z2 = sed.m35006c(parcel2, readInt);
                        continue;
                    case 10:
                        z3 = sed.m35006c(parcel2, readInt);
                        continue;
                    case 11:
                        str6 = sed.m35020q(parcel2, readInt);
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
        return new ApplicationEntity(i, str, str2, str3, applicationInfo, appAclsEntity, z, str4, str5, z2, z3, str6);
    }
}
