package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchEntity;
import java.util.ArrayList;

/* renamed from: aaff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaff implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TurnBasedMatchEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        GameEntity gameEntity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        String str5 = null;
        byte[] bArr2 = null;
        Bundle bundle = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
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
                    str2 = sed.m35020q(parcel2, readInt);
                    break;
                case 4:
                    j = sed.m35012i(parcel2, readInt);
                    break;
                case 5:
                    str3 = sed.m35020q(parcel2, readInt);
                    break;
                case 6:
                    j2 = sed.m35012i(parcel2, readInt);
                    break;
                case 7:
                    str4 = sed.m35020q(parcel2, readInt);
                    break;
                case 8:
                    i = sed.m35010g(parcel2, readInt);
                    break;
                case 9:
                default:
                    sed.m35002b(parcel2, readInt);
                    break;
                case 10:
                    i2 = sed.m35010g(parcel2, readInt);
                    break;
                case 11:
                    i3 = sed.m35010g(parcel2, readInt);
                    break;
                case 12:
                    bArr = sed.m35023t(parcel2, readInt);
                    break;
                case 13:
                    arrayList = sed.m35005c(parcel2, readInt, ParticipantEntity.CREATOR);
                    break;
                case 14:
                    str5 = sed.m35020q(parcel2, readInt);
                    break;
                case 15:
                    bArr2 = sed.m35023t(parcel2, readInt);
                    break;
                case 16:
                    i4 = sed.m35010g(parcel2, readInt);
                    break;
                case 17:
                    bundle = sed.m35022s(parcel2, readInt);
                    break;
                case 18:
                    i5 = sed.m35010g(parcel2, readInt);
                    break;
                case 19:
                    z = sed.m35006c(parcel2, readInt);
                    break;
                case 20:
                    str6 = sed.m35020q(parcel2, readInt);
                    break;
                case 21:
                    str7 = sed.m35020q(parcel2, readInt);
                    break;
            }
        }
        sed.m34994F(parcel2, b);
        return new TurnBasedMatchEntity(gameEntity, str, str2, j, str3, j2, str4, i, i2, i3, bArr, arrayList, str5, bArr2, i4, bundle, i5, z, str6, str7);
    }
}
