package com.google.android.gms.plus.internal.model.apps;

import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ApplicationEntity extends AbstractSafeParcelable implements ReflectedParcelable, anxl {
    public static final Parcelable.Creator CREATOR = new anwu();

    /* renamed from: a */
    public final int f82379a;

    /* renamed from: b */
    public final String f82380b;

    /* renamed from: c */
    public final String f82381c;

    /* renamed from: d */
    public final String f82382d;

    /* renamed from: e */
    public final ApplicationInfo f82383e;

    /* renamed from: f */
    public final AppAclsEntity f82384f;

    /* renamed from: g */
    public final boolean f82385g;

    /* renamed from: h */
    public final String f82386h;

    /* renamed from: i */
    public final String f82387i;

    /* renamed from: j */
    public final boolean f82388j;

    /* renamed from: k */
    public final boolean f82389k;

    /* renamed from: l */
    public final String f82390l;

    public ApplicationEntity(int i, String str, String str2, String str3, ApplicationInfo applicationInfo, AppAclsEntity appAclsEntity, boolean z, String str4, String str5, boolean z2, boolean z3, String str6) {
        this.f82379a = i;
        this.f82380b = str;
        this.f82381c = str2;
        this.f82382d = str3;
        this.f82383e = applicationInfo;
        this.f82384f = appAclsEntity;
        this.f82385g = z;
        this.f82386h = str4;
        this.f82387i = str5;
        this.f82388j = z2;
        this.f82389k = z3;
        this.f82390l = str6;
    }

    /* renamed from: a */
    public static ApplicationEntity m68424a(anxl anxl) {
        if (anxl == null) {
            return null;
        }
        if (anxl instanceof ApplicationEntity) {
            return (ApplicationEntity) anxl;
        }
        return new ApplicationEntity(anxl.mo42351a(), anxl.mo42352b(), anxl.mo42353c(), anxl.mo42354d(), anxl.mo42355f(), anxl.mo42357h(), anxl.mo42358i(), anxl.mo42360k(), anxl.mo42356g(), anxl.mo42359j());
    }

    /* renamed from: a */
    public final String mo42351a() {
        return this.f82380b;
    }

    /* renamed from: b */
    public final String mo42352b() {
        return this.f82381c;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final String mo42353c() {
        return this.f82382d;
    }

    /* renamed from: d */
    public final ApplicationInfo mo42354d() {
        return this.f82383e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ApplicationEntity) {
            ApplicationEntity applicationEntity = (ApplicationEntity) obj;
            if (this.f82379a != applicationEntity.f82379a || !sdg.m34949a(this.f82380b, applicationEntity.f82380b) || !sdg.m34949a(this.f82381c, applicationEntity.f82381c) || !sdg.m34949a(this.f82382d, applicationEntity.f82382d) || !sdg.m34949a(this.f82384f, applicationEntity.f82384f) || this.f82385g != applicationEntity.f82385g || this.f82389k != applicationEntity.f82389k || !sdg.m34949a(this.f82386h, applicationEntity.f82386h) || !sdg.m34949a(this.f82387i, applicationEntity.f82387i) || !sdg.m34949a(this.f82390l, applicationEntity.f82390l)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo42355f() {
        return this.f82385g;
    }

    /* renamed from: g */
    public final boolean mo42356g() {
        return this.f82389k;
    }

    /* renamed from: h */
    public final String mo42357h() {
        return this.f82386h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82379a), this.f82380b, this.f82381c, this.f82382d, this.f82384f, Boolean.valueOf(this.f82385g), this.f82386h, this.f82387i, Boolean.valueOf(this.f82389k), this.f82390l});
    }

    /* renamed from: i */
    public final String mo42358i() {
        return this.f82387i;
    }

    /* renamed from: j */
    public final String mo42359j() {
        return this.f82390l;
    }

    /* renamed from: k */
    public final boolean mo42360k() {
        return this.f82388j;
    }

    public ApplicationEntity(String str, String str2, String str3) {
        this(3, str, str2, str3, null, null, true, null, null, false, false, null);
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
        see.m35046a(parcel, 1, this.f82380b, false);
        see.m35046a(parcel, 2, this.f82381c, false);
        see.m35046a(parcel, 3, this.f82382d, false);
        see.m35040a(parcel, 4, this.f82383e, i, false);
        see.m35040a(parcel, 5, this.f82384f, i, false);
        see.m35051a(parcel, 6, this.f82385g);
        see.m35046a(parcel, 7, this.f82386h, false);
        see.m35046a(parcel, 8, this.f82387i, false);
        see.m35051a(parcel, 9, this.f82388j);
        see.m35051a(parcel, 10, this.f82389k);
        see.m35046a(parcel, 11, this.f82390l, false);
        see.m35063b(parcel, 1000, this.f82379a);
        see.m35062b(parcel, a);
    }

    public ApplicationEntity(String str, String str2, String str3, ApplicationInfo applicationInfo, boolean z, String str4, String str5, boolean z2, boolean z3, String str6) {
        this(3, str, str2, str3, applicationInfo, null, z, str4, str5, z2, z3, str6);
    }
}
