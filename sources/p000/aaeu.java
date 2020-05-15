package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;

/* renamed from: aaeu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaeu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ProfileSettingsEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        Status status = null;
        String str = null;
        StockProfileImageEntity stockProfileImageEntity = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    status = (Status) sed.m34998a(parcel2, readInt, Status.CREATOR);
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
                    stockProfileImageEntity = (StockProfileImageEntity) sed.m34998a(parcel2, readInt, StockProfileImageEntity.CREATOR);
                    break;
                case 7:
                    z4 = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    z5 = sed.m35006c(parcel2, readInt);
                    break;
                case 9:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    z6 = sed.m35006c(parcel2, readInt);
                    break;
                case 11:
                    z7 = sed.m35006c(parcel2, readInt);
                    break;
                case 12:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ProfileSettingsEntity(status, str, z, z2, z3, stockProfileImageEntity, z4, z5, i, z6, z7, i2, i3);
    }
}
