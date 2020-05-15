package com.google.android.gms.plus.internal.model.acls;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AclsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anwo();

    /* renamed from: a */
    public final int f82360a;

    /* renamed from: b */
    public final String f82361b;

    /* renamed from: c */
    public final String f82362c;

    /* renamed from: d */
    public final AppAclsEntity f82363d;

    public AclsRequest(int i, String str, String str2, AppAclsEntity appAclsEntity) {
        this.f82360a = i;
        this.f82361b = str;
        this.f82362c = str2;
        this.f82363d = appAclsEntity;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AclsRequest) {
            AclsRequest aclsRequest = (AclsRequest) obj;
            if (this.f82360a != aclsRequest.f82360a || !sdg.m34949a(this.f82362c, aclsRequest.f82362c) || !sdg.m34949a(this.f82363d, aclsRequest.f82363d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f82360a), this.f82362c, this.f82363d});
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
        see.m35046a(parcel, 1, this.f82361b, false);
        see.m35046a(parcel, 2, this.f82362c, false);
        see.m35040a(parcel, 3, this.f82363d, i, false);
        see.m35063b(parcel, 1000, this.f82360a);
        see.m35062b(parcel, a);
    }
}
