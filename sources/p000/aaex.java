package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import java.util.ArrayList;

/* renamed from: aaex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aaex implements Parcelable.Creator {
    /* renamed from: a */
    public InvitationEntity createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        GameEntity gameEntity = null;
        String str = null;
        ParticipantEntity participantEntity = null;
        ArrayList arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 1:
                    gameEntity = (GameEntity) sed.m34998a(parcel2, readInt, GameEntity.CREATOR);
                    break;
                case 2:
                    str = sed.m35020q(parcel2, readInt);
                    break;
                case 3:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 4:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 5:
                    participantEntity = (ParticipantEntity) sed.m34998a(parcel2, readInt, ParticipantEntity.CREATOR);
                    break;
                case 6:
                    arrayList = sed.m35005c(parcel2, readInt, ParticipantEntity.CREATOR);
                    break;
                case 7:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 8:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new InvitationEntity(gameEntity, str, j, i, participantEntity, arrayList, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InvitationEntity[i];
    }
}
