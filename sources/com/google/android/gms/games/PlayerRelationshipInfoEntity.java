package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlayerRelationshipInfoEntity extends GamesAbstractSafeParcelable implements PlayerRelationshipInfo {
    public static final Parcelable.Creator CREATOR = new aade();

    /* renamed from: a */
    public int f32538a;

    /* renamed from: b */
    public String f32539b;

    /* renamed from: c */
    public String f32540c;

    /* renamed from: d */
    public String f32541d;

    public PlayerRelationshipInfoEntity(int i, String str, String str2, String str3) {
        this.f32538a = i;
        this.f32539b = str;
        this.f32540c = str2;
        this.f32541d = str3;
    }

    /* renamed from: a */
    public final int mo19271a() {
        return this.f32538a;
    }

    /* renamed from: b */
    public final String mo19272b() {
        return this.f32539b;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo19273c() {
        return this.f32540c;
    }

    /* renamed from: d */
    public final String mo19274d() {
        return this.f32541d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f32538a), this.f32539b, this.f32540c, this.f32541d});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlayerRelationshipInfo) {
            if (obj == this) {
                return true;
            }
            PlayerRelationshipInfo playerRelationshipInfo = (PlayerRelationshipInfo) obj;
            if (playerRelationshipInfo.mo19271a() != this.f32538a || !sdg.m34949a(playerRelationshipInfo.mo19272b(), this.f32539b) || !sdg.m34949a(playerRelationshipInfo.mo19273c(), this.f32540c) || !sdg.m34949a(playerRelationshipInfo.mo19274d(), this.f32541d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("FriendStatus", Integer.valueOf(this.f32538a));
        String str = this.f32539b;
        if (str != null) {
            a.mo25396a("Nickname", str);
        }
        String str2 = this.f32540c;
        if (str2 != null) {
            a.mo25396a("InvitationNickname", str2);
        }
        if (this.f32541d != null) {
            a.mo25396a("NicknameAbuseReportToken", this.f32540c);
        }
        return a.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f32538a);
        see.m35046a(parcel, 2, this.f32539b, false);
        see.m35046a(parcel, 3, this.f32540c, false);
        see.m35046a(parcel, 4, this.f32541d, false);
        see.m35062b(parcel, a);
    }
}
