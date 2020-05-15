package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesAbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProfileSettingsEntity extends GamesAbstractSafeParcelable implements aadf {
    public static final Parcelable.Creator CREATOR = new aaeu();

    /* renamed from: a */
    public final Status f32641a;

    /* renamed from: b */
    public final String f32642b;

    /* renamed from: c */
    public final boolean f32643c;

    /* renamed from: d */
    public final boolean f32644d;

    /* renamed from: e */
    public final boolean f32645e;

    /* renamed from: f */
    public final StockProfileImageEntity f32646f;

    /* renamed from: g */
    public final boolean f32647g;

    /* renamed from: h */
    public final boolean f32648h;

    /* renamed from: i */
    public final int f32649i;

    /* renamed from: j */
    public final boolean f32650j;

    /* renamed from: k */
    public final boolean f32651k;

    /* renamed from: l */
    public final int f32652l;

    /* renamed from: m */
    public final int f32653m;

    public ProfileSettingsEntity(Status status, String str, boolean z, boolean z2, boolean z3, StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5, int i, boolean z6, boolean z7, int i2, int i3) {
        this.f32641a = status;
        this.f32642b = str;
        this.f32643c = z;
        this.f32644d = z2;
        this.f32645e = z3;
        this.f32646f = stockProfileImageEntity;
        this.f32647g = z4;
        this.f32648h = z5;
        this.f32649i = i;
        this.f32650j = z6;
        this.f32651k = z7;
        this.f32652l = i2;
        this.f32653m = i3;
    }

    /* renamed from: b */
    public final boolean mo16747b() {
        return this.f32644d;
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f32641a;
    }

    /* renamed from: c */
    public final boolean mo16748c() {
        return this.f32645e;
    }

    /* renamed from: d */
    public final String mo16749d() {
        return this.f32642b;
    }

    /* renamed from: e */
    public final StockProfileImage mo16750e() {
        return this.f32646f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aadf)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        aadf aadf = (aadf) obj;
        return sdg.m34949a(this.f32642b, aadf.mo16749d()) && sdg.m34949a(Boolean.valueOf(this.f32643c), Boolean.valueOf(aadf.mo16751f())) && sdg.m34949a(Boolean.valueOf(this.f32644d), Boolean.valueOf(aadf.mo16747b())) && sdg.m34949a(Boolean.valueOf(this.f32645e), Boolean.valueOf(aadf.mo16748c())) && sdg.m34949a(this.f32641a, aadf.mo7183bo()) && sdg.m34949a(this.f32646f, aadf.mo16750e()) && sdg.m34949a(Boolean.valueOf(this.f32647g), Boolean.valueOf(aadf.mo16752g())) && sdg.m34949a(Boolean.valueOf(this.f32648h), Boolean.valueOf(aadf.mo16753h())) && this.f32649i == aadf.mo16756k() && this.f32650j == aadf.mo16754i() && this.f32651k == aadf.mo16755j() && this.f32652l == aadf.mo16757l() && this.f32653m == aadf.mo16758m();
    }

    /* renamed from: f */
    public final boolean mo16751f() {
        return this.f32643c;
    }

    /* renamed from: g */
    public final boolean mo16752g() {
        return this.f32647g;
    }

    /* renamed from: h */
    public final boolean mo16753h() {
        return this.f32648h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32642b, Boolean.valueOf(this.f32643c), Boolean.valueOf(this.f32644d), Boolean.valueOf(this.f32645e), this.f32641a, this.f32646f, Boolean.valueOf(this.f32647g), Boolean.valueOf(this.f32648h), Integer.valueOf(this.f32649i), Boolean.valueOf(this.f32650j), Boolean.valueOf(this.f32651k), Integer.valueOf(this.f32652l), Integer.valueOf(this.f32653m)});
    }

    /* renamed from: i */
    public final boolean mo16754i() {
        return this.f32650j;
    }

    /* renamed from: j */
    public final boolean mo16755j() {
        return this.f32651k;
    }

    /* renamed from: k */
    public final int mo16756k() {
        return this.f32649i;
    }

    /* renamed from: l */
    public final int mo16757l() {
        return this.f32652l;
    }

    /* renamed from: m */
    public final int mo16758m() {
        return this.f32653m;
    }

    public final String toString() {
        sdf a = sdg.m34948a(this);
        a.mo25396a("GamerTag", this.f32642b);
        a.mo25396a("IsGamerTagExplicitlySet", Boolean.valueOf(this.f32643c));
        a.mo25396a("IsProfileVisible", Boolean.valueOf(this.f32644d));
        a.mo25396a("IsVisibilityExplicitlySet", Boolean.valueOf(this.f32645e));
        a.mo25396a("Status", this.f32641a);
        a.mo25396a("StockProfileImage", this.f32646f);
        a.mo25396a("IsProfileDiscoverable", Boolean.valueOf(this.f32647g));
        a.mo25396a("AutoSignIn", Boolean.valueOf(this.f32648h));
        a.mo25396a("httpErrorCode", Integer.valueOf(this.f32649i));
        a.mo25396a("IsSettingsChangesProhibited", Boolean.valueOf(this.f32650j));
        char[] cArr = {128, 171, 171, 174, 182, 133, 177, 168, 164, 173, 163, 136, 173, 181, 168, 179, 164, 178};
        for (int i = 0; i < 18; i++) {
            cArr[i] = (char) (cArr[i] - '?');
        }
        a.mo25396a(new String(cArr), Boolean.valueOf(this.f32651k));
        a.mo25396a("ProfileVisibility", Integer.valueOf(this.f32652l));
        char[] cArr2 = {166, 171, 174, 161, 160, 171, 158, 165, 177, 168, 164, 173, 163, 178, 158, 171, 168, 178, 179, 158, 181, 168, 178, 168, 161, 168, 171, 168, 179, 184};
        for (int i2 = 0; i2 < 30; i2++) {
            cArr2[i2] = (char) (cArr2[i2] - '?');
        }
        a.mo25396a(new String(cArr2), Integer.valueOf(this.f32653m));
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
        see.m35040a(parcel, 1, this.f32641a, i, false);
        see.m35046a(parcel, 2, this.f32642b, false);
        see.m35051a(parcel, 3, this.f32643c);
        see.m35051a(parcel, 4, this.f32644d);
        see.m35051a(parcel, 5, this.f32645e);
        see.m35040a(parcel, 6, this.f32646f, i, false);
        see.m35051a(parcel, 7, this.f32647g);
        see.m35051a(parcel, 8, this.f32648h);
        see.m35063b(parcel, 9, this.f32649i);
        see.m35051a(parcel, 10, this.f32650j);
        see.m35051a(parcel, 11, this.f32651k);
        see.m35063b(parcel, 12, this.f32652l);
        see.m35063b(parcel, 13, this.f32653m);
        see.m35062b(parcel, a);
    }
}
