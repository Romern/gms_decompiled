package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new xqe();

    /* renamed from: a */
    public final String f31789a;

    /* renamed from: b */
    public final String f31790b;

    /* renamed from: c */
    public final String f31791c;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        sdo.m34959a((Object) str);
        this.f31789a = str;
        sdo.m34959a((Object) str2);
        this.f31790b = str2;
        this.f31791c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialRpEntity) {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
            if (!sdg.m34949a(this.f31789a, publicKeyCredentialRpEntity.f31789a) || !sdg.m34949a(this.f31790b, publicKeyCredentialRpEntity.f31790b) || !sdg.m34949a(this.f31791c, publicKeyCredentialRpEntity.f31791c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31789a, this.f31790b, this.f31791c});
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
        see.m35046a(parcel, 2, this.f31789a, false);
        see.m35046a(parcel, 3, this.f31790b, false);
        see.m35046a(parcel, 4, this.f31791c, false);
        see.m35062b(parcel, a);
    }
}
