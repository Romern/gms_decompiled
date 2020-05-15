package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.PlayerRelationshipInfoEntity;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* renamed from: aadb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aadb implements Parcelable.Creator {
    /* renamed from: a */
    public PlayerEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        MostRecentGameInfoEntity mostRecentGameInfoEntity = null;
        PlayerLevelInfo playerLevelInfo = null;
        String str6 = null;
        String str7 = null;
        Uri uri3 = null;
        String str8 = null;
        Uri uri4 = null;
        String str9 = null;
        PlayerRelationshipInfoEntity playerRelationshipInfoEntity = null;
        long j4 = -1;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 2:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 4:
                    uri2 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 5:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 6:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 7:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 8:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 17:
                case 30:
                case 31:
                case 32:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 14:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 15:
                    mostRecentGameInfoEntity = (MostRecentGameInfoEntity) sed.m34998a(parcel2, readInt, MostRecentGameInfoEntity.CREATOR);
                    break;
                case 16:
                    playerLevelInfo = (PlayerLevelInfo) sed.m34998a(parcel2, readInt, PlayerLevelInfo.CREATOR);
                    break;
                case 18:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 19:
                    z2 = sed.m35006c(parcel2, readInt);
                    break;
                case 20:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 21:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
                case 22:
                    uri3 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 23:
                    str8 = sed.m35020q(parcel2, readInt);
                    break;
                case 24:
                    uri4 = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 25:
                    str9 = sed.m35020q(parcel2, readInt);
                    break;
                case 26:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 27:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 28:
                    z3 = sed.m35006c(parcel2, readInt);
                    break;
                case 29:
                    j4 = sed.m35012i(parcel2, readInt);
                    break;
                case 33:
                    playerRelationshipInfoEntity = (PlayerRelationshipInfoEntity) sed.m34998a(parcel2, readInt, PlayerRelationshipInfoEntity.CREATOR);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new PlayerEntity(str, str2, uri, uri2, j, i, j2, str3, str4, str5, mostRecentGameInfoEntity, playerLevelInfo, z, z2, str6, str7, uri3, str8, uri4, str9, i2, j3, z3, j4, playerRelationshipInfoEntity);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlayerEntity[i];
    }
}
