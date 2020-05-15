package com.google.android.gms.plus.internal.model.apps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.people.data.Audience;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppAclsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new anws();

    /* renamed from: a */
    public final int f82368a;

    /* renamed from: b */
    public final String f82369b;

    /* renamed from: c */
    public final Audience f82370c;

    /* renamed from: d */
    public final ArrayList f82371d;

    /* renamed from: e */
    public final boolean f82372e;

    /* renamed from: f */
    public final boolean f82373f;

    /* renamed from: g */
    public final boolean f82374g;

    /* renamed from: h */
    public final boolean f82375h;

    /* renamed from: i */
    public final int f82376i;

    /* renamed from: j */
    public final String f82377j;

    /* renamed from: k */
    public final String f82378k;

    public AppAclsEntity(int i, String str, Audience audience, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i2, String str2, String str3) {
        this.f82368a = i;
        this.f82369b = str;
        this.f82370c = audience;
        this.f82371d = arrayList;
        this.f82372e = z;
        this.f82373f = z2;
        this.f82374g = z3;
        this.f82375h = z4;
        this.f82376i = i2;
        this.f82377j = str2;
        this.f82378k = str3;
    }

    /* renamed from: a */
    public final boolean mo46590a() {
        return this.f82372e || this.f82371d != null || this.f82373f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AppAclsEntity) {
            AppAclsEntity appAclsEntity = (AppAclsEntity) obj;
            if (this.f82368a == appAclsEntity.f82368a && sdg.m34949a(this.f82369b, appAclsEntity.f82369b) && sdg.m34949a(this.f82370c, appAclsEntity.f82370c) && sdg.m34949a(this.f82371d, appAclsEntity.f82371d) && this.f82372e == appAclsEntity.f82372e && this.f82373f == appAclsEntity.f82373f && this.f82374g == appAclsEntity.f82374g && this.f82375h == appAclsEntity.f82375h && this.f82376i == appAclsEntity.f82376i && sdg.m34949a(this.f82377j, appAclsEntity.f82377j) && sdg.m34949a(this.f82378k, appAclsEntity.f82378k)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82368a), this.f82369b, this.f82370c, this.f82371d, Boolean.valueOf(this.f82372e), Boolean.valueOf(this.f82373f), Boolean.valueOf(this.f82374g), Boolean.valueOf(this.f82375h), Integer.valueOf(this.f82376i), this.f82377j, this.f82378k});
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
        see.m35046a(parcel, 1, this.f82369b, false);
        see.m35040a(parcel, 2, this.f82370c, i, false);
        see.m35066c(parcel, 3, this.f82371d, false);
        see.m35051a(parcel, 4, this.f82372e);
        see.m35051a(parcel, 5, this.f82373f);
        see.m35051a(parcel, 6, this.f82374g);
        see.m35051a(parcel, 7, this.f82375h);
        see.m35063b(parcel, 8, this.f82376i);
        see.m35046a(parcel, 9, this.f82377j, false);
        see.m35046a(parcel, 10, this.f82378k, false);
        see.m35063b(parcel, 1000, this.f82368a);
        see.m35062b(parcel, a);
    }
}
