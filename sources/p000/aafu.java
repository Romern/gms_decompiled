package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

/* renamed from: aafu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aafu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SnapshotMetadataEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        GameEntity gameEntity = null;
        PlayerEntity playerEntity = null;
        String str = null;
        Uri uri = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    gameEntity = (GameEntity) sed.m34998a(parcel2, readInt, GameEntity.CREATOR);
                    break;
                case 2:
                    playerEntity = (PlayerEntity) sed.m34998a(parcel2, readInt, PlayerEntity.CREATOR);
                    break;
                case 3:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 5:
                    uri = (Uri) sed.m34998a(parcel2, readInt, Uri.CREATOR);
                    break;
                case 6:
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 9:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 10:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 11:
                    f = sed.m35015l(parcel2, readInt);
                    break;
                case 12:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 13:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 14:
                    j3 = sed.m35012i(parcel2, readInt);
                    break;
                case 15:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new SnapshotMetadataEntity(gameEntity, playerEntity, str, uri, str2, str3, str4, j, j2, f, str5, z, j3, str6);
    }
}
