package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementEntity;

/* renamed from: aadg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aadg implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AchievementEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Uri uri = null;
        String str4 = null;
        Uri uri2 = null;
        String str5 = null;
        String str6 = null;
        PlayerEntity playerEntity = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = -1.0f;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 3:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 5:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 6:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    uri2 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 8:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 11:
                    playerEntity = (PlayerEntity) sed.m34998a(parcel2, readInt, PlayerEntity.CREATOR);
                    break;
                case 12:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 13:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 14:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 15:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 16:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 17:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 18:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new AchievementEntity(str, i, str2, str3, uri, str4, uri2, str5, i2, str6, playerEntity, i3, i4, str7, j, j2, f, str8);
    }
}
