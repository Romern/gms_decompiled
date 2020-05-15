package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;

/* renamed from: aaez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aaez implements Parcelable.Creator {
    /* renamed from: a */
    public ParticipantEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        String str3 = null;
        PlayerEntity playerEntity = null;
        ParticipantResult participantResult = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
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
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 6:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 7:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 8:
                    playerEntity = (PlayerEntity) sed.m34998a(parcel2, readInt, PlayerEntity.CREATOR);
                    break;
                case 9:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 10:
                    participantResult = (ParticipantResult) sed.m34998a(parcel2, readInt, ParticipantResult.CREATOR);
                    break;
                case 11:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 12:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new ParticipantEntity(str, str2, uri, uri2, i, str3, z, playerEntity, i2, participantResult, str4, str5);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParticipantEntity[i];
    }
}
