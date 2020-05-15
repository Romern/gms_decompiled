package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import com.google.android.gms.photos.autobackup.model.UserQuota;

/* renamed from: anjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anjy implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AutoBackupSettings[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        UserQuota userQuota = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 4:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 5:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 6:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 7:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 10:
                    z8 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    userQuota = (UserQuota) sed.m34998a(parcel2, readInt, UserQuota.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AutoBackupSettings(i, str, z, z2, z3, z4, z5, z6, z7, z8, userQuota);
    }
}
