package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;

/* renamed from: aadd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aadd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PlayerLevelInfo[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        long j2 = 0;
        PlayerLevel playerLevel = null;
        PlayerLevel playerLevel2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                j = sed.m35012i(parcel, readInt);
            } else if (a == 2) {
                j2 = sed.m35012i(parcel, readInt);
            } else if (a == 3) {
                playerLevel = (PlayerLevel) sed.m34998a(parcel, readInt, PlayerLevel.CREATOR);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                playerLevel2 = (PlayerLevel) sed.m34998a(parcel, readInt, PlayerLevel.CREATOR);
            }
        }
        sed.m34994F(parcel, b);
        return new PlayerLevelInfo(j, j2, playerLevel, playerLevel2);
    }
}
