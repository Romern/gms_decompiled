package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlayerLevel extends GamesAbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aadc();

    /* renamed from: a */
    public final int f32531a;

    /* renamed from: b */
    public final long f32532b;

    /* renamed from: c */
    public final long f32533c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public PlayerLevel(int i, long j, long j2) {
        boolean z = true;
        sdo.m34971a(j >= 0, (Object) "Min XP must be positive!");
        sdo.m34971a(j2 <= j ? false : z, (Object) "Max XP must be more than min XP!");
        this.f32531a = i;
        this.f32532b = j;
        this.f32533c = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PlayerLevel playerLevel = (PlayerLevel) obj;
        return sdg.m34949a(Integer.valueOf(playerLevel.f32531a), Integer.valueOf(this.f32531a)) && sdg.m34949a(Long.valueOf(playerLevel.f32532b), Long.valueOf(this.f32532b)) && sdg.m34949a(Long.valueOf(playerLevel.f32533c), Long.valueOf(this.f32533c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32531a), Long.valueOf(this.f32532b), Long.valueOf(this.f32533c)});
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("LevelNumber", Integer.valueOf(this.f32531a));
        a.mo25396a("MinXp", Long.valueOf(this.f32532b));
        a.mo25396a("MaxXp", Long.valueOf(this.f32533c));
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f32531a);
        see.m35036a(parcel, 2, this.f32532b);
        see.m35036a(parcel, 3, this.f32533c);
        see.m35062b(parcel, a);
    }
}
