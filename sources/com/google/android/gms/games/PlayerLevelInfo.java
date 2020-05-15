package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlayerLevelInfo extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aadd();

    /* renamed from: a */
    public final long f32534a;

    /* renamed from: b */
    public final long f32535b;

    /* renamed from: c */
    public final PlayerLevel f32536c;

    /* renamed from: d */
    public final PlayerLevel f32537d;

    public PlayerLevelInfo(long j, long j2, PlayerLevel playerLevel, PlayerLevel playerLevel2) {
        sdo.m34970a(j != -1);
        sdo.m34959a(playerLevel);
        sdo.m34959a(playerLevel2);
        this.f32534a = j;
        this.f32535b = j2;
        this.f32536c = playerLevel;
        this.f32537d = playerLevel2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PlayerLevelInfo playerLevelInfo = (PlayerLevelInfo) obj;
        return sdg.m34949a(Long.valueOf(this.f32534a), Long.valueOf(playerLevelInfo.f32534a)) && sdg.m34949a(Long.valueOf(this.f32535b), Long.valueOf(playerLevelInfo.f32535b)) && sdg.m34949a(this.f32536c, playerLevelInfo.f32536c) && sdg.m34949a(this.f32537d, playerLevelInfo.f32537d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f32534a), Long.valueOf(this.f32535b), this.f32536c, this.f32537d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35036a(parcel, 1, this.f32534a);
        see.m35036a(parcel, 2, this.f32535b);
        see.m35040a(parcel, 3, this.f32536c, i, false);
        see.m35040a(parcel, 4, this.f32537d, i, false);
        see.m35062b(parcel, a);
    }
}
